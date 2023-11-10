package practicelearning;

public class MainClassThrottle {
	public static void main(String[] args) {
      
	Qthrottle equation = new Qthrottle();
	
	equation.x = 150;
			
			if(equation.x<=127){
				equation.y=equation.x*2;
			}
			if(equation.x>127) {
				equation.y=equation.x+127;
			}
			System.out.println("The value of y is"+equation.y);
	}
}
