/**
 * 
 */
package Task4_3;

/**
 * @author ThuyNguyen
 *
 */
public class Limos extends Vehicles {
	private int numPassenger;

	/**
	 * This is construtor
	 * @param idVehicles
	 * @param seat
	 * @param numPassenger
	 */
	public Limos(int idVehicles, int seat, int numPassenger) {
		super(idVehicles, seat);
		this.numPassenger = numPassenger;
	}

	
	
}
