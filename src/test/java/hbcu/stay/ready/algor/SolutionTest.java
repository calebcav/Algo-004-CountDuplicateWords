package hbcu.stay.ready.algor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
    Solution solution;

    @Before
    public void setup(){
        solution = new Solution();
    }

    @Test
    public void countUniqueWordsTest1(){
        String input = "Hello Java. Hello World. Hello Java!";
        String expected =   "The 3 unique words are:\n" +
                            "Hello (seen 3)\n" +
                            "Java (seen 2)\n" +
                            "World (seen 1)";
        String actual = solution.countUniqueWords(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countUniqueWordsTest2(){
        String input = "that that is is that that is not is not is that it it is wutang";
        String expected =   "The 5 unique words are:\n" +
                            "is (seen 6)\n" +
                            "it (seen 2)\n" +
                            "not (seen 2)\n" +
                            "that (seen 5)\n" +
                            "wutang (seen 1)";
        String actual = solution.countUniqueWords(input);
        Assert.assertEquals(expected, actual);
    }
}
