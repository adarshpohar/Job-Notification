package com.example.job.notification.Service;

import com.example.job.notification.Repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.Notification;
import java.util.List;
import java.util.Optional;

@Service

public class NotificationService {
    @Autowired
    private NotificationRepository notificationRepository;

    public List<com.example.job.notification.Entity.Notification> getAllNotifications() {
        return notificationRepository.findAll();
    }

    public Optional<com.example.job.notification.Entity.Notification> getNotificationById(Long id) {
        return notificationRepository.findById(id);
    }

    public Notification saveNotification(Notification notification) {
        return notificationRepository.Save(notification);
    }

    public void deleteNotification(Long id) {
        notificationRepository.deleteById(id);
    }
}
