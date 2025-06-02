
package com.example.OnlineTenderSystem.dto;

import java.time.LocalDateTime;
import java.util.List;

// TenderResponseDTO.java

public class TenderResponseDTO {
    private Long id;
    private String title;
    private String description;
    private double budget;
    private LocalDateTime deadline;
    private List<BidResponseDTO> bids;


    // Constructors
    public TenderResponseDTO() {}

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    
    public double getBudget() { return budget; }
    public void setBudget(double budget) { this.budget = budget; }
    
    public LocalDateTime getDeadline() { return deadline; }
    public void setDeadline(LocalDateTime deadline) { this.deadline = deadline; }
    
    public List<BidResponseDTO> getBids() { return bids; }
    public void setBids(List<BidResponseDTO> bids) { this.bids = bids; }
}