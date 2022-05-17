import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        // 입력받을 준비
        Scanner scanner = new Scanner(System.in);

        // 신장 입력
        System.out.print("신장(cm): ");
        double height = scanner.nextFloat();

        // 체중 입력
        System.out.print("체중(kg): ");
        double weight = scanner.nextFloat();

        // BMI 계산 및 if식
        double bmi = weight / (height * height * 0.0001);        // 질문. 왜 float 가 아닌 double을 사용해야 하는가
        boolean low = bmi <= 18.5;
        boolean normal = bmi > 18.5 && bmi <= 23;
        boolean high = bmi > 23 && bmi <= 25;
        boolean fat = bmi > 25;

        String a = "저체중";
        String b = "정상";
        String c = "과체중";
        String d = "비만";

        if(low) {
            System.out.println("비만도 결과: " + a);
        }

        if(normal) {
            System.out.println("비만도 결과: " + b);
        }

        if(high) {
            System.out.println("비만도 결과: " + c);
        }

        if(fat) {
            System.out.println("비만도 결과: " + d);
        }

        System.out.println("BMI: " + bmi);
    }
}
