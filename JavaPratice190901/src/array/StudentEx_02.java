package array;

import array.model.GradeVO;

public class StudentEx_02 {

	public static void main(String[] args) {
		
		GradeVO gService = new GradeVO();
		
		gService.newVO(50);
		gService.makeScore();
		gService.scoreList();
	}
}
