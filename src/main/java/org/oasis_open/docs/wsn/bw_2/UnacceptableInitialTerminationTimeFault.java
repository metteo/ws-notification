
package org.oasis_open.docs.wsn.bw_2;

import javax.xml.ws.WebFault;
import org.oasis_open.docs.wsn.b_2.UnacceptableInitialTerminationTimeFaultType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "UnacceptableInitialTerminationTimeFault", targetNamespace = "http://docs.oasis-open.org/wsn/b-2")
public class UnacceptableInitialTerminationTimeFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private UnacceptableInitialTerminationTimeFaultType faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public UnacceptableInitialTerminationTimeFault(String message, UnacceptableInitialTerminationTimeFaultType faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public UnacceptableInitialTerminationTimeFault(String message, UnacceptableInitialTerminationTimeFaultType faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.oasis_open.docs.wsn.b_2.UnacceptableInitialTerminationTimeFaultType
     */
    public UnacceptableInitialTerminationTimeFaultType getFaultInfo() {
        return faultInfo;
    }

}
