package adapter;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Takes care of the database access read/write
 * 
 * @author Bogdan and Tomas
 * @version 1.0
 */
public class Adapter implements IAdapter {

	private static final String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String USER = "bogdan";
	private static final String PASSWORD = "bogdan";
	private static Connection conn;

	public Adapter() throws SQLException {
		DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
	}

	private void openDatabase() throws SQLException {
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			conn.setAutoCommit(false);
			System.out.println("connection established, autocommit off");

		} catch (SQLException e) {
			System.out.println("error establishing connection");
			System.out.println("Connection string in use: " + URL + "(user/pwd " + USER + "/" + PASSWORD + ")");
			System.out.println(e.getMessage());
			e.printStackTrace();

		}

	}

	private void closeDatabase() {
		try {
			conn.close();
			System.out.println("connection closed");

		} catch (SQLException e) {
			System.out.println("error closing connection");
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.exit(0);

		}
	}

	@Override
	public void registerAnimal(double weight) throws SQLException {
		openDatabase();
		String sql = "insert into animal values (sq_id.nextval," + weight + ")";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.executeQuery();
		stmt.close();
		closeDatabase();

	}

	@Override
	public void registerTray(double maxWeight) throws SQLException {

		try {
			openDatabase();
			int defaultWeight = 0;
			String sql = "insert into tray values (sq_id.nextval," + maxWeight + "," + defaultWeight + ")";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.executeQuery();
			stmt.close();
			closeDatabase();
		} catch (Exception e) {
			System.out.println("error running case, see messages for details");
			System.out.println(e.getMessage());
			e.printStackTrace();

		}
	}

	@Override
	public void registerProduct(String productType) throws SQLException {
		try {
			openDatabase();

			String sql = "insert into product values (sq_id.nextval,'" + productType + "')";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.executeQuery();
			stmt.close();
			closeDatabase();
		} catch (Exception e) {
			System.out.println("error running case, see messages for details");
			System.out.println(e.getMessage());
			e.printStackTrace();

		}
	}
	
	@Override
	public void addProductContent(int productId, int trayId) throws SQLException {
		try {
			openDatabase();
			String sql = "insert into product_content values (" + productId + ", " + trayId + ")";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.executeQuery();
			stmt.close();
			closeDatabase();
		}

		catch (Exception e) {
			System.out.println("error running case, see messages for details");
			System.out.println(e.getMessage());
			e.printStackTrace();

		}

	}

	@Override
	public void addTrayContent(int trayId, int animalId) throws SQLException {
		try {
			openDatabase();
			String sql = "insert into tray_content values (" + animalId + ", " + trayId + ")";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.executeQuery();
			stmt.close();
			closeDatabase();
		}

		catch (Exception e) {
			System.out.println("error running case, see messages for details");
			System.out.println(e.getMessage());
			e.printStackTrace();

		}

	}

	@Override
	public ArrayList<Integer> getInfectedProducts(int productId) throws SQLException {
		ArrayList<Integer> products = new ArrayList<>();
		try {
			openDatabase();
			
			PreparedStatement stmt = conn.prepareStatement(" select unique product_id from product_content inner join (select tray_id as tr from tray_content inner join (select tray_id as infected_tray from product_content where product_id = ? ) on tray_id = infected_tray) on product_content.tray_id = tr");
			stmt.setLong(1, productId);
			ResultSet rs = stmt.executeQuery();
			System.out.println("Infected Products");
			while (rs.next()) {
				
				int ssn = rs.getInt("product_id");
				products.add(ssn);
				System.out.println(ssn);
				
			}
			rs.close();
			stmt.close();
			closeDatabase();
		} catch (Exception e) {
			System.out.println("error running case, see messages for details");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return products;
	}

	public static void main(String[] args) throws SQLException {

		Adapter ad = new Adapter();
		ad.getInfectedProducts(11);
	}

}
