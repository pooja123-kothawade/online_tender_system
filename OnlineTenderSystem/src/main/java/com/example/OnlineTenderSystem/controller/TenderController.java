package com.example.OnlineTenderSystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.OnlineTenderSystem.domain.Tender;
import com.example.OnlineTenderSystem.service.TenderService;

@RestController
@RequestMapping("/api/tenders")
public class TenderController {
    private final TenderService tenderService;

    public TenderController(TenderService tenderService) {
        this.tenderService = tenderService;
    }

    @GetMapping
    public List<Tender> getAllTenders() {
        return tenderService.getAllTenders();
    }

    @PostMapping
    public Tender createTender(@RequestBody Tender tender) {
        return tenderService.createTender(tender);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tender> getTenderById(@PathVariable Long id) {
        Optional<Tender> tender = tenderService.getTenderById(id);
        return tender.map(ResponseEntity::ok)
                   .orElse(ResponseEntity.notFound().build());
    }
}