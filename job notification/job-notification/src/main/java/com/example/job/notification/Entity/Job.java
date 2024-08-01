package com.example.job.notification.Entity;

import com.example.job.notification.Entity.Job;
import com.netflix.discovery.shared.Application;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@EntityListeners(Entity.class)

public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private LocalDate datePosted;

    @ManyToOne
    @JoinColumn(name = "employer_id")
    private Employer employer;

    @OneToMany(mappedBy = "job")
    private Set<Application> applications = new HashSet<>();


    }

