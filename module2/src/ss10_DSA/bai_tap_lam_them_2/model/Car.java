package ss10_DSA.bai_tap_lam_them_2.model;

public class Car extends Transport {
    private String soChoNgoi;
    private String kieuXe;

    public Car(String bienKiemSoat, String hangSanXuat, String namSangXuat, String chuSoHuu, String soChoNgoi, String kieuXe) {
        super(bienKiemSoat, hangSanXuat, namSangXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public Car(String bienKiemSoat, String hangSanXuat, String namSangXuat, String chuSoHuu) {
        super(bienKiemSoat, hangSanXuat, namSangXuat, chuSoHuu);
    }

    public String getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(String soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return super.toString()+ "Car{" +
                "soChoNgoi='" + soChoNgoi + '\'' +
                ", kieuXe='" + kieuXe + '\'' +
                '}';
    }
}
