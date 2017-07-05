package com.beeva.patrones.BancoDao.entity;

public class Cuenta {
	
	protected double balance;
	protected int tipo;
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

}
