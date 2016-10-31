package section5.lab2;

import junit.framework.TestCase;

public class ConsLoRestaurantTest extends TestCase {
	public void testConstructor() {
		Restaurant r1 = new Restaurant("Chez Nous", "French", "exp.", new Intersection(7, 65));
		Restaurant r2 = new Restaurant("Das Bier", "German", "cheap", new Intersection(2, 86));
		Restaurant r3 = new Restaurant("Sun", "Chinese", "cheap", new Intersection(10, 13));

		ILoRestaurant empty = new MTLoRestaurant();
		ILoRestaurant l1 = new ConsLoRestaurant(r1, empty);
		ILoRestaurant l2 = new ConsLoRestaurant(r2, l1);
		ILoRestaurant l3 = new ConsLoRestaurant(r3, l2);

		System.out.println(l3);

		ILoRestaurant all = new ConsLoRestaurant(r1,
				new ConsLoRestaurant(r2, new ConsLoRestaurant(r3, new MTLoRestaurant())));
		System.out.println(all);
	}
}
