package ss10_DSA.bai_tap_lam_them_2.model;

public class Bike extends Transport{
    private String congSuat ;

    public Bike(String bienKiemSoat, String hangSanXuat, String namSangXuat, String chuSoHuu, String congSuat) {
        super(bienKiemSoat, hangSanXuat, namSangXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public Bike(String congSuat) {
        this.congSuat = congSuat;
    }

    public String getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(String congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return super.toString()+ "Bike{" +
                "congSuat='" + congSuat + '\'' +
                '}';
    }
}
