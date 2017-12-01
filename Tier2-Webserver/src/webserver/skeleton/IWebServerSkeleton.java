/**
 * IWebServerSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:31 BST)
 */
package webserver.skeleton;

import server.IDatabaseServer;
import webserver.GetInfectedProductsResponse;

import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 * IWebServerSkeleton java skeleton for the axisService
 */
public class IWebServerSkeleton implements IWebServerSkeletonInterface {
	private IDatabaseServer server;

	/**
	 * Auto generated method signature
	 *
	 * @param registerProduct0
	 * @return
	 */
	public void registerProduct(webserver.RegisterProduct registerProduct0) {
		// TODO : fill this with the necessary business logic
		connectClient();

		try {
			server.registerProduct(registerProduct0.getArgs0());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @param addTrayContent1
	 * @return
	 */
	public void addTrayContent(webserver.AddTrayContent addTrayContent1) {
		// TODO : fill this with the necessary business logic
		connectClient();
		try {
			server.addTrayContent(addTrayContent1.getArgs0(), addTrayContent1.getArgs1(), addTrayContent1.getArgs2());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @param registerTray2
	 * @return
	 */
	public void registerTray(webserver.RegisterTray registerTray2) {
		// TODO : fill this with the necessary business logic
		connectClient();
		try {
			server.registerTray(registerTray2.getArgs0());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @param registerAnimal3
	 * @return
	 */
	public void registerAnimal(webserver.RegisterAnimal registerAnimal3) {
		// TODO : fill this with the necessary business logic
		connectClient();
		try {
			server.registerAnimal(registerAnimal3.getArgs0());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @param getInfectedProducts4
	 * @return getInfectedProductsResponse5
	 */
	public webserver.GetInfectedProductsResponse getInfectedProducts(
			webserver.GetInfectedProducts getInfectedProducts4) {
		// TODO : fill this with the necessary business logic
		connectClient();
		
		int[] list = new int[0];

		try {
			list = server.getInfectedProducts(getInfectedProducts4.getArgs0());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		GetInfectedProductsResponse response = new GetInfectedProductsResponse();
		response.set_return(list);
		return response;
	}

	/**
	 * Auto generated method signature
	 *
	 * @param addProductContent6
	 * @return
	 */
	public void addProductContent(webserver.AddProductContent addProductContent6) {
		// TODO : fill this with the necessary business logic
		connectClient();

		try {
			server.addProductContent(addProductContent6.getArgs0(), addProductContent6.getArgs1());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void connectClient() {
		try {
			server = (IDatabaseServer) Naming.lookup("rmi://localhost:1099/DatabaseServer");
			System.out.println("connected to server ");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
