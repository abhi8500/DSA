package org.LLD.DesignPatterns.Factory.AbstractNotificationFactory.Notification;

import org.LLD.DesignPatterns.Factory.AbstractNotificationFactory.NotificationType;
import org.LLD.DesignPatterns.Factory.AbstractNotificationFactory.template.NotificationTemplate;

public class PushNotification extends Notification{

    public PushNotification(String recipient, NotificationTemplate template) {
        super(recipient, template);
    }

    public void sendNotification() {
        // Logic to send a push notification
        System.out.println("Push notification sent to device " + getRecipient());
        System.out.println("Message: " + getTemplate().getMessage());
    }

    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }
}
