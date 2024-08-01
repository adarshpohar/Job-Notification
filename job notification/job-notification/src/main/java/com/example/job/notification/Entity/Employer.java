package com.example.job.notification.Entity;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.batch.BatchProperties;

import java.util.HashSet;
import java.util.Set;

@Entity

public class Employer {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public Set<BatchProperties.Job> getJobs() {
        return jobs;
    }

    public void setJobs(Set<BatchProperties.Job> jobs) {
        this.jobs = jobs;
    }

    public Employer(Long id, String name, String address, String contactEmail, Set<BatchProperties.Job> jobs) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contactEmail = contactEmail;
        this.jobs = jobs;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;
    private String contactEmail;

    @OneToMany(mappedBy = "employer")
    private Set<BatchProperties.Job> jobs = new HashSet<>();
}
