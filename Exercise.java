import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        // 필요정보 입력받기
        Scanner scanner = new Scanner(System.in);

        System.out.print("운동 종류: ");
        String exerciseType = scanner.nextLine();

        System.out.print("체중(kg): ");
        double weight = scanner.nextDouble();

        System.out.print("운동 시간(분): ");
        double time = scanner.nextDouble();

        // 처리
        double cycle = 2.3 * weight * (time / 15);
        double walking = 0.9 * weight * (time / 15);
        double running = 2 * weight * (time / 15);
        double burnedCalorie = 0;

        if (exerciseType.equals("자전거")) {
            burnedCalorie = cycle;
        }

        if (exerciseType.equals("걷기")) {
            burnedCalorie = walking;
        }

        if (exerciseType.equals("달리기")) {
            burnedCalorie = running;
        }

        //출력
        System.out.println("칼로리 소모: " + burnedCalorie + "kcal");
    }
}
