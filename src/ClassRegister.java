import java.util.Scanner; 

public class ClassRegister {
	private long max;
	private long min;
	private double mo;	
	private long numbers[];

	
	public ClassRegister(int nums) {
		numbers= new long[nums];
		mo=0;
		max=0;
		min=100;
		for(int i=0;i<numbers.length;i++){
			numbers[i]=0;
		}
	}
	
	void findmo()
	{
		for(int i=0;i<numbers.length;i++)
		{
			mo+=numbers[i];			
		}
		mo/=10;
		System.out.println("Η μέση τιμή των βαθμών είναι: "+mo);
	}
	
	void findmax()
	{
		for(int i=0;i<numbers.length;i++)
		{			
			if(numbers[i]>max)
				max=numbers[i];			
		}		
		System.out.println(" O μεγαλύτερος βαθμός είναι: "+max);
	}
	void findmin()
	{	
		for(int i=0;i<numbers.length;i++)
		{			
			if(numbers[i]<min)
				min=numbers[i];			
		}		
		System.out.println(" O μικρότερος βαθμός είναι: "+min);
	}
	void distribution()	
	{		
		 int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0,c10=0,c11=0;
		for(int i=0;i<numbers.length;i++)
		{			
			if(numbers[i]>=0&numbers[i]<=9)		
				c1++;			
			else if (numbers[i]>=10&numbers[i]<=19)	
				c2++;
			else if (numbers[i]>=20&numbers[i]<=29)	
				c3++;
			else if (numbers[i]>=30&numbers[i]<=39)	
				c4++;
			else if (numbers[i]>=40&numbers[i]<=49)	
				c5++;
			else if (numbers[i]>=50&numbers[i]<=59)	
				c6++;
			else if (numbers[i]>=60&numbers[i]<=69)	
				c7++;
			else if (numbers[i]>=70&numbers[i]<=79)	
				c8++;
			else if (numbers[i]>=80&numbers[i]<=89)	
				c9++;
			else if (numbers[i]>=90&numbers[i]<=99)	
				c10++;
			else if (numbers[i]==100)	
				c11++;
		}
		System.out.print("\n 0- 9: ");
		for(int j=0;j<c1;j++)
			System.out.print("*");		
		System.out.print("\n 10- 19: ");
		for(int j=0;j<c2;j++)
			System.out.print("*");
		System.out.print("\n 20- 29: ");
		for(int j=0;j<c3;j++)
			System.out.print("*");
		System.out.print("\n 30- 39: ");
		for(int j=0;j<c4;j++)
			System.out.print("*");
		System.out.print("\n 40- 49: ");
		for(int j=0;j<c5;j++)
			System.out.print("*");
		System.out.print("\n 50- 59: ");
		for(int j=0;j<c6;j++)
			System.out.print("*");
		System.out.print("\n 60- 69: ");
		for(int j=0;j<c7;j++)
			System.out.print("*");
		System.out.print("\n 70- 79: ");
		for(int j=0;j<c8;j++)
			System.out.print("*");
		System.out.print("\n 80- 89: ");
		for(int j=0;j<c9;j++)
			System.out.print("*");
		System.out.print("\n 90- 99: ");
		for(int j=0;j<c10;j++)
			System.out.print("*");
		System.out.print("\n 100: ");
		for(int j=0;j<c11;j++)
			System.out.print("*");
		System.out.println();
	}
	
	void givenumbers(){
		Scanner input = new Scanner(System.in);
		
		int choice_input;
		long num_input;
		
		choice_input=0;
		num_input=1;
		System.out.println("----- Υλοποίηση απλού βαθμολογίου για το μάθημα \"Programming in Java\" -----");	
		for(int i=0;i<numbers.length;i++)
		{	
			int ar=i+1;
			System.out.print("Δωστε τον "+ar+"ο βαθμό:");					
			num_input=input.nextLong();
			numbers[i]=num_input;
		}		
	
		do{
			
			System.out.println("Επιλογή:");
			System.out.println("1 = Υπολογισμός μέσου βαθμού");
			System.out.println("2 = Υπολογισμός μεγαλύτερου βαθμού");
			System.out.println("3 = Υπολογισμός μικρότερου βαθμού");
			System.out.println("4 = Εκτύπωση κατανομής βαθμολογίου");
			System.out.println("0 = Έξοδος");
			System.out.println("----------");
			do{
				if(choice_input!=1&choice_input!=2&choice_input!=3&choice_input!=4&choice_input!=0)
					System.out.println("Επέλεξε 1,2,3,4 ή 0 ");
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
				case 3:
					findmin();
					min=100;
					break;	
				case 4:
					distribution();					
					break;	
				}
				
			}while(choice_input!=0);			
		}while(choice_input!=0);
	
		input.close();
		System.out.println("----- Bye Bye-----");
	}

}
