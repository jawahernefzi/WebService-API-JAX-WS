package services;

public class test {

	public static void main(String[] args) {
		Banque proxy=new Banquews().getBanquePort();
		System.out.println(proxy.comptes().toString());
		}
}
