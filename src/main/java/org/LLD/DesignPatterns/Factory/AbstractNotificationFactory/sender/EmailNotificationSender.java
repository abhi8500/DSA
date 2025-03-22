package org.LLD.DesignPatterns.Factory.AbstractNotificationFactory.sender;

import org.LLD.DesignPatterns.Factory.AbstractNotificationFactory.Notification.Notification;
import org.LLD.DesignPatterns.Factory.AbstractNotificationFactory.NotificationType;

public class EmailNotificationSender extends NotificationSender{

    public EmailNotificationSender(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        System.out.println("Sending Email notification to " + getNotification().getRecipient());
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }
}
