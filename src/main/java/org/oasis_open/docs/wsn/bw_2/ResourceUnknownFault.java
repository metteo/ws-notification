
package org.oasis_open.docs.wsn.bw_2;

import javax.xml.ws.WebFault;
import org.oasis_open.docs.wsrf.r_2.ResourceUnknownFaultType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "ResourceUnknownFault", targetNamespace = "http://docs.oasis-open.org/wsrf/r-2")
public class ResourceUnknownFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ResourceUnknownFaultType faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ResourceUnknownFault(String message, ResourceUnknownFaultType faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public ResourceUnknownFault(String message, ResourceUnknownFaultType faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.oasis_open.docs.wsrf.r_2.ResourceUnknownFaultType
     */
    public ResourceUnknownFaultType getFaultInfo() {
        return faultInfo;
    }

}
