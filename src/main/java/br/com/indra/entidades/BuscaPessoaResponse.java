package br.com.indra.entidades;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuscaPessoaResponse", propOrder = {"resposta"})
@XmlSeeAlso(BuscaPessoa.class)
@XmlRootElement(name = "buscaPessoaResponse", namespace = "http://ws.joni.com.br/")
public class BuscaPessoaResponse {
	
	 @XmlElement(required = true)
	protected String resposta;

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
}
