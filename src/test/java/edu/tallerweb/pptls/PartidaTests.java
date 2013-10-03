package edu.tallerweb.pptls;

import static org.junit.Assert.*;
import org.junit.Test;

public class PartidaTests {
	/**
	 * Test de Spock
	 */
	@Test
	public void queSpockVaporizaPiedra() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Spock vaporiza piedra", Resultado.GANA,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test
	public void SpockEsRefutadoPorPapel() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("Papel refuta a Spock", Resultado.PIERDE,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test
	public void spockContraSpock() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals("Spock versus Spock", Resultado.EMPATA,
				jugadorUno.jugarCon(jugadorDos));

	}

	/**
	 * Test de Papel
	 */
	@Test
	public void papelEnvuelvePiedra() {

		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Papel envuelve a la piedra", Resultado.GANA,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test
	public void lagartoComePapel() {

		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("Papel es comido por el Largarto", Resultado.PIERDE,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test
	public void PapelEmpataPapel() {

		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("Papel versus Papel", Resultado.EMPATA,
				jugadorUno.jugarCon(jugadorDos));

	}

}
