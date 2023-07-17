/**
 * 
 */
package Task4_3;

/**
 * @author ThuyNguyen
 *
 */
public class Buses extends Vehicles{
	private int priceTicket;
	private String from;// start from
	/**
	 * this is construtor
	 * @param idVehicles
	 * @param seat
	 * @param priceTicket
	 * @param from
	 */
	public Buses(int idVehicles, int seat, int priceTicket, String from) {
		super(idVehicles, seat);
		this.priceTicket = priceTicket;
		this.from = from;
	}
	
	
}
