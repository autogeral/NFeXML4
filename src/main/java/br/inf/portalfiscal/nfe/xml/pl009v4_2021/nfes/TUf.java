//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementaï¿½ï¿½o de Referï¿½ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificaï¿½ï¿½es neste arquivo serï¿½o perdidas apï¿½s a recompilaï¿½ï¿½o do esquema de origem. 
// Gerado em: 2021.06.14 ï¿½s 11:18:47 AM BRT 
//


package br.inf.portalfiscal.nfe.xml.pl009v4_2021.nfes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TUf.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteï¿½do esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TUf">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="preserve"/>
 *     &lt;enumeration value="AC"/>
 *     &lt;enumeration value="AL"/>
 *     &lt;enumeration value="AM"/>
 *     &lt;enumeration value="AP"/>
 *     &lt;enumeration value="BA"/>
 *     &lt;enumeration value="CE"/>
 *     &lt;enumeration value="DF"/>
 *     &lt;enumeration value="ES"/>
 *     &lt;enumeration value="GO"/>
 *     &lt;enumeration value="MA"/>
 *     &lt;enumeration value="MG"/>
 *     &lt;enumeration value="MS"/>
 *     &lt;enumeration value="MT"/>
 *     &lt;enumeration value="PA"/>
 *     &lt;enumeration value="PB"/>
 *     &lt;enumeration value="PE"/>
 *     &lt;enumeration value="PI"/>
 *     &lt;enumeration value="PR"/>
 *     &lt;enumeration value="RJ"/>
 *     &lt;enumeration value="RN"/>
 *     &lt;enumeration value="RO"/>
 *     &lt;enumeration value="RR"/>
 *     &lt;enumeration value="RS"/>
 *     &lt;enumeration value="SC"/>
 *     &lt;enumeration value="SE"/>
 *     &lt;enumeration value="SP"/>
 *     &lt;enumeration value="TO"/>
 *     &lt;enumeration value="EX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TUf")
@XmlEnum
public enum TUf {

    AC,
    AL,
    AM,
    AP,
    BA,
    CE,
    DF,
    ES,
    GO,
    MA,
    MG,
    MS,
    MT,
    PA,
    PB,
    PE,
    PI,
    PR,
    RJ,
    RN,
    RO,
    RR,
    RS,
    SC,
    SE,
    SP,
    TO,
    EX;

    public String value() {
        return name();
    }

    public static TUf fromValue(String v) {
        return valueOf(v);
    }

}
