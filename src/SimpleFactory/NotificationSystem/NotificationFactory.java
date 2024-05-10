package SimpleFactory.NotificationSystem;

public class NotificationFactory {
    public static Notification getFactory(NotificationType notificationType, String recipient, String sender, String message){
        return switch (notificationType){
            case EMAIL -> new EmailNotification(recipient,sender,message);
            case PUSH -> new PushNotification(recipient,message);
            case SMS -> new SmsNotification(recipient,message);
            default -> throw new IllegalStateException();
        };
    }
}
