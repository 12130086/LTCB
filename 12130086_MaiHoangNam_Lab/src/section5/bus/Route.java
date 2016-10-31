package section5.bus;

public class Route {
	private String routeName;
	private Segments segments;

	public Route(String routeName, Segments segments) {
		this.routeName = routeName;
		this.segments = segments;
	}

	@Override
	public String toString() {
		return "routeName: " + this.routeName + "\n" + "segments:\n" + this.segments;
	}

	public boolean passAcross(Segment sgm) {
		return this.segments.contains(sgm);
	}

	public int howLong() {
		return this.segments.howLong();
	}
}
