
package org.oasis_open.docs.wsn.bw_2;

import javax.xml.ws.WebFault;
import org.oasis_open.docs.wsn.b_2.UnrecognizedPolicyRequestFaultType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "UnrecognizedPolicyRequestFault", targetNamespace = "http://docs.oasis-open.org/wsn/b-2")
public class UnrecognizedPolicyRequestFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private UnrecognizedPolicyRequestFaultType faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public UnrecognizedPolicyRequestFault(String message, UnrecognizedPolicyRequestFaultType faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public UnrecognizedPolicyRequestFault(String message, UnrecognizedPolicyRequestFaultType faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.oasis_open.docs.wsn.b_2.UnrecognizedPolicyRequestFaultType
     */
    public UnrecognizedPolicyRequestFaultType getFaultInfo() {
        return faultInfo;
    }

}