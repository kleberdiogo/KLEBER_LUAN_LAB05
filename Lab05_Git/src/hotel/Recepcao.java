package hotel;

import java.util.ArrayList;
import java.util.Locale;

public class Recepcao {
	private ArrayList<Estadia> totalEstadias;
	private Estadia estadia;

	public Recepcao() {
		totalEstadias = new ArrayList<Estadia>();
	}

	public void checkIn(String nome, String tipo, int idade, int dias, double valor) {
		estadia = new Estadia(nome, tipo, idade, dias, valor);
		this.totalEstadias.add(estadia);
	}

	public void checkOut(String nome) {

		for (int i = 0; i < totalEstadias.size(); i++){
			if(totalEstadias.get(i).getNome().equals(nome)){

				totalEstadias.remove(i);
			}
		}
	}	

	public int getNumDeHospedes() {
		return this.totalEstadias.size();
	}

	public double getLucroTotal() {
		double lucroTotal = 0.0;
		for (Estadia estadia : this.totalEstadias) {
			lucroTotal += estadia.getValor();
		}
		return lucroTotal;
	}

	public String toString() {
		
		String imprime = "Estadias:\n";

		for (Estadia estadia : this.totalEstadias) {
			String valor = String.format(Locale.US, "%.2f",estadia.getValor());
			imprime += estadia.getNome() + " (" + estadia.getTipo() + "): " + estadia.getDias() + " dias com o preco de R$ " + valor;
		}
		return imprime;
	}

}
