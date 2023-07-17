/**
 * 
 */
package Task4_3;

/**
 * @author ThuyNguyen
 *
 */
public class Cars extends Vehicles {
	private String color;

	/**
	 * @param idVehicles
	 * @param seat
	 * @param color
	 */
	public Cars(int idVehicles, int seat, String color) {
		super(idVehicles, seat);
		this.color = color;
	}
	
}
