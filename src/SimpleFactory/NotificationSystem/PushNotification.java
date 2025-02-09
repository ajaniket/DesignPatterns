package SimpleFactory.NotificationSystem;

public class PushNotification extends Notification{

    public PushNotification(String recipient, String message) {
        super(recipient,message);
    }

    @Override
    public void sendNotification() {
        // Logic to send a push notification
        System.out.println("Push notification sent to device " + this.getRecipient());
        System.out.println("Message: " + this.getMessage());
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }
}
