package adapter;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface IAdapter{
	public void registerAnimal(double weight) throws SQLException;
	public void registerTray(double maxWeight)throws SQLException;
	public void registerProduct(String productType )throws SQLException;
	
	public void addProductContent(int productId,int trayId)throws SQLException;
	public void addTrayContent(int trayId,int animalId,double weight)throws SQLException;
	public int[] getInfectedProducts(int productId)throws SQLException;
}
