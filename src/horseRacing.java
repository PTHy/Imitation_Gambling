import java.util.Scanner;

public class horseRacing {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		final int MAX_FIELD_LENGTH = 100;
		int input,chk = 0,winner = 0;
		int[] horses = new int[4];
		System.out.println("1���� | 2���� | 3���� | 4����");
		System.out.print("����>");
		input = sc.nextInt();
		if(input < 1 || input > 4) {
			System.out.println("�߸��� �Է��Դϴ�.");
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
		//todo �� �޸��°� �׷��� �߰��ؾߵ˴ϴ�
		System.out.print(winner+"���� �¸� ");
		if(input == winner)
			System.out.println("����� ���߼̽��ϴ�");
		else
			System.out.println("����� Ʋ���̽��ϴ�");
	}
}
