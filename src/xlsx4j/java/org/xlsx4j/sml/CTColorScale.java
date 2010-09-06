/*
 *  Copyright 2010, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */


package org.xlsx4j.sml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CT_ColorScale complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_ColorScale">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cfvo" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_Cfvo" maxOccurs="unbounded" minOccurs="2"/>
 *         &lt;element name="color" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_Color" maxOccurs="unbounded" minOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_ColorScale", propOrder = {
    "cfvo",
    "color"
})
public class CTColorScale {

    @XmlElement(required = true)
    protected List<CTCfvo> cfvo;
    @XmlElement(required = true)
    protected List<CTColor> color;

    /**
     * Gets the value of the cfvo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cfvo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCfvo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTCfvo }
     * 
     * 
     */
    public List<CTCfvo> getCfvo() {
        if (cfvo == null) {
            cfvo = new ArrayList<CTCfvo>();
        }
        return this.cfvo;
    }

    /**
     * Gets the value of the color property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the color property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTColor }
     * 
     * 
     */
    public List<CTColor> getColor() {
        if (color == null) {
            color = new ArrayList<CTColor>();
        }
        return this.color;
    }

}
