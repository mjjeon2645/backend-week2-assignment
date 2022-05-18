import java.util.Scanner;

public class Animalfarm {
    public static void main(String[] args) {

        // 입력 준비
        Scanner scanner = new Scanner(System.in);

        // 동물 이름 입력받기
        System.out.print("동물 이름: ");
        String animal = scanner.nextLine();

        // 동물 별 울음소리 정의하기
        String rooster = "꼬꼬댁";
        String pig = "꿀꿀";
        String dog = "멍멍";
        String others = "우리 농장에는 그 동물이 없습니다.";

        // 출력하기

        if(animal.equals("닭")) {             // 닭이라면 실행
            System.out.println(rooster);
        }

        else if(animal.equals("돼지")) {       // 닭이 아니라 돼지라면 실행
            System.out.println(pig);
        }

        else if(animal.equals("개")) {        // 돼지도 아니라 개라면 실행
            System.out.println(dog);
        }

        else {                               // 이도 저도 다 아니면 실행
            System.out.println(others);
        }

    }
}

