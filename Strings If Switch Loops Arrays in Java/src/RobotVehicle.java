public class RobotVehicle {
	String state;
	float velocity;
	float temp;
	
	
	RobotVehicle()
	{
		state=null;
		velocity=0;
		temp=0;
	}
	RobotVehicle(String s, float v, float t)
	{
		state=s;
		velocity=v;
		temp=t;
	}
	void checktemp()
	{
		if(temp>350)
		{	
			state="��������� ��� ����";
			velocity=8;
		}
	}
	void printvalues()
	{
        System.out.println("----��������� ��������----");        
        System.out.println("���������: " + state + ", ��������: " + velocity + ", �����������: "+ temp); 
        
	}
	void setState(String s)
	{
		state=s;
	}
	void setTemp(float t)
	{
		temp=t;
	}
	void setVelocity(float v)
	{
		velocity=v;
	}
	public static void main(String[] args) {
		RobotVehicle rv= new RobotVehicle();
		rv.setState("�� ����������");
		rv.setVelocity(3);
		rv.setTemp(256);
		//�� ������� 47-50 ������� �� ������������ �� ��� �� ��� �������� ������������
		//RobotVehicle rv= new RobotVehicle("�� ����������",3,256);
		rv.printvalues();
		rv.setVelocity(5);
		rv.setTemp(355);
		rv.checktemp();
		rv.printvalues();
//		Time t1 = new Time(20, 45, 59);    
//		Time t2 = new Time(18, 30); 
//		Time t3= new Time(t2);
//		System.out.println("hours "+t3.getHour()+" mins "+ t3.getMin()+" secs "+ t3.getSec());
		
	}

}
