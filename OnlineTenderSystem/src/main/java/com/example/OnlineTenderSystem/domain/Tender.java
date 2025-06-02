package com.example.OnlineTenderSystem.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Tender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String title;
    private String description;
    private double budget;
    
    @Column(name = "deadline")
    private LocalDateTime deadline;
    
    @Column(name = "creation_date")
    private LocalDateTime creationDate;
    
    @Column(name = "closing_date")
    private LocalDateTime closingDate;
    
    private String status;
    
    @OneToMany(mappedBy = "tender", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Bid> bids = new ArrayList<>();

    // Default constructor (required by JPA)
    public Tender() {
        this.creationDate = LocalDateTime.now(); // Set creation date automatically
    }

    // Parameterized constructor
    public Tender(String title, String description, double budget, LocalDateTime deadline) {
        this();
        this.title = title;
        this.description = description;
        this.budget = budget;
        this.deadline = deadline;
        this.status = "OPEN"; // Default status
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(LocalDateTime closingDate) {
        this.closingDate = closingDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Bid> getBids() {
        return bids;
    }

    public void setBids(List<Bid> bids) {
        this.bids = bids;
    }

    // Helper method to add bid
    public void addBid(Bid bid) {
        bids.add(bid);
        bid.setTender(this);
    }

    // Helper method to remove bid
    public void removeBid(Bid bid) {
        bids.remove(bid);
        bid.setTender(null);
    }

    @Override
    public String toString() {
        return "Tender{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", budget=" + budget +
                ", deadline=" + deadline +
                ", creationDate=" + creationDate +
                ", closingDate=" + closingDate +
                ", status='" + status + '\'' +
                '}';
    }
}