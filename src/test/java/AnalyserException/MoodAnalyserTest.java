package AnalyserException;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void welcomeMessageTest()
	{
		MoodAnalyser moodAnalyser=new MoodAnalyser();
		String welcomeMessageResult=moodAnalyser.welcomeMessage("Welcome to mood analyser");
		assertSame("Welcome to mood analyser",welcomeMessageResult);
	}

	@Test	
	public void moodAnalyserTest()
	{
		MoodAnalyser moodAnalyser1=new MoodAnalyser();
		String mood=moodAnalyser1.analyseMood("SAD");
		assertSame("SAD",mood);
		
	}
	
	@Test	
	public void moodAnalyserTestForSad()
	{
		MoodAnalyser moodAnalyser2=new MoodAnalyser();
		String mood2=moodAnalyser2.analyseMoodForSad("I was in sad mood");
		assertEquals("sad",mood2);
		
	}
	
	@Test	
	public void moodAnalyserTestForAny()
	{
		MoodAnalyser moodAnalyser2=new MoodAnalyser();
		String mood2=moodAnalyser2.analyseMoodForAnyMood("I was in any mood");
		assertEquals("HAPPY",mood2);
		
	}
	
}
