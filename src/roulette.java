
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
				System.out.println(realseq + "번 : 부자가 됬어요!");
				rich++;
			}
			else {
				System.out.println(realseq + "번 : 다 잃었어요...");
				poor++;
			}
			realseq++;
			seq = 0;
			curMon = 300000;
		}
		System.out.println("\n===============================\n");
		System.out.printf("%d번 이겼고 %d번 졌습니다. 승률은 %.2f%% 입니다.\n",win,lose,(((double)win/(win+lose))*100));
		System.out.println(rich+"번 부자가 되었고 "+poor+"번 돈을 모두 잃었습니다. 부자가 된 확률은 "+((double)rich/realseq)*100+"% 입니다.");
	}
}
