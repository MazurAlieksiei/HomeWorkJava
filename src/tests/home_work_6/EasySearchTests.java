package tests.home_work_6;

import home_work_6.utils.EasySearch;
import home_work_6.api.ISearchEngine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class EasySearchTests {

    ISearchEngine searchEngine = new EasySearch();

    @ParameterizedTest
    @CsvSource({"Мама мыла раму, мыл, 0 ",
            "Мама мыла раму, раму, 1", "Мама мыла раму, Мама, 1",
            "Мама мыла раму, мама, 0", "Мама мыла раму, мыла, 1"})
    public void search(String text, String word, int expected) {
        long result = searchEngine.search(text, word);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"Кис кис кис, кис, 2 ",
            "ура!ура!ура!, ура, 3"})
    public void search_SameWords_StringInput(String text, String word, int expected) {
        long result = searchEngine.search(text, word);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"губка.боб, губка, 1 ", "'губка,боб', губка, 1 ", "губка!боб, губка, 1 ", "губка?боб, губка, 1 ",
            "губка:боб, губка, 1 ", "губка;боб, губка, 1 ", "губка_боб, губка, 1 ", "губка-боб, губка, 0 "})
    public void search_WordsWithPunctuationsInput_SearchFirst(String text, String word, int expected) {
        long result = searchEngine.search(text, word);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"скидвард.осьминог, осьминог, 1 ", "'скидвард,осьминог', осьминог, 1 ", "скидвард!осьминог, осьминог, 1 ",
            "скидвард?осьминог, осьминог, 1 ", "скидвард:осьминог, осьминог, 1 ",
            "скидвард;осьминог, осьминог, 1 ", "скидвард_осьминог, осьминог, 1 ",
            "скидвард-осьминог, скидвард-осьминог, 1 "})
    public void search_WordsWithPunctuationsInput_SearchSecond(String text, String word, int expected) {
        long result = searchEngine.search(text, word);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"что что-то и что-нибудь, что, 1 ", "бабушка бабушке бабушку, бабушк, 0",
            "дома домохозяйка делает домашние дела, дом, 0 "})
    public void search_WordsWithSameLetters_Partially(String text, String word, int expected) {
        long result = searchEngine.search(text, word);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({" , что, 0 ", "бабушка бабушке бабушку, , 0"})
    public void search_EmptyInput(String text, String word, int expected) {
        long result = searchEngine.search(text, word);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void search_NullTextInput() {
        String text = null;
        String word = "любое";
        long result = searchEngine.search(text, word);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void search_NullWordInput() {
        String text = "любой";
        String word = null;
        long result = searchEngine.search(text, word);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void search_NullInput() {
        String text = null;
        String word = null;
        long result = searchEngine.search(text, word);
        Assertions.assertEquals(0, result);
    }

    //    @Test
//    public void sesrch_1 (){
//        String text = "приветпривет";
//        String word = "привет";
//        long result = searchEngine.search(text, word);
//        Assertions.assertEquals(0, result);
//    }
//
    @ParameterizedTest
    @CsvSource({"раз, раз, 1", "разочек, разочек, 1", "облом, да, 0"})
    public void sesrch_OneSeqchWordString(String text, String word, int expected) {
        long result = searchEngine.search(text, word);
        Assertions.assertEquals(expected, result);
    }
}
