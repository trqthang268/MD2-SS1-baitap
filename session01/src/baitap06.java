import java.util.Scanner;

public class baitap06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra");
        int num = scanner.nextInt();

        if (num % 5 == 0 && num % 3 == 0){
            System.out.println(num+" chia hết cho cả 3 và 5");
        }else if(num % 5 == 0){
            System.out.println(num +" chia hết cho 5");
        }else if(num %3==0){
            System.out.println(num+" chia hết cho 3");
        }else{
            System.out.println(num+" Không chia hết cho 3, cũng không chia hết cho 5");
        }
    }
}
