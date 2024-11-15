package com.clases;
import com.interfaces.Auditable;

public class Transaccion implements Auditable{
	public int idTransaccion;
	public String tipoTransaccion;
	public int monto;
	public Transaccion(int idTransaccion, String tipoTransaccion, int monto) {
		this.idTransaccion = idTransaccion;
		this.tipoTransaccion = tipoTransaccion;
		this.monto = monto;
	}
	public int getIdTransaccion() {
		return idTransaccion;
	}
	public void setIdTransaccion(int idTransaccion) {
		this.idTransaccion = idTransaccion;
	}
	public String getTipoTransaccion() {
		return tipoTransaccion;
	}
	public void setTipoTransaccion(String tipoTransaccion) {
		this.tipoTransaccion = tipoTransaccion;
	}
	public int getMonto() {
		return monto;
	}
	public void setMonto(int monto) {
		this.monto = monto;
	}
	
	 	@Override
	    public void registrarAccion(String accion) {
	        System.out.println("Acción registrada: " + accion);
	    }
	 	@Override
	 	public String toString() {
	 	    return "id Transaccion: " + idTransaccion + ", tipo: " + this.tipoTransaccion + ", monto: " + this.monto;
	 	}
}
