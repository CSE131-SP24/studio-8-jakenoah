package studio8;

public class MultipleChoiceQuestion extends Question {
	
	private String[] choices = new String[4];
	
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		super(prompt,answer,points);
		this.choices = choices;
	    
	}

	public void displayPrompt() {
		
		 super.displayPrompt();
		 
		 for (int i = 1; i < 5;i++) {
			 System.out.println("Choice " + i + " is " + choices[i-1]);
		 }
		
		
	}
	
	public static void main(String[] args) {
		String[] choices = {"seven", "nine", "eight", "six"};
		Question multipleChoice = new MultipleChoiceQuestion("What studio is this?", "3", 1, choices);
		multipleChoice.displayPrompt();
		System.out.println(multipleChoice.checkAnswer("hi"));//wrong
		System.out.println(multipleChoice.checkAnswer("1"));//wrong
		System.out.println(multipleChoice.checkAnswer("3"));//right
	}

}
