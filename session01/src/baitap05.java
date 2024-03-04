import java.util.Scanner;

public class baitap05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập điểm Toán");
        int toan = scanner.nextInt();
        System.out.println("Nhập điểm Lý");
        int ly = scanner.nextInt();
        System.out.println("Nhập điểm Hóa");
        int hoa = scanner.nextInt();
        System.out.println("Nhập điểm Văn");
        int van = scanner.nextInt();
        System.out.println("Nhập điểm Anh");
        int anh = scanner.nextInt();
        int average = (toan + ly + hoa + van + anh) / 5;

        if (toan <= 10 && ly <= 10 && hoa <= 10 && van <= 10 && anh <= 10 && toan >= 0 && ly >= 0 && hoa >= 0 && van >= 0 && anh >= 0) {
            if (average >= 9) {
                System.out.println("Xếp loại xuất sắc");
            } else if (average < 9 && average >= 8) {
                System.out.println("Xếp loại giỏi");
            } else if (average <8 && average >= 6.5){
                System.out.println("Xếp loại khá");
            }else if (average <6.5 && average >=5){
                System.out.println("Xếp loại trung bình");
            }else{
                System.out.println("Xếp loại yếu");
            }
        }else {
            System.out.println("Nhập liệu sai, hãy nhập lại");
        }
    }
}
