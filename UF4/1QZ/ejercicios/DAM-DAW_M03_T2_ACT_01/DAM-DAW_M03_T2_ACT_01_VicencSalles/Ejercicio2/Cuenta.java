package Ejercicio2;

import java.util.Scanner;

public class Cuenta {

	private int numeroCuenta;
	private int saldo;
	private String titular;
	
	public static void main(String[] args) {
		
	}
	
	public Cuenta (int numeroCuenta, int saldo, String titular){
	
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.titular = titular;
		
	}
	
	public int getNumeroCuenta(){
		return numeroCuenta;
	}
	
	public int getSaldo(){
		return saldo;
	}

	public String getTitular(){
		return titular;
	}
	
	public void setSaldo(int nuevoSaldo){
		saldo += nuevoSaldo;
		System.out.println("Se ha efectuado el ingreso correctamente.");
		System.out.println("Tu saldo actual es de "+saldo+"€");
	}
	
	public void setTitular(String nuevoTitular){
		titular = nuevoTitular;
	}
	
	public void cobrarComision (int comision){
		saldo -= comision;
	}
	
	
	
}
