/**
 * 
 */
package p240008228;

/**
 * @author Nicola Mc Nally
 * 40008228
 *
 */
public class CarFactory {
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//create several car objects
		FamilySaloon fs1 = new FamilySaloon ("Audi", "A3", 130, true);
		F1 f1 = new F1 ("Ferrari", "Maranello", 333, 1.24);
		F1 f2 = new F1 ("McLaren", "MCL2016", 998, 1.12);
		RallyCar r1 = new RallyCar ("Subaru", "Impreza", 143, 1.98);
		FamilySaloon fs2 = new FamilySaloon("Subaru", "Legacy", 123, true);
		
		//create an array to store each car object
		Car[] cars = {fs1, f1, f2, r1, fs2};
		
		//showing all car details to screen
		showAllCarDetails(cars);
		
		// show car with lowest HP
		outputLeastHp(cars);
		
		//show all subaru details
		showAllSubaruDetails(cars);
		
			
	}
	/**
	 * Method to show all
	 * @param Cars
	 */

	public static void showAllCarDetails(Car[] cars)	{
		for (Car c : cars)	{
			System.out.println();
			c.displayAll();
		}
		
	}
		
		public static void outputLeastHp(Car[] cars)	{
			
			int min=cars[0].getHorsePower();
			String leastHPModel = cars[0].getModel();
			
			for (Car c : cars)	{
				
				if(c.getHorsePower()<min)	{
					min=c.getHorsePower();
					leastHPModel = c.getModel();
				}
			}
			
			System.out.println("Min HP : "+leastHPModel);
		}
	/**
	 * method to get all details of subaru	
	 * @param cars
	 */
	public static void showAllSubaruDetails(Car[] cars)	{
		for (Car car : cars) {
			System.out.println();
			System.out.println("b) subaru");
			if (car.getMake().equalsIgnoreCase("Subaru"))	{
				car.displayAll();
			} else	{
				System.out.println("Not a sub");
			}
		}
	}
}


