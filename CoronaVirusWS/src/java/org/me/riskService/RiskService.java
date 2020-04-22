package org.me.riskService;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Jordan Merkel
 */
@WebService(serviceName = "RiskService")
public class RiskService {

    /**
     * this operation performs the risk web service
     * 
     * the user enters in the population and cases in their current country and
     * the web service responds with a risk assessment
     */
    @WebMethod(operationName = "risk")
    public String risk(@WebParam(name = "population") int population, @WebParam(name = "cases") int cases) {
        
        double riskNum = population / cases;
        
        if (riskNum <= 5)
        {
            return "Very High Risk!";
        }
        else if(riskNum <= 10)
        {
            return "High Risk!";
        }
        else if(riskNum <= 20)
        {
            return "Medium Risk!";
        }
        else
        {
          return "Low Risk";  
        }
    
    }
}
