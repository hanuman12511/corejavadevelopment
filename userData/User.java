package userData;
public class User {
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
