import java.util.Scanner;
import java.util.ArrayList;
public class Vacation {

	private ArrayList <String> places;
	String name;
	
	public Vacation() {
		places = new ArrayList<String>();
		places.add(new String("����������")); 
		places.add(new String("�����"));
		places.add(new String("�������"));
		places.add(new String("�����"));
		places.add(new String("������"));
		places.add(new String("�������"));
		places.add(new String("�����"));
		places.add(new String("����������������"));
		places.add(new String("���������"));
		places.add(new String("����"));
		
	}
	
	void setName(String n){
		name=n;
	}
	
	String placeProposal(){		
		return (String)places.get(name.length()%places.size());
	}

	public static void main(String[] args) {
		Vacation test = new Vacation();
		Scanner input = new Scanner(System.in);
		String name;

		System.out.println("----- ����� �� ����� ���, ������� Enter ��� �� ��� �����������! -----");
		System.out.println("�����: ");	
		name=input.next();		
		test.setName(name);
		System.out.println("� ���� ��� ��� ��������� ��� �������� �����: "+test.placeProposal());			
		input.close();
		System.out.println("----- ���� ��� ������ !! ;) -----");
	}
}
