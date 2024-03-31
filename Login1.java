import java.util.Scanner;
import userData.*;
import Home.*;
public class Login1 {
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
