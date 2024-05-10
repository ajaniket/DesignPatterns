package AbstractFactory.NotificationSystem;

import AbstractFactory.NotificationSystem.Notification.*;
import AbstractFactory.NotificationSystem.Sender.EmailNotificationSender;
import AbstractFactory.NotificationSystem.Sender.NotificationSender;
import AbstractFactory.NotificationSystem.Template.EmailNotificationTemplate;
import AbstractFactory.NotificationSystem.Template.NotificationTemplate;

public class EmailNotificationFactory extends NotificationFactory {

    //noti,template,sender
    @Override
    public Notification createNotifications(String recipient, String sender, NotificationTemplate template){
        return new EmailNotification(recipient,sender,template);
    }

    @Override
    public NotificationTemplate createTemplate(String message) {
        return new EmailNotificationTemplate(message);
    }

    @Override
    public NotificationSender createSender(Notification notification) {
        return new EmailNotificationSender(notification);
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }
}
