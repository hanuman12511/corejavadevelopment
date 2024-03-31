class Info{
    private int id;
    private  String name;
    void setData(int id,String name){
        this.id=id;
        this.name=name;
    }
    void showData(){
        System.out.println(id);
        System.out.println(name);
    }
}


class emp extends Info{
    private float salary;
    void setInfodata(int id,String name,float salary){
        this.salary=salary;
        setData(id,name);
        showData();
    }
    void showsalary(){
        System.out.println(salary);
    }
}
class Students extends Info{
    private float marks;
    void setDataInfo(int id,String name,float marks){
        this.marks=marks;
        setData(id, name);
        showData();
    }
    void show(){
        System.out.println(marks);
    }
}

class MainInherit1{
    public static void main(String[] args) {
        emp e=new emp();
        e.setInfodata(1,"user",3000);
        e.showsalary();
        Students s =new Students();
        s.setDataInfo(12, "hanu",40);
        s.show();
    }
}