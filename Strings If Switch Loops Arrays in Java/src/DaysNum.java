import java.util.Scanner;
public class DaysNum {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int b,days,year=0;
		String a=null;
		System.out.println("----- Υπολογισμός Ημερών -----");
		System.out.println("Δώσε τοv μήνα (με Enter):");
		a= input.next();
	
		switch (a) {  
		    
		case "Ιανουάριος":  
		case "Μάρτιος":  
		case "Μάιος":  
		case "Ιούλιος":
		case "Αύγουστος": 
		case "Οκτώβριος": 
		case "Δεκέμβριος": 
			days=31;
			break;
			
		case "Απρίλιος":  
		case "Ιούνιος":  
		case "Σεπτέμβριος":  
		case "Νοέμβριος":
			days=30;
			break;
		case "Φεβρουάριος": 
			System.out.println("Δώσε έτος (με Enter):");
			year= input.nextInt();
			
			if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
				days=29;
           else
        	   days=28;
		
			break;

		}
	
		input.close();
	}
}


