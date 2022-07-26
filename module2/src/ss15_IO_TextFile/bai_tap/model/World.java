package ss15_IO_TextFile.bai_tap.model;

public class World {
    private int id;
    private String code;
    private String nameCountry;

    public World(int id, String code, String nameCountry) {
        this.id = id;
        this.code = code;
        this.nameCountry = nameCountry;
    }

    public World() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    @Override
    public String toString() {
        return "World{" +
                "id=" + id +
                ", code=" + code +
                ", nameCountry=" + nameCountry +
                '}';
    }
}
