package com.animal.butterfly.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import com.animal.butterfly.server.IRmiService;

public class RmiClient {
	
	public static void main(String[] args) {
		try {
			IRmiService rmiService = (IRmiService) Naming.lookup("rmi://localhost:8888/rmiService");
			String content = rmiService.say();
			System.out.println("RMI Client Got Say Content: " + content);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}
	
}
