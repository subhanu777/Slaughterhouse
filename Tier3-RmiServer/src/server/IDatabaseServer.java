package server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;

public interface IDatabaseServer extends Remote{

	public void registerAnimal(double weight)throws RemoteException, SQLException;
	public void registerTray(double maxWeight) throws RemoteException, SQLException;
	public void registerProduct(String productType )throws RemoteException, SQLException;
	
	public void addProductContent(int productId,int trayId)throws RemoteException, SQLException;
	public void addTrayContent(int trayId,int animalId,double weight)throws RemoteException, SQLException;
	
	public ArrayList<Integer> getInfectedProducts(int productId) throws RemoteException, SQLException;

}
