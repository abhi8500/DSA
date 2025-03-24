package org.LLD.DesignPatterns.Creational.Factory.AbstractNotificationFactory;

import org.LLD.DesignPatterns.Creational.Factory.AbstractNotificationFactory.Notification.Notification;
import org.LLD.DesignPatterns.Creational.Factory.AbstractNotificationFactory.sender.NotificationSender;
import org.LLD.DesignPatterns.Creational.Factory.AbstractNotificationFactory.template.NotificationTemplate;

public abstract class NotificationFactory {

    public abstract NotificationType notificationType();

    public abstract Notification createNotification(String recipient,String sender,NotificationTemplate notificationTemplate);

    public abstract NotificationTemplate createNotificationTemplate(String message);

    public abstract NotificationSender createNotificationSender(Notification notification);
}
