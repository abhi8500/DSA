package org.LLD.DesignPatterns.Builder.message;


import org.LLD.DesignPatterns.Builder.WithBuilder;

@WithBuilder
public class MessageBuilder {


    private MessageType messageType;
    private String content;
    private String sender;
    private String recipient;
    private boolean isDelivered;
    private long timestamp;

    // Private constructor to force usage of Builder
    private MessageBuilder() {
    }

    // Static method to get a builder instance
    public static Builder getBuilder() {

        return new Builder();
    }

    public static class Builder {
        private final MessageBuilder messageBuilder;

        public Builder() {
            this.messageBuilder = new MessageBuilder(); // Single instance maintained
        }

        public Builder setMessageType(MessageType messageType) {
            messageBuilder.messageType = messageType;
            return this;
        }

        public Builder setContent(String content) {
            messageBuilder.content = content;
            return this;
        }

        public Builder setSender(String sender) {
            messageBuilder.sender = sender;
            return this;
        }

        public Builder setRecipient(String recipient) {
            messageBuilder.recipient = recipient;
            return this;
        }

        public Builder setDelivered(boolean delivered) {
            messageBuilder.isDelivered = delivered;
            return this;
        }

        public Builder setTimestamp(long timestamp) {
            messageBuilder.timestamp = timestamp;
            return this;
        }

        public MessageBuilder build() {
            return messageBuilder;
        }
    }
}
