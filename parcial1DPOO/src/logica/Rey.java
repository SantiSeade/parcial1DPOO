package logica;
public class Rey extends Pieza {
	public int getCoordendadaX() {
		return coordenadaX;
	}
	
	public int getCoordendaday() {
		return coordenadaY;
	}
	
	public int getTamanioTablero() {
		return tamanioTablero;
	}
	
	public int casillasDisponiblesRey() {
		int tamanio = getTamanioTablero();
		int x = getCoordendadaX();
		int y = getCoordendadaX();
		return 1;
	}
	
}