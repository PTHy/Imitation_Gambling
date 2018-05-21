import java.util.Scanner;

public class horseRacing {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		final int MAX_FIELD_LENGTH = 100;
		int input,chk = 0,winner;
		int[] horses = new int[4];
		System.out.println("1번마 | 2번마 | 3번마 | 4번마");
		System.out.print("선택>");
		input = sc.nextInt();
		if(input < 1 || input > 4) {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		//todo 말 달리는거 해야됨
		while(true) {
			for(int horse : horses) {
				horse += (int)((double)Math.random()*3)+1;
				if(horse >= 100) {
					chk = 1;
					winner = 0;
					break;
				}
			}
		}
		
		
	}
}
