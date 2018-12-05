public class Die{

	private int sides;
	private int value;
	public Die(){
		sides = 6;
		value = (int)(Math.random()*6)+1;
	}
}