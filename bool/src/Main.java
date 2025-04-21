import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("정수를 입력하세요: ");
        num = sc.nextInt();

        if (num >= 1 && num <=100){
            System.out.println(num);
        }
        else {
            System.out.println("1에서 100 사이의 값이 아닙니다.");
        }


    }
}