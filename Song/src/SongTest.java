import java.util.Scanner;
public class SongTest {
	
public static void main(String[] args) {
		
		Song mysong[] = new Song[5];
		
		mysong[0] = new Song("�׸����ϴ�","������",2017,"�ѱ�");
		mysong[1] = new Song("�Ƹ���� ��������","������",2018,"�ѱ�");
		mysong[2] = new Song("���","�¿�",2019,"�ѱ�");
		mysong[3] = new Song("�̾���","������,�̹���,��â��",2019,"�ѱ�");
		mysong[4] = new Song();
		
		//���
		for(int i=0;i<mysong.length;i++) {
			System.out.println("\n�뷡���� : "+ mysong[i].title +"\n���� : "+mysong[i].artist +"\n��ǥ�ȿ��� : "+mysong[i].year +"��\n���� : "+mysong[i].country);
		}
		
		//�˻�(quit �Է��ϸ� ����)
		Scanner in = new Scanner(System.in);
		while(true) {
			String s = in.nextLine();
			if(s.equals("quit")) break;
			for(int i=0;i<mysong.length;i++) {
				if(s.equals(mysong[i].title)) {
					System.out.println("\n�뷡���� : "+ mysong[i].title +"\n���� : "+mysong[i].artist +"\n��ǥ�ȿ��� : "+mysong[i].year +"��\n���� : "+mysong[i].country);
					break;
				}
			}
		}
		
	}
}
