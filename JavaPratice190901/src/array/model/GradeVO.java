package array.model;

import java.util.Random;

public class GradeVO {

	private GradeVO[] gradeVO;
	public void newVO(int length) {
		gradeVO = new GradeVO[length];
		
	}
	public void makeScore() {
		Random rnd = new Random();
		
		for(int i = 0 ; i < gradeVO.length ; i++) {
			gradeVO[i] = new GradeVO();
			
			String strNum = String.format("03d", i+1);
			int intKor = rnd.nextInt(101);
			int intEng = rnd.nextInt(101);
			
			gradeVO[i].strNum = strNum;
			
		}
	}
}
