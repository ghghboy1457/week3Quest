import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력한 숫자 : ");
        int num1 = sc.nextInt();

        if (num1 % 3 == 0 && num1 % 5 == 0) {
            System.out.println("3과 5의 배수입니다.");
        } else if (num1 % 3 == 0) {
            System.out.println("3의 배수입니다.");
        } else if (num1 % 5 == 0) {
            System.out.println("5의 배수입니다.");
        } else {
            System.out.println("해당 배수의 만족시키지 않는다,");
        }
    }
}

