package ss10_DSA.bai_tap_lam_them_2.model;

public abstract class Transport {
    private String bienKiemSoat;
    private String hangSanXuat;
    private String namSangXuat;
    private String chuSoHuu;

    public Transport(String bienKiemSoat, String hangSanXuat, String namSangXuat, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.hangSanXuat = hangSanXuat;
        this.namSangXuat = namSangXuat;
        this.chuSoHuu = chuSoHuu;
    }

    public Transport() {
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String getNamSangXuat() {
        return namSangXuat;
    }

    public void setNamSangXuat(String namSangXuat) {
        this.namSangXuat = namSangXuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "bienKiemSoat='" + bienKiemSoat + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", namSangXuat='" + namSangXuat + '\'' +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                '}';
    }
}
