//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.07 at 11:29:09 AM BRT 
//


package br.inf.portalfiscal.nfe.xml.pl008h2.nfes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2000._09.xmldsig.SignatureType;


/**
 * Tipo retorno do Evento
 * 
 * <p>Java class for TRetEvento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRetEvento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="infEvento">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/nfe}TAmb"/>
 *                   &lt;element name="verAplic" type="{http://www.portalfiscal.inf.br/nfe}TVerAplic"/>
 *                   &lt;element name="cOrgao" type="{http://www.portalfiscal.inf.br/nfe}TCOrgaoIBGE"/>
 *                   &lt;element name="cStat" type="{http://www.portalfiscal.inf.br/nfe}TStat"/>
 *                   &lt;element name="xMotivo" type="{http://www.portalfiscal.inf.br/nfe}TMotivo"/>
 *                   &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/nfe}TChNFe" minOccurs="0"/>
 *                   &lt;element name="tpEvento" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;pattern value="[0-9]{6}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="xEvento" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                         &lt;minLength value="5"/>
 *                         &lt;maxLength value="60"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="nSeqEvento" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;pattern value="[1-9][0-9]{0,1}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;choice minOccurs="0">
 *                     &lt;element name="CNPJDest" type="{http://www.portalfiscal.inf.br/nfe}TCnpjOpc"/>
 *                     &lt;element name="CPFDest" type="{http://www.portalfiscal.inf.br/nfe}TCpf"/>
 *                   &lt;/choice>
 *                   &lt;element name="emailDest" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="60"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dhRegEvento" type="{http://www.portalfiscal.inf.br/nfe}TDateTimeUTC"/>
 *                   &lt;element name="nProt" type="{http://www.portalfiscal.inf.br/nfe}TProt" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Id">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}ID">
 *                       &lt;pattern value="ID[0-9]{15}"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/nfe}TRetVerEvento" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name="retEvento")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRetEvento", propOrder = {
    "infEvento",
    "signature"
})
public class TRetEvento {

    @XmlElement(required = true)
    protected TRetEvento.InfEvento infEvento;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected SignatureType signature;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;

    /**
     * Gets the value of the infEvento property.
     * 
     * @return
     *     possible object is
     *     {@link TRetEvento.InfEvento }
     *     
     */
    public TRetEvento.InfEvento getInfEvento() {
        return infEvento;
    }

    /**
     * Sets the value of the infEvento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRetEvento.InfEvento }
     *     
     */
    public void setInfEvento(TRetEvento.InfEvento value) {
        this.infEvento = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

    /**
     * Gets the value of the versao property.
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
     * Sets the value of the versao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersao(String value) {
        this.versao = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/nfe}TAmb"/>
     *         &lt;element name="verAplic" type="{http://www.portalfiscal.inf.br/nfe}TVerAplic"/>
     *         &lt;element name="cOrgao" type="{http://www.portalfiscal.inf.br/nfe}TCOrgaoIBGE"/>
     *         &lt;element name="cStat" type="{http://www.portalfiscal.inf.br/nfe}TStat"/>
     *         &lt;element name="xMotivo" type="{http://www.portalfiscal.inf.br/nfe}TMotivo"/>
     *         &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/nfe}TChNFe" minOccurs="0"/>
     *         &lt;element name="tpEvento" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;pattern value="[0-9]{6}"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="xEvento" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
     *               &lt;minLength value="5"/>
     *               &lt;maxLength value="60"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="nSeqEvento" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;pattern value="[1-9][0-9]{0,1}"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;choice minOccurs="0">
     *           &lt;element name="CNPJDest" type="{http://www.portalfiscal.inf.br/nfe}TCnpjOpc"/>
     *           &lt;element name="CPFDest" type="{http://www.portalfiscal.inf.br/nfe}TCpf"/>
     *         &lt;/choice>
     *         &lt;element name="emailDest" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="60"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dhRegEvento" type="{http://www.portalfiscal.inf.br/nfe}TDateTimeUTC"/>
     *         &lt;element name="nProt" type="{http://www.portalfiscal.inf.br/nfe}TProt" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Id">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}ID">
     *             &lt;pattern value="ID[0-9]{15}"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tpAmb",
        "verAplic",
        "cOrgao",
        "cStat",
        "xMotivo",
        "chNFe",
        "tpEvento",
        "xEvento",
        "nSeqEvento",
        "cnpjDest",
        "cpfDest",
        "emailDest",
        "dhRegEvento",
        "nProt"
    })
    public static class InfEvento {

        @XmlElement(required = true)
        protected String tpAmb;
        @XmlElement(required = true)
        protected String verAplic;
        @XmlElement(required = true)
        protected String cOrgao;
        @XmlElement(required = true)
        protected String cStat;
        @XmlElement(required = true)
        protected String xMotivo;
        protected String chNFe;
        protected String tpEvento;
        protected String xEvento;
        protected String nSeqEvento;
        @XmlElement(name = "CNPJDest")
        protected String cnpjDest;
        @XmlElement(name = "CPFDest")
        protected String cpfDest;
        protected String emailDest;
        @XmlElement(required = true)
        protected String dhRegEvento;
        protected String nProt;
        @XmlAttribute(name = "Id")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Gets the value of the tpAmb property.
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
         * Sets the value of the tpAmb property.
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
         * Gets the value of the verAplic property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVerAplic() {
            return verAplic;
        }

        /**
         * Sets the value of the verAplic property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVerAplic(String value) {
            this.verAplic = value;
        }

        /**
         * Gets the value of the cOrgao property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOrgao() {
            return cOrgao;
        }

        /**
         * Sets the value of the cOrgao property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOrgao(String value) {
            this.cOrgao = value;
        }

        /**
         * Gets the value of the cStat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCStat() {
            return cStat;
        }

        /**
         * Sets the value of the cStat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCStat(String value) {
            this.cStat = value;
        }

        /**
         * Gets the value of the xMotivo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXMotivo() {
            return xMotivo;
        }

        /**
         * Sets the value of the xMotivo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXMotivo(String value) {
            this.xMotivo = value;
        }

        /**
         * Gets the value of the chNFe property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChNFe() {
            return chNFe;
        }

        /**
         * Sets the value of the chNFe property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChNFe(String value) {
            this.chNFe = value;
        }

        /**
         * Gets the value of the tpEvento property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTpEvento() {
            return tpEvento;
        }

        /**
         * Sets the value of the tpEvento property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTpEvento(String value) {
            this.tpEvento = value;
        }

        /**
         * Gets the value of the xEvento property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXEvento() {
            return xEvento;
        }

        /**
         * Sets the value of the xEvento property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXEvento(String value) {
            this.xEvento = value;
        }

        /**
         * Gets the value of the nSeqEvento property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNSeqEvento() {
            return nSeqEvento;
        }

        /**
         * Sets the value of the nSeqEvento property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNSeqEvento(String value) {
            this.nSeqEvento = value;
        }

        /**
         * Gets the value of the cnpjDest property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCNPJDest() {
            return cnpjDest;
        }

        /**
         * Sets the value of the cnpjDest property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCNPJDest(String value) {
            this.cnpjDest = value;
        }

        /**
         * Gets the value of the cpfDest property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCPFDest() {
            return cpfDest;
        }

        /**
         * Sets the value of the cpfDest property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCPFDest(String value) {
            this.cpfDest = value;
        }

        /**
         * Gets the value of the emailDest property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmailDest() {
            return emailDest;
        }

        /**
         * Sets the value of the emailDest property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmailDest(String value) {
            this.emailDest = value;
        }

        /**
         * Gets the value of the dhRegEvento property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDhRegEvento() {
            return dhRegEvento;
        }

        /**
         * Sets the value of the dhRegEvento property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDhRegEvento(String value) {
            this.dhRegEvento = value;
        }

        /**
         * Gets the value of the nProt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNProt() {
            return nProt;
        }

        /**
         * Sets the value of the nProt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNProt(String value) {
            this.nProt = value;
        }

        /**
         * Gets the value of the id property.
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
         * Sets the value of the id property.
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

}
