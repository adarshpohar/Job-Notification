package com.example.job.notification.Repository;
import com.example.job.notification.Entity.Employer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployerRepository extends JpaRepository<Employer, Long>{
}
