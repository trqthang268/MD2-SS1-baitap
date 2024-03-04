import java.util.Scanner;

public class baitap04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài");
        int height = scanner.nextInt();
        System.out.println("Nhập chiều rộng");
        int width = scanner.nextInt();
        int chuvi = (height+width)*2;
        int dientich = height*width;
        System.out.println("Chu vi hình chữ nhật là: "+chuvi);
        System.out.println("Diện tích hình chữ nhật là: "+dientich);
    }
}
