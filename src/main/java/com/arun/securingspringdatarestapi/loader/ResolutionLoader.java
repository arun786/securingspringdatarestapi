package com.arun.securingspringdatarestapi.loader;

import com.arun.securingspringdatarestapi.domain.ResolutionDomain;
import com.arun.securingspringdatarestapi.domain.UserDomain;
import com.arun.securingspringdatarestapi.repository.ResolutionRepository;
import com.arun.securingspringdatarestapi.repository.UserRepository;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.UUID;

/**
 * @author arun on 9/8/20
 */

@Configuration
public class ResolutionLoader implements SmartInitializingSingleton {

    private final ResolutionRepository resolutionRepository;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public ResolutionLoader(ResolutionRepository resolutionRepository, UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.resolutionRepository = resolutionRepository;
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }


    @Override
    public void afterSingletonsInstantiated() {

        UUID adwitiId = UUID.fromString("a555ab01-20d1-4208-8d3a-d1c19364ee1a");
        UUID aravId = UUID.fromString("aebd3b2d-7e8e-4760-9f2d-40853cb02ff7");
        ResolutionDomain adwitiResolution = new ResolutionDomain().setCompleted(false).setOwner(adwitiId).setText("To be the best Mathematician");
        resolutionRepository.save(adwitiResolution);

        ResolutionDomain aravResolution = new ResolutionDomain().setCompleted(false).setOwner(aravId).setText("To play");
        resolutionRepository.save(aravResolution);

        UserDomain adwiti = new UserDomain().setId(adwitiId).setUsername("adwiti").setPassword(passwordEncoder.encode("adwiti"));
        UserDomain arav = new UserDomain().setId(aravId).setUsername("arav").setPassword(passwordEncoder.encode("arav"));

        userRepository.save(adwiti);
        userRepository.save(arav);
    }
}
