import java.util.Scanner;

class Elevator {
    int maxPeople;
    int changePeople;

    public Elevator(int max)
    {
        maxPeople = max;
    }

    public void setPeople(int people) {
        changePeople = people;
    }

    public void checkPeople() {
        System.out.println("현재 인원: " + changePeople + "명");

        if (changePeople >= maxPeople) {
            System.out.println("계단을 이용해 주세요");
        } else if (changePeople >= maxPeople - 2) {
            System.out.println("약간 혼잡합니다. 급하면 계단을 이용해주세요");
        } else {
            System.out.println("엘리베이터를 이용하셔도 됩니다.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("엘리베이터 최대 인원을 입력하세요: ");
        int max = scanner.nextInt();

        Elevator elevator = new Elevator(max);

        System.out.print("현재 탑승 인원을 입력하세요: ");
        int people = scanner.nextInt();

        elevator.setPeople(people);
        elevator.checkPeople();
    }
}
