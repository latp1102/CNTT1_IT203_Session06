public class b6 {
    private String id;
    private String userName;
    private String password;
    private String email;
    public b6(String id, String userName, String password, String email){
        this.id = id;
        this.userName = userName;
        this.setPassword(password);
        this.setEmail(email);
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return "*****";
    }
    public void setPassword(String password) {
        if(password != null && !password.trim().isEmpty()){
            this.password = password;
        }else {
            System.out.println("Pass không để trống");
        }
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        if(email != null && email.contains("@")){
            this.email = email;
        }else {
            System.out.println("email ko hợp lệ");
        }

    }
    public void display(){
        System.out.println("Id: " + id + " userName: " + userName + " Pass: " + password  + " email: " + (email != null ? email: "N/A"));
    }
    public static void main(String[] args) {
        b6 user_1 = new b6("123", "Trần Văn A", "12345", "tranvana@gmail.com");
        user_1.display();
        b6 user_2 = new b6("123", "Trần Văn B", "", "tranvabgmail.com");
        System.out.println("Mật khẩu: " + user_2.getPassword());
    }
}
