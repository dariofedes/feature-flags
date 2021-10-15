package com.featureflags.featureflags;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;

import java.util.Arrays;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;

@SpringBootTest

//@ActiveProfiles("dev")
class FeatureFlagsApplicationTests {
	@Autowired private Environment env;
	@Test
    void should_return_true_for_development_environment() {
		// Set env variable environment to "develop"
		System.out.println(Arrays.toString(env.getActiveProfiles()));

		FeaturesService featuresService = new FeaturesService();

		Map<String, Boolean> features = featuresService.getFeatures();

//		assertTrue(features.openai);
    }

}
