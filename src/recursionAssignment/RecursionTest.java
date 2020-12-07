package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import recursionAssignment.Recursion;

public class RecursionTest{

    /**
     * Testing the countHi() method
     */
    @Test
    public void Test1(){
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
        assertEquals(1, Recursion.countHi("xxhixx"));
    }
    
    /**
     * Testing the countHi() method
     */
    @Test
    public void Test2(){
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
        assertEquals(2, Recursion.countHi("xhixhix"));
    }

    /**
     * Testing the countHi() method
     */
    @Test
    public void Test3(){
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
        assertEquals(1, Recursion.countHi("hi"));
    }

    /**
     * Testing the countHi() method
     */
    @Test
    public void Test4(){
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
        assertEquals(4, Recursion.countHi("tm1hiam3hiamehi2menhi"));
    }

    /**
     * Testing the pairStar() method
     */
    @Test
    public void Test5(){
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
        assertEquals("hel*lo", Recursion.pairStar("hello"));
    }

    /**
     * Testing the pairStar() method
     */
    @Test
    public void Test6(){
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
        assertEquals("x*xy*y", Recursion.pairStar("xxyy"));
    }

    /**
     * Testing the pairStar() method
     */
    @Test
    public void Test7(){
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
        assertEquals("a*a*a*a", Recursion.pairStar("aaaa"));
    }

    /**
     * Testing the pairStar() method
     */
    @Test
    public void Test8(){
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
        assertEquals("a*abcde*ef*f", Recursion.pairStar("aabcdeeff"));
    }
    
    /**
     * Testing the stringClean() method
     */
    @Test
    public void Test9(){
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
        assertEquals("yza", Recursion.stringClean("yyzzza"));
    }

    /**
     * Testing the stringClean() method
     */
    @Test
    public void Test10(){
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
        assertEquals("abcd", Recursion.stringClean("abbbcdd"));
    }

    /**
     * Testing the stringClean() method
     */
    @Test
    public void Test11(){
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
        assertEquals("Helo", Recursion.stringClean("Hello"));
    }

    /**
     * Testing the stringClean() method
     */
    @Test
    public void Test12(){
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
        assertEquals("abcdedefgh", Recursion.stringClean("aabccccccdedeefgghhh"));
    }


}
