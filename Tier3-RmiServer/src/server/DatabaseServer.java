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

public class DatabaseServer extends UnicastRemoteObject implements IDatabaseServer {

	private Adapter adapter;

	public DatabaseServer() throws RemoteException {
		super();
		Registry registry = LocateRegistry.createRegistry(1099);
	}

	public static void main(String[] args) {
		try {
			IDatabaseServer databaseServer = (IDatabaseServer) new DatabaseServer();
			Naming.rebind("DatabaseServer", databaseServer);
			System.out.println("DatabaseServer started");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void registerAnimal(double weight) throws SQLException {
		adapter.registerAnimal(weight);
	}

	@Override
	public void registerTray(double maxWeight) throws SQLException {
		adapter.registerTray(maxWeight);
	}

	@Override
	public void registerProduct(String productType) throws SQLException {
		adapter.registerProduct(productType);
	}

	@Override
	public void addProductContent(int productId, int trayId) throws SQLException {
		adapter.addProductContent(productId, trayId);
	}

	@Override
	public void addTrayContent(int trayId, int animalId,double weight) throws SQLException {
		adapter.addTrayContent(trayId, animalId, weight);
	}

	@Override
	public ArrayList<Integer> getInfectedProducts(int productId) throws RemoteException, SQLException {
		return adapter.getInfectedProducts(productId);
	}

}
