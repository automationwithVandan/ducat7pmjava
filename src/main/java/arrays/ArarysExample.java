package arrays;

public class ArarysExample {

	public static void main(String[] args) {
		/*
		 * String name1="vandan"; String name2="Ajay"; String name3="Arivind";
		 */

		// DataType variablename[] = new DataType[5];
		
		//Array Index alaways start from 0
		String name[] = new String[5];
		name[0]= "vandan";
		name[1]="Sadhvi";
		name[2]="Sikha";
		name[3]="Lata";
		name[4]="Arvind";
		
		/*
		 * System.out.println(name.length); for(int i=0;i<name.length;i++) {
		 * if(name[i].equals("Lata")) { System.out.println(i); break; }
		 * System.out.println(name[i]); }
		 */
		int i=0;
		while(i<name.length)
		{
			System.out.println(name[i]);
			i++;
		}

		int num[] = new int[5];
		num[0]=12;
		num[1]=20;
		num[2]=30;
		num[3]=7;
		num[4]=18;
	// there is an array, find the maximum number in the array
	// find secind max number from an array
	
	
	}

}
