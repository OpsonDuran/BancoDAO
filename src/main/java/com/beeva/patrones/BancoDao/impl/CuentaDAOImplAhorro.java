package com.beeva.patrones.BancoDao.impl;

import com.beeva.patrones.BancoDao.entity.Cliente;
import com.beeva.patrones.BancoDao.inter.CuentaDAO;

public class CuentaDAOImplAhorro implements CuentaDAO{

	public boolean Deposito(Cliente cliente, double dinero) {
	
		cliente.cuenta.setBalance(cliente.cuenta.getBalance()+dinero);
		return true;
	}

	public boolean Retiro(Cliente cliente, double dinero) {
		if(cliente.cuenta.getBalance()<5000){
			cliente.cuenta.setBalance(cliente.cuenta.getBalance()-dinero);
			return true;
		}
		return false;
	}
	
}
