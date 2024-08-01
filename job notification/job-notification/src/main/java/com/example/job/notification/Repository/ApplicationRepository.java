package com.example.job.notification.Repository;
import com.example.job.notification.Entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long>{
}
