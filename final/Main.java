import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int person = 0 ;

        System.out.println("엘레베이터 탑승 인원");
        person = sc.nextInt();

        if(person > 7){
            System.out.println("사람이 너무 많습니다 계단을이용하세요");
        }

    }
}