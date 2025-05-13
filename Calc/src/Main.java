import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2,num3 ; ;

        System.out.println("숫자1을 입력하세요 ");
        num1 = sc.nextInt();
        System.out.println("숫자2을 입력하세요 ");
        num2 = sc.nextInt();
        System.out.println("숫자3을 입력하세요 ");
        num3=sc.nextInt();




        System.out.println(num1-num2-num3);
    }
}
