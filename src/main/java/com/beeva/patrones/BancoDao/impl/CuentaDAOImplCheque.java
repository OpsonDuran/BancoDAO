package com.beeva.patrones.BancoDao.impl;

import com.beeva.patrones.BancoDao.entity.Cliente;
import com.beeva.patrones.BancoDao.inter.CuentaDAO;

import java.util.Calendar;

public class CuentaDAOImplCheque implements CuentaDAO{
	//inicializa calendario y se asigna arreglo de los dias
	Calendar now = Calendar.getInstance();
	String[] strDays = new String[]{"Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};

	public boolean Deposito(Cliente cliente, double dinero) {
		
		cliente.getCuenta().setBalance(cliente.getCuenta().getBalance()+dinero);
		return true;
	}

	public boolean Retiro(Cliente cliente, double dinero) {
		if(strDays[now.get(Calendar.DAY_OF_WEEK) - 1]!="Sabado" && strDays[now.get(Calendar.DAY_OF_WEEK) - 1]!="Domingo"){
			cliente.getCuenta().setBalance(cliente.getCuenta().getBalance()-dinero);
			return true;
		}
		return false;
	}

}
