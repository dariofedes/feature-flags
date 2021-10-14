package com.featureflags.featureflags;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;

@SpringBootTest

class FeatureFlagsApplicationTests {
	@Autowired private ConfigurableEnvironment env;

	@Test
    void should_return_true_for_development_environment() {
		env.setActiveProfiles("development");
		Feature features = new Feature();
		assertTrue(features.openai);
    }

}
