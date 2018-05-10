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
		System.out.println("가위(1) 바위(2) 보(3)");
		System.out.println("선택 해 주십시오");
		System.out.print("선택>>");
		user = sc.nextInt();
		if(user < 1 ||user > 3) {
			System.out.println("잘못된 입력입니다");
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
			message = "이기셨습니다 +5000";
			curMon += 5000;
		}else if(result == 0){
			message = "비기셨습니다 +0";
		}else {
			message = "패배하셨습니다 -5000";
			curMon -= 5000;
		}
		message += "|내 선택 : ";
		switch(user) {
		case 1 :
			message += "가위";
			break;
		case 2 :
			message += "바위";
			break;
		case 3 :
			message += "보";
			break; 
		}
		message += " |봇의 선택 : ";
		switch(bot) {
		case 1 :
			message += "가위";
			break;
		case 2 :
			message += "바위";
			break;
		case 3 :
			message += "보";
			break;
		}
		message += "|현재 돈 : "+curMon;
		System.out.println("====================");
		System.out.println(message);
	}
}
