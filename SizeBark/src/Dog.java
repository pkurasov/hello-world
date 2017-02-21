// Hello this is a bark class
public class Dog {
	private int size;
	private String name;
	private int howdyHo;
	public void setSize(int mySize){
		size=mySize;
	}
	
	public void setName(String myName){
		name=myName;
	}
	
	public int getSize(){
		return size;
	}
	
	public String getName(){
		return name;
	}
	
	public void bark(int numBarks){
		while(numBarks>0){
			if(size>60){
				System.out.println("Woof! Woof!");
				numBarks=numBarks-1;
			}else if(size>14){
				System.out.println("Ruff! Ruff!");
				numBarks=numBarks-1;
			}else{
				System.out.println("Yip! Yip!");
				numBarks=numBarks-1;
			}
		}
	}
	
}

