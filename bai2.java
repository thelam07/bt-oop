interface EmailSender {
    void sendEmail();
}

interface Programmer {
    void program();
}

interface Salesperson {
    void sell();
}

class OfficeEmployee implements EmailSender {
    private String name;

    public OfficeEmployee(String name) {
        this.name = name;
    }

    @Override
    public void sendEmail() {
        System.out.println(name + " (văn phòng) đang gửi email.");
    }
}

class TechnicalEmployee implements Programmer, EmailSender {
    private String name;

    public TechnicalEmployee(String name) {
        this.name = name;
    }

    @Override
    public void program() {
        System.out.println(name + " (kỹ thuật) đang lập trình.");
    }

    @Override
    public void sendEmail() {
        System.out.println(name + " (kỹ thuật) đang gửi email.");
    }
}

class SalesEmployee implements Salesperson, EmailSender {
    private String name;

    public SalesEmployee(String name) {
        this.name = name;
    }

    @Override
    public void sell() {
        System.out.println(name + " (bán hàng) đang bán hàng.");
    }

    @Override
    public void sendEmail() {
        System.out.println(name + " (bán hàng) đang gửi email.");
    }
}

public class bai2 {
    public static void main(String[] args) {
        OfficeEmployee an = new OfficeEmployee("An");
        TechnicalEmployee binh = new TechnicalEmployee("Bình");
        SalesEmployee chi = new SalesEmployee("Chi");

        EmailSender[] emailSenders = { an, binh, chi };
        for (EmailSender sender : emailSenders) {
            sender.sendEmail();
        }

        binh.program();
        chi.sell();
    }
}
