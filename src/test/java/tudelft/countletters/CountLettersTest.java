package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void firstWordDoesNotMatch(){
        int words = new CountLetters().count("cat|dogs");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void NotMatchingWords(){
        int words = new CountLetters().count("cat|dog");
        Assertions.assertEquals(0, words);
    }

    @Test
    public void OneMatchingWordEndWithR() {
        int words = new CountLetters().count("moon|star");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void endsWithRfollowedByCharacter() {
        int words = new CountLetters().count("car|");
        Assertions.assertEquals(1, words);
    }


    @Test
    public void OneLetterWord(){
        int words = new CountLetters().count("s");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void onlyNonLetterCharacters() {
        int words = new CountLetters().count("|!@#$");
        Assertions.assertEquals(0, words);
    }

    @Test
    public void endsWithNonLetterAfterMatch() {
        int words = new CountLetters().count("stars!!");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void mixedCaseLetters() {
        int words = new CountLetters().count("Stars|Rise");
        Assertions.assertEquals(1, words);
    }


    @Test
    public void trailingSpacesAfterMatchingWord() {
        int words = new CountLetters().count("rocks ");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void NoWords(){
        int words = new CountLetters().count("");
        Assertions.assertEquals(0, words);
    }

}