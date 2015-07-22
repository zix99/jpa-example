package com.webs.identity.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by chris on 7/21/15.
 */
public class Identity {
    private String id;

    public Identity()
    { }

    public Identity(String id) {
        this.id = id;
    }

    @JsonProperty
    public String getId() {
        return this.id;
    }
}
