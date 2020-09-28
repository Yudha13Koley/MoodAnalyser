package com.training;

public class MoodAnalyser {
private String message;
public MoodAnalyser() {}
	public String AnalyseMood(String string) {
		if(string.contains("Sad"))
			return "Sad";
		else
			return "Happy";
		
	}

}
