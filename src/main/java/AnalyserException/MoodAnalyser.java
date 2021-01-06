package AnalyserException;

public class MoodAnalyser {

	public String welcomeMessage(String welcomeMessage)
	{
		return welcomeMessage;
	}

	
	public String analyseMood(String mood)
	{
		if(mood.contains("SAD"))
		{
			return "SAD";
		}
		return "HAPPY";
	}	

	public String analyseMoodForSad(String mood1)
	{
		if(mood1.contains("sad"))
		{
			return "sad";
		}
		
		return "HAPPY";
	}
	
}