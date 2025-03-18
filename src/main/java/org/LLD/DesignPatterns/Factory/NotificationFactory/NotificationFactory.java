package org.LLD.DesignPatterns.Factory.NotificationFactory;

public class NotificationFactory {

    public static Notification createNotification(NotificationType notificationType, String recipient, String message, String sender) {
        return switch (notificationType) {
            case EMAIL -> new EmailNotification(recipient, sender, message);
            case SMS -> new SmsNotification(recipient, message);
            case PUSH -> new PushNotification(recipient, message);
            default -> throw new IllegalArgumentException("Invalid notification type");
        };
    }
}
