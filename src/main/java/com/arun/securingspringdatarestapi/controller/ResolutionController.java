package com.arun.securingspringdatarestapi.controller;

import com.arun.securingspringdatarestapi.model.Resolution;
import com.arun.securingspringdatarestapi.service.ResolutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author arun on 9/8/20
 */

@RestController
public class ResolutionController {

    private final ResolutionService resolutionService;

    @Autowired
    public ResolutionController(ResolutionService resolutionService) {
        this.resolutionService = resolutionService;
    }

    @GetMapping("/v1/resolution")
    public ResponseEntity<List<Resolution>> getAllResolutions() {
        List<Resolution> allResolutions = resolutionService.getAllResolutions();
        return ResponseEntity.ok(allResolutions);
    }
}
