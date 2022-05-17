import java.util.Scanner;

public class OnaDiet {
    public static void main(String[] args) {

        // 입력 준비
        Scanner scanner = new Scanner(System.in);

        // 운동종류 입력받기
        System.out.print("운동 종류: ");
        String training = scanner.nextLine();

        // 체중 입력받기
        System.out.print("체중(kg): ");
        int weight = scanner.nextInt();

        // 운동시간 입력받기
        System.out.print("운동 시간(분): ");
        int time = scanner.nextInt();

        // 칼로리 소모량 계산하여 출력하기
        // 소모량 = 운동계수 * 체중

        double cycle = weight * time * 2.3 / 15;
        double walking = weight * time * 0.9 / 15;
        double running = weight * time * 2 / 15;

        if("자전거".equals(training))
            System.out.println("칼로리 소모: " + cycle + "kcal");

        if("걷기".equals(training))
            System.out.println("칼로리 소모: " + walking + "kcal");

        if("달리기".equals(training))
            System.out.println("칼로리 소모: " + running + "kcal");           // 질문. 여기는 왜 소숫점이 예시처럼 안나올까?

    }
}
