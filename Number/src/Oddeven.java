import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Á¤¼ö¸¦ ÀÔ·ÂÇÏ¼î");
		int num = in.nextInt();
		
		if(num%2==0) System.out.println("Â¦¼ö");
		else System.out.println("È¦¼ö");
	}

}
