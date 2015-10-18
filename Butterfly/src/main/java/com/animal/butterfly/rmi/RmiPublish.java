package com.animal.butterfly.rmi;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import com.animal.butterfly.server.IRmiService;
import com.animal.butterfly.server.RmiService;

public class RmiPublish {

	public RmiPublish() {

		try {
			IRmiService rmiService = new RmiService();
			// 发布的接口
			LocateRegistry.createRegistry(8888);
			// 绑定地址
			Naming.bind("rmi://localhost:8888/rmiService", rmiService);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (AlreadyBoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new RmiPublish();
	}
}
