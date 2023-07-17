/**
 * 
 */
package Task4_3;

/**
 * @author ThuyNguyen
 *
 */
public class Subways extends Vehicles {
 private int priceTicket;

/**
 * @param idVehicles
 * @param seat
 * @param priceTicket
 */
public Subways(int idVehicles, int seat, int priceTicket) {
	super(idVehicles, seat);
	this.priceTicket = priceTicket;
}
 
}
