package AbstractFactory.NotificationSystem;

//1) we need to create 3 things: Notification, Template, Sender
//2) Notification Factory will be the parent class of all factories
//3)

import AbstractFactory.NotificationSystem.Notification.Notification;
import AbstractFactory.NotificationSystem.Sender.NotificationSender;
import AbstractFactory.NotificationSystem.Template.NotificationTemplate;

public abstract class NotificationFactory {
    public abstract Notification createNotifications(String recipient, String sender, NotificationTemplate template);
    public abstract NotificationTemplate createTemplate(String message);
    public abstract NotificationSender createSender(Notification notification);
    public abstract NotificationType notificationType();

}