//public class demo {
//    private double radius;
//    public demo(double radius){
//        this.radius = radius;
//    }
//    public static void main(String[] args) {
//        demo cr1 = new demo(5);
//        demo cr2 = new demo(5);
//    }
//}
public class demo {
    private String id;
    private String name;
    private  String phone;
    private boolean e;
    // getter lấy giá trị các thuôc tính
    public String getId(){
        return id;
    }

    // setter gán giá trị cho các thuộc tính
    public void setId(){
        this.id = id;
    }
    // thay đổi
    public void setName(String name){

    }
    // đối số là cái mới truyền vào

    // hàm tạo
    public demo(String id, String name, String phone, boolean e){
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.e = e;
    }
    public static void main(String[] args) {
        // khởi tạo đối tượng
        demo sc1 = new demo("S001", "K", "009", true);
    }
}