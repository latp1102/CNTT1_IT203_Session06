public class b1 {
    String studentId;
    String fullName;
    int birthYear;
    double gpa;
     public b1(String studentId, String fullName, int birthYear, double gpa){
         this.studentId = studentId;
         this.fullName = fullName;
         this.birthYear = birthYear;
         this.gpa = gpa;
    }
    public void display(){
        System.out.println("Mã sv: " + studentId);
        System.out.println("Họ và tên: " + fullName);
        System.out.println("Năm sinh: " + birthYear);
        System.out.print("Điểm TB: " + gpa);
    }
    public static void main(String[] args) {
        b1 sv1 = new b1("B001", "Nguyễn Văn A", 2000, 3.0);
        b1 sv2 = new b1("B002", "Nguyễn Văn B", 2001, 3.1);
        sv1.display();
        sv2.display();
    }
}
