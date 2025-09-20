package ej3ObjetosSumergibles;

public class Submarino implements Sumergible{
	private int profundidadMax;
	private int profundidadActual;
	
	public Submarino(int profundidadMax, int profundidadActual) {
		this.profundidadMax = profundidadMax;
		if (profundidadMax < profundidadActual) {
			System.out.println("Profundidad actual no puede ser mayor que la maxima");
			this.profundidadActual = profundidadMax / 2; 
			System.out.println("Instanciado con la mitad de la máxima. Corregir su valor");
		} else {this.profundidadActual = profundidadActual;}
	}
	
	@Override
	public int getProfActual() {
		return profundidadActual;
	}
	@Override
	public int getProfMax() {
		return profundidadMax;
	}
	@Override
	public void setProfActual(int profNueva) {
		if (profNueva <= profundidadMax) {profundidadActual = profNueva;}
		else {System.out.println("La profundidad actual no puede ser mayor a la maxima. No se cambio nada.");}
	}
	@Override
	public void setProfMax(int profNueva) {
		if (profNueva >= profundidadActual) {profundidadMax = profNueva;}
		else {System.out.println("La profundidad maxima no puede ser menor a la actual. No se cambio nada.");}
	}

	
	
	
	
}
