import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("연도를 입력하세요 : ");
        int year = sc.nextInt();
        if ((year % 4 != 0 || year % 100 == 0) && year % 400 != 0) {
            System.out.println("윤년에 해당되지 않습니다.");
        } else {
            System.out.println("윤년입니다.");
        }

    }
}