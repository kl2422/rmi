package com.animal.butterfly.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IRmiService extends Remote {
	
	public String say() throws RemoteException;
	
}
