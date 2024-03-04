import java.util.Scanner;

public class baitap03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true){
            System.out.println("Moi nhap so:");
            int n = Integer.parseInt(scanner.nextLine());
            int hangTram = n / 100;
            int hangChuc = n % 100 / 10;
            int hangDv = n % 10;
            String chuoi = "";
        if (n >= 0 && n <= 999) {
            System.out.print("Hang tram: " + hangTram);
            System.out.print(" - Hang chuc: " + hangChuc);
            System.out.println(" - Hang don vi: " + hangDv);
            switch (hangTram) {
                case 1:
                    chuoi = "One hundred";
                    break;
                case 2:
                    chuoi = "Two hundred";
                    break;
                case 3:
                    chuoi = "Three hundred";
                    break;
                case 4:
                    chuoi = "Four hundred";
                    break;
                case 5:
                    chuoi = "Five hundred";
                    break;
                case 6:
                    chuoi = "Six hundred";
                    break;
                case 7:
                    chuoi = "Seven hundred";
                    break;
                case 8:
                    chuoi = "Eight hundred";
                    break;
                case 9:
                    chuoi = "Nine hundred";
                    break;
            }
            if (hangChuc >= 2) {
                switch (hangChuc) {
                    case 2:
                        chuoi += " Twenty";
                        break;
                    case 3:
                        chuoi += " Thirdty";
                        break;
                    case 4:
                        chuoi += " Fourty";
                        break;
                    case 5:
                        chuoi += " Fifty";
                        break;
                    case 6:
                        chuoi += " Sixty";
                        break;
                    case 7:
                        chuoi += " Seventy";
                        break;
                    case 8:
                        chuoi += " Eighty";
                        break;
                    case 9:
                        chuoi += " Ninety";
                }
            }
            if (hangChuc == 1) {
                switch (hangDv) {
                    case 0:
                        chuoi += " Ten";
                        break;
                    case 1:
                        chuoi += " Eleven";
                        break;
                    case 2:
                        chuoi += " Twelve";
                        break;
                    case 3:
                        chuoi += " Thirdteen";
                        break;
                    case 4:
                        chuoi += " Fourteen";
                        break;
                    case 5:
                        chuoi += " Fiveteen";
                        break;
                    case 6:
                        chuoi += " Sixteen";
                        break;
                    case 7:
                        chuoi += " Seventeen";
                        break;
                    case 8:
                        chuoi += " Eighteen";
                        break;
                    case 9:
                        chuoi += " Nineteen";
                        break;
                }
            }
            if (hangChuc != 1){
            switch (hangDv){
                case 1:
                    chuoi += " One";
                    break;
                case 2:
                    chuoi += " Two";
                    break;
                case 3:
                    chuoi += " Three";
                    break;
                case 4:
                    chuoi += " Four";
                    break;
                case 5:
                    chuoi += " Five";
                    break;
                case 6:
                    chuoi += " Six";
                    break;
                case 7:
                    chuoi += " Seven";
                    break;
                case 8:
                    chuoi += " Eight";
                    break;
                case 9:
                    chuoi += " Nine";
                    break;
            }
            }
        }else {
            System.out.println("So ngoai khoang 0 - 999");
        }
        System.out.println(chuoi);
        }
    }
}
