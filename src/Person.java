

public class Person {
	//Part 2
		//4. Create a Person class, with 2 member variables - name and superpower.
	private String name;
	private String superpower;
		//5. Using the pattern in Part 1, add getter and setter methods for the member variables of the Person class.
	String getName() {
		return name;
	}
	String getSuperpower() {
		return superpower;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setSuperpower(String superpower) {
		this.superpower=superpower;
	}
		//6. Now, make a Runner class that creates 3 different people, sets their superpowers, 
		//and prints the value returned by the default toString() method. 

		//7. Override the default toString() method by implementing a toString() method on the Person
		// class that returns "<name> has mad <superpower> skills". 
public String toString() {

	return name+" has mad "+superpower+" skills";
	
}
}
