package com.example.OnlineTenderSystem.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.OnlineTenderSystem.domain.Bid;
import com.example.OnlineTenderSystem.repository.BidRepository;
import com.example.OnlineTenderSystem.repository.TenderRepository;

@Service
public class BidService {
    private final BidRepository bidRepository;
    private final TenderRepository tenderRepository;

    public BidService(BidRepository bidRepository, TenderRepository tenderRepository) {
        this.bidRepository = bidRepository;
        this.tenderRepository = tenderRepository;
    }

    public Bid createBid(Long tenderId, Bid bid) {
        return tenderRepository.findById(tenderId)
                .map(tender -> {
                    bid.setTender(tender);
                    bid.setSubmissionDate(LocalDateTime.now());
                    return bidRepository.save(bid);
                })
                .orElseThrow(() -> new RuntimeException("Tender with id " + tenderId + " not found"));
    }

    public List<Bid> getBidsByTenderId(Long tenderId) {
        return bidRepository.findByTenderId(tenderId);
    }
}