/* 
class UserDatabase{
    void add(int n1,int n2){
    
            System.out.println(n1+n2);

     
       
    }
    void div(int n1,int n2){
     
            System.out.println(n1/n2);
       
       
    }
    
    void sub(int n1,int n2){
      
            System.out.println(n1-n2);
       
    }
}

public class Exceptionn{
    public static void main(String[] args) {
        UserDatabase ud =new UserDatabase();
        int n1 =9,n2=0;
        ud.add(n1, n2);
        ud.div(n1, n2);
        ud.sub(n1, n2);
    }

}
 */

/* 

class UserDatabase{
    void add(int n1,int n2){
        try {
            System.out.println(n1+n2);

        } catch (ArithmeticException e) {
           
        }
       
    }
    void div(int n1,int n2){
        try {
            System.out.println(n1/n2);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
       
    }
    
    void sub(int n1,int n2){
        try {
            System.out.println(n1-n2);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}

public class Exceptionn{
    public static void main(String[] args) {
        UserDatabase ud =new UserDatabase();
        int n1 =9,n2=0;
        ud.add(n1, n2);
        ud.div(n1, n2);
        ud.sub(n1, n2);
    }

} */

/* 
class UserDatabase{
    void Fun(String value){
        int num = Integer.parseInt(value);
        System.out.println(num);    
    }
   
}

public class Exceptionn{
    public static void main(String[] args) {
        UserDatabase ud =new UserDatabase();
        ud.Fun("123o");
    }

} */

/* class UserDatabase{
    void Fun(String value){
        try{
        int num = Integer.parseInt(value);
        System.out.println(num);    
        }
        catch(NumberFormatException nn){
            System.out.println(nn);
        }
    }
   
}

public class Exceptionn{
    public static void main(String[] args) {
        UserDatabase ud =new UserDatabase();
        ud.Fun("123o");
    }

} */








/* class UserDatabase{
    void Fun(String value[],int n){
        
        System.out.println(value[n]);
    }
   
}

public class Exceptionn{
    public static void main(String[] args) {
        UserDatabase ud =new UserDatabase();
        String name[]={"user1","user2"};
        ud.Fun(name,4);
    }

}
 */

/* 
 class UserDatabase{
    void Fun(String value[],int n){
        
    try {
        
        System.out.println(value[n]);

    } catch (Exception e) {

        System.out.println(e);

    }
    }
   
}

public class Exceptionn{
    public static void main(String[] args) {
        UserDatabase ud =new UserDatabase();
        String name[]={"user1","user2"};
        ud.Fun(name,4);
    }

} */

/* 

class UserDatabase{
    void Fun(String value){
       
        System.out.println(value.length());
    
    }
   
}

public class Exceptionn{
    public static void main(String[] args) {
        UserDatabase ud =new UserDatabase();
        ud.Fun(null);
    }

}

 */

class UserDatabase{
    void Fun(String value){
       try {
        System.out.println(value.length());
    
       } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e);
    }
        
    }
   
}

public class Exceptionn{
    public static void main(String[] args) {
        UserDatabase ud =new UserDatabase();
        ud.Fun(null);
    }

}


