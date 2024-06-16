package com.Job.Jobsearch.model;

import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "Joblisting")
public class Post {

    private String profile;
    private int exp;
    private List<String> techs;
    private String desc;

    // Getters and setters
    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public List<String> getTechs() {
        return techs;
    }

    public void setTechs(List<String> techs) {
        this.techs = techs;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
