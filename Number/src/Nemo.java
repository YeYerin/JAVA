import java.util.Scanner;

public class Nemo {

	public static void main(String[] args) {
		Scanner w = new Scanner(System.in);
		System.out.println("가로를 입력하쇼");
		int wid = w.nextInt();
		
		Scanner h = new Scanner(System.in);
		System.out.println("세로를 입력하쇼");
		int hei = h.nextInt();
		
		System.out.printf("넓이는 %d",wid*hei);

	}
}
