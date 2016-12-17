public class Point 
{ 
    private int xCoord;  
    private int yCoord;  
    private int zCoord;  
     
    public Point() 
    { 
        xCoord=0; 
        yCoord=0; 
        zCoord=0; 
    } 
     
    public Point(int x,int y,int z) 
    { 
        xCoord=x; 
        yCoord=y; 
        zCoord=z;  
    } 
 
    void setX(int newX) 
    { 
        xCoord=newX; 
    } 
     
    void setY(int newY) 
    { 
        yCoord=newY; 
    } 
 
    void setZ(int newZ) 
    { 
        zCoord=newZ; 
    } 
     
    int getX() 
    { 
        return xCoord; 
    } 
     
    int getY() 
    { 
        return yCoord; 
    } 

    int getZ() 
    { 
        return zCoord; 
    } 
     
    public String getPosition() 
    { 
        return "(x,y,z) = (" + xCoord + "," + yCoord + "," + zCoord + 
")"; 
    } 
       
} 
 