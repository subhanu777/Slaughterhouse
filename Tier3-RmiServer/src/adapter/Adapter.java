package adapter;

import java.sql.SQLException;

import adaptee.Adaptee;

public class Adapter implements IAdapter{

	
	private Adaptee adaptee;
	
	public Adapter() throws ClassNotFoundException {
			adaptee= new Adaptee();
	}
	
	
	
	@Override
	public void registerAnimal(double weight) throws SQLException {
		
		String sql = "insert into animal values (sq_id.nextval,"+weight+")";		
		adaptee.update(sql);
		
	}

	@Override
	public void registerTray(double maxWeight) throws SQLException {
		int defaultWeight = 0;
		String sql = "insert into tray values (sq_id.nextval,"+maxWeight+","+defaultWeight+")";	
			adaptee.update(sql);	
	}

	@Override
	public void registerProduct(String productType) throws SQLException {
		String sql = "insert into product values (sq_id.nextval,'"+productType+"')";		
		adaptee.update(sql);			
	}



	@Override
	public void addProductContent(int productId, int trayId)throws SQLException {	
		String sql = "insert into product_content values ("+productId+", "+trayId+")";
		adaptee.update(sql);		
	}



	@Override
	public void addTrayContent(int trayId, int animalId) throws SQLException {
		String sql = "insert into tray_content values ("+animalId+", "+trayId+")";
		adaptee.update(sql);
	}
	public static void main(String[] args) throws ClassNotFoundException {
	
		try{
			Adapter adapter  = new Adapter();
			adapter.addTrayContent(21, 22);
		}
		catch(SQLException e) {
		e.printStackTrace();
	}
	
	}
	
	
	
	
	
	
	
	
	
}
