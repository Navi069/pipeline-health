package com.example.pipeline_health;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PipelineRepo extends JpaRepository<PipelineRecord, Long> {}
