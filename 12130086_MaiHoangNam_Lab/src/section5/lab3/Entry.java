package section5.lab3;

public class Entry {
	private Date date;
	private double distance;
	private int duration;
	private String comment;

	public Entry(Date date, double distance, int duration, String comment) {
		this.date = date;
		this.distance = distance;
		this.duration = duration;
		this.comment = comment;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "date: " + this.date.toString() + ", distance: " + this.distance + ", duration: " + this.duration
				+ ", comment: " + this.comment;
	}
}
