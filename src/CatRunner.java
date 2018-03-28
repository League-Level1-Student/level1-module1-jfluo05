
public class CatRunner {

	
	public static void main(String[] args) {
		
		/* Do the following things without changing the Cat class */
		Cat Cate= new Cat("Cate");
		
		// 1. Make the Cat meow
		Cate.meow();
		// 2. Get the Cat to print it's name
		Cate.printName();
		// 3. Kill the Cat!
		
		for(int i=0; i<9; i++) {
			Cate.kill();
		}
	}
}
