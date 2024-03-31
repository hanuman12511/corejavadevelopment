package userData;

import infopk.Info;
import infopk.UserInfo;

public class User {
  UserInfo info;
   public  User(String email,String password){
       info = new Info();
        info.setEmail(email);
        info.setPassword(password);
       
    }
    public boolean isLogin(){
        if(info.getEmail().equals("admin@g.c") && info.getPassword().equals("admin")){
            return true;
        }
       
            return false;
       
    }
}
