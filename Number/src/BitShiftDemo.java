
public class BitShiftDemo {

	public static void main(String[] args) {
		
		int a=-10;
		System.out.printf("%d= 0x%x \n", a,a);
		int b=a>>3;
		System.out.printf("%d>>3= 0x%x \n", a,b);
		b=a<<3;
		System.out.printf("%d<<3= 0x%x \n", a,b);
		b=a>>>3;
		System.out.printf("%d>>>3= 0x%x \n", a,b);
	}

}
