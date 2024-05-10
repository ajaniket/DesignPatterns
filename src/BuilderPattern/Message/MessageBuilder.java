package BuilderPattern.Message;

public class MessageBuilder {
    private final MessageType messageType;
    private final String content;
    private final String sender;
    private final String recipient;
    private final boolean isDelivered;
    private final long timestamp;
    public MessageBuilder(Builder builder){
        this.messageType=builder.getMessageType();
        this.content=builder.getContent();
        this.sender=builder.getSender();
        this.recipient=builder.getRecipient();
        this.isDelivered=builder.isDelivered();
        this.timestamp=builder.getTimestamp();
    }
    public static Builder getBuilder(){
        return new Builder();
    }
    public static class Builder {

        private MessageType messageType;
        private String content;
        private String sender;
        private String recipient;
        private boolean isDelivered;
        private long timestamp;

        public MessageBuilder build(){
            return new MessageBuilder(this);
        }

        public MessageType getMessageType() {
            return messageType;
        }

        public void setMessageType(MessageType messageType) {
            this.messageType = messageType;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }

        public String getRecipient() {
            return recipient;
        }

        public void setRecipient(String recipient) {
            this.recipient = recipient;
        }

        public boolean isDelivered() {
            return isDelivered;
        }

        public void setDelivered(boolean delivered) {
            isDelivered = delivered;
        }

        public long getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(long timestamp) {
            this.timestamp = timestamp;
        }
    }
}
