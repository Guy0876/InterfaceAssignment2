public class Boat implements SeaVessel {
	private int passengers;
	private String name;
	private int speed;
	private int x;
	private int y;
	public Boat(int passengers,String name, int speed, int x, int y)
	{
		this.name = name;
		this.passengers = passengers;
		this.speed = speed;
		this.x = x;
		this. y = y;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getMaxPassengers() {
		return passengers;
	}

	public String getName() {
		return name;
	}

	public int getMaxSpeed() {
		return speed;
	}
	public void launch() {
		System.out.println("the boat was implemented");
	}
	public void getDetails(){
		System.out.println("the name is" + name +"the speed is" + speed +"the passengers is" + passengers );
	}
	@Override
	public void move(int x, int y) {
		this.x = x;
		this. y = y;
	}
}
