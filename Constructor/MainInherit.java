class Info{
    int id;
    String name;
    void show(){
        
    }
}

class CSD extends Info{
    
    void show(){
        System.out.println(id+"\n");
        System.out.println(name+"\n");
    }
}
class Lib extends Info{
   
    void show(){
        System.out.println(id+"\n");
        System.out.println(name+"\n");
    }
}
public class MainInherit {
    public static void main(String[] args) {
        CSD obj =new CSD();
        obj.id=9;
        obj.name="user";
        obj.show();
    }
    
}
