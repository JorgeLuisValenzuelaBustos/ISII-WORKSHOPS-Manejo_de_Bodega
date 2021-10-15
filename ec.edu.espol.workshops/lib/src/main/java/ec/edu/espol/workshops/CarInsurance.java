
package ec.edu.espol.workshops;

public class CarInsurance {
	
	int age;
	char sex;
	boolean married; // 1 is married else 0
	double basePrice = 500;
	
	public boolean setMarried(boolean married) { return this.married = married; }
	
	public void setAge(int age) { 
		
		if(age > 18) {
			this.age = age; }
		
	} 
	
	public void setBasePrice(double basePrice) { 
		
		if(basePrice > 0) {
			this.basePrice = basePrice; }
		
	}
	
	public void setSex(char sex) {
		
		if( (sex == 'H') || (sex == 'M') ) {
			this.sex = sex; }
		
	}

}
