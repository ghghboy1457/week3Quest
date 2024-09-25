import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("키(cm)를 입력하세요: ");
        double cm = sc.nextDouble();

        System.out.print("몸무게(kg)를 입력하세요: ");
        double kg = sc.nextDouble();

        double heightM = cm / 100;

        double bmi = kg / (heightM * heightM);

        System.out.println("당신의 BMI는" + bmi + "입니다");

        if (bmi < 18.5) {
            System.out.println("저체중입니다.");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("정상 체중입니다.");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("과체중입니다.");
        } else {
            System.out.println("비만입니다.");
        }
    }
}

