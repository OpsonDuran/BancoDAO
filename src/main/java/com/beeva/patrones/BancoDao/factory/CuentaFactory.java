package com.beeva.patrones.BancoDao.factory;

import com.beeva.patrones.BancoDao.entity.Cuenta;
import com.beeva.patrones.BancoDao.impl.CuentaDAOImplAhorro;
import com.beeva.patrones.BancoDao.impl.CuentaDAOImplCheque;
import com.beeva.patrones.BancoDao.inter.CuentaDAO;

public class CuentaFactory {
	
	public CuentaDAO getImplements(Cuenta cuenta){
		if(cuenta.getTipoCuenta()==1){
			CuentaDAO account = new CuentaDAOImplAhorro();
			return account ;
		}else{
			CuentaDAO account = new CuentaDAOImplCheque();
			return account;
		}
	}



}
