
package ec.edu.espol.workshops;

public class CarInsurance {
	
	int age;
	char sex;
	boolean married; // 1 is married else 0
	double basePrice = 600;
	
	
	public CarInsurance(int age, char sex, boolean married) {
		this.age = age;
		this.sex = sex;
		this.married = married;
	}

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
	
	
	public double calculatePremium() {

		if((this.sex== 'M') && (this.married== false) && (this.age<25)) {
			this.basePrice+= 1500;
			return this.basePrice;
			
		}
		
		else if((this.sex== 'F') || (this.married== true)) {
			this.basePrice-=200;
			return this.basePrice;
			
		}
		
		else if((this.age >=45) && (this.age < 65 )) {
			this.basePrice=-100;
			return this.basePrice;
			
		}
		
		else {
			return -1;
		}
		
		
	}
	
	public void sellInsurance() {
		
		if((this.age >80) && (generateLicense().length()==9)) {
			 System.out.print("Doesn't meet the requirements");
		}
		
	}
	
	
	public String generateLicense() {
		
		 int license = 0;
		 license = (int)((Math.random() * 900000000)+10000000);
		 
		 return String.valueOf(license);
		
	}
	
	
	
	

}
