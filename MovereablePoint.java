package test2;

public class MovereablePoint implements moveable{
    int x,y;
	int xSpeed;
	int ySpeed;
	public MovereablePoint(int x, int y, int xSpeed, int ySpeed) {
		super();
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public MovereablePoint() {}
	@Override
	public void moveup() {
		System.out.println("move up");
	}
	@Override
	public void movedown() {
		System.out.println("move Down");
	}
	@Override
	public void moveleft() {
		System.out.println("move left");
	}
	@Override
	public void moveright() {
		System.out.println("move Right");
	}
	
	@Override
	public String toString() {
		return "MovereablePoint=" +x+"y="+xSpeed+ySpeed;
	}

}

