package ss10_DSA.bai_tap_lam_them.model;

public class Teacher extends Person  {
    private String specialize;

    public Teacher(String code, String name, String birthDay, String gender, String chuyenMon) {
        super(code, name, birthDay, gender);
        this.specialize = chuyenMon;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return super.toString()+ "Teacher{" +
                "chuyenMon='" + specialize + '\'' +
                '}';
    }
}
