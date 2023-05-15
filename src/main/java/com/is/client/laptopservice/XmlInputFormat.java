
package com.is.client.laptopservice;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xmlInputFormat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xmlInputFormat"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="screen" type="{http://web.is.com/}screen" minOccurs="0"/&gt;
 *         &lt;element name="processor" type="{http://web.is.com/}processor" minOccurs="0"/&gt;
 *         &lt;element name="ram" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="disc" type="{http://web.is.com/}disc" minOccurs="0"/&gt;
 *         &lt;element name="graphic_card" type="{http://web.is.com/}graphicCard" minOccurs="0"/&gt;
 *         &lt;element name="os" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="disc_reader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xmlInputFormat", propOrder = {
    "manufacturer",
    "screen",
    "processor",
    "ram",
    "disc",
    "graphicCard",
    "os",
    "discReader"
})
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class XmlInputFormat {

    protected String manufacturer;
    protected Screen screen;
    protected Processor processor;
    protected String ram;
    protected Disc disc;
    @XmlElement(name = "graphic_card")
    protected GraphicCard graphicCard;
    protected String os;
    @XmlElement(name = "disc_reader")
    protected String discReader;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the screen property.
     * 
     * @return
     *     possible object is
     *     {@link Screen }
     *     
     */
    public Screen getScreen() {
        return screen;
    }

    /**
     * Sets the value of the screen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Screen }
     *     
     */
    public void setScreen(Screen value) {
        this.screen = value;
    }

    /**
     * Gets the value of the processor property.
     * 
     * @return
     *     possible object is
     *     {@link Processor }
     *     
     */
    public Processor getProcessor() {
        return processor;
    }

    /**
     * Sets the value of the processor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Processor }
     *     
     */
    public void setProcessor(Processor value) {
        this.processor = value;
    }

    /**
     * Gets the value of the ram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRam() {
        return ram;
    }

    /**
     * Sets the value of the ram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRam(String value) {
        this.ram = value;
    }

    /**
     * Gets the value of the disc property.
     * 
     * @return
     *     possible object is
     *     {@link Disc }
     *     
     */
    public Disc getDisc() {
        return disc;
    }

    /**
     * Sets the value of the disc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Disc }
     *     
     */
    public void setDisc(Disc value) {
        this.disc = value;
    }

    /**
     * Gets the value of the graphicCard property.
     * 
     * @return
     *     possible object is
     *     {@link GraphicCard }
     *     
     */
    public GraphicCard getGraphicCard() {
        return graphicCard;
    }

    /**
     * Sets the value of the graphicCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link GraphicCard }
     *     
     */
    public void setGraphicCard(GraphicCard value) {
        this.graphicCard = value;
    }

    /**
     * Gets the value of the os property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOs() {
        return os;
    }

    /**
     * Sets the value of the os property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOs(String value) {
        this.os = value;
    }

    /**
     * Gets the value of the discReader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscReader() {
        return discReader;
    }

    /**
     * Sets the value of the discReader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscReader(String value) {
        this.discReader = value;
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
