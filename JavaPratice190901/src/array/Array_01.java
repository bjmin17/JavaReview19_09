package array;

import java.util.Random;

public class Array_01 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] lottoNum = new int[6];
		int nLottoIndex = 0;
		
		while(true) {
			int lotNum = rnd.nextInt(45) + 1;
			int index;
			for(index = 0; index < lottoNum.length; index ++) {
				if(lottoNum[index] == lotNum) 

					break;
				System.out.println(index + "번째 " + "로또 인덱스" + lottoNum[index]);
				System.out.println("랜덤 로또 번호" + lotNum);
				// 0 0<6 Num[0] 
			}
			if(index >= lottoNum.length)
				System.out.println("if문의 " + lottoNum[nLottoIndex]);
				System.out.println("if문의 " + lotNum);
				lottoNum[nLottoIndex++] = lotNum;
				System.out.println("if문의 " + lottoNum[nLottoIndex-1]);
				System.out.println("if문의 " + nLottoIndex);
			if(nLottoIndex >= lottoNum.length) break;
			
		}
		System.out.print("로또 번호 추첨 :");
		for(int i = 0 ; i < lottoNum.length ; i++) {
			System.out.print (lottoNum[i] + ", ");
		}
	}
	
	

}
