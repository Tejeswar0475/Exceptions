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
}
