public abstract class Users {
    private String username;
    private String password;
    private String name;
    private String role;
public Users(String username,String password,String name,String role){
    this.username=username;
    this.password=password;
    this.name=name;
    this.role=role;

}
public String getRole(){
    return role;
}
    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
}