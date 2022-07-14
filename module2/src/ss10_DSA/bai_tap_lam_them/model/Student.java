package ss10_DSA.bai_tap_lam_them.model;

public class Student extends Person{
    private String nameClass;
    private double points;

    public Student(String code, String name, String birthDay, String gender, String nameClass, double points) {
        super(code, name, birthDay, gender);
        this.nameClass = nameClass;
        this.points = points;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return super.toString()+ "Student{" +
                "nameClass='" + nameClass + '\'' +
                ", points=" + points +
                '}';
    }
}
