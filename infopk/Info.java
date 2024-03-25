package infopk;
public class Info{
    private String email;
    private String password;

    public void setEmail(String email){
        this.email =email;
    }

    public void setPassword(String password){
        this.password =password;
    }

    String getEmail(){
        return email;
    } 
    String getPassword(){
        return password;
    }
}