public class b2 {
    String userName;
    String password;
    String email;
    public b2(String userName, String password, String email){
        this.userName = userName;
        this.password = password;
        this.email = email;
    }
    public void change_pass(String newPassword){
        password = newPassword;
    }
    public void dispaly(){
        System.out.println("userName: " + userName);
        System.out.println("password: " + password);
        System.out.println("email: " + email);
    }
    public static void main(String[] args) {
        b2 acc = new b2("nguyenvana", "110110", "nva@gmail.com");
        acc.dispaly();
        acc.change_pass("111111");
        acc.dispaly();
    }
}
