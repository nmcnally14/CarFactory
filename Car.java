/**
 * 
 */
package p240008228;

/**
 * @author Nicola Mc Nally
 * 40008228
 *
 */
public class Car {
	
	// create class attributes
	private String make;
	private String model;
	private int horsePower;

	/**
	 * Default constructor
	 */
	public Car() {
		
	}
	

	/**
	 * Generate constructor
	 * @param make
	 * @param model
	 * @param horsePower
	 */
	public Car(String make, String model, int horsePower) {
		super();
		this.make = make;
		this.model = model;
		// engage with the validation for the horsepower
		this.setHorsePower(horsePower);
	}



	/**
	 * This gets the make
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * This sets the make
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * This gets the model
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * This sets the model
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * This gets the horsepower
	 * @return the horsePower
	 */
	public int getHorsePower() {
		return horsePower;
	}

	/**
	 * This sets the horsePower - should be between 0 and 100 inclusive
	 * @param horsePower the horsePower to set
	 */
	public void setHorsePower(int horsePower) {
		if (horsePower>=0 && horsePower<=1000)	{
		this.horsePower = horsePower;
		} else	{
			this.horsePower = -999;
		}
	}
	/**
	 * Class Method - public
	 * Method to display all instance vars
	 */
	public void displayAll()	{
		System.out.println("Make \t"+this.make);
		System.out.println("Model \t"+this.model);
		System.out.println("HorsePower \t"+this.horsePower);
	}
	

}
