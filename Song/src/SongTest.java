import java.util.Scanner;
public class SongTest {
	
public static void main(String[] args) {
		
		Song mysong[] = new Song[5];
		
		mysong[0] = new Song("그리워하다","비투비",2017,"한국");
		mysong[1] = new Song("아름답고도 아프구나","비투비",2018,"한국");
		mysong[2] = new Song("사계","태연",2019,"한국");
		mysong[3] = new Song("미안해","서은광,이민혁,이창섭",2019,"한국");
		mysong[4] = new Song();
		
		//출력
		for(int i=0;i<mysong.length;i++) {
			System.out.println("\n노래제목 : "+ mysong[i].title +"\n가수 : "+mysong[i].artist +"\n발표된연도 : "+mysong[i].year +"년\n국적 : "+mysong[i].country);
		}
		
		//검색(quit 입력하면 종료)
		Scanner in = new Scanner(System.in);
		while(true) {
			String s = in.nextLine();
			if(s.equals("quit")) break;
			for(int i=0;i<mysong.length;i++) {
				if(s.equals(mysong[i].title)) {
					System.out.println("\n노래제목 : "+ mysong[i].title +"\n가수 : "+mysong[i].artist +"\n발표된연도 : "+mysong[i].year +"년\n국적 : "+mysong[i].country);
					break;
				}
			}
		}
		
	}
}
