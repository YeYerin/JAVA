import java.util.Scanner;

public class Cylinder {

	public static void main(String[] args) {
		Scanner rad = new Scanner(System.in);
		System.out.println("밑면의 반지름은?");
		int radius = rad.nextInt();
		
		Scanner hei = new Scanner(System.in);
		System.out.println("기둥의 높이는?");
		int height = hei.nextInt();
		
		System.out.printf("원기둥의 부피는 %f입니다.",radius*radius*3.14*height);
	}
}
