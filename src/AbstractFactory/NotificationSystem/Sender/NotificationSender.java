package AbstractFactory.NotificationSystem.Sender;

import AbstractFactory.NotificationSystem.Notification.Notification;
import AbstractFactory.NotificationSystem.NotificationType;

public abstract class NotificationSender {
    private final Notification notification;

    public NotificationSender(Notification notification) {
        this.notification = notification;
    }

    public Notification getNotification() {
        return notification;
    }

    public abstract void send();

    public abstract NotificationType notificationType();

}