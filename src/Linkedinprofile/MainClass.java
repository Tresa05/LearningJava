package Linkedinprofile;

public class MainClass {
	
	public static void main(String[] args) {
		System.out.println("helloJava");
		
		CreateLinkedinProfile profile1 = new CreateLinkedinProfile();
		profile1.name = "Tresa";
		profile1.age = 28;
		profile1.address = "50 Thomas Riley";
		profile1.printDetails();
				

		CreateLinkedinProfile profile2 = new CreateLinkedinProfile();
		profile2.name = "Jubin";
		profile2.printDetails();
		profile2.address = "50 Thomas Riley";
		
		
}
}	
	
