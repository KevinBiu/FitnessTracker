package FitnessGUI;

public class Plan {
	
	public static float Bmi; 
	public boolean time = true ; 
	public boolean loc = true ; 
	public boolean gen = true; 
	
	
	// Calculate the BMI using the metric system
	public static void MBmi (float h, float w) {
		Bmi =  (w / (h * h)) * 10000; 
	}
	// Calculate the BMI with Imperial 
	public static void IBmi(float h, float w) {
		Bmi =  (w * 703)  / (h * h); 
	}
	
}
