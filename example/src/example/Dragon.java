package example;

/**
 * A fire breathing worm of epic proportions.
 */
public class Dragon implements FireBreather {
	public static void main(String[] args) {
		Castle c = new Castle();
		Dragon myDragon = new Dragon();
		myDragon.burnCastle(c);
	}
	
	@Override
	public void burnCastle(Castle c) {
		c.raiseGate();
		breatheFire();
	}
}