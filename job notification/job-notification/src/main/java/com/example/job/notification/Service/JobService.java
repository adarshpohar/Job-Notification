package com.example.job.notification.Service;

import com.example.job.notification.Entity.Job;
import com.example.job.notification.Repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class JobService {
    @Autowired
    private static JobRepository jobRepository;

    public static List<Job> getAllJobs(Long id) {
        return jobRepository.findAll();
    }

    public Optional<Job> getJobById(Long id) {
        return jobRepository.findById(id);
    }

    public Job saveJob(Job job) {
        return jobRepository.save(job);
    }

    public static void deleteJob(Long id) {
        jobRepository.deleteById(id);
    }
}
