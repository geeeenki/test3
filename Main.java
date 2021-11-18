package test3;

public class Main {

	public static void main(String[] args) {
		
		
		Pikatyu pika = new Pikatyu();
		Basyamo basya = new Basyamo();
		Kairyu kai = new Kairyu();
		
		pika.setName("ピカチュウ");
		basya.setName("バシャーモ");
		kai.setName("カイリュウ");
		
		
		pika.attack();
		basya.defence();
		kai.FireThunderAt();
		
	}

}
