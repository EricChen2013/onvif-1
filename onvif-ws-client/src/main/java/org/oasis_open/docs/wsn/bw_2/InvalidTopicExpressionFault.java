
package org.oasis_open.docs.wsn.bw_2;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-02-29T15:12:53.857+01:00
 * Generated source version: 3.1.5
 */

@WebFault(name = "InvalidTopicExpressionFault", targetNamespace = "http://docs.oasis-open.org/wsn/b-2")
public class InvalidTopicExpressionFault extends Exception {
    
    private org.oasis_open.docs.wsn.b_2.InvalidTopicExpressionFaultType invalidTopicExpressionFault;

    public InvalidTopicExpressionFault() {
        super();
    }
    
    public InvalidTopicExpressionFault(String message) {
        super(message);
    }
    
    public InvalidTopicExpressionFault(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidTopicExpressionFault(String message, org.oasis_open.docs.wsn.b_2.InvalidTopicExpressionFaultType invalidTopicExpressionFault) {
        super(message);
        this.invalidTopicExpressionFault = invalidTopicExpressionFault;
    }

    public InvalidTopicExpressionFault(String message, org.oasis_open.docs.wsn.b_2.InvalidTopicExpressionFaultType invalidTopicExpressionFault, Throwable cause) {
        super(message, cause);
        this.invalidTopicExpressionFault = invalidTopicExpressionFault;
    }

    public org.oasis_open.docs.wsn.b_2.InvalidTopicExpressionFaultType getFaultInfo() {
        return this.invalidTopicExpressionFault;
    }
}
