package clases;

import java.util.ArrayList;
import java.util.Random;
public class CuentaBancaria {
	private double saldo;
	private Persona titular;
	private int numeroCuenta;
	private static ArrayList<CuentaBancaria> listaDeCuentasBancarias = new ArrayList<>();
	
	public CuentaBancaria(double saldo, Persona titular) {	
		this.saldo = saldo;
		this.titular = titular;
		this.numeroCuenta = generarNumeroCuentaAleatorio();
        listaDeCuentasBancarias.add(this);
	}
	
	private int generarNumeroCuentaAleatorio() {
        Random random = new Random();
        return 100000 + random.nextInt(900000); 
    }
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Persona getTitular() {
		return titular;
	}
	public void setTitular(Persona titular) {
		this.titular = titular;
	}
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public static ArrayList<CuentaBancaria> getListaDeCuentasBancarias() {
		return listaDeCuentasBancarias;
	}
	public static void setListaDeCuentasBancarias(ArrayList<CuentaBancaria> listaDeCuentasBancarias) {
		CuentaBancaria.listaDeCuentasBancarias = listaDeCuentasBancarias;
	}
	
	public void depositar(double monto) {
		 if (monto > 0) {
	            saldo += monto;
	            System.out.println("Depósito de $" + monto + " realizado, saldo actual: $" + saldo);
	        } else {
	            System.out.println("El monto a depositar debe ser mayor a 0");
	        }
	}
	public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro de $" + monto + " realizado, saldo actual: $" + saldo);
        } else if (monto > saldo) {
            System.out.println("Fondos insuficientes para retirar $" + monto + " ,saldo actual: $" + saldo);
        } else {
            System.out.println("El monto a retirar debe ser mayor a 0.");
        }
    }
	public String despliegaInformacion() {
        return "Nombre:" + titular.getNombre() + ", Número de cuenta: " + this.numeroCuenta + ", Saldo: " + this.saldo; 
    }
	public static void imprimeInformacionDeTodasLasCuentas() {
        for (CuentaBancaria cuenta : listaDeCuentasBancarias) {
            cuenta.despliegaInformacion();
            System.out.println(cuenta.despliegaInformacion());
        }
    }
}
