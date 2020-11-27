package example;

import lombok.Data;


class Song {
	private String title;
	private String artist;
	private int year;
	private String country;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Song(String title, String artist, int year, String country) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country =country;
	}
	
	public Song() {
		// TODO Auto-generated constructor stub
	}
	void show() {
		System.out.println(year+"년 "+country+"국적의 "+artist+"가 부른"+title);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song s = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
		s.show();
		//		s.setYear(1978);
//		s.setCountry("스웨덴");
//		s.setArtist("ABBA");
//		s.setTitle("Dancing Queen");
	}

}
