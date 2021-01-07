package AnalyserException;

public class MoodAnayserCustom {
	
	 public String analyseMood(String message) throws MoodAnalyserException
	    {
	        try
	        {
	        	if (message.contains("sad"))
	        		return "SAD";
	        	else
	            	return "HAPPY";
	        }
	        catch(NullPointerException e)
	        {
	        	throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL,"Given null as input" );
	        }
	    }
	
	

}
