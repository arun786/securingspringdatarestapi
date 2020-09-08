package com.arun.securingspringdatarestapi.model;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

/**
 * @author arun on 9/8/20
 */

@Getter
@Setter
public class Resolution {
    private boolean completed;
    private Long id;
    private UUID owner;
    private String text;
}
