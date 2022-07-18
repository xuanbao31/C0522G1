package ss10_DSA.bai_tap_lam_them_2.model;

public class Truck extends Transport{
    private String trongTai;

    public Truck(String bienKiemSoat, String hangSanXuat, String namSangXuat, String chuSoHuu, String trongTai) {
        super(bienKiemSoat, hangSanXuat, namSangXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public Truck(String trongTai) {
        this.trongTai = trongTai;
    }

    public String getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(String trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return super.toString()+ "Truck{" +
                "trongTai='" + trongTai + '\'' +
                '}';
    }
}
