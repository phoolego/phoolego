public abstract class Carriage {
	protected int weigth;
	public Carriage(int w) {
		weigth = w;
	}
	public int getWeigth() {
		return weigth;
	}
	public abstract void printInfo();
}
