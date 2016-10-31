package section5.bus;

public class ConsSegments implements Segments {
	private Segment first;
	private Segments rest;

	public ConsSegments(Segment first, Segments rest) {
		this.first = first;
		this.rest = rest;
	}

	public Segment getFirst() {
		return first;
	}

	public void setFirst(Segment first) {
		this.first = first;
	}

	public Segments getRest() {
		return rest;
	}

	public void setRest(Segments rest) {
		this.rest = rest;
	}

	@Override
	public String toString() {
		return this.first.toString() + "\n" + this.rest.toString();
	}

	@Override
	public boolean contains(Segment sgm) {
		return this.first.same(sgm) || this.rest.contains(sgm);
	}

	@Override
	public int howLong() {
		return this.first.getDistance() + this.rest.howLong();
	}

}
