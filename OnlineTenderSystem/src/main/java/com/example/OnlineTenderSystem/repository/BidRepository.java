// BidRepository.java
package com.example.OnlineTenderSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OnlineTenderSystem.domain.Bid;

public interface BidRepository extends JpaRepository<Bid, Long> {
    List<Bid> findByTenderId(Long tenderId); // Add this custom query
}
