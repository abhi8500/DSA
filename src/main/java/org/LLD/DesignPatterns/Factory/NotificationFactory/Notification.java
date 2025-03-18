package org.LLD.DesignPatterns.Factory.NotificationFactory;

public abstract class Notification {

    private String recipient;
    private String message;

    public Notification(String recipient,String message){
        this.recipient = recipient;
        this.message = message;
    }

    public abstract void sendNotification();
    public abstract NotificationType notificationType();

    public String getRecipient() {
        return recipient;
    }

    public String getMessage() {
        return message;
    }
}
