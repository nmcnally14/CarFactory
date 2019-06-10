/**
 * 
 */
package p240008228;

/**
 * @author Nicola
 *
 */
public class F1 extends Car {
	
	// create instance vars/class attributes
	private double area;

	/**
	 * Default constructor
	 */
	public F1() {
		
	}

	/**
	 * Constructor with args
	 * @param make
	 * @param model
	 * @param horsePower
	 * add area
	 */
	public F1(String make, String model, int horsePower, double area) {
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
		System.out.println("F1");
		super.displayAll();
		System.out.println("Area : \t"+this.area);
	}
	
	

}
