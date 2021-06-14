package oop.assignment2.ex24.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramDetectorTest {
    // edge cases - 0,1, very large numbers, very small numbers
    //test both true and false
    //common cases
    //uncommon cases
    @Test
    void isAnagram_returns_true_small_words() {
        AnagramDetector detector = new AnagramDetector();

        boolean actual = detector.isAnagram("bed", "deb");

        assertTrue(actual);
    }
    @Test
    void isAnagram_returns_true_medium_words() {
        AnagramDetector detector = new AnagramDetector();

        boolean actual = detector.isAnagram("racecar","carrace");

        assertTrue(actual);
    }
    @Test
    void isAnagram_returns_true_large_words() {
        AnagramDetector detector = new AnagramDetector();

        boolean actual = detector.isAnagram("tommarvoloriddle", "iamlordvoldemort");

        assertTrue(actual);
    }
    @Test
    void isAnagram_returns_true_same_words() {
        AnagramDetector detector = new AnagramDetector();

        boolean actual = detector.isAnagram("potato", "potato");

        assertTrue(actual);
    }
    @Test
    void getIsAnagram_returns_true_words_with_space(){
        AnagramDetector detector = new AnagramDetector();

        boolean actual = detector.isAnagram("best buy", "buy best");
    }

    @Test
    void isAnagram_returns_false_small_words() {
        AnagramDetector detector = new AnagramDetector();

        boolean actual = detector.isAnagram("bed", "say");

        assertFalse(actual);
    }
    @Test
    void isAnagram_returns_false_medium_words() {
        AnagramDetector detector = new AnagramDetector();

        boolean actual = detector.isAnagram("potato","tomato");

        assertFalse(actual);
    }
    @Test
    void isAnagram_returns_false_large_words() {
        AnagramDetector detector = new AnagramDetector();

        boolean actual = detector.isAnagram("Jurassicparkandworld", "alifealwaysfindsaway");

        assertFalse(actual);

    }
    @Test
    void isAnagram_returns_false_different_sized_words() {
        AnagramDetector detector = new AnagramDetector();

        boolean actual = detector.isAnagram("superman", "kalel");

        assertFalse(actual);
    }
    @Test
    void isAnagram_returns_false_words_with_spaces() {
        AnagramDetector detector = new AnagramDetector();

        boolean actual = detector.isAnagram("Super man", "Super boy");

        assertFalse(actual);
    }
}