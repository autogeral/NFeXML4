//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.06.14 às 11:26:52 AM BRT 
//


package br.inf.portalfiscal.nfe.xml.pl009v4.nfes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Tipo procEvento
 * 
 * <p>Classe Java de TProcEvento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TProcEvento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="evento" type="{http://www.portalfiscal.inf.br/nfe}TEvento"/>
 *         &lt;element name="retEvento" type="{http://www.portalfiscal.inf.br/nfe}TRetEvento"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/nfe}TVerEvento" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name="procEvento")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TProcEvento", propOrder = {
    "evento",
    "retEvento"
})
public class TProcEvento {

    @XmlElement(required = true)
    protected TEvento evento;
    @XmlElement(required = true)
    protected TRetEvento retEvento;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;

    /**
     * Obtém o valor da propriedade evento.
     * 
     * @return
     *     possible object is
     *     {@link TEvento }
     *     
     */
    public TEvento getEvento() {
        return evento;
    }

    /**
     * Define o valor da propriedade evento.
     * 
     * @param value
     *     allowed object is
     *     {@link TEvento }
     *     
     */
    public void setEvento(TEvento value) {
        this.evento = value;
    }

    /**
     * Obtém o valor da propriedade retEvento.
     * 
     * @return
     *     possible object is
     *     {@link TRetEvento }
     *     
     */
    public TRetEvento getRetEvento() {
        return retEvento;
    }

    /**
     * Define o valor da propriedade retEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link TRetEvento }
     *     
     */
    public void setRetEvento(TRetEvento value) {
        this.retEvento = value;
    }

    /**
     * Obtém o valor da propriedade versao.
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
