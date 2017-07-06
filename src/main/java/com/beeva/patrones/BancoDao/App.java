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
		int tipocuenta,id,opcion;
    	
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
			        Cliente cliente=new Cliente();
			        cliente.setNombre(nombre);
			        cliente.setApellido(apellido);
			        cliente.setCuenta(cuenta);
			        usuarios.AddCliente(cliente);				    
				}

				System.out.println("Numero de clientes "+ usuarios.getnClientes());


				System.out.println("Informacion del cliente:");
				for(int i=0;i<usuarios.getnClientes();i++){
				System.out.println("Nombre del usuario:" +usuarios.getCliente(i).nombre+" "+usuarios.getCliente(i).apellido+"| Tipo cuenta: "+usuarios.getCliente(i).getCuenta().getTipoCuenta()+" | Saldo: $"+usuarios.getCliente(i).getCuenta().getBalance());		
				}
				
				// Cajero
				System.out.println("---Cajero---");
				System.out.println("Ingresa usuario");
				System.out.println("---------------");
				System.out.println("Id:");
				id=lectura.nextInt();
				while(true){
					System.out.println("Informacion del cliente:");
					System.out.println("Nombre del usuario:" +usuarios.getCliente(id).nombre+" "+usuarios.getCliente(id).apellido+"| Tipo cuenta: "+usuarios.getCliente(id).getCuenta().getTipoCuenta()+" | Saldo: $"+usuarios.getCliente(id).getCuenta().getBalance());		
					System.out.println("Opciones");
					System.out.println("1----Deposito");
					System.out.println("2----Retiro");
			        System.out.println("Seleccione una opcion");
			        opcion= lectura.nextInt();
			        System.out.println("----------");
			        CuentaFactory cuentaFactory = new CuentaFactory();
			        CuentaDAO cuentaDAO =  cuentaFactory.getImplements(usuarios.getCliente(id).getCuenta());
			    	switch (opcion) {
					case 1:

						System.out.println("----------");
						System.out.println("Deposito");
						System.out.println("Catidad a depositar");
					    dinero= lectura.nextDouble();
				        cuentaDAO.Deposito(usuarios.getCliente(id), dinero);
						System.out.println("Saldo "+usuarios.getCliente(id).getCuenta().getBalance());
						System.out.println("----------");

						break;
					case 2:
						System.out.println("----------");
						System.out.println("Retiro");
						System.out.println("Catidad a Retirar");
					    dinero= lectura.nextDouble();
				        cuentaDAO.Retiro(usuarios.getCliente(id), dinero);
						System.out.println("Saldo "+usuarios.getCliente(id).getCuenta().getBalance());
						System.out.println("----------");
						break;

					default:
					    break;
			    	}}
        
        
        
    }
}
