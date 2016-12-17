
public class Time 
{ 
   private int hour;  // 0 - 23 
   private int minute; // 0 - 59 
   private int second; // 0 - 59 
 
    Time(int h, int m, int s) {                                   
     hour = ( ( h >= 0 && h < 24 ) ? h : 0 ); 
     minute = ( ( m >= 0 && m < 60 ) ? m : 0 ); 
     second = ( ( s >= 0 && s < 60 ) ? s : 0 ); 
   } // end Time three-argument constructor  
 
    Time(int h, int m) {                                   
     this( h, m, 0 ); // invoke Time constructor with three arguments 
   } // end Time two-argument constructor 
    
    Time(Time t){                                   
    	this.hour=t.hour;
    	this.minute=t.minute;
    	this.second=t.second;
      } 
    
    int getHour()
    {
    	return hour;
    }
    int getMin()
    {
    	return minute;
    }
    int getSec()
    {
    	return second;
    }

    
 
} 

