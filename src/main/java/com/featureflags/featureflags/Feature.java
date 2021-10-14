package com.featureflags.featureflags;

import org.springframework.beans.factory.annotation.Value;

public class Feature {

    @Value("${spring.profiles.active}") private String activeProfile;

    @Value("${your.path.yml.string}") private String x;

    public Feature() {
    }

    public boolean openai;

    public void parseFeatures() {

    }
}
