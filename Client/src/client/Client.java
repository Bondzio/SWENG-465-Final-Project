package client;

import java.util.Scanner;

/**
 * @author Jordan Merkel, Collin Tice, Nick DiPasquale, and Richard Sevic
 */
public class Client 
{

    /**
     * main function for client
     */
    public static void main(String[] args) 
    {
        while(true)
        {
            System.out.println("");
            System.out.println("");
            System.out.println("Please enter a number to execute one of the following services:");
            System.out.println("1. Survey");
            System.out.println("2. Risk");
            System.out.println("3. Statistics");
            System.out.println("4. News");
            System.out.println("5. Exit client");
            
            Scanner scan = new Scanner(System.in);
            
            //Menu for the user to select the web service
            switch(scan.nextInt())
            {
                case 1:
                    surveyMethod();
                    break;
                    
                case 2:
                    riskMethod();
                    break;
                    
                case 3:
                    statsMethod();
                    break;
                    
                case 4:
                    newsMethod();
                    break;
                
                case 5:
                    return;
            }
        }
    }
    
    /**
     * this method performs the survey web service
     * 
     * This asks the user a set of questions and replies with a response whether
     * the user should seek medical attention or not
     */
    private static void surveyMethod()
    {
        try
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("");
            System.out.println("");
            System.out.println("Please enter true or false for the following questions ");
            
            System.out.print("I feel like I have a fever: ");
            boolean fever = scan.nextBoolean();
            
            System.out.print("I have a persistent cough: ");
            boolean cough = scan.nextBoolean();
            
            System.out.print("I am experiencing shortness of breath: ");
            boolean shortnessOfBreath = scan.nextBoolean();
            
            System.out.print("I am having trouble breathing: ");
            boolean troubleBreathing = scan.nextBoolean();
            
            
            System.out.print("I am having persistent chest pains: ");
            boolean persistentChestPain = scan.nextBoolean();
            
            System.out.print("I am showing bluish color in my lips or face: ");
            boolean bluishLipsOrFace = scan.nextBoolean();
            
            System.out.print("I have been feeling confused: ");
            boolean confusion = scan.nextBoolean();
            
            System.out.print("Results: ");
        
            //gets the response from thhe web service
            String response = survey(fever, cough, shortnessOfBreath, troubleBreathing, persistentChestPain,
            bluishLipsOrFace, confusion);
        
            System.out.println(response);} catch (Exception ex){
            
            System.out.println("Exception: " + ex );
            
        }
    }
    
    /**
     * this method performs the risk web service
     * 
     * the user enters in the population and cases in their current country and
     * the web service responds with a risk assessment
     */
    private static void riskMethod()
    {
        try 
        {
            System.out.println("");
            System.out.println("");
            
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Enter the population of your state");
            int population = scanner.nextInt();
            
            System.out.println("Enter the cases in your state");
            int cases = scanner.nextInt();
            
            System.out.println(risk(population,cases));  //runs risk web service
        } 
        catch (Exception ex)
        {
            System.out.println("Exception: " + ex );
        }
    }
    
    private static void statsMethod()
    {
        try 
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Country or Country Code");
            String input = scan.nextLine();
            
            System.out.println(getGlobalData());
            
            System.out.println(getCountryData(input));
        } 
        catch (Exception e) 
        {
            System.out.println("Exception: " + e);
        }
    }
    
    /**
     * this methods performs the news web service
     * 
     * the user can enter 1 or 2 to get either a helpful safety tip or
     * a link to a reliable information source
     */
    private static void newsMethod()
    {
        try
        {
            System.out.println("");
            System.out.println("");
            
            int input = 1;
            Scanner scan = new Scanner(System.in);
            
            do
            {
                System.out.println("Would you like a safety tip (1), a link to reliable information (2), or type anything else to quit:");
                input = scan.nextInt();
                
                if (input == 1)
                {
                    String tip = randomSafetyTip(true);//safety tip operation
                    System.out.println(tip);
                }
                else if (input == 2)
                {
                    String link = newsLink(true);//news link operation
                    System.out.println(link);
                }
                
            }while (input == 1 || input == 2);//repeats the options
            
            System.out.println("Have a nice day!");
            
        }
        catch (Exception ex)
        {
            System.out.println("Exception: " + ex);
        }
    }
    
    
    //===============================operations=================================
    private static String risk(int population, int cases) 
    {
        org.me.riskservice.RiskService_Service service = new org.me.riskservice.RiskService_Service();
        org.me.riskservice.RiskService port = service.getRiskServicePort();
        return port.risk(population, cases);
    }

    private static String survey(boolean fever, boolean cough, boolean shortnessOfBreath, boolean troubleBreathing, boolean persistentChestPain, boolean bluishLipsOrFace, boolean confusion) 
    {
        org.me.survey.SurveyService_Service service = new org.me.survey.SurveyService_Service();
        org.me.survey.SurveyService port = service.getSurveyServicePort();
        return port.survey(fever, cough, shortnessOfBreath, troubleBreathing, persistentChestPain, bluishLipsOrFace, confusion);
    }

    private static String newsLink(boolean cdc) 
    {
        org.me.news.NewsService_Service service = new org.me.news.NewsService_Service();
        org.me.news.NewsService port = service.getNewsServicePort();
        return port.newsLink(cdc);
    }

    private static String randomSafetyTip(boolean safetyTip) 
    {
        org.me.news.NewsService_Service service = new org.me.news.NewsService_Service();
        org.me.news.NewsService port = service.getNewsServicePort();
        return port.randomSafetyTip(safetyTip);
    }
    
    private static String getCountryData(java.lang.String country) 
    {
        org.me.statistics.StatisticsWS_Service service = new org.me.statistics.StatisticsWS_Service();
        org.me.statistics.StatisticsWS port = service.getStatisticsWSPort();
        return port.getCountryData(country);
    }

    private static String getGlobalData() 
    {
        org.me.statistics.StatisticsWS_Service service = new org.me.statistics.StatisticsWS_Service();
        org.me.statistics.StatisticsWS port = service.getStatisticsWSPort();
        return port.getGlobalData();
    }
    //==========================================================================

    
    
}
