package org.LLD.DesignPatterns.Factory.AbstractNotificationFactory.sender;

import org.LLD.DesignPatterns.Factory.AbstractNotificationFactory.Notification.Notification;
import org.LLD.DesignPatterns.Factory.AbstractNotificationFactory.NotificationType;

public abstract  class NotificationSender {

    private final Notification notification;

    public NotificationSender(Notification notification) {
        this.notification = notification;
    }

    public Notification getNotification() {
        return notification;
    }

    public abstract void send();

    public abstract NotificationType notificationType();
}
