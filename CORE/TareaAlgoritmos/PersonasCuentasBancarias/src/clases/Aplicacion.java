package clases;
import clases.CuentaBancaria;
import clases.Persona;
public class Aplicacion {
	public static void main(String[] args) {
		Persona persona1 = new Persona("Samuel", 22);
		Persona persona2 = new Persona("Simon", 19);
		Persona persona3 = new Persona("Gonzalo", 20);
		
		CuentaBancaria cuenta1 = new CuentaBancaria(22.20, persona1);
		CuentaBancaria cuenta2 = new CuentaBancaria(30.35, persona2);
		CuentaBancaria cuenta3 = new CuentaBancaria(40.33, persona3);
		
		cuenta1.depositar(25.50);
		System.out.println("Saldo Samuel " + cuenta1.getSaldo());
		
		cuenta1.retirar(50);
		cuenta1.retirar(30);
		
		System.out.println("Saldo cuenta1: " + cuenta1.getSaldo());
		System.out.println("Saldo cuenta2: " + cuenta2.getSaldo());
		System.out.println("Saldo cuenta3: " + cuenta3.getSaldo());
		
		CuentaBancaria.imprimeInformacionDeTodasLasCuentas();
	}
}
