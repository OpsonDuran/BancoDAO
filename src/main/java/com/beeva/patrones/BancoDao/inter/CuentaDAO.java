package com.beeva.patrones.BancoDao.inter;

import com.beeva.patrones.BancoDao.entity.Cuenta;


public interface CuentaDAO {
	

	public boolean addCuenta(Cuenta c);
	public boolean removCuenta(Cuenta c);
	public Cuenta getCuenta(int id);
	

}
