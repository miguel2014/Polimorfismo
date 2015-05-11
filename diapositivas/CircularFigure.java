package diapositivas;

public abstract class CircularFigure implements Figure {
	protected int semiEjeMenor, semiEjeMayor;
	
	/**
	 * @param semiEjeMenor
	 * @param semiEjeMayor
	 */
	public CircularFigure(int semiEjeMenor, int semiEjeMayor) {
		this.semiEjeMenor = semiEjeMenor;
		this.semiEjeMayor = semiEjeMayor;
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return 2*NUMERO_PI*Math.sqrt((this.semiEjeMayor*this.semiEjeMayor+
				this.semiEjeMenor*this.semiEjeMenor)/2);
	}

	

}