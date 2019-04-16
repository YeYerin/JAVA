import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("이름은?");
		String name = in.next();
		Scanner on = new Scanner(System.in);
		System.out.println("생일은?");
		String birthday = on.nextLine();
		
		System.out.printf("이름은 %s이고, 생일은 %s이다.",name,birthday);
	}

}
