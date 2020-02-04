package myJava;


public class myFirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String myFriend = "Pagma Battulga";	
		
		
	System.out.println(myFriend);	
		


	String housePrice = "$650000";
	
	String address = "11713 Potomac Crossing Way";
	
	String techSchool = "TechCircle";
	
	System.out.println(techSchool + " is an It Bootcamp. And the Address is\n" + address + "." + " The medium price of the houses in the area is " + housePrice +".");
	
	
	String firstName = "Enkhmend";
	 
	String lastName = "Ganbaatar";
	
	
	System.out.println("My name is " +firstName + " and my lastName is " +lastName +" I'm so happy to be here in Techcircle " +"And Thank you for teaching us Java");
	
	
	
	
	
	
		
// below are end of class and main method
		
	int firstNumber = 20;
	int secondNumber = 20;
	
	boolean a =(firstNumber==secondNumber);
	
	System.out.println(a);
	
	////////
	Integer objectNumber = new Integer(6);
	Integer objectSecNumber = new Integer(6);
	
	
	boolean b = (objectNumber.equals(objectSecNumber));
	
	
	
	
	System.out.println(b);
	
	////////////
	
	String myCar = "Toyota Prius V";
	 
	String price = "14k";
	
	String addressSec = "4078 Airline parkway";
	
	System.out.println("I bougth a car from " + addressSec + " The car's Model is " + myCar + " It cost me about " + price + "." );
	
// 
	// Relational operators
	
	
	
	
	long number1 = 23445;
	
	long number2 = 245345;
	long number3 = 2343545;
	long number4 = 2345;
	long number5 = 23;

	
	
	
	boolean equals = number1 == number5;
	boolean notEquals = number3 !=22;
	
	boolean greaterThan = number5>342324;
	 boolean lessThan = number4 < number5;
	 
	
	boolean ç = number1 >= number2;
	 boolean lessThanOrEqualTo = number4 <= 2343245;
	 
	 System.out.println("equals Results are = " + equals);
	 System.out.println("not Equals Results are = " + notEquals);
	 System.out.println("greater Than Results are = " + greaterThan);
	 
	 System.out.println("less Than Results are = " + lessThan);
	 
	 System.out.println("less Than Or Equal To Results are = " + lessThanOrEqualTo);
	
	 
	 int aa=67;
	 
	 int a1 = 84;
	
	 int b1 = 73;
	  
	 int c1 = 32;
	 
	 int d1 = 16;
	  
	 boolean  booleanResults1 = ((a1==aa)&&(c1==d1));
	
	 boolean  booleanResults2 = ((a1==aa)||(c1==d1));
	
	 boolean  booleanResults3 = ((a1==aa)&&(c1==d1));
	
	// assignment operation
	 
	 
	 int a2 = 98;
	 
	 int b2 = 39;
	 int c2 = 5;
	 int d2 = 16;
	 
	 
	 System.out.println(a2);
	 
		a2 = a2 + b2;

	 
	a2+=b2;
	 
	
	
	 System.out.println(a2);

	 
	 a2+=d2;
	 
	 System.out.println(a2);

	 
	 c2 = c2 - d2;
	 
	 
	 System.out.println("C is" + c2);
	
	c2 -=d2;
	
	System.out.println("C is " + c2);
	
	d2*=a2;
	
	System.out.println("D is " + d2);
	
	
	
	d2/=b2;
	System.out.println("D is " + d2);
	
	
	d2%=a2;
	
	System.out.println("D is " + d2);
	
	int a3, b3;
	
	a3 = 10;
	b3 = (a3==1) ? 20 : 30;
	
	System.out.println("Value is b3 is : " + b3);
	
	
	
	b3 = (a3 == 10) ? 20 : 30;
	
	System.out.println("Value of b3 is : " + b3);
	
	
	final int finalValue = 4;
	
	//    finalValue = a3;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
