import java.util.Scanner;

public class horseRacing {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		final int MAX_FIELD_LENGTH = 100;
		int input,chk = 0,winner = 0;
		int[] horses = new int[4];
		System.out.println("1번마 | 2번마 | 3번마 | 4번마");
		System.out.print("선택>");
		input = sc.nextInt();
		if(input < 1 || input > 4) {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		while(true) {
			for(int i = 0; i < 4; i++) {
				horses[i] += (int)((double)Math.random()*3)+1;
				if(horses[i] >= 100) {
					chk = 1;
					winner = i+1;
					break;
				}
			}
			if(chk == 1)
				break;
			else
				continue;
		}
		//todo 말 달리는거 그래픽 추가해야됩니다
		System.out.print(winner+"번마 승리 ");
		if(input == winner)
			System.out.println("당신이 맟추셨습니다");
		else
			System.out.println("당신은 틀리셨습니다");
	}
}
