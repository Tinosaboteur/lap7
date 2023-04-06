package test2;

public class MoverableCircle implements moveable{
    public int radius;
	public MovereablePoint center;
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
	public MoverableCircle(int radius, MovereablePoint center) {
		super();
		this.radius = radius;
		this.center = center;
	}
	public MoverableCircle() {}
	public String toString() {
		return "MoverableCircle [radius=" + radius + ", center=" + center + "]";
	}
}
