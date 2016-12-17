
public class Array4x5 {

	private int array[][];
	
	public Array4x5() 
	{
		array=new int[4][5];
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[0].length;j++)
				array[i][j]=0;			
		}		
	}	
	void fillarray() {			
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[0].length;j++)
			{
				array[i][j]=i+j;
			System.out.print(array[i][j]+" ");
			}
			System.out.println();		
		}
	}	
	public static void main(String[] args) {
		System.out.println("----- Πίνακας ακεραίων με 4 γραμμές και 5 στήλες -----");
		Array4x5 test = new Array4x5();
		System.out.println();
		System.out.println("Τα περιεχόμενα του πίνακα είναι:");
		test.fillarray();
	}

}
