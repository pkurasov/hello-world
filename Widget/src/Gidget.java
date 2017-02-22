
public class Gidget {
	private int i; 
	private String s; 
	public Gidget(int i, String s) { 
		this.i= 3*i; 
		this.s = s; 
		}
	
	public String gidge() { 
		Widget w = new Widget(i,s); 
		char c = s.charAt(i); 
		s.replace(c,++c); 
		return (s.charAt(i) + w.widge()); 
		}
}
