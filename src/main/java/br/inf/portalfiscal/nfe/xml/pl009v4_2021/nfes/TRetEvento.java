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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2000._09.xmldsig.SignatureType;


/**
 * Tipo retorno do Evento
 * 
 * <p>Classe Java de TRetEvento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteï¿½do esperado contido dentro desta classe.
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
     * Obtï¿½m o valor da propriedade infEvento.
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
     * Define o valor da propriedade infEvento.
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
     * Obtï¿½m o valor da propriedade signature.
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
     * Define o valor da propriedade signature.
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


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteï¿½do esperado contido dentro desta classe.
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
         * Obtï¿½m o valor da propriedade verAplic.
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
         * Define o valor da propriedade verAplic.
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
         * Obtï¿½m o valor da propriedade cOrgao.
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
         * Define o valor da propriedade cOrgao.
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
         * Obtï¿½m o valor da propriedade cStat.
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
         * Define o valor da propriedade cStat.
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
         * Obtï¿½m o valor da propriedade xMotivo.
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
         * Define o valor da propriedade xMotivo.
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
         * Obtï¿½m o valor da propriedade chNFe.
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
         * Define o valor da propriedade chNFe.
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
         * Obtï¿½m o valor da propriedade tpEvento.
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
         * Define o valor da propriedade tpEvento.
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
         * Obtï¿½m o valor da propriedade xEvento.
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
         * Define o valor da propriedade xEvento.
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
         * Obtï¿½m o valor da propriedade nSeqEvento.
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
         * Define o valor da propriedade nSeqEvento.
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
         * Obtï¿½m o valor da propriedade cnpjDest.
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
         * Define o valor da propriedade cnpjDest.
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
         * Obtï¿½m o valor da propriedade cpfDest.
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
         * Define o valor da propriedade cpfDest.
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
         * Obtï¿½m o valor da propriedade emailDest.
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
         * Define o valor da propriedade emailDest.
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
         * Obtï¿½m o valor da propriedade dhRegEvento.
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
         * Define o valor da propriedade dhRegEvento.
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
         * Obtï¿½m o valor da propriedade nProt.
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
         * Define o valor da propriedade nProt.
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

}
