import java.util.Scanner;

public class Cylinder {

	public static void main(String[] args) {
		Scanner rad = new Scanner(System.in);
		System.out.println("�ظ��� ��������?");
		int radius = rad.nextInt();
		
		Scanner hei = new Scanner(System.in);
		System.out.println("����� ���̴�?");
		int height = hei.nextInt();
		
		System.out.printf("������� ���Ǵ� %f�Դϴ�.",radius*radius*3.14*height);
	}
}
