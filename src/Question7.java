import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("월을 입력하세요: ");
        int month = sc.nextInt();
        switch (month) {
            case 1:
                System.out.println("1월은 겨울입니다");
                break;
            case 2:
                System.out.println("2월은 겨울입니다");
                break;
            case 3:
                System.out.println("3월은 봄입니다");
                break;
            case 4:
                System.out.println("4월은 봄입니다");
                break;
            case 5:
                System.out.println("5월은 봄입니다");
                break;
            case 6:
                System.out.println("6월은 봄입니다");
                break;
            case 7:
                System.out.println("7월은 여름입니다");
                break;
            case 8:
                System.out.println("8월은 여름입니다");
                break;
            case 9:
                System.out.println("9월은 가을입니다");
                break;
            case 10:
                System.out.println("10월은 가을입니다");
                break;
            case 11:
                System.out.println("11월은 가을입니다");
                break;
            case 12:
                System.out.println("12월은 겨울입니다");
        }

    }
}
