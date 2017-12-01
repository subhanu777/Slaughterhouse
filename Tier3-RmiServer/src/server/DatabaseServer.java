package server;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.RemoteObject;
import java.rmi.server.RemoteObjectInvocationHandler;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.ArrayList;

import adapter.Adapter;
import adapter.IAdapter;
import model.Animal;

public class DatabaseServer extends UnicastRemoteObject implements IDatabaseServer {

	private IAdapter adapter;

	public DatabaseServer() throws RemoteException {
		super();
		try {
			adapter=new Adapter();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) throws RemoteException {
		IDatabaseServer databaseServer = (IDatabaseServer) new DatabaseServer();
	
		try {
			
		
			LocateRegistry.createRegistry(1099);
			String path = "//localhost:1099/DatabaseServer";
			Naming.bind("DatabaseServer", databaseServer);
			System.out.println("DatabaseServer started");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void registerAnimal(double weight) {
		try {
			adapter.registerAnimal(weight);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void registerTray(double maxWeight) {
		try {
			adapter.registerTray(maxWeight);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void registerProduct(String productType){
		try {
			adapter.registerProduct(productType);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void addProductContent(int productId, int trayId) {
		try {
			adapter.addProductContent(productId, trayId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void addTrayContent(int trayId, int animalId,double weight) {
		try {
			adapter.addTrayContent(trayId, animalId, weight);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public int[] getInfectedProducts(int productId) throws RemoteException {
		int [] arr = new int[0];
		try {
			arr = adapter.getInfectedProducts(productId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arr;
	}


}
