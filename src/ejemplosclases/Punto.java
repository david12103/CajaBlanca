package ejemplosclases;

public class Punto {
	private int posicionX, posicionY;

	public Punto(int posicionX, int posicionY) {
		this.posicionX = posicionX;
		this.posicionY = posicionY;
	}

	public void mover(int offsetX, int offsetY) {
		if (offsetX > 0 && offsetY > 0) {
			this.posicionX += offsetX;
			this.posicionY = offsetY;
		}
	}

	public int getPosicionX() {
		return posicionX;
	}

	public int getPosicionY() {
		return posicionY;
	}

}
