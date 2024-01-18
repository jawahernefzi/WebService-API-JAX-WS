package metier;

import java.util.Date;
public class Compte {
	
private long code;
private Date dateCreation;
private double solde;
public Compte(long code, Date dateCreation, double solde) {
	this.code = code;
	this.dateCreation = dateCreation;
	this.solde = solde;
}


public Compte() {
	super();
}


public long getCode() {
	return code;
}
public void setCode(long code) {
	this.code = code;
}
public Date getDateCreation() {
	return dateCreation;
}
public void setDateCreation(Date dateCreation) {
	this.dateCreation = dateCreation;
}
public double getSolde() {
	return solde;
}
public void setSolde(double solde) {
	this.solde = solde;
}



@Override
public String toString() {
	return "Compte [code=" + code + ", dateCreation=" + dateCreation + ", solde=" + solde + "]";
}


}
