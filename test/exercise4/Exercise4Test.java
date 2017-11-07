package exercise4;

import java.util.ArrayList;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author allewi01
 * @assignment 4
 */
public class Exercise4Test {
    
    public Exercise4Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testTask1() {
        System.out.println("task1");
        Exercise4 instance = new Exercise4();
        Integer n = 3;
        Integer expResult = 27;
        Integer result = instance.task1(n);
        assertEquals(expResult, result);
        n = 8;
        expResult = 512;
        result = instance.task1(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testTask2() {
        System.out.println("task2");
        Exercise4 instance = new Exercise4();
        String s = "hello";
        Integer expResult = 5;
        Integer result = instance.task2(s);
        assertEquals(expResult, result);
        s = "python > java";
        expResult = 13;
        result = instance.task2(s);
        assertEquals(expResult, result);
    }

    @Test
    public void testTask3() {
        System.out.println("task3");
        Exercise4 instance = new Exercise4();
        Character c = 'j';
        Integer expResult = 106;
        Integer result = instance.task3(c);
        assertEquals(expResult, result);
        c = '~';
        expResult = 126;
        result = instance.task3(c);
        assertEquals(expResult, result);
    }

    @Test
    public void testTask4() {
        System.out.println("task4");
        Exercise4 instance = new Exercise4();
        String s = "Computer Science";
        Character expResult = 'e';
        Character result = instance.task4(s);
        assertEquals(expResult, result);
        s = "252";
        expResult = '2';
        result = instance.task4(s);
        assertEquals(expResult, result);
    }

    @Test
    public void testTask5() {
        System.out.println("task5");
        Exercise4 instance = new Exercise4();
        Integer m = 2;
        Integer n = 3;
        Integer expResult = 5;
        Integer result = instance.task5(m, n);
        assertEquals(expResult, result);
        m = 27;
        n = 51;
        expResult = 78;
        result = instance.task5(m, n);
        assertEquals(expResult, result);
    }

    @Test
    public void testTask6() {
        System.out.println("task6");
        Exercise4 instance = new Exercise4();
        String s = "new york";
        Integer n = 4;
        Character expResult = 'y';
        Character result = instance.task6(s, n);
        assertEquals(expResult, result);
        s = "chicago";
        n = 9;
        expResult = 'i';
        result = instance.task6(s, n);
        assertEquals(expResult, result);
    }

    @Test
    public void testTask7() {
        System.out.println("task7");
        Exercise4 instance = new Exercise4();
        Integer[] n1 = {1, 3, 7, 9};
        Integer expResult = 9;
        Integer result = instance.task7(n1);
        assertEquals(expResult, result);
        Integer[] n2 = {1, 2, 4, 8, 16, 32, 64, 128};
        expResult = 128;
        result = instance.task7(n2);
        assertEquals(expResult, result);
    }

    @Test
    public void testTask8() {
        System.out.println("task8");
        Exercise4 instance = new Exercise4();
        Integer[] m1 = {0, 1, 3, 6, 10, 15};
        Integer n = 3;
        Boolean expResult = true;
        Boolean result = instance.task8(m1, n);
        assertEquals(expResult, result);
        Integer[] m2 = {1, 1, 2, 6, 24, 120, 720};
        n = 36;
        expResult = false;
        result = instance.task8(m2, n);
        assertEquals(expResult, result);
    }

    @Test
    public void testTask9() {
        System.out.println("task9");
        Exercise4 instance = new Exercise4();
        ArrayList<String> s = new ArrayList();
        s.add("hello");
        s.add("world");
        Integer expResult = 10;
        Integer result = instance.task9(s);
        assertEquals(expResult, result);
        s = new ArrayList();
        s.add("foo");
        s.add("bar");
        s.add("huh");
        expResult = 9;
        result = instance.task9(s);
        assertEquals(expResult, result);
    }

    @Test
    public void testTask10() {
        System.out.println("task10");
        Exercise4 instance = new Exercise4();
        HashMap<Integer, Integer> h = new HashMap<>();
        h.put(0, 0);
        h.put(1, 1);
        h.put(2, 1);
        h.put(3, 2);
        h.put(4, 3);
        h.put(5, 5);
        h.put(6, 8);
        h.put(7, 13);
        h.put(8, 21);
        Integer expResult = 353;
        Integer result = instance.task10(h);
        assertEquals(expResult, result);
        h = new HashMap<>();
        h.put(0, 1);
        h.put(1, 3);
        h.put(2, 9);
        h.put(3, 27);
        h.put(4, 81);
        expResult = 426;
        result = instance.task10(h);
        assertEquals(expResult, result);
    }
    
}
