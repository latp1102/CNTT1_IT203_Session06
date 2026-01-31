public class b4 {
    String id;
    String name;
    double salary;
    public b4(){
        this.id = "unknow";
        this.name = "unknow";
        this.salary = 0.0;
    }
    public b4(String id, String name){
        this.id = id;
        this.name = name;
        this.salary = 0.0;
    }
    public b4(String id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void display(){
        System.out.print("Id: " + id + " name: " + name + " salary: " + salary);
    }
    public static void main(String[] args) {
        b4 employee_1 = new b4();
        employee_1.display();
        System.out.println();
        b4 employee_2 = new b4("S001", "Nguyễn Văn B");
        employee_2.display();
        System.out.println();
        b4 employee_3 = new b4("S001", "Nguyễn Văn A", 12000000);
        employee_3.display();
    }
}
