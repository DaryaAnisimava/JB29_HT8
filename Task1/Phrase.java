package by.epam.les10.main;

public class Phrase {
	    private String value="";// String List<Word> value
	// это декомпозиция задачи - мредложение состоит из списка слов (упрощая)
	// тоже и в тексте

	    public String getValue() {
	        return value;
	    }

		public void addValue(Word word1) {
			 value += " " + word1.getValue();
	    }

			
		
	}

