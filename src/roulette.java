
public class roulette {
	public static void main(String[] args) {
		int[] arr = new int [3];
		int curMon = 300000,realseq = 0,seq = 0, ranNum,ranNum2,ranNum3,rich=0,poor=0,win=0,lose=0;
		while(realseq < 100) {
			while(curMon > 0 && curMon < 500000) {
				curMon -= 1500;
				for(int i = 0; i < 3; i++) {
					arr[i] = (int)(Math.random()*8+1);	
				}
				
				if(arr[0] == arr[1]) {
					if(arr[1] == arr[2]) {
						curMon += 100000;
						win++;
						continue;
					}
				}
				seq++;
				lose++;
			}
			if(curMon > 500000) {
				System.out.println(realseq + "�� : ���ڰ� ����!");
				rich++;
			}
			else {
				System.out.println(realseq + "�� : �� �Ҿ����...");
				poor++;
			}
			realseq++;
			seq = 0;
			curMon = 300000;
		}
		System.out.println("\n===============================\n");
		System.out.printf("%d�� �̰�� %d�� �����ϴ�. �·��� %.2f%% �Դϴ�.\n",win,lose,(((double)win/(win+lose))*100));
		System.out.println(rich+"�� ���ڰ� �Ǿ��� "+poor+"�� ���� ��� �Ҿ����ϴ�. ���ڰ� �� Ȯ���� "+((double)rich/realseq)*100+"% �Դϴ�.");
	}
}
