import java.util.Scanner;

public class horseRacing {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		final int MAX_FIELD_LENGTH = 100;
		int input,chk = 0,winner;
		int[] horses = new int[4];
		System.out.println("1���� | 2���� | 3���� | 4����");
		System.out.print("����>");
		input = sc.nextInt();
		if(input < 1 || input > 4) {
			System.out.println("�߸��� �Է��Դϴ�.");
			return;
		}
		//todo �� �޸��°� �ؾߵ�
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
