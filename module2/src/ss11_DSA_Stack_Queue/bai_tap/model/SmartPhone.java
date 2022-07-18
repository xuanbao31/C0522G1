package ss11_DSA_Stack_Queue.bai_tap.model;

public class SmartPhone implements Comparable<SmartPhone> {
    private String phoneCompany;
    private int id;
    private double price;
    private String phoneName;

    public SmartPhone(String phoneCompany, int id, double price, String phoneName) {
        this.phoneCompany = phoneCompany;
        this.id = id;
        this.price = price;
        this.phoneName = phoneName;
    }

    public SmartPhone() {
    }

    public String getPhoneCompany() {
        return phoneCompany;
    }

    public void setPhoneCompany(String phoneCompany) {
        this.phoneCompany = phoneCompany;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "phoneCompany='" + phoneCompany + '\'' +
                ", id=" + id +
                ", price=" + price +
                ", phoneName='" + phoneName + '\'' +
                '}';
    }

    @Override
    public int compareTo(SmartPhone o) {
        if (this.getPrice() > o.getPrice()) {
            return 1;
        } else {
            return -1;
        }
    }
}
