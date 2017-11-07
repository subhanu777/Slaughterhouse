package adapter;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface IAdapter {
	public void registerAnimal(double weight) throws SQLException;
	public void registerTray(double maxWeight) throws SQLException;
	public void registerProduct(String productType )throws SQLException;
	
	public void addProductContent(int productId,int trayId)throws SQLException;
	public void addTrayContent(int trayId,int animalId)throws SQLException;
	public ArrayList<Integer> getInfectedProducts(int productId) throws SQLException;
}
