
public class HelloWorld {

	public static void main(String[] args) {
		Explosion e = new Explosion();
		String s = String.format("Howdy Partner,\nBecareful these been %d explosions in the pits?\n", e.getPower());
		
		Message m = new Message(s);
		System.out.println(m.getMessage());
	}

}
