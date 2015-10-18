package com.animal.butterfly.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

@SuppressWarnings("serial")
public class RmiService extends UnicastRemoteObject implements IRmiService {

	public RmiService() throws RemoteException {
		super();
	}

	public String say() throws RemoteException {
		String content = "Woo! So beautiful butterfly!";
		System.out.println("RMI Server say: " + content);
		return content;
	}
}
