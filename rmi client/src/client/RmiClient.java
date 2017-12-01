package client;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Animal;
import server.IDatabaseServer;

public class RmiClient {

	private IDatabaseServer server;


	public RmiClient() throws RemoteException {
		try {
			server = (IDatabaseServer) Naming.lookup("rmi://localhost:1099/DatabaseServer");
			System.out.println("connected to server ");
			

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws RemoteException, SQLException {
		

		RmiClient  cl = new RmiClient();
		
		int[] products = cl.server.getInfectedProducts(6);

		System.out.println(products.toString());

		
	}
	
}
