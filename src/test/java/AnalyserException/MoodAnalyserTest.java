package AnalyserException;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void welcomeMessagTest()
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
	public void moodAnalyserTestForConstructor()
	{
		MoodAnalyser moodAnalyser2=new MoodAnalyser("I am in sad mood");
		String mood2=moodAnalyser2.analyseMood();
		assertEquals("sad",mood2);
	}
	
	@Test	
	public void moodAnalyserTestWithNoParameters()
	{
		MoodAnalyser moodAnalyser2=new MoodAnalyser("I am in happy mood");
		String mood2=moodAnalyser2.analyseMood();
		assertEquals("happy",mood2);
	}
	
	@Test	
	public void moodAnalyserTestExceptionHandle()
	{
		try
		{
			MoodAnalyser moodAnalyser2=new MoodAnalyser(null);
			String mood2=moodAnalyser2.analyseMood();
			assertEquals("happy",mood2);
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();	
		}
		
	}
	
}