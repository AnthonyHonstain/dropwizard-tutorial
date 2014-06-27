package com.example.helloworld;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * When this class is deserialized from the YAML file, it will pull two root
 * level fields from the YAML object:
 *   template - the template for our Hello World saying
 *   defaultName - the default name to user
 *
 *   @NotEmpty annotation - causes an exception to prevent start
 *   if values are missing.
 *
 *   @JsonProperty annotation - let Jackson do serialize and deserialize
 */
public class HelloWorldConfiguration extends Configuration{
    @NotEmpty
    private String template;

    @NotEmpty
    private String defaultName = "Stranger";

    @JsonProperty
    public String getTemplate(){
        return template;
    }

    @JsonProperty
    public void setTemplate(String template) {
        this.template = template;
    }

    @JsonProperty
    public String getDefaultName() {
        return defaultName;
    }

    @JsonProperty
    public void setDefaultName(String name) {
        this.defaultName = name;
    }
}

