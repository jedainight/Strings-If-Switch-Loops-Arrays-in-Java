import java.util.Scanner;
public class DaysNum {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int b,days,year=0;
		String a=null;
		System.out.println("----- ����������� ������ -----");
		System.out.println("���� ��v ���� (�� Enter):");
		a= input.next();
	
		switch (a) {  
		    
		case "����������":  
		case "�������":  
		case "�����":  
		case "�������":
		case "���������": 
		case "���������": 
		case "����������": 
			days=31;
			break;
			
		case "��������":  
		case "�������":  
		case "�����������":  
		case "���������":
			days=30;
			break;
		case "�����������": 
			System.out.println("���� ���� (�� Enter):");
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


