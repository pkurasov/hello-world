import java.util.Scanner; 
public class FindInput {
	public static void main(String[] args) { 
		int x = 0; 
		String s = "";
	Scanner cin = new Scanner(System.in); 
	System.out.print("Input, please: "); 
	if (cin.hasNextInt()) { 
		x = cin.nextInt(); } 
	if (cin.hasNextLine()) 
	{ s = cin.nextLine(); }
	if (x % 2 == 0) { 
		Widget w = new Widget(x, s); 
		System.out.println(w.widge()); } 
	else { 
		Gidget g = new Gidget(x, s); 
		System.out.println(g.gidge()); 
		}
	}
}


