/* abstract class Info{
    void show(){

    }
    abstract void setData(int id,String name);
    abstract void showinfo();
} */

interface Info{
     void setData(int id,String name);
    void showinfo();
}

class EC implements Info{
    private int id;
    private String name;
   public  void setData(int id,String name){
       this.id=id;
       this.name=name;
    }
  public  void showinfo(){
        System.out.println(id);
        System.out.println(name);

    }
    void showMarks(){
        System.out.println("marks");
    }

}

class CS extends Info{
    private int id;
    private String name;
    void setData(int id,String name){
       this.id=id;
       this.name=name;
    }
    void showinfo(){
        System.out.println(id);
        System.out.println(name);

    }

}

public class Abstractclass {
    public static void main(String[] args) {
        
        Info info = new EC();
        info.setData(12 , "user");
        info.showinfo();
      // info.showMarks();
    }
    
}
