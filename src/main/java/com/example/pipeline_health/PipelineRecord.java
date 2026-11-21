package com.example.pipeline_health;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class PipelineRecord {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String project;
    private String status;
    private LocalDate lastRun;

    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getProject() { return project; }
    public void setProject(String project) { this.project = project; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public LocalDate getLastRun() { return lastRun; }
    public void setLastRun(LocalDate lastRun) { this.lastRun = lastRun; }
}