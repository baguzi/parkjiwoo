//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 1000; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }

        System.out.println("1부터 1000까지의 짝수의 합 :" + sum);

    }

}