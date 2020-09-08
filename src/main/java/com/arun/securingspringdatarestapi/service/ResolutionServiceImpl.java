package com.arun.securingspringdatarestapi.service;

import com.arun.securingspringdatarestapi.domain.ResolutionDomain;
import com.arun.securingspringdatarestapi.model.Resolution;
import com.arun.securingspringdatarestapi.repository.ResolutionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author arun on 9/8/20
 */

@Service
public class ResolutionServiceImpl implements ResolutionService {

    private final ResolutionRepository resolutionRepository;

    @Autowired
    public ResolutionServiceImpl(ResolutionRepository resolutionRepository) {
        this.resolutionRepository = resolutionRepository;
    }

    @Override
    public List<Resolution> getAllResolutions() {

        Iterable<ResolutionDomain> resolutons = resolutionRepository.findAll();
        List<Resolution> resolutions = new ArrayList<>();
        resolutons.forEach(rd -> {
            Resolution resolution = new Resolution()
                    .setCompleted(rd.isCompleted())
                    .setId(rd.getId())
                    .setOwner(rd.getOwner())
                    .setText(rd.getText());
            resolutions.add(resolution);
        });
        return resolutions;
    }
}
