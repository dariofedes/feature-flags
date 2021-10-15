package com.featureflags.featureflags;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Map;

@Profile("development")
public class FeaturesService {

    // get environment variable as activeProfile
    @Value("${spring.profiles.active}") private String activeProfile;
//    @Autowired private Environment env;

    public Map<String, Boolean> getFeatures() {
        Map<String, Object> allFeatures = parseFeaturesSource();

        System.out.println(activeProfile);
//        System.out.println(Arrays.toString(env.getActiveProfiles()));
//        System.out.println(allFeatures.get(activeProfile));

        return null;
    }



    private Map<String, Object> parseFeaturesSource() {
        Yaml yaml = new Yaml();

        InputStream inputStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream();

        return yaml.load(inputStream);
    }
}

