
public class coin {
	public static void main(String[] args) {
		int betMon, curMon = 300000, coin, seq = 0, sel, realseq = 0, win = 0, lose = 0;
		double per;

		while (realseq < 40) {
			while (curMon >= 0 && curMon <= 500000) {
				betMon = (int) (Math.random() * 2000) + 1;

				// 1 = front, 2 = back
				sel = (int) (Math.random() * 2) + 1;
				coin = (int) (Math.random() * 2) + 1;

				if (coin == sel)
					curMon += betMon;
				else
					curMon -= betMon;
				seq++;
//				System.out.println("idx : " + seq + " ���� �ݾ� : " + betMon + "���� �ݾ� : " + curMon);
			}
//			System.out.println("���� �ݾ� : " + curMon);
			if (curMon <= 0)
				lose ++;
			else
				win++;
			seq = 0;
			curMon = 300000;
			realseq++;
		}
		per = ((double)win/realseq)*100;
		System.out.println("500000������ �� ��� : "+win+"�� ��� ���� ��� : "+lose+"�� �·� :"+per+"%");
	}
}
