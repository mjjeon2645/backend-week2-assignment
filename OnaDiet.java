import java.util.Scanner;

public class OnaDiet {
    public static void main(String[] args) {

        // 입력 준비
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        System.out.print("신장(cm): ");
        double height = scanner.nextDouble();

        System.out.print("체중(kg): ");
        double weight = scanner.nextDouble();

        // BMI 계산과 출력
        double result = weight / (0.0001 * height * height);
        String low = "저체중";
        String normal = "정상";
        String high = "과체중";
        String fat = "비만";

        if (result <= 18.5)
            System.out.println("비만도 결과: " + low);

        if (result > 18.5 && result <= 23)
            System.out.println("비만도 결과: " + normal);

        if (result > 23 && result <= 25)
            System.out.println("비만도 결과: " + high);

        if (result > 25)
            System.out.println("비만도 결과: " + fat);

        System.out.println("BMI: " + result);
    }
}