package Case_1.Model;

public abstract class QuanLyDienThoai {
    private  int id;
    private  String namePhone;
    private int soLuong;
    private  String nhaSanXuat;

    public QuanLyDienThoai(int id, String namePhone, int soLuong, String nhaSanXuat) {
        this.id = id;
        this.namePhone = namePhone;
        this.soLuong = soLuong;
        this.nhaSanXuat = nhaSanXuat;
    }

    public QuanLyDienThoai() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamePhone() {
        return namePhone;
    }

    public void setNamePhone(String namePhone) {
        this.namePhone = namePhone;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    @Override
    public String toString() {
        return "QuanLyDienThoai{" +
                "id=" + id +
                ", namePhone='" + namePhone + '\'' +
                ", soLuong=" + soLuong +
                ", nhaSanXuat='" + nhaSanXuat + '\'' +
                '}';
    }
}
