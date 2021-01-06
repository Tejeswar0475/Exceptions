package AnalyserException;

import javax.swing.text.html.HTMLDocument.Iterator;

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
	
}
