package org.LLD.DesignPatterns.Creational.Factory.AbstractNotificationFactory;

import org.LLD.DesignPatterns.Creational.Factory.AbstractNotificationFactory.Notification.EmailNotification;
import org.LLD.DesignPatterns.Creational.Factory.AbstractNotificationFactory.Notification.Notification;
import org.LLD.DesignPatterns.Creational.Factory.AbstractNotificationFactory.sender.EmailNotificationSender;
import org.LLD.DesignPatterns.Creational.Factory.AbstractNotificationFactory.sender.NotificationSender;
import org.LLD.DesignPatterns.Creational.Factory.AbstractNotificationFactory.template.EmailNotificationTemplate;
import org.LLD.DesignPatterns.Creational.Factory.AbstractNotificationFactory.template.NotificationTemplate;

public class EmailNotificationFactory extends NotificationFactory{

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }

    @Override
    public Notification createNotification(String recipient, String sender, NotificationTemplate notificationTemplate) {
        return new EmailNotification(recipient,sender,notificationTemplate);
    }


    @Override
    public NotificationTemplate createNotificationTemplate(String message) {
        return new EmailNotificationTemplate(message);
    }

    @Override
    public NotificationSender createNotificationSender(Notification notification) {
        return new EmailNotificationSender(notification);
    }
}
