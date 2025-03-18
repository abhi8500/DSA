package org.LLD.DesignPatterns.Factory.NotificationFactory;

public class PushNotification extends Notification {

    public PushNotification(String recipient, String message) {
        super(recipient, message);
    }


    public void sendNotification() {
        // Logic to send a push notification
        System.out.println("Push notification sent to device " + getRecipient());
        System.out.println("Message: " + getMessage());
    }

    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }
}
