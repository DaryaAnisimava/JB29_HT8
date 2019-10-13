package by.epam.les10.main;

public class Phrase {
	    private String value="";

	    public String getValue() {
	        return value;
	    }

		public void addValue(Word word1) {
			 value += " " + word1.getValue();
	    }

			
		
	}

