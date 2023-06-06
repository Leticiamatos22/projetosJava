package logic;

public class Car {
	//atributos
	private String color;
	private int speed; //velocidade
	private int posX;  //posição
	private int posY;
	private int health;
	
	//construtores
	public Car () {
		
	}
	
	
	public Car (String color) {
		this.color = color;
	}
	
	public Car (String color, int posX, int posY) {
		this.color = color;
		this.posX = posX;
		this.posY = posY;
	}
	
	public Car (String color, int speed, int posX, int posY, int health) {
		this.color = color;
		this.speed = speed;
		this.posX = posX;
		this.posY = posY;
		this.health = health;
	}
	//metodos funcionais
	public void accelerate () {
		this.speed+=1;
	}
	public void accelerate (int speed) {
		this.speed+=speed;
	}
	
	
	//metodos de acesso
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	//toString
	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", posX=" + posX + ", posY=" + posY + ", health=" + health
				+ "]";
	}
	
	
	
	
	
	
	
}
