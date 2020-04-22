package org.me.news;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "NewsService")
public class NewsService {

    /**
     * Web service operation to link users to CDC for more information
     */
    @WebMethod(operationName = "NewsLink")
    public String NewsLink(@WebParam(name = "CDC") boolean CDC) {
        //TODO write your implementation code here:
        if (CDC)
        {
            return "Go to https://www.cdc.gov/coronavirus/2019-ncov/index.html for more info.";
        }
        return "Have a nice day.";
    }

    /**
     * Web service operation to give the user a random safety tip
     */
    @WebMethod(operationName = "RandomSafetyTip")
    public String RandomSafetyTip(@WebParam(name = "SafetyTip") boolean SafetyTip) {
        //TODO write your implementation code here:
        if (SafetyTip)
        {
            int x = (int)(Math.random()*((5-1)+1))+1;
            if (x == 1)
            {
                return "Stay at home.";
            }
            else if (x == 2)
            {
                return "Keep 6 feet away from other people.";
            }
            else if (x == 3)
            {
                return "Wash your hands frequently.";
            }
            else if (x == 4)
            {
                return "Don't touch your face.";
            }
            else if (x == 5)
            {
                return "Avoid social gatherings.";
            }
        }
        return "Be Safe.";
    }
}
