package tests.home_work_6;

import home_work_6.api.ISearchEngine;
import home_work_6.utils.EasySearch;
import home_work_6.utils.SearchEngineCaseNormalizer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SearchEngineCaseNormalizerTests {
    ISearchEngine searchEngine = new SearchEngineCaseNormalizer(new EasySearch());

    @ParameterizedTest
    @CsvSource({"бабушка бабушке бабушку, бабушка, 3", "дому домов домами домом дома, дом, 5"})
    public void search(String text, String word, int expected) {
        long result = searchEngine.search(text, word);
        Assertions.assertEquals(expected, result);
    }
}
