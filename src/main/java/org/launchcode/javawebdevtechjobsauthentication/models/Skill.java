package org.launchcode.javawebdevtechjobsauthentication.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;
import java.util.ArrayList;

@Entity
public class Skill extends AbstractEntity{

    @Size(min=1, max=500, message = "Description must be between 1 and 500 characters")
    private String description;

    @ManyToMany(mappedBy = "skill")
    private List<Job> jobs = new ArrayList<>();

    public Skill() {};

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
