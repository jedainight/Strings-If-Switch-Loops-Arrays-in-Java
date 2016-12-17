import java.util.Scanner; 
public class TenNumbers {
	
	private long max;
	private double mo;	
	private long numbers[];

	public TenNumbers(int nums) {
		numbers= new long[nums];
		mo=0;
		max=0;
		for(int i=0;i<numbers.length;i++){
			numbers[i]=0;
		}
	}
	
	void findmo(){
		for(int i=0;i<numbers.length;i++){
			mo+=numbers[i];			
		}
		mo/=10;
		System.out.println("Η μέση τιμή είναι: "+mo);
	}
	
	void findmax(){
		for(int i=0;i<numbers.length;i++){			
			if(numbers[i]>max)
				max=numbers[i];			
		}		
		System.out.println(" O μέγιστος είναι: "+max);
	}
	
	void givenumbers(){
		Scanner input = new Scanner(System.in);
		
		int choice_input;
		long num_input;
		
		choice_input=0;
		num_input=1;
		System.out.println("----- Υπολογισμός μέγιστου και μέσης τιμής απο 10 αριθμούς-----");
		 
		for(int i=0;i<numbers.length;i++)
		{	
			int ar=i+1;
			System.out.print("Αριθμός "+ar+":");					
			num_input=input.nextLong();
			numbers[i]=num_input;
		}		
	
		do{
			
			System.out.println("Επιλογή:");
			System.out.println("1 = Υπολογισμός μέσης τιμής");
			System.out.println("2 = Υπολογισμός μεγίστου");
			System.out.println("0 = Έξοδος");
			System.out.println("----------");
			do{
				if(choice_input!=1&choice_input!=2&choice_input!=0)
					System.out.println("Επέλεξε 1,2 ή 0 ");
				System.out.println("Επιλογή:");
				
				while(!input.hasNextInt()){					
					System.out.println("Δεν επιτρέπονται άλλοι χαρακτήρες");
					input.next();
				}
				choice_input=input.nextInt();						
				switch(choice_input){
				case 1:
					findmo();
					mo=0;
					break;
				case 2:
					findmax();
					max=0;
					break;	
				}
				
			}while(choice_input!=0);			
		}while(choice_input!=0);
	
		input.close();
		System.out.println("----- Bye Bye-----");
	}
	public static void main(String[] args) {
		TenNumbers test= new TenNumbers(10);
		test.givenumbers();
	}

}


