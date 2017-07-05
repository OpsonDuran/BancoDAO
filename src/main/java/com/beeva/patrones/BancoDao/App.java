package com.beeva.patrones.BancoDao;

import com.beeva.patrones.BancoDao.entity.Cuenta;
import com.beeva.patrones.BancoDao.factory.CuentaFactory;
import com.beeva.patrones.BancoDao.inter.CuentaDAO;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        Cuenta cuenta = new Cuenta();
        cuenta.setBalance(100);
        cuenta.setTipo(1); 
        CuentaFactory cuentaFactory = new CuentaFactory();
        CuentaDAO cuentaDAO =  cuentaFactory.getFactory(cuenta);
        cuentaDAO.addCuenta(cuenta);
        
        System.out.println("balance"+cuentaDAO.getCuenta(1).getBalance());
        System.out.println("tipo cuenta"+cuentaDAO.getCuenta(1).getTipo());
        
        
        
        
    }
}
