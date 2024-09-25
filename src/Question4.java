import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자 : ");
        int num1 = sc.nextInt();
        System.out.print("두번째 숫자 : ");
        int num2 = sc.nextInt();
        System.out.print("사용할 연산자 ");
        char ch = sc.next().charAt(0);
        int result = 0;
        switch (ch) {
            case '*':
                result = num1 * num2;
                break;
            case '+':
                result = num1 + num2;
                break;
            case ',':
            case '.':
            default:
                System.out.println("연산자를 잘못 입력하였습니다");
                break;
            case '-':
                result = num1 - num2;
                break;
            case '/':
                result = num1 / num2;
        }

        System.out.println("결과: " + result);
    }
}