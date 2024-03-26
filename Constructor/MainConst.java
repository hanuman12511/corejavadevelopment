class Demo{
    Demo(){
        System.out.println("default");    
    }
    Demo(int id){
            System.out.println(id);
    }
    Demo(int id,String name){
            System.out.println(id);
            System.out.println(name);
    }
}
public  class MainConst{
    static public void main(String... r){
        Demo d =new Demo();
        Demo d1 =new Demo(45);
        Demo d2 =new Demo(45,"user");
    } 
}
 