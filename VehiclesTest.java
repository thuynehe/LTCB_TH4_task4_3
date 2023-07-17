/**
 * 
 */
package Task4_3;

import junit.framework.TestCase;

/**
 * @author ThuyNguyen
 *
 */
public class VehiclesTest extends TestCase {
	public void test() {
		//create test for class Vehicles
		Vehicles bus = new Buses(1, 30, 3000, "NLU");
		Vehicles limo = new Limos(1, 10, 7);
		Vehicles car = new Cars(3, 4,"Red");
		Vehicles subway = new Subways(4, 150, 50000);
	}
}
