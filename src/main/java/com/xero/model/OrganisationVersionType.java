//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.25 at 11:30:02 AM PDT 
//


package com.xero.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for organisationVersionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="organisationVersionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AU"/>
 *     &lt;enumeration value="NZ"/>
 *     &lt;enumeration value="GLOBAL"/>
 *     &lt;enumeration value="UK"/>
 *     &lt;enumeration value="US"/>
 *     &lt;enumeration value="AUONRAMP"/>
 *     &lt;enumeration value="NZONRAMP"/>
 *     &lt;enumeration value="GLOBALONRAMP"/>
 *     &lt;enumeration value="UKONRAMP"/>
 *     &lt;enumeration value="USONRAMP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "organisationVersionType")
@XmlEnum
public enum OrganisationVersionType {

    AU,
    NZ,
    GLOBAL,
    UK,
    US,
    AUONRAMP,
    NZONRAMP,
    GLOBALONRAMP,
    UKONRAMP,
    USONRAMP;

    public String value() {
        return name();
    }

    public static OrganisationVersionType fromValue(String v) {
        return valueOf(v);
    }

}
