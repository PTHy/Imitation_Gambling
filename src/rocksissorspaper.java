import java.util.Scanner;

public class rocksissorspaper {
	static int user,curMon = 300000;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while(true) {
			showMenu();
		}
	}
	
	public static void showMenu() {
		System.out.println("====================");
		System.out.println("����(1) ����(2) ��(3)");
		System.out.println("���� �� �ֽʽÿ�");
		System.out.print("����>>");
		user = sc.nextInt();
		if(user < 1 ||user > 3) {
			System.out.println("�߸��� �Է��Դϴ�");
		} else {
			select();
		}
	}
	public static void select() {
		int bot = (int)((double)Math.random()*3)+1;
		int result = bot - user;
		result(bot, result);
	}
	public static void result(int bot, int result) {
		String message = null;
		//User Win
		if(result == -1 || result == 2) {
			message = "�̱�̽��ϴ� +5000";
			curMon += 5000;
		}else if(result == 0){
			message = "���̽��ϴ� +0";
		}else {
			message = "�й��ϼ̽��ϴ� -5000";
			curMon -= 5000;
		}
		message += "|�� ���� : ";
		switch(user) {
		case 1 :
			message += "����";
			break;
		case 2 :
			message += "����";
			break;
		case 3 :
			message += "��";
			break; 
		}
		message += " |���� ���� : ";
		switch(bot) {
		case 1 :
			message += "����";
			break;
		case 2 :
			message += "����";
			break;
		case 3 :
			message += "��";
			break;
		}
		message += "|���� �� : "+curMon;
		System.out.println("====================");
		System.out.println(message);
	}
}
