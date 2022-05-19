import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        // 입력
        Scanner scanner = new Scanner(System.in);

        System.out.print("신장(cm): ");
        double height = scanner.nextDouble();

        System.out.print("체중(kg): ");
        double weight = scanner.nextDouble();

        // 처리
        double bmi = weight / (height * height * 0.0001);
        String result = "비만도 결과";

        // 결과
        if (bmi <= 18.5) {
            result = "저체중";
        }

        if (bmi > 18.5 && bmi <= 23) {
            result = "정상";
        }

        if (bmi > 23 && bmi <= 25) {
            result = "과체중";
        }

        if (bmi > 25) {
            result = "비만";
        }

        System.out.println("비만도 결과: " + result);
        System.out.println("BMI: " + bmi);
    }
}
