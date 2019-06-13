package FitnessGUI;

public class Plan {
	
	public static float Bmi; 
	public boolean loc = true ; 
	public boolean gen = true; 
	public static int tim; 
	
	
	// Calculate the BMI using the metric system
	public static void MBmi (float h, float w) {
		Bmi =  (w / (h * h)) * 10000; 
		System.out.println(Bmi);
	}
	// Calculate the BMI with Imperial 
	public static void IBmi(float h, float w) {
		Bmi =  (w * 703)  / (h * h); 
		System.out.println(Bmi);
	}
	
	public static void time() {
		switch (tim) {
		  case 1:
		    System.out.println("Option 1");
		    break;
		  case 2:
		    System.out.println("Option 2");
		    break;
		  case 3:
		    System.out.println("Option 3");
		    break;
		}
	}
	

}
