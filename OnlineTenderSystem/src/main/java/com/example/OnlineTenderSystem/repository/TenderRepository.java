// TenderRepository.java
package com.example.OnlineTenderSystem.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.OnlineTenderSystem.domain.Tender;

public interface TenderRepository extends JpaRepository<Tender, Long> {
    
    // Corrected query method
    List<Tender> findByDeadlineGreaterThan(LocalDateTime currentDate);
    
    // Corrected query with @Param
    @Query("SELECT t FROM Tender t WHERE t.budget >= :minBudget")
    List<Tender> findTendersWithMinBudget(@Param("minBudget") double minBudget);
}
