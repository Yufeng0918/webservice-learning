
package com.dbs.services.student;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Role.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Role"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STUDENT"/&gt;
 *     &lt;enumeration value="TEACHER"/&gt;
 *     &lt;enumeration value="PRESIDENT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Role")
@XmlEnum
public enum Role {

    STUDENT,
    TEACHER,
    PRESIDENT;

    public String value() {
        return name();
    }

    public static Role fromValue(String v) {
        return valueOf(v);
    }

}
