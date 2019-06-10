package FitnessGUI;

public class Info {
	
	public static float Bmi; 
	public boolean time = true ; 
	public boolean loc = true ; 
	public boolean gen = true; 
	
	public Info() {
		
	}
	
	
	// Calculate the BMI using the metric system
	public static float MBmi(float h, float w) {
		Bmi = w / (h * h); 
		return Bmi; 
	}
	// Calculate the BMI with Imperial 
	public static float IBmi(float h, float w) {
		Bmi = (w * 703)  / (h * h); 
		return Bmi; 
	}

}
