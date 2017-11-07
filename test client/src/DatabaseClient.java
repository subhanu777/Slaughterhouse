import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class DatabaseClient{

	
	private IDatabaseServer databaseClient;
	
	public DatabaseClient() throws RemoteException {
		super();
		try {

			databaseClient =  (IDatabaseServer) Naming.lookup("rmi://localhost:1099/DatabaseServer");
			System.out.println("connected to server");
			

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws RemoteException {
		
	DatabaseClient db = new DatabaseClient();
	
	}
	
	
}
