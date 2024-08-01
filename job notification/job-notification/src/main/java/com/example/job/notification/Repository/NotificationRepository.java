package com.example.job.notification.Repository;
import com.example.job.notification.Entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface NotificationRepository extends JpaRepository<Notification, Long> {
    javax.management.Notification Save(javax.management.Notification notification);
}
