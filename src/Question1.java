import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("이 정수는 짝수 입니다");
        } else {
            System.out.println("이 정수는 홀수입니다");
        }

    }
}

