
public class Printer {
	int paper;	int use;
	void print(int paper, int use) {
		System.out.println("용지추가 : "+ paper + "\n용지출력 : "+ use + "\n남은용지 : " + (paper-use));
	}
}
 