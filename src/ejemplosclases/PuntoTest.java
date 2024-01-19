package ejemplosclases;

import org.junit.jupiter.api.Test;

class PuntoTest {

	@Test
	void testMover() {
		Punto punto=new Punto(0, 0);
		int offsetX=1;
		int offsetY=1;
		punto.mover(offsetX, offsetY);
		offsetX=-1;
		punto.mover(offsetX, offsetY);
		offsetX=1;
		offsetY=-1;
		punto.mover(offsetX, offsetY);
	}

}
