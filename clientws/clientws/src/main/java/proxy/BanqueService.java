
package proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://ws1/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod(operationName = "Convert")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Convert", targetNamespace = "http://ws1/", className = "proxy.Convert")
    @ResponseWrapper(localName = "ConvertResponse", targetNamespace = "http://ws1/", className = "proxy.ConvertResponse")
    @Action(input = "http://ws1/BanqueService/ConvertRequest", output = "http://ws1/BanqueService/ConvertResponse")
    public double convert(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

    /**
     * 
     * @param code
     * @return
     *     returns proxy.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://ws1/", className = "proxy.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://ws1/", className = "proxy.GetCompteResponse")
    @Action(input = "http://ws1/BanqueService/getCompteRequest", output = "http://ws1/BanqueService/getCompteResponse")
    public Compte getCompte(
        @WebParam(name = "code", targetNamespace = "")
        int code);

    /**
     * 
     * @return
     *     returns java.util.List<proxy.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listComptes", targetNamespace = "http://ws1/", className = "proxy.ListComptes")
    @ResponseWrapper(localName = "listComptesResponse", targetNamespace = "http://ws1/", className = "proxy.ListComptesResponse")
    @Action(input = "http://ws1/BanqueService/listComptesRequest", output = "http://ws1/BanqueService/listComptesResponse")
    public List<Compte> listComptes();

}
