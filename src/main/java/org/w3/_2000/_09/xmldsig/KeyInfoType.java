//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementaï¿½ï¿½o de Referï¿½ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificaï¿½ï¿½es neste arquivo serï¿½o perdidas apï¿½s a recompilaï¿½ï¿½o do esquema de origem. 
// Gerado em: 2021.06.14 ï¿½s 11:18:47 AM BRT 
//


package org.w3._2000._09.xmldsig;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de KeyInfoType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteï¿½do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="KeyInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="X509Data" type="{http://www.w3.org/2000/09/xmldsig#}X509DataType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyInfoType", propOrder = {
    "x509Data"
})
public class KeyInfoType {

    @XmlElement(name = "X509Data", required = true)
    protected X509DataType x509Data;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Obtï¿½m o valor da propriedade x509Data.
     * 
     * @return
     *     possible object is
     *     {@link X509DataType }
     *     
     */
    public X509DataType getX509Data() {
        return x509Data;
    }

    /**
     * Define o valor da propriedade x509Data.
     * 
     * @param value
     *     allowed object is
     *     {@link X509DataType }
     *     
     */
    public void setX509Data(X509DataType value) {
        this.x509Data = value;
    }

    /**
     * Obtï¿½m o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
