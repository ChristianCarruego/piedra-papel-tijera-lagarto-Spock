package edu.tallerweb.pptls;

import java.util.ArrayList;
/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {
	private final Forma forma;
	private final ArrayList<Forma> ganaA= new ArrayList<Forma>();
	
	/**
	 * Toda Mano debe crearse con una forma dada, que será
	 * la que determine su condición en el juego.
	 * @param forma, la Forma que adopta la Mano.
	 */
	public Mano(final Forma forma) {
		this.forma=forma;
		
		
		
	}
	/**
	 * Evaluará el resultado de la partida según las reglas
	 * del juego.
	 * @param otra, la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */
	public Resultado jugarCon(final Mano otra) {
		
		Integer diferencia;
		diferencia=(this.forma.ordinal()-otra.forma.ordinal());
		
		
		if (diferencia==0){
			return Resultado.EMPATA;
		}
		else if (diferencia==-4||diferencia==-3||diferencia==1||diferencia==2)
			return Resultado.GANA;
		return Resultado.PIERDE;
	}
}
