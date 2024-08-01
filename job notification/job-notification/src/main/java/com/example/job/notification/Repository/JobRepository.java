package com.example.job.notification.Repository;
import com.example.job.notification.Entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface JobRepository extends JpaRepository<Job, Long> {
}
