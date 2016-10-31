package section5.lab3;

public class ConsLog extends ALog {
	private Entry first;
	private ALog rest;

	public ConsLog(Entry first, ALog rest) {
		this.first = first;
		this.rest = rest;
	}

	public Entry getFirst() {
		return first;
	}

	public void setFirst(Entry first) {
		this.first = first;
	}

	public ALog getRest() {
		return rest;
	}

	public void setRest(ALog rest) {
		this.rest = rest;
	}

	@Override
	public String toString() {
		return this.first.toString() + " \n" + this.rest.toString();
	}
}
