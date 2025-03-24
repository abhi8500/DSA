package org.LLD.DesignPatterns.Creational.Factory.AbstractNotificationFactory.template;

import org.LLD.DesignPatterns.Creational.Factory.AbstractNotificationFactory.NotificationType;

public abstract class NotificationTemplate {

    private String message;

    public NotificationTemplate(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public abstract String applyTemplate();
    public abstract NotificationType notificationType();
}
