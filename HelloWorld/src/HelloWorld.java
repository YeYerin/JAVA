import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("�̸���?");
		String name = in.next();
		Scanner on = new Scanner(System.in);
		System.out.println("������?");
		String birthday = on.nextLine();
		
		System.out.printf("�̸��� %s�̰�, ������ %s�̴�.",name,birthday);
	}

}
