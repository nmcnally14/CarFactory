/**
 * 
 */
package p240008228;

/**
 * @author Nicola
 *
 */
public class RallyCar extends Car {
	
	// create class attributes
	private double area;

	/**
	 * Default constructor
	 */
	public RallyCar() {
		
	}

	/**
	 * Constructor with args
	 * @param make
	 * @param model
	 * @param horsePower
	 * add area
	 */
	public RallyCar(String make, String model, int horsePower, double area) {
		super(make, model, horsePower);
		this.area = area;
		
		
	}

	/**
	 * This gets the area
	 * @return the area
	 */
	public double getArea() {
		return area;
	}

	/**
	 * This sets the area
	 * @param area the area to set
	 */
	public void setArea(double area) {
		this.area = area;
	}
	
	/**
	 * Class Method - public
	 * Method to display all instance vars
	 */
	@Override
	public void displayAll()	{
		System.out.println("RallyCar");
		super.displayAll();
		System.out.println("Area : \t"+this.area);
	}
}

	
	


