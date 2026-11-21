package com.example.pipeline_health;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/pipelines")
public class PipelineController {
    private final PipelineRepo repo;
    public PipelineController(PipelineRepo repo) { this.repo = repo; }

    @GetMapping
    public List<PipelineRecord> all() { return repo.findAll(); }

    @PostMapping
    public PipelineRecord add(@RequestBody PipelineRecord p) { return repo.save(p); }
}