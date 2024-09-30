public class Jeep implements LandVehicle {
	
	private int passengers;
	private String name;
	private int speed;
	private int numOfWheels;
	private int x;
	private int y;
	public Jeep(int passengers,String name, int speed, int numOfWheels, int x, int y)
	{
		this.name = name;
		this.passengers = passengers;
		this.speed = speed;
		this.numOfWheels = numOfWheels;
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

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
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

	public int getNumOfWheels() {
		return numOfWheels;
	}

	public void drive() {
		System.out.println("the Jeep was implemented");
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
