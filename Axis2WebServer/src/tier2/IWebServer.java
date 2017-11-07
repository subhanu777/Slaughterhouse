package tier2;

import java.util.ArrayList;

public interface IWebServer {

	
	public void registerAnimal(double weight);
	public void registerTray(double maxWeight) ;
	public void registerProduct(String productType );
	
	public void addProductContent(int productId,int trayId);
	public void addTrayContent(int trayId,int animalId, double weight);
	
	public ArrayList<Integer> getInfectedProducts(int productId) ;
}
