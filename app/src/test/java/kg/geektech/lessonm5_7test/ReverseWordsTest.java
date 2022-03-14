package kg.geektech.lessonm5_7test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ReverseWordsTest {
    ReverseWords reverseWords;

    @Before
    public void setup() {
        reverseWords = new ReverseWords();
    }

    @Test
    public void reverseToWords() {
        assertEquals("[art, asta, ban, ced]", reverseWords.reverseString("ban asta ced art"));
    }

    @Test
    public void deleteSpaceProgram() {
        assertEquals("работаиденьги", reverseWords.deleteSpaceProgram("   работа  и      деньги"));
    }

    @Test
    public void work() {
        for (int i = 0; i < 5; i++) {
            boolean d = true;
            if (d) {
                assertEquals("set", reverseWords.workString("set"));
                d = false;
            } else {
                assertFalse(Boolean.parseBoolean(reverseWords.workString("set")));
                d = true;
            }
        }
    }
    @Test
    public void firstUpperCase() {
        assertEquals("Работа лучшая и плохая", reverseWords.firstUpperCase("работа лучшая и плохая"));
    }

    @After
    public void tearDown() {
        reverseWords = null;
    }
}
