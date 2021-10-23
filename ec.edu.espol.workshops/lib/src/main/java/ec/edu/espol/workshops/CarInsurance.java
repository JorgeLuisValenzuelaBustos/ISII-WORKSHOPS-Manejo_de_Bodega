
package ec.edu.espol.workshops;

/**
 * @author Home
 *
 */
public class CarInsurance {
	
	int age;
	char sex;
	boolean married; // 1 is married else 0
	double basePrice = 500;
	
	
	public int getAge() {
		return age;
	}

	public char getSex() {
		return sex;
	}

	public boolean isMarried() {
		return married;
	}

	public double getBasePrice() {
		return basePrice;
	}

	/*
	 * 
	 */
	public boolean setMarried(boolean married) { return this.married = married; }
	
	public void setAge(int age) { 
		
		int mayoriaEdad = 18;
		
		if(age > mayoriaEdad) {
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
	
	/*
	 * Calcula si es premium 
	 * @return double
	 */
	public double calculatePremium() {

		boolean male = (this.sex == 'M') && (!this.married);
		boolean female = (this.sex == 'F') || (this.married);
		
		if( male && (this.age < 25) ) {
			this.basePrice= +1500;
			return this.basePrice;
			
		} else if(female) {
			
			this.basePrice=-200;
			return this.basePrice;
			
		} else if( (this.age >=45) && (this.age < 65 ) ) {
			
			this.basePrice=-100;
			return this.basePrice;
			
		}
		
		return -1;
		
		
	}

	/*
	 * 
	 */
	public void sellInsurance() {
		
		if((this.age >80)||(generateLicense() == null)) {
			 System.out.println("Doesn't meet the requirements");
		}
		
	}
	
	/*
	 * Gerera la licencia del seguro
	 * @return String Valor de la licencia
	 */
	public String generateLicense() {
		
		 int license = (int)((Math.random() * 900000000)+10000000);
		 
		 return String.valueOf(license);
		
	}
	
}
