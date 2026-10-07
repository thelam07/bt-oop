import java.util.Locale;

abstract class PaymentMethod {
    protected String type;
    protected String name;

    public PaymentMethod(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public abstract void pay(long amount);

    protected String format(long amount) {
        return String.format(Locale.forLanguageTag("vi-VN"), "%,d", amount);
    }
}

class CreditCardPayment extends PaymentMethod {
    public CreditCardPayment() {
        super("Không dùng tiền mặt", "CreditCard");
    }

    @Override
    public void pay(long amount) {
        System.out.println("Thanh toán " + format(amount) + " bằng thẻ tín dụng.");
    }
}

class PayPalPayment extends PaymentMethod {
    public PayPalPayment() {
        super("Không dùng tiền mặt", "PayPal");
    }

    @Override
    public void pay(long amount) {
        System.out.println("Thanh toán " + format(amount) + " qua PayPal.");
    }
}

class CashPayment extends PaymentMethod {
    public CashPayment() {
        super("Trực tiếp", "Cash");
    }

    @Override
    public void pay(long amount) {
        System.out.println("Thanh toán " + format(amount) + " bằng tiền mặt.");
    }
}

class MoMoPayment extends PaymentMethod {
    public MoMoPayment() {
        super("Không dùng tiền mặt", "MoMo");
    }

    @Override
    public void pay(long amount) {
        System.out.println("Thanh toán " + format(amount) + " qua MoMo.");
    }
}

class Order {
    private String customerName;
    private long amount;
    private PaymentMethod paymentMethod;

    public Order(String customerName, long amount, PaymentMethod paymentMethod) {
        this.customerName = customerName;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public void checkout() {
        System.out.println("Khách hàng: " + customerName);
        paymentMethod.pay(amount);
    }
}

public class bai3 {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("An", 200000, new CreditCardPayment()),
            new Order("Bình", 150000, new PayPalPayment()),
            new Order("Chi", 100000, new CashPayment()),
            new Order("Dũng", 300000, new MoMoPayment())
        };

        for (Order order : orders) {
            order.checkout();
        }
    }
}
