package server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IDatabaseServer extends Remote{

	public void registerAnimal(double weight)throws RemoteException;
	public void registerTray(double maxWeight) throws RemoteException;
	public void registerProduct(String productType )throws RemoteException;
	
	public void addProductContent(int productId,int trayId)throws RemoteException;
	public void addTrayContent(int trayId,int animalId,double weight)throws RemoteException;
	
	public int[] getInfectedProducts(int productId) throws RemoteException;	
}