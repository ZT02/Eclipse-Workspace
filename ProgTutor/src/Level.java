
public abstract class Level {

	private int life;

	public Level(int life) {
		this.life = life;

	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public abstract void run();

}
