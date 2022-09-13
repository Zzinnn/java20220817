package ch13.book.p659;

public class ProductExample {
	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setKind(new Tv());
		Tv tv = product1.getKind();
		String tvModel =product1.getMedel();
	}
	
	public<Car, String> product2 = new Product<Car, String>();
	product2.setKind(new Car());
	product2.setModel("디젤");
	Car car = product2.getKind();
	String carModel = product2.getmodel();
	
}

class Tv {
	
}
class Car{
	
}
