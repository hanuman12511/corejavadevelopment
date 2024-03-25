import java.util.Scanner;


class Home{
    
    Scanner sc= new Scanner(System.in);
    Home(){
        sc.next();
    }
}

class Info{
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

class User{
    Info info =new Info();
    User(String email,String password){
       
        info.setEmail(email);
        info.setPassword(password);
    }
    boolean isLogin(){
        if(info.getEmail().equals("admin@g.c") && info.getPassword().equals("admin")){
            return true;
        }
       
            return false;
       
    }

}
public class Login{
    public static void main(String [ ]r){
        Scanner sc =new Scanner(System.in);

System.out.println("Enter email and password");
        String email=sc.next();
        String password=sc.next();

        User user =new User(email,password);
        if(user.isLogin()){
            System.out.println("user Loggin");
            Home home = new Home();
             
        }
        else{
            System.out.println("user not login");
        }
    }
}