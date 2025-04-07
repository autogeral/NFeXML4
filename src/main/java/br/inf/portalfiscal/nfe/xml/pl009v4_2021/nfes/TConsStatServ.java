//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementaï¿½ï¿½o de Referï¿½ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificaï¿½ï¿½es neste arquivo serï¿½o perdidas apï¿½s a recompilaï¿½ï¿½o do esquema de origem. 
// Gerado em: 2021.06.14 ï¿½s 11:12:07 AM BRT 
//


package br.inf.portalfiscal.nfe.xml.pl009v4_2021.nfes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Tipo Pedido de Consulta do Status do Serviï¿½o
 * 
 * <p>Classe Java de TConsStatServ complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteï¿½do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TConsStatServ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/nfe}TAmb"/>
 *         &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/nfe}TCodUfIBGE"/>
 *         &lt;element name="xServ">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TServ">
 *               &lt;enumeration value="STATUS"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/nfe}TVerConsStatServ" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TConsStatServ", propOrder = {
    "tpAmb",
    "cuf",
    "xServ"
})
public class TConsStatServ {

    @XmlElement(required = true)
    protected String tpAmb;
    @XmlElement(name = "cUF", required = true)
    protected String cuf;
    @XmlElement(required = true)
    protected String xServ;
    @XmlAttribute(name = "versao", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String versao;

    /**
     * Obtï¿½m o valor da propriedade tpAmb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpAmb() {
        return tpAmb;
    }

    /**
     * Define o valor da propriedade tpAmb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpAmb(String value) {
        this.tpAmb = value;
    }

    /**
     * Obtï¿½m o valor da propriedade cuf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUF() {
        return cuf;
    }

    /**
     * Define o valor da propriedade cuf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUF(String value) {
        this.cuf = value;
    }

    /**
     * Obtï¿½m o valor da propriedade xServ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXServ() {
        return xServ;
    }

    /**
     * Define o valor da propriedade xServ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXServ(String value) {
        this.xServ = value;
    }

    /**
     * Obtï¿½m o valor da propriedade versao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersao() {
        return versao;
    }

    /**
     * Define o valor da propriedade versao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersao(String value) {
        this.versao = value;
    }

}
