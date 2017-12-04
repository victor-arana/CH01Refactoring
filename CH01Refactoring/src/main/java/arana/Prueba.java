package arana;

public class Prueba {

	public static void main(String[] args) {
		Customer victor = new Customer("Victor");
		Movie birdman = new Movie("birdman", Movie.REGULAR);
		Rental rental = new Rental(birdman, 1);
		victor.addRental(rental);
		System.out.println(victor.statement());
	}

}
