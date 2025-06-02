// BidController.java
package com.example.OnlineTenderSystem.controller;

import com.example.OnlineTenderSystem.domain.Bid;
import com.example.OnlineTenderSystem.service.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tenders/{tenderId}/bids")
public class BidController {
    private final BidService bidService;

    @Autowired
    public BidController(BidService bidService) {
        this.bidService = bidService;
    }

    @PostMapping
    public Bid createBid(@PathVariable Long tenderId, @RequestBody Bid bid) {
        return bidService.createBid(tenderId, bid);
    }

    @GetMapping
    public List<Bid> getBidsByTenderId(@PathVariable Long tenderId) {
        return bidService.getBidsByTenderId(tenderId);
    }
}