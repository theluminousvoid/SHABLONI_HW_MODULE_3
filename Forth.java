public class Forth {
    public static void main(String[] args){
        ISender email = new EmailSender();
        NotificationService service = new NotificationService(email);
        service.SendNotification("Hello!");
    }
}

interface ISender {
    void SendMessage(String message);
}

class EmailSender implements ISender {
    public void SendMessage(String message) {
        System.out.println("Email sent: " + message);
    }
}

class SmsSender implements ISender {
    public void SendMessage(String message) {
        System.out.println("SMS sent: " + message);
    }
}

class NotificationService {
    private ISender Sender;

    public NotificationService(ISender sender) {
        this.Sender = sender;
    }

    public void SendNotification(String message) {
        Sender.SendMessage(message);
    }
}
