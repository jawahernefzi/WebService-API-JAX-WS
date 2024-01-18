package serveur;

import javax.xml.ws.Endpoint;

import service.Banque;

public class Serveur {
	public static void main (String[] args) {
		Endpoint.publish("http://localhost:8090/", new Banque());
		System.out.println("ok");
		
	}
}
