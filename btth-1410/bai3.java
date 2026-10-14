abstract class Payment {
    protected long amount;

    public Payment(long amount) {
        this.amount = amount;
    }

    public abstract void processPayment();

    public void showAmount() {
        System.out.println("So tien: " + amount);
    }
}

interface Refundable {
    void refund();
}

class CashPayment extends Payment {
    public CashPayment(long amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Thanh toan bang tien mat");
    }
}

class CardPayment extends Payment implements Refundable {
    public CardPayment(long amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Thanh toan bang the");
    }

    @Override
    public void refund() {
        System.out.println("Hoan tien thanh cong");
    }
}

public class bai3 {
    public static void main(String[] args) {
        CashPayment cash = new CashPayment(500000);
        CardPayment card = new CardPayment(1000000);

        Payment[] payments = { cash, card };
        for (Payment p : payments) {
            p.showAmount();
            p.processPayment();
        }

        card.refund();
    }
}
