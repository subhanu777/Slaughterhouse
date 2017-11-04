import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import databaseServer.IDatabaseServer;

public class DatabaseClient extends UnicastRemoteObject implements IDatabaseServer{

	
	private IDatabaseServer databaseServer;
	
	public DatabaseClient() throws RemoteException {
		super();
		try {

			databaseServer =  (IDatabaseServer) Naming.lookup("rmi://localhost:1099/DatabaseServer");
			System.out.println("connected to server");
			

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws RemoteException {
		
	DatabaseClient db = new DatabaseClient();
	
	}
	
	
}
