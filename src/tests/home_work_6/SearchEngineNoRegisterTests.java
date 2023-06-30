package tests.home_work_6;

import home_work_6.api.ISearchEngine;
import home_work_6.utils.EasySearch;
import home_work_6.utils.SearchEngineNoRegister;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchEngineNoRegisterTests {

    ISearchEngine engine = new SearchEngineNoRegister(new EasySearch());

    @Test
    public void searchNoRegister1() {
        String text = "Даш даш карандаши, а даШ, даш?";
        String word = "даш";
        long result = engine.search(text, word);
        Assertions.assertEquals(4, result);
    }

    @Test
    public void searchNoRegister2() {
        String text = "ЛаВиРоВаЛ? лАвИрОвАл! ЛаВиРоВаЛ, ЛАВИРОВАЛ: лавировал";
        String word = "лавировал";
        long result = engine.search(text, word);
        Assertions.assertEquals(5, result);
    }
}
