package org.LLD.DesignPatterns.Creational.Factory.NotificationFactory;

public class SmsNotification extends Notification{

    public SmsNotification(String recipient,  String message) {
       super(recipient,message);
    }


    public void sendNotification() {
        // Logic to send an SMS
        System.out.println("SMS sent to " + getRecipient());
        System.out.println("Message: " + getMessage());
    }

    public NotificationType notificationType() {
        return NotificationType.SMS;
    }
}
