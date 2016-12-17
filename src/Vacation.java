import java.util.Scanner;
import java.util.ArrayList;
public class Vacation {

	private ArrayList <String> places;
	String name;
	
	public Vacation() {
		places = new ArrayList<String>();
		places.add(new String("ΒΟΥΔΑΠΕΣΤΗ")); 
		places.add(new String("ΠΡΑΓΑ"));
		places.add(new String("ΜΑΔΡΙΤΗ"));
		places.add(new String("ΠΟΡΤΟ"));
		places.add(new String("ΠΕΚΙΝΟ"));
		places.add(new String("ΛΟΝΔΙΝΟ"));
		places.add(new String("ΜΟΣΧΑ"));
		places.add(new String("ΚΩΝΣΤΑΝΤΙΝΟΥΠΟΛΗ"));
		places.add(new String("ΒΑΡΚΕΛΩΝΗ"));
		places.add(new String("ΡΩΜΗ"));
		
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

		System.out.println("----- Δώστε το όνομα σας, πατήστε Enter και θα σας ταξιδέψουμε! -----");
		System.out.println("Όνομα: ");	
		name=input.next();		
		test.setName(name);
		System.out.println("Η πόλη που σας ταιριάζει για διακοπές είναι: "+test.placeProposal());			
		input.close();
		System.out.println("----- Καλό σας ταξίδι !! ;) -----");
	}
}
