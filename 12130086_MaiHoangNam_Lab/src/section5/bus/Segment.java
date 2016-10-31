package section5.bus;

public class Segment {
	private Station origin;
	private Station destination;
	private int distance;

	public Segment(Station origin, Station destination, int distance) {
		this.origin = origin;
		this.destination = destination;
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "[origin: " + this.origin.toString() + ", destination: " + this.destination.toString() + ", distance: "
				+ this.distance + "]";
	}

	public boolean same(Segment sgm) {
		return this.equals(sgm);
	}

	public int getDistance() {
		return distance;
	}
}
