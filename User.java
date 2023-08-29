public class User {

    Integer id;
    String name;
    String email;
    String phone_number;
    String catagory;



    public User() {

    }


    public User(Integer id, String name, String phone_number, String email, String catagory) {
        this.id = id;
        this.name = name;
        this.phone_number = phone_number;
        this.email = email;
        this.catagory = catagory;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }


    @Override
    public String toString() {
        return "User [" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", email='" + email + '\'' +
                ", catagory='" + catagory + '\'' +
                ']';
    }
}
