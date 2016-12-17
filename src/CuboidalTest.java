public class CuboidalTest {

	private Cuboidal [] ArrayOfCuboidal;
	
	private int [] lengths = {1,2,3,4,5,6};
	private int [] widths = {2,4,6,8,10,12};
	private int [] heights = {1,3,5,7,9,11};
	private int [] Xs = {10,20,30,40,50,60};
	private int [] Ys = {100,200,300,400,500,600};
	private int [] Zs = {1,2,3,4,5,6};

	
	public CuboidalTest() {
		ArrayOfCuboidal= new Cuboidal[7];
		
		for(int i=0;i<3;i++){
			Point p = new Point(Xs[i],Ys[i],Zs[i]);
			ArrayOfCuboidal[i] = new Cuboidal(lengths[i], widths[i], heights[i], p);  

		}
		
		for(int i=3;i<6;i++){
			ArrayOfCuboidal[i] = new Cuboidal(lengths[i], widths[i], heights[i],Xs[i],Ys[i],Zs[i]);
		}
		
		ArrayOfCuboidal[6] = new Cuboidal();
		
	}
	
	void NumberOfCuboids(){
		System.out.println("-----Δημιουργήθηκαν "+ Cuboidal.noOfCuboids()+" Cuboidals-----");
	}
	
	void CuboidalInfo(){
		for(int i=0;i<ArrayOfCuboidal.length;i++)
		{
			System.out.println();
			System.out.println("---- Cuboidal "+(i+1)+" ----");
			ArrayOfCuboidal[i].printDetails();
			System.out.println("Όγκος= "+ArrayOfCuboidal[i].getVolume());
			System.out.println("Εμβαδό= "+ArrayOfCuboidal[i].getSurfaceArea());
		}
	}

	public static void main(String[] args) {
		CuboidalTest test = new CuboidalTest();
		test.NumberOfCuboids();
		test.CuboidalInfo();
		

	}

}
