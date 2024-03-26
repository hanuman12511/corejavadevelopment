class Demo{
    void show(int id){
        System.out.println("id="+id);   
    }
    void show(int id,String name){
        System.out.println("id="+id+"\nname="+name);   
    }

}

public class Methodoverload {
    public static void main(String[] args) {
        Demo d =new Demo();
        d.show(8);
        d.show(3,"uset");
    }
}
