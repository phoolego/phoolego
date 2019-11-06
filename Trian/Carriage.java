package Train;

public abstract class Carriage {
	protected int weight;
	public Carriage(int w) {
		weight = w;
	}
	public int getWeight() {
		return weight;
	}
	public abstract void printInfo();
}
