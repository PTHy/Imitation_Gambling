
public class roulette {
	public static void main(String[] args) {
		int[] arr = new int [3];
		int curMon = 300000, seq = 0, ranNum,ranNum2,ranNum3;
		while(curMon > 0 || curMon < 500000) {
			curMon -= 1500;
			
			ranNum = (int)((Math.random()*7) + 1);
			ranNum2 = (int)((Math.random()*7) + 1);
			ranNum3 = (int)((Math.random()*7) + 1);
			
			arr[0] = ranNum;
			arr[1] = ranNum2;
			arr[2] = ranNum3;
			if(arr[0] == arr[1]) {
				if(arr[1] == arr[2]) {
					System.out.println("arr[0] : "+arr[0]+"arr[1]"+arr[1]+"arr[2]"+arr[2]);
					curMon += 500000;
					continue;
				}
			}
			seq++;
		}
	}
}
