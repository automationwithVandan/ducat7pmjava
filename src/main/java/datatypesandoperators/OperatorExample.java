package datatypesandoperators;

public class OperatorExample {

	public static void main(String[] args) {
	
		
		int num1=10;  // = assignment operator
		int num2=10;
		//System.out.println(num1==num2); // == comparision operator
		//System.out.println(num1<num2);
		
		
		String name="vandan";
		String name2="vandan";
		//System.out.println(name==name2);  
		//System.out.println(name.equalsIgnoreCase(name2));  // equals or equalsIgnoreCase
		
		// arithmetic operators
		
		int a=10;
		int b=2;
		int div= a/b;
		int rem= a%b;
		int sum=a+b;
		int sub= a-b;
		//System.out.println("this is division "+div);
		//System.out.println("this is remainder "+rem);
		//System.out.println("this is addition "+sum);
		//System.out.println("this is subtraction "+sub);
		                   
		int num=5;
		num++;  // num=num+1;
		num--; // num=num-1;
		//System.out.println(num);
		
		int num3=10;
		int num4=9;
		System.out.println(num3<=num4);  // less than or equal to
		System.out.println(num3!=num4);
	}

}
