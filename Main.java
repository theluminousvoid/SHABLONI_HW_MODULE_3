//TIP Чтобы <b>запустить</b> код, нажмите <shortcut actionId="Run"/> или
// нажмите на значок <icon src="AllIcons.Actions.Execute"/> на полях.
public class Main {
    public static void main(String[] args) {
        Order order1 = new Order("NAme", 20, 30000);
        Calculate calc1 = new Calculate();
        calc1.CalculateTotalPrice(20,30000);
        Payment pay1 = new Payment();
        pay1.ProcessPayment("buy");
        Email email1 = new Email();
    }
}

class Calculate {
    public double CalculateTotalPrice(int Quantity, double Price)
    {
        // Рассчет стоимости с учетом скидок
        return Quantity * Price * 0.9;
    }
}

class Payment{
    public void ProcessPayment(String paymentDetails)
    {
        // Логика обработки платежа
        System.out.println("Payment processed using: " + paymentDetails);
    }
}


class Email{
    public void SendConfirmationEmail(String email)
    {
        // Логика отправки уведомления
        System.out.println("Confirmation email sent to: " + email);
    }
}

class Order {
    public String ProductName;
    public int Quantity;
    public double Price;
    public Order(String ProductName, int Quantity, double Price) {
        this.ProductName = ProductName;
        this.Quantity = Quantity;
        this.Price = Price;
    }
}