public class b5 {
    String bookId;
    String bookName;
    public b5(String bookId, String bookName){
        this.bookId = bookId;
        this.bookName = bookName;
    }
    public void dispaly(){
        System.out.println("Mã sách: " + bookId + " Tên sách: " + bookName);
    }
    public static void main(String[] args) {
        b5 book = new b5("B001", "Cơ sở dữ liệu");
        book.dispaly();
    }

}
