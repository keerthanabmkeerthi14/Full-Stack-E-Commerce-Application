package com.keerthanabm.ecomproj.repo;

import com.keerthanabm.ecomproj.model.OutboxEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OutboxEventRepo extends JpaRepository<OutboxEvent, Long> {

    List<OutboxEvent> findByStatusOrderByCreatedAtAsc(String status);

    List<OutboxEvent> findByStatusAndRetryCountLessThanOrderByCreatedAtAsc(String status, int maxRetries);
}
