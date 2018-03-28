
public class SeaCreatureRun {
public static void main(String[] args) {
	SeaCreature Spongebob= new SeaCreature("Spongebob");
	Spongebob.eat();
	Spongebob.laugh();
	
	SeaCreature Patrick= new SeaCreature("Patrick");
	System.out.println(Patrick.getName());
	Patrick.eat();
	Patrick.laugh();
	
	SeaCreature SquidWard= new SeaCreature("SquidWard");
	System.out.println(SquidWard.getName());
	SquidWard.eat();
	SquidWard.laugh();
}
}
