
public class PersonRunner {

public static void main(String[] args) {
	//6. Now, make a Runner class that creates 3 different people, sets their superpowers, 
			//and prints the value returned by the default toString() method. 

	Person AJ=new Person();
	Person PAJ=new Person();
	Person NAJ=new Person();

	AJ.setName("Jessica");	
	AJ.setSuperpower("awesomeness");
	System.out.println(AJ);
	
	PAJ.setName("Jackie");
	PAJ.setSuperpower("invisibility");
	System.out.println(PAJ);
	
	NAJ.setName("Jordan");
	NAJ.setSuperpower("speed");
	System.out.println(NAJ);
	
	
	//7. Override the default toString() method by implementing a toString() method on the Person
	// class that returns "<name> has mad <superpower> skills". 
	
	
	
}



}
