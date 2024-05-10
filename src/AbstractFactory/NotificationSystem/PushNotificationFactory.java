package AbstractFactory.NotificationSystem;

import AbstractFactory.NotificationSystem.Notification.Notification;
import AbstractFactory.NotificationSystem.Notification.PushNotification;
import AbstractFactory.NotificationSystem.Sender.NotificationSender;
import AbstractFactory.NotificationSystem.Sender.PushNotificationSender;
import AbstractFactory.NotificationSystem.Template.NotificationTemplate;
import AbstractFactory.NotificationSystem.Template.PushNotificationTemplate;

public class PushNotificationFactory extends NotificationFactory{
    @Override
    public Notification createNotifications(String recipient, String sender, NotificationTemplate template) {
        return new PushNotification(recipient,template);
    }

    @Override
    public NotificationTemplate createTemplate(String message) {
        return new PushNotificationTemplate(message);
    }

    @Override
    public NotificationSender createSender(Notification notification) {
        return new PushNotificationSender(notification);
    }

    @Override
    public NotificationType notificationType() {
        return null;
    }
}
