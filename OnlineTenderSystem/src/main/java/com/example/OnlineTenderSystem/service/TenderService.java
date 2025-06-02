// TenderService.java
package com.example.OnlineTenderSystem.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OnlineTenderSystem.domain.Tender;
import com.example.OnlineTenderSystem.repository.TenderRepository;

@Service
public class TenderService {
    private final TenderRepository tenderRepository;

    @Autowired
    public TenderService(TenderRepository tenderRepository) {
        this.tenderRepository = tenderRepository;
    }

    public List<Tender> getAllTenders() {
        return tenderRepository.findAll();
    }

    public Tender createTender(Tender tender) {
        tender.setCreationDate(LocalDateTime.now());
        return tenderRepository.save(tender);
    }

    public Optional<Tender> getTenderById(Long id) {
        return tenderRepository.findById(id);
    }
}