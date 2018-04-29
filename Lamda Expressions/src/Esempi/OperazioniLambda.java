package Esempi;

public class OperazioniLambda {

	private int x;
	private int y;

	public OperazioniLambda(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getIdentity(IntFunId ifIdentity) {
		return (ifIdentity.identity(x));
	}

	public int getValueOperation(IntFunProd ifOperation) {
		return ifOperation.operation(x, y);
	}
}
