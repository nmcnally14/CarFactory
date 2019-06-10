/**
 * 
 */
package p240008228;

/**
 * @author Nicola
 *
 */
public class FamilySaloon extends Car {
	
	// create new instance var
	private boolean metallicPaint;

	/**
	 * Default constructor
	 */
	public FamilySaloon() {
		
	}

	/**
	 * constructor with args
	 * @param make
	 * @param model
	 * @param horsePower
	 * add metallic paint
	 */
	public FamilySaloon(String make, String model, int horsePower, boolean metallicPaint) {
		super(make, model, horsePower);
		this.metallicPaint = metallicPaint;
	}
	
	/**
	 * This Gets the metallic paint
	 * @return the metallicPaint
	 */
	public boolean isMetallicPaint() {
		return metallicPaint;
	}


	/**
	 * This Sets the metallic paint
	 * @param metallicPaint the metallicPaint to set
	 */
	public void setMetallicPaint(boolean metallicPaint) {
		this.metallicPaint = metallicPaint;
	}
	
	/**
	 * Class Method - public
	 * Method to display all instance vars
	 */
	@Override
	public void displayAll()	{
		System.out.println("Family Saloon");
		super.displayAll();
		System.out.println("Metallic Paint \t"+this.metallicPaint);
	}



}
