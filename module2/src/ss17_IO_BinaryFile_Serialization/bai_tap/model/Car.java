package ss17_IO_BinaryFile_Serialization.bai_tap.model;

import java.io.Serializable;

public class Car implements Serializable {
    private String maSanPham;
    private String tenSanPham;
    private String hangSanPham;
    private double giaSanPham;
    private String mauSacSanPham;

    public Car(String maSanPham, String tenSanPham, String hangSanPham, double giaSanPham, String mauSacSanPham) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.hangSanPham = hangSanPham;
        this.giaSanPham = giaSanPham;
        this.mauSacSanPham = mauSacSanPham;
    }

    public Car() {

    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getHangSanPham() {
        return hangSanPham;
    }

    public void setHangSanPham(String hangSanPham) {
        this.hangSanPham = hangSanPham;
    }

    public double getGiaSanPham() {
        return giaSanPham;
    }

    public void setGiaSanPham(double giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    public String getMauSacSanPham() {
        return mauSacSanPham;
    }

    public void setMauSacSanPham(String mauSacSanPham) {
        this.mauSacSanPham = mauSacSanPham;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maSanPham='" + maSanPham + '\'' +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", hangSanPham='" + hangSanPham + '\'' +
                ", giaSanPham=" + giaSanPham +
                ", mauSacSanPham='" + mauSacSanPham + '\'' +
                '}';
    }

}
