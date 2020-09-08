package com.arun.securingspringdatarestapi.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

/**
 * @author arun on 9/8/20
 */

@Entity(name = "users")
@Getter
@Setter
public class UserDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(unique = true)
    private String username;

    private String password;
    private Boolean enabled = true;
}
