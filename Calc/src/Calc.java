import java.util.Scanner;

public abstract class Calc {

	int a;
	int b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public abstract int calculate();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>> ");
		int a = in.nextInt();
		int b = in.nextInt();
		String cal = in.next();

		if (cal.equals("+")) {
			Add add = new Add();
			add.setValue(a, b);
			System.out.println(add.calculate());
		} else if (cal.equals("-")) {
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.println(sub.calculate());

		} else if (cal.equals("*")) {
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.println(mul.calculate());
		} else if (cal.equals("/")) {
			Div div = new Div();
			if (b == 0) {
				System.out.println("0���� ���� �� �����ϴ�.");
			} else {
				div.setValue(a, b);
				System.out.println(div.calculate());
			}
		} else
			System.out.println("+,-,*,/ �� �����մϴ�.");
	}

}
