package array.model;

public class StudentVO {

	
	public String strNum;
	public String strName;
	public String strDeg;
	public int intKor;
	public int intEng;
	
	public int total;
	public float average;
	
	public void total() {
		total = intKor + intEng;
		System.out.println(strNum + "번째 학생의 총점 : "+ total);
	}
	public void average() {
		average = (intKor + intEng) / 2;
		System.out.println(strNum + "번째 학생의 평균 : " + average);
	}

	
}
