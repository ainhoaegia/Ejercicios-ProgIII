package EJ08;

public class Partido {
	
	private String torneo;
	private String tipo;
	private int ronda;
	private String ganador;
	private String perdedor;
	private int setsGanados;
	private int setsPerdidos;

	public static void main(String[] args) {
		
	}
	
	public String getTorneo() {
		return torneo;
	}


	public void setTorneo(String torneo) {
		this.torneo = torneo;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getRonda() {
		return ronda;
	}


	public void setRonda(int ronda) {
		this.ronda = ronda;
	}


	public String getGanador() {
		return ganador;
	}


	public void setGanador(String ganador) {
		this.ganador = ganador;
	}


	public String getPerdedor() {
		return perdedor;
	}


	public void setPerdedor(String perdedor) {
		this.perdedor = perdedor;
	}


	public int getSetsGanados() {
		return setsGanados;
	}


	public void setSetsGanados(int setsGanados) {
		this.setsGanados = setsGanados;
	}


	public int getSetsPerdidos() {
		return setsPerdidos;
	}


	public void setSetsPerdidos(int setsPerdidos) {
		this.setsPerdidos = setsPerdidos;
	}
}
