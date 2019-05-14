
package ar.edu.unlam.pb2.Cuenta;

public class Cuenta {

	private String titular;
	private Double cantidad;

	public Cuenta(String titular, Double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}

	public Cuenta(String titular) {
		this.titular = titular;
		this.cantidad = 0.0;
	}
	/* Métodos */

	public String getTitular() { 
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public String toString() {
		String mensaje = "El titular es" + titular + "" + "la cantidad es" + cantidad;
		return mensaje;
	}

	public void ingresar(Double cantidad) {
		if (cantidad >= 0.0) {
			this.cantidad += cantidad;
		}
	}

	public void retira(Double cantidad) {
		this.cantidad -= cantidad;
		if ((this.cantidad - cantidad) < 0.0) {
			this.cantidad = 0.0;
		}
	}

}

