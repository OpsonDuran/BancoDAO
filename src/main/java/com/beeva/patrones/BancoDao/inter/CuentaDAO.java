package com.beeva.patrones.BancoDao.inter;

import com.beeva.patrones.BancoDao.entity.Cliente;

public interface CuentaDAO {
	public boolean Deposito(Cliente cliente,double dinero);
	public boolean Retiro(Cliente cliente,double dinero);

}
