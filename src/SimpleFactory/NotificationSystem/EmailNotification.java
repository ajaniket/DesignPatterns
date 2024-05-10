package SimpleFactory.NotificationSystem;

public class EmailNotification extends Notification {
    private String sender;

    public EmailNotification(String recipient, String sender, String message) {
        super(recipient,message);
        this.sender = sender;
    }

    public String getSender() {
        return sender;
    }

    @Override
    public void sendNotification() {
        // Logic to send an email
        System.out.println("Email sent to " + this.getRecipient() + " from " + sender);
        System.out.println("Message: " + this.getMessage());
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }
}
