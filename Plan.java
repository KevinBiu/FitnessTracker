package FitnessGUI;

public class Plan {
	
	public static float Bmi; 
	
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
	
	public static void showBmi() {
		
	}
	
	

}
