public class Die{

	private int sides;
	private int value;
	public Die(){
		sides = 6;
		value = (int)(Math.random()*6)+1;
	}
	public Die(int sides, int value){
		this.sides = sides;
		this.value = (int)(Math.random()*6)+1;
	}
	public int getValue(){
		return value;
	}
}