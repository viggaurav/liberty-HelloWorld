//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.14 at 04:04:39 PM IST 
//


package com.acn.schema.jaxb.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="CDBeans" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="categories" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="codes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="decodes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="effectiveDate " type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="separator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sortOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cdBeans"
})
@XmlRootElement(name = "Output")
public class Output {

    @XmlElement(name = "CDBeans")
    protected List<Output.CDBeans> cdBeans;

    /**
     * Gets the value of the cdBeans property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cdBeans property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCDBeans().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Output.CDBeans }
     * 
     * 
     */
    public List<Output.CDBeans> getCDBeans() {
        if (cdBeans == null) {
            cdBeans = new ArrayList<Output.CDBeans>();
        }
        return this.cdBeans;
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
     *         &lt;element name="categories" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="codes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="decodes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="effectiveDate " type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="separator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sortOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "categories",
        "codes",
        "decodes",
        "effectiveDate0020",
        "separator",
        "sortOrder"
    })
    public static class CDBeans {

        protected String categories;
        protected String codes;
        protected String decodes;
        @XmlElement(name = "effectiveDate ")
        protected String effectiveDate0020;
        protected String separator;
        protected String sortOrder;

        /**
         * Gets the value of the categories property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCategories() {
            return categories;
        }

        /**
         * Sets the value of the categories property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCategories(String value) {
            this.categories = value;
        }

        /**
         * Gets the value of the codes property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodes() {
            return codes;
        }

        /**
         * Sets the value of the codes property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodes(String value) {
            this.codes = value;
        }

        /**
         * Gets the value of the decodes property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDecodes() {
            return decodes;
        }

        /**
         * Sets the value of the decodes property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDecodes(String value) {
            this.decodes = value;
        }

        /**
         * Gets the value of the effectiveDate0020 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEffectiveDate_0020() {
            return effectiveDate0020;
        }

        /**
         * Sets the value of the effectiveDate0020 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEffectiveDate_0020(String value) {
            this.effectiveDate0020 = value;
        }

        /**
         * Gets the value of the separator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSeparator() {
            return separator;
        }

        /**
         * Sets the value of the separator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSeparator(String value) {
            this.separator = value;
        }

        /**
         * Gets the value of the sortOrder property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSortOrder() {
            return sortOrder;
        }

        /**
         * Sets the value of the sortOrder property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSortOrder(String value) {
            this.sortOrder = value;
        }

    }

}
