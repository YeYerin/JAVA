import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("������ �Է��ϼ�");
		int num = in.nextInt();
		
		if(num%2==0) System.out.println("¦��");
		else System.out.println("Ȧ��");
	}

}
