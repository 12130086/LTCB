package section5.lab2;

public class Restaurant {
	private String name;
	private String food;
	private String priceRange;
	private Intersection intersection;

	public Restaurant(String name, String food, String priceRange, Intersection intersection) {
		this.name = name;
		this.food = food;
		this.priceRange = priceRange;
		this.intersection = intersection;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getPriceRange() {
		return priceRange;
	}

	public void setPriceRange(String priceRange) {
		this.priceRange = priceRange;
	}

	public Intersection getIntersection() {
		return intersection;
	}

	public void setIntersection(Intersection intersection) {
		this.intersection = intersection;
	}

	@Override
	public String toString() {
		return "name: " + this.name + ", food: " + this.food + ", range price: " + this.priceRange + ", intersection: "
				+ this.intersection.toString();
	}

}
