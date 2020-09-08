package com.arun.securingspringdatarestapi.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

/**
 * @author arun on 9/8/20
 */

@Entity(name = "resolution")
@Getter
@Setter
public class ResolutionDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private boolean completed;
    private UUID owner;
    private String text;
}
