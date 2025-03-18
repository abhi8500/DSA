package org.LLD.DesignPatterns.Factory.NotificationFactory;

public class EmailNotification extends Notification {

    private String sender;

    public EmailNotification(String recipient, String sender, String message) {
        super(recipient, message);
        this.sender = sender;
    }


    public String getSender() {
        return sender;
    }

    public void sendNotification() {
        // Logic to send an email
        System.out.println("Email sent to " + getRecipient() + " from " + sender);
        System.out.println("Message: " + getMessage());
    }

    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }
}
