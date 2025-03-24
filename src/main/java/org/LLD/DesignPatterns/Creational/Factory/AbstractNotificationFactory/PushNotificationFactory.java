package org.LLD.DesignPatterns.Creational.Factory.AbstractNotificationFactory;

import org.LLD.DesignPatterns.Creational.Factory.AbstractNotificationFactory.Notification.Notification;
import org.LLD.DesignPatterns.Creational.Factory.AbstractNotificationFactory.Notification.PushNotification;
import org.LLD.DesignPatterns.Creational.Factory.AbstractNotificationFactory.sender.NotificationSender;
import org.LLD.DesignPatterns.Creational.Factory.AbstractNotificationFactory.sender.PushNotificationSender;
import org.LLD.DesignPatterns.Creational.Factory.AbstractNotificationFactory.template.NotificationTemplate;
import org.LLD.DesignPatterns.Creational.Factory.AbstractNotificationFactory.template.PushNotificationTemplate;

public class PushNotificationFactory extends NotificationFactory{
    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }

    @Override
    public Notification createNotification(String recipient, String sender, NotificationTemplate notificationTemplate) {
        return new PushNotification(recipient,notificationTemplate);
    }

    @Override
    public NotificationTemplate createNotificationTemplate(String message) {
        return new PushNotificationTemplate(message);
    }

    @Override
    public NotificationSender createNotificationSender(Notification notification) {
        return new PushNotificationSender(notification);
    }
}
