
public class Song {
	
String title; String artist; int year; String country;
	
	public Song(String title,String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	//제목,가수,연도,국적이 다 입력되지 않으면 이 값을 넣어준다.
	public Song(){
		this("","",0,"");
	}

} 
