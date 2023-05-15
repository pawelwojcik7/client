
package com.is.client.laptopservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.laptopservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Laptop_QNAME = new QName("http://web.is.com/", "laptop");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.laptopservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link XmlInputFormat }
     * 
     */
    public XmlInputFormat createXmlInputFormat() {
        return new XmlInputFormat();
    }

    /**
     * Create an instance of {@link Screen }
     * 
     */
    public Screen createScreen() {
        return new Screen();
    }

    /**
     * Create an instance of {@link Processor }
     * 
     */
    public Processor createProcessor() {
        return new Processor();
    }

    /**
     * Create an instance of {@link Disc }
     * 
     */
    public Disc createDisc() {
        return new Disc();
    }

    /**
     * Create an instance of {@link GraphicCard }
     * 
     */
    public GraphicCard createGraphicCard() {
        return new GraphicCard();
    }

    /**
     * Create an instance of {@link XmlInputFormatArray }
     * 
     */
    public XmlInputFormatArray createXmlInputFormatArray() {
        return new XmlInputFormatArray();
    }

    /**
     * Create an instance of {@link StringArray }
     * 
     */
    public StringArray createStringArray() {
        return new StringArray();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlInputFormat }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XmlInputFormat }{@code >}
     */
    @XmlElementDecl(namespace = "http://web.is.com/", name = "laptop")
    public JAXBElement<XmlInputFormat> createLaptop(XmlInputFormat value) {
        return new JAXBElement<XmlInputFormat>(_Laptop_QNAME, XmlInputFormat.class, null, value);
    }

}
