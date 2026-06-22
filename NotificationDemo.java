interface Notification {
    void send();
}

class EmailNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Email Notification Sent");
    }
}

class SMSNotification implements Notification {
    @Override
    public void send() {
        System.out.println("SMS Notification Sent");
    }
}

public class NotificationDemo {
    public static void main(String[] args) {
        Notification email = new EmailNotification();
        Notification sms = new SMSNotification();

        email.send();
        sms.send();
    }
}