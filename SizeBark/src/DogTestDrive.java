
public class DogTestDrive {

	public static void main(String[] args) {
		Dog one= new Dog();
	    one.setSize(70);
	    Dog two= new Dog();
	    two.setSize(8);
	    Dog three= new Dog();
	    three.setSize(35);
	    
	    one.bark(3);
	    two.bark(5);
	    three.bark(2);
	    // Creating an array of dogs
	    // Unprogramed remote control to Dog object
	    // in each array spot
	    Dog[] pets;
		pets= new Dog[7];
		// Program some remote controls
		// to access a specific dog
		pets[0]=new Dog();
		pets[1]=new Dog();
		// CAll methods on these Dogs 
		pets[0].setSize(30);
		int x=pets[0].getSize();
		pets[1].setSize(8);
		
		
		
	}

}
