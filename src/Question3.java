import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요: ");
        int score = sc.nextInt();
        if (score >= 90) {
            System.out.println("당신의 학점은 A");
        } else if (score >= 80) {
            System.out.println("당신의 학점은 B");
        } else if (score >= 70) {
            System.out.println("당신의 학점은 C");
        } else if (score >= 60) {
            System.out.println("당신의 학점은 D");
        } else {
            System.out.println("당신의 학점은 F");
        }

    }
}


