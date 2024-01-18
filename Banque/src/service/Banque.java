package service;
import java.util.ArrayList;
import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import metier.Compte;
@WebService(serviceName ="banquews")

public class Banque {

	private ArrayList<Compte> comptes;
	@WebMethod(operationName ="convertir")
	public double convertirEuroDt (@WebParam double mt) {
		mt=mt*3.36;
		return mt;
				
	}
	
	public Banque() {
		this.comptes=new ArrayList<Compte>();
		comptes.add(new Compte(10, new Date(125, 10, 5), 4000));
		comptes.add(new Compte(11, new Date(125, 10, 5), 4000));
	}
@WebMethod(operationName = "Comptes")
	public ArrayList<Compte> getComptes() {
		return comptes;
	}
@WebMethod(operationName = "AjoutComptes")
	public void setComptes(ArrayList<Compte> comptes) {
		this.comptes = comptes;
	}
@WebMethod(operationName = "rechercher")
	public Compte rechercherCompte(long code) { 
		for(Compte c:comptes)
			if(c.getCode()==code)
				return c;
		return null;
	}
@WebMethod(operationName = "MAJ")
	public void MAJ_solde(long code,double solde1) {
		this.rechercherCompte(code).setSolde(solde1);
		System.out.println("votre solde après la MAJ = "+this.rechercherCompte(code).getSolde());
	}
	@WebMethod(operationName = "listeCodes")
	public void listerComptes()
	{
	for(Compte c:comptes)
		System.out.println(c.getCode());
	}
	@WebMethod(operationName = "retirer")
	public double retirerSolde(long code,double montant) {
	if (this.rechercherCompte(code).getSolde()<montant)
		System.out.println("solde insuffisant");
	else
		this.rechercherCompte(code).setSolde(this.rechercherCompte(code).getSolde()-montant);
	return this.rechercherCompte(code).getSolde();
	}
	@WebMethod(operationName = "verser")
	public double verserSolde(long code,double montant) {
		
			this.rechercherCompte(code).setSolde(this.rechercherCompte(code).getSolde()+montant);
		return this.rechercherCompte(code).getSolde();
		}
}