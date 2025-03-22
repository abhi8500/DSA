package org.LLD.DesignPatterns.Factory.AbstractNotificationFactory.sender;

import org.LLD.DesignPatterns.Factory.AbstractNotificationFactory.Notification.Notification;
import org.LLD.DesignPatterns.Factory.AbstractNotificationFactory.NotificationType;

public class PushNotificationSender extends NotificationSender {

    public PushNotificationSender(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        System.out.println("Sending Push notification to " + getNotification().getRecipient());
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }
}