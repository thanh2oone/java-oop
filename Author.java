public class Author {
    private String name;
    private String email;

    Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public String getName() {
        return name;
    }
}
