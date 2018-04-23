package br.com.indra.entidades;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuscaPessoa", propOrder = {"arg0"})
@XmlRootElement(name = "buscaPessoa", namespace = "http://ws.joni.com.br/")
public class BuscaPessoa {
	
	 @XmlElement(required = true)
	private String arg0;

	public String getArg0() {
		return arg0;
	}

	public void setArg0(String arg0) {
		this.arg0 = arg0;
	}

}
