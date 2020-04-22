package org.me.survey;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Collin Tice
 */
@WebService(serviceName = "SurveyService")
public class SurveyService {


    /**
     * this operation performs the survey web service
     * 
     * This asks the user a set of questions and replies with a response whether
     * the user should seek medical attention or not
     */
    @WebMethod(operationName = "survey")
    public String survey(@WebParam(name = "fever")
            boolean fever, @WebParam(name = "cough")
            boolean cough, @WebParam(name = "shortnessOfBreath")
            boolean shortnessOfBreath, @WebParam(name = "troubleBreathing")
            boolean troubleBreathing, @WebParam(name = "persistentChestPain")
            boolean persistentChestPain, @WebParam(name = "bluishLipsOrFace")
            boolean bluishLipsOrFace, @WebParam(name = "confusion") 
            boolean confusion) {
        
        int total = 0;
        String response = "";
        
        if(fever == true)
        {
            total++;
        }
        if(cough == true)
        {
            total++;
        }
        if(shortnessOfBreath == true)
        {
            total++;
        }
        
        
        if(bluishLipsOrFace == true || confusion == true
                || persistentChestPain == true || troubleBreathing == true)
        {
            response = "Seek medical attention immediately";
        }
        else if(total >= 2){
            
            response = "Self quarantine for 14 days.";
        }else{
            
            response = "Keep monitoring your health.";
        }
        
        return response;
    }

    
}
