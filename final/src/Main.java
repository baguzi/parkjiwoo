import java.util.Scanner;

class Elevator {
    private int maxPeople;
    private int changePeople;

    public Elevator(int max) {
        this.maxPeople = max;
    }

    public void setPeople(int people) {
        this.changePeople = people;
    }

    public int getPeople() {
        return changePeople;
    }

    public String checkPeopleStatus() {
        if (changePeople >= maxPeople) {
            return "계단을 이용해 주세요";
        } else if (changePeople >= maxPeople - 2) {
            return "약간 혼잡합니다. 급하면 계단을 이용해주세요";
        } else {
            return "엘리베이터를 이용하셔도 됩니다.";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("엘리베이터 최대 인원을 입력하세요: ");
        int max = scanner.nextInt();

        Elevator elevator = new Elevator(max);

        while (true) {
            System.out.print("현재 탑승 인원을 입력하세요 (0 이하 입력 시 종료): ");
            int people = scanner.nextInt();

            if (people <= 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            elevator.setPeople(people);
            System.out.println("현재 인원: " + elevator.getPeople() + "명");
            System.out.println(elevator.checkPeopleStatus());
        }
    }
}

