package ServicePackage;

public class UserServiceDTO {
    private long id;
    private String name;

    public UserServiceDTO(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public UserServiceDTO() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
