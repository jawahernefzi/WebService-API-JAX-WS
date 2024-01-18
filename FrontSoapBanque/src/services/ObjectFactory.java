
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Retirer_QNAME = new QName("http://service/", "retirer");
    private final static QName _AjoutComptesResponse_QNAME = new QName("http://service/", "AjoutComptesResponse");
    private final static QName _Rechercher_QNAME = new QName("http://service/", "rechercher");
    private final static QName _ComptesResponse_QNAME = new QName("http://service/", "ComptesResponse");
    private final static QName _MAJ_QNAME = new QName("http://service/", "MAJ");
    private final static QName _ConvertirResponse_QNAME = new QName("http://service/", "convertirResponse");
    private final static QName _VerserResponse_QNAME = new QName("http://service/", "verserResponse");
    private final static QName _RetirerResponse_QNAME = new QName("http://service/", "retirerResponse");
    private final static QName _Comptes_QNAME = new QName("http://service/", "Comptes");
    private final static QName _MAJResponse_QNAME = new QName("http://service/", "MAJResponse");
    private final static QName _Verser_QNAME = new QName("http://service/", "verser");
    private final static QName _Convertir_QNAME = new QName("http://service/", "convertir");
    private final static QName _ListeCodes_QNAME = new QName("http://service/", "listeCodes");
    private final static QName _ListeCodesResponse_QNAME = new QName("http://service/", "listeCodesResponse");
    private final static QName _AjoutComptes_QNAME = new QName("http://service/", "AjoutComptes");
    private final static QName _RechercherResponse_QNAME = new QName("http://service/", "rechercherResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Retirer }
     * 
     */
    public Retirer createRetirer() {
        return new Retirer();
    }

    /**
     * Create an instance of {@link Rechercher }
     * 
     */
    public Rechercher createRechercher() {
        return new Rechercher();
    }

    /**
     * Create an instance of {@link AjoutComptesResponse }
     * 
     */
    public AjoutComptesResponse createAjoutComptesResponse() {
        return new AjoutComptesResponse();
    }

    /**
     * Create an instance of {@link Comptes }
     * 
     */
    public Comptes createComptes() {
        return new Comptes();
    }

    /**
     * Create an instance of {@link RetirerResponse }
     * 
     */
    public RetirerResponse createRetirerResponse() {
        return new RetirerResponse();
    }

    /**
     * Create an instance of {@link ConvertirResponse }
     * 
     */
    public ConvertirResponse createConvertirResponse() {
        return new ConvertirResponse();
    }

    /**
     * Create an instance of {@link VerserResponse }
     * 
     */
    public VerserResponse createVerserResponse() {
        return new VerserResponse();
    }

    /**
     * Create an instance of {@link ComptesResponse }
     * 
     */
    public ComptesResponse createComptesResponse() {
        return new ComptesResponse();
    }

    /**
     * Create an instance of {@link MAJ }
     * 
     */
    public MAJ createMAJ() {
        return new MAJ();
    }

    /**
     * Create an instance of {@link RechercherResponse }
     * 
     */
    public RechercherResponse createRechercherResponse() {
        return new RechercherResponse();
    }

    /**
     * Create an instance of {@link AjoutComptes }
     * 
     */
    public AjoutComptes createAjoutComptes() {
        return new AjoutComptes();
    }

    /**
     * Create an instance of {@link Convertir }
     * 
     */
    public Convertir createConvertir() {
        return new Convertir();
    }

    /**
     * Create an instance of {@link ListeCodes }
     * 
     */
    public ListeCodes createListeCodes() {
        return new ListeCodes();
    }

    /**
     * Create an instance of {@link ListeCodesResponse }
     * 
     */
    public ListeCodesResponse createListeCodesResponse() {
        return new ListeCodesResponse();
    }

    /**
     * Create an instance of {@link Verser }
     * 
     */
    public Verser createVerser() {
        return new Verser();
    }

    /**
     * Create an instance of {@link MAJResponse }
     * 
     */
    public MAJResponse createMAJResponse() {
        return new MAJResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Retirer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "retirer")
    public JAXBElement<Retirer> createRetirer(Retirer value) {
        return new JAXBElement<Retirer>(_Retirer_QNAME, Retirer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjoutComptesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "AjoutComptesResponse")
    public JAXBElement<AjoutComptesResponse> createAjoutComptesResponse(AjoutComptesResponse value) {
        return new JAXBElement<AjoutComptesResponse>(_AjoutComptesResponse_QNAME, AjoutComptesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Rechercher }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "rechercher")
    public JAXBElement<Rechercher> createRechercher(Rechercher value) {
        return new JAXBElement<Rechercher>(_Rechercher_QNAME, Rechercher.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComptesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "ComptesResponse")
    public JAXBElement<ComptesResponse> createComptesResponse(ComptesResponse value) {
        return new JAXBElement<ComptesResponse>(_ComptesResponse_QNAME, ComptesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MAJ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "MAJ")
    public JAXBElement<MAJ> createMAJ(MAJ value) {
        return new JAXBElement<MAJ>(_MAJ_QNAME, MAJ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertirResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "convertirResponse")
    public JAXBElement<ConvertirResponse> createConvertirResponse(ConvertirResponse value) {
        return new JAXBElement<ConvertirResponse>(_ConvertirResponse_QNAME, ConvertirResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "verserResponse")
    public JAXBElement<VerserResponse> createVerserResponse(VerserResponse value) {
        return new JAXBElement<VerserResponse>(_VerserResponse_QNAME, VerserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetirerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "retirerResponse")
    public JAXBElement<RetirerResponse> createRetirerResponse(RetirerResponse value) {
        return new JAXBElement<RetirerResponse>(_RetirerResponse_QNAME, RetirerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Comptes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "Comptes")
    public JAXBElement<Comptes> createComptes(Comptes value) {
        return new JAXBElement<Comptes>(_Comptes_QNAME, Comptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MAJResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "MAJResponse")
    public JAXBElement<MAJResponse> createMAJResponse(MAJResponse value) {
        return new JAXBElement<MAJResponse>(_MAJResponse_QNAME, MAJResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Verser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "verser")
    public JAXBElement<Verser> createVerser(Verser value) {
        return new JAXBElement<Verser>(_Verser_QNAME, Verser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Convertir }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "convertir")
    public JAXBElement<Convertir> createConvertir(Convertir value) {
        return new JAXBElement<Convertir>(_Convertir_QNAME, Convertir.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListeCodes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "listeCodes")
    public JAXBElement<ListeCodes> createListeCodes(ListeCodes value) {
        return new JAXBElement<ListeCodes>(_ListeCodes_QNAME, ListeCodes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListeCodesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "listeCodesResponse")
    public JAXBElement<ListeCodesResponse> createListeCodesResponse(ListeCodesResponse value) {
        return new JAXBElement<ListeCodesResponse>(_ListeCodesResponse_QNAME, ListeCodesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjoutComptes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "AjoutComptes")
    public JAXBElement<AjoutComptes> createAjoutComptes(AjoutComptes value) {
        return new JAXBElement<AjoutComptes>(_AjoutComptes_QNAME, AjoutComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercherResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "rechercherResponse")
    public JAXBElement<RechercherResponse> createRechercherResponse(RechercherResponse value) {
        return new JAXBElement<RechercherResponse>(_RechercherResponse_QNAME, RechercherResponse.class, null, value);
    }

}
