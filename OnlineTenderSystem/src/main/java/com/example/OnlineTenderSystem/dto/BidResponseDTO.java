package com.example.OnlineTenderSystem.dto;

public class BidResponseDTO {
    private Long id;
    private double amount;
    private String proposal;

    // Constructors
    public BidResponseDTO() {}

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
    
    public String getProposal() { return proposal; }
    public void setProposal(String proposal) { this.proposal = proposal; }
}