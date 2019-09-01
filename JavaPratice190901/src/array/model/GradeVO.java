package array.model;

import java.util.Random;

public class GradeVO {

	private StudentVO[] studentVO;
	public void newVO(int length) {
		studentVO = new StudentVO[length];
		
	}
	public void makeScore() {
		Random rnd = new Random();
		
		for(int i = 0 ; i < studentVO.length ; i++) {
			studentVO[i] = new StudentVO();
			
			String strNum = String.format("%03d", i+1);
			int intKor = rnd.nextInt(101);
			int intEng = rnd.nextInt(101);
			
			studentVO[i].strNum = strNum;
			studentVO[i].intKor = intKor;
			studentVO[i].intEng = intEng;
			
		}
	}
	public void scoreList() {
		System.out.println("==========================");
		System.out.println("성적표");
		System.out.println("--------------------------");
		System.out.println("학번\t국어\t영어");
		System.out.println("--------------------------");
		for(int i = 0 ; i < studentVO.length ; i++) {
			System.out.print(studentVO[i].strNum + "\t");
			System.out.printf("%3d\t", studentVO[i].intKor);
			System.out.printf("%3d\n", studentVO[i].intKor);
		}
		System.out.println("==========================");
	}
}
