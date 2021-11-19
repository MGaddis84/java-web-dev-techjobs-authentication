package org.launchcode.javawebdevtechjobsauthentication.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;

@Entity
public class Job extends AbstractEntity{

    @ManyToOne
    private Employer employer;

    private String skills;

    public Job() {};

    public Job(Employer anEmployer, String someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

//    private String employer;
//    private String skill;
//
//    public List<Job> getJobs() {
//        return jobs;
//    }
//
//    public void setJobs(List<Job> jobs) {
//        this.jobs = jobs;
//    }
//
//    public Job() {
//        super();
//    }

    // Initialize the id and value fields.

    // Getters and setters.

    public String getEmployer() {
        return Employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getSkill() {
        return skills;
    }

    public void setSkill(String skill) {
        this.skills = skill;
    }

}
