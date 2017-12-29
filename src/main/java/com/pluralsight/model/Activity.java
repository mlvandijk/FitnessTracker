package com.pluralsight.model;

import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

public class Activity {
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    private String desc;
}
