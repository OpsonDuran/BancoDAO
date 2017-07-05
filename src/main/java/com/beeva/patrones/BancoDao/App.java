package com.beeva.patrones.BancoDao;

import java.util.Scanner;

import com.beeva.patrones.BancoDao.entity.Cliente;
import com.beeva.patrones.BancoDao.entity.Cuenta;
import com.beeva.patrones.BancoDao.factory.CuentaFactory;
import com.beeva.patrones.BancoDao.inter.CuentaDAO;
import com.beeva.patrones.BancoDao.store.Banco;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*
        Cuenta cuenta = new Cuenta();
        cuenta.setBalance(100);
        cuenta.setTipoCuenta(1);
        CuentaFactory cuentaFactory = new CuentaFactory();
        CuentaDAO cuentaDAO =  cuentaFactory.getImplements(cuenta);
        cuentaDAO.Deposito(100);
        /*
        System.out.println("balance"+cuentaDAO.getCuenta(1).getBalance());
        System.out.println("tipo cuenta"+cuentaDAO.getCuenta(1).getTipo());
        */
    	
    	Scanner lectura = new Scanner(System.in);
		double num,dinero;
		String nombre,apellido;
		int tipocuenta;
    	
		//Ingresar usuarios

				System.out.println("numero de usuarios a ingresar");
				System.out.println("---------------");
				num=lectura.nextInt();
				lectura.nextLine();
				Banco usuarios= new Banco();

				for(int i=0;i<num;i++){
					System.out.println("Ingresa usuario "+(i+1));
					System.out.println("---------------");
					System.out.print("Nombre:");
					nombre=lectura.nextLine();
					System.out.print("Apellido:");
					apellido=lectura.nextLine();
				    lectura.nextLine();
					System.out.println("Tipos de Cuenta");
					System.out.println("Tipo Ahorro->1");
					System.out.println("Tipo Cheques->2");
					System.out.print("Tipo de Cuenta:");
				    tipocuenta=lectura.nextInt();
				    lectura.nextLine();
					System.out.print("Saldo inicial: $");
				    dinero=lectura.nextDouble();
				    lectura.nextLine();
				    Cuenta cuenta = new Cuenta();
			        cuenta.setBalance(dinero);
			        cuenta.setTipoCuenta(tipocuenta);
			        CuentaFactory cuentaFactory = new CuentaFactory();
			        CuentaDAO cuentaDAO =  cuentaFactory.getImplements(cuenta);
			        Cliente cliente=new Cliente();
			        cliente.setNombre(nombre);
			        cliente.setApellido(apellido);
			        cliente.setCuenta(cuenta);
			        usuarios.AddCliente(cliente);
			        
				    
				}

				System.out.println("Numero de clientes "+ usuarios.getnClientes());


				System.out.println("Informacion del cliente:");
				for(int i=0;i<usuarios.getnClientes();i++){
				System.out.println("Nombre del usuario:" +usuarios.getCliente(i).nombre+" "+usuarios.getCliente(i).apellido+" | Saldo: $"+usuarios.getCliente(i).getCuenta().getBalance());		
				}
        
        
        
    }
}
