	public class Cuboidal 
	{ 
	    private int length;  
	    private int width;  
	    private int height; 
	   //the loc of the front-left-bottom corner 
	    private Point corner;    
	    //the number of cuboids created so far  
	    private static int count=0; 
	 
	    public Cuboidal(int l, int w, int h, Point p)  
	    {     
	        length=l;  
	        width=w;  
	        height=h;  
	        count=count+1; 
	        corner= new Point(p.getX(), p.getY(), p.getZ());  
	    }  
	     
	    public Cuboidal(int l,int w,int h,int x,int y,int z) 
	    { 
	        corner= new Point (x,y,z); 
	    } 
	    public Cuboidal() 
	    { 
	        this(1,1,1,0,0,0); 
	    } 
	 
	    void setLength(int len) 
	    { 
	        length=len; 
	    } 
	     
	    void setWidth(int wid) 
	    { 
	        width=wid; 
	    } 
	     
	    void setHeight(int h) 
	    { 
	        height=h; 
	    } 
	     
	    int getLength() 
	    { 
	        return length; 
	    } 
	   
	    int getWidth() 
	    { 
	        return width; 
	    } 
	     
	    int getHeight() 
	    { 
	        return height; 
	    } 
	     
	    int getVolume() 
	    { 
	        return length*height*width; 
	    } 
	     
	    int getSurfaceArea() 
	    { 
	        return 2*length*width+2*height*length+2*height*width; 
	    } 
	     
	    void printDetails() 
	    { 
	        System.out.println("X COORDINATE = "+ corner.getX()); 
	        System.out.println("Y COORDINATE = " + corner.getY());  
	        System.out.println("Z COORDINATE = " + corner.getZ()); 
	        System.out.println("Height = "+height); 
	        System.out.println("Length = " + length); 
	        System.out.println("Width = " + width); 
	    } 
	     
	    public static int noOfCuboids()  
	    {  
	        return count;  
	    }  
	 
}
