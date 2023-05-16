public class Card_WhiteJack {
	private int suit;//can have states of 0-3 0=hearts
	private int number;//0-12 ace=0 2-10num=1-9 JQK=10-12
	private boolean direction;//displays face up or down
	public Card_WhiteJack(int suit,int number,boolean direction){
		this.setDirection(direction);
		this.setNumber(number);
		this.setSuit(suit);
	}
	public void setSuit(int suit) {
		this.suit = suit;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void setDirection(boolean direction) {
		this.direction = direction;
	}
	public int getSuit() {
		return suit;
	}
	public int getNumber() {
		return number;
	}
	public boolean isDirection() {
		return direction;
	}
	public String toString(){
		String myOutput = "";
		myOutput += "Suit Is: "+this.getSuit();
		myOutput += "Number Is: "+this.getNumber();
		myOutput += "Direction Is: "+this.isDirection();
		return myOutput;
	}
}