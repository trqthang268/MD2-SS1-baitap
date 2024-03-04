import java.util.Scanner;

public class baitap02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập USD");
        int USD = scanner.nextInt() ;
        int VND = USD*23000;
        System.out.println("Giá trị tương ứng với USD là "+VND+"Đ");

    }
}
