package com.example.boottimesclient.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@ConfigurationProperties("boottimes")
public class BootTimesConfiguration {

    private static final Logger LOGGER = LoggerFactory.getLogger(BootTimesConfiguration.class);

    private Map<String, TestConfig> testconfigs = new HashMap<>();

    public Map<String, TestConfig> getTestConfigs() {
        return testconfigs;
    }

    @PostConstruct
    private void postConstruct() {
        LOGGER.info("amount testconfigs = " + testconfigs.size());
    }

    public static class TestConfig {

        private boolean someBoolean = false;
        private Integer someInteger = 0;
        private Float someDecimal = 0f;
        private String someString = "";


        public String getSomeString() {
            return someString;
        }

        public void setSomeString(String someString) {
            this.someString = someString;
        }

        public boolean isSomeBoolean() {
            return someBoolean;
        }

        public void setSomeBoolean(boolean someBoolean) {
            this.someBoolean = someBoolean;
        }

        public Integer getSomeInteger() {
            return someInteger;
        }

        public void setSomeInteger(Integer someInteger) {
            this.someInteger = someInteger;
        }

        public Float getSomeDecimal() {
            return someDecimal;
        }

        public void setSomeDecimal(Float someDecimal) {
            this.someDecimal = someDecimal;
        }
    }
}
