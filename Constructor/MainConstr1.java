class Demo{
    Demo(){
      
        System.out.println("default"); 
        
    }
    Demo(int id){
        this();
            System.out.println(id);
    }
    Demo(int id,String name){
        this(56);
            System.out.println(id);
            System.out.println(name);
    }
}
public  class MainConstr1{
    static public void main(String... r){
        Demo d =new Demo(23,"user");
        
    } 
}