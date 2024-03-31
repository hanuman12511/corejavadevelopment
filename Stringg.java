public class Stringg {

    public static void main(String[] args) {
  
        String str  = "user";
        String str1  = "User";
        String str2  = "User";
       /*  System.out.println(str==str1);
        System.out.println(str1==str2); */
        String  str3 = new  String("user");
        String  str4 = new  String("user");
        String  str5 = new  String("User");
     /*    System.out.println(str3.equals(str));
        System.out.println(str4.equals(str3));
        System.out.println(str4.equals(str5)); */

        str3.concat("programming");
        System.out.println(str);   
        
        StringBuffer str6 = new StringBuffer("user");
        System.out.println(str6.equals(str));

        str6.append("programming");

        System.out.println(str6);


    }

}   





/* public class Stringg {

    public static void main(String[] args) {
            for(String r:args){
                System.out.println(r);
            }
    }

} */
