package org.LLD.DesignPatterns.Builder.message;

public class Client {

    public static void main(String[] args) {
        MessageBuilder message = MessageBuilder.getBuilder()
                .setContent("HII").setMessageType(MessageType.AUDIO)
                .setDelivered(false).setTimestamp(1202).setSender("Abhi")
                .setRecipient("Nikki")
                .build();
    }
}
