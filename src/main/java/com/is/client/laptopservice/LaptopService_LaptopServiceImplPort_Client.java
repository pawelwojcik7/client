
package com.is.client.laptopservice;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.4.5
 * 2023-05-10T23:48:37.696+02:00
 * Generated source version: 3.4.5
 *
 */
public final class LaptopService_LaptopServiceImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://web.is.com/", "LaptopServiceImplService");

    private LaptopService_LaptopServiceImplPort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = LaptopServiceImplService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        LaptopServiceImplService ss = new LaptopServiceImplService(wsdlURL, SERVICE_NAME);
        LaptopService port = ss.getLaptopServiceImplPort();

        {
        System.out.println("Invoking customMethod...");
        int _customMethod_arg0 = 0;
        int _customMethod_arg1 = 0;
        int _customMethod__return = port.customMethod(_customMethod_arg0, _customMethod_arg1);
        System.out.println("customMethod.result=" + _customMethod__return);


        }
        {
        System.out.println("Invoking getNumberOfRecordsByProducer...");
        String _getNumberOfRecordsByProducer_arg0 = "";
        int _getNumberOfRecordsByProducer__return = port.getNumberOfRecordsByProducer(_getNumberOfRecordsByProducer_arg0);
        System.out.println("getNumberOfRecordsByProducer.result=" + _getNumberOfRecordsByProducer__return);


        }
        {
        System.out.println("Invoking getRecordsByScreenType...");
        String _getRecordsByScreenType_arg0 = "";
        XmlInputFormatArray _getRecordsByScreenType__return = port.getRecordsByScreenType(_getRecordsByScreenType_arg0);
        System.out.println("getRecordsByScreenType.result=" + _getRecordsByScreenType__return);


        }
        {
        System.out.println("Invoking getAllDistinctScreenTypes...");
        StringArray _getAllDistinctScreenTypes__return = port.getAllDistinctScreenTypes();
        System.out.println("getAllDistinctScreenTypes.result=" + _getAllDistinctScreenTypes__return);


        }
        {
        System.out.println("Invoking getAllDistinctProducers...");
        StringArray _getAllDistinctProducers__return = port.getAllDistinctProducers();
        System.out.println("getAllDistinctProducers.result=" + _getAllDistinctProducers__return.item);


        }

        System.exit(0);
    }

}
