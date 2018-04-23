//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.23 às 01:42:40 PM BRT 
//


package br.com.indra.entidades;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the teste.wsdl package. 
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

    private final static QName _BuscaPessoa_QNAME = new QName("http://ws.joni.com.br/", "buscaPessoa");
    private final static QName _BuscaPessoaResponse_QNAME = new QName("http://ws.joni.com.br/", "buscaPessoaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: teste.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.joni.com.br/", name = "buscaPessoa")
    public JAXBElement<String> createBuscaPessoa(String value) {
        return new JAXBElement<String>(_BuscaPessoa_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.joni.com.br/", name = "buscaPessoaResponse")
    public JAXBElement<String> createBuscaPessoaResponse(String value) {
        return new JAXBElement<String>(_BuscaPessoaResponse_QNAME, String.class, null, value);
    }

}
