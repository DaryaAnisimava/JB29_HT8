package by.epam.les10.main;

public class TextRunner {
	public static void main(String[] args) {
        Word word = new Word("mother");
        Text text = new Text(word);

        Word word1 = new Word("father");
        Word word2 = new Word("sister");
        Word word3 = new Word("brother");

        Phrase phrase = new Phrase();
        phrase.addValue(word1);
        phrase.addValue(word2);
        phrase.addValue(word3);

        text.addBody(phrase);

        System.out.println("Head: "+text.getHeader());
        System.out.println("Body: "+text.getBody());

    }
}
