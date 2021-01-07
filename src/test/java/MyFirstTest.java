import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {

    //1//
    @Test
     public void testIfNameIsEqual(){
        String expected = "Codeup";
        String actual = "CodeUp";

       // assertEquals(expected,actual);
        assertNotEquals(expected,actual);
    }

    //2//
    @Test
    public void testIfArrayListIsDifferent(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        languages.add("Java");
        languages.add("CSS");

        moreLanguages.add("JavaScrip");
        moreLanguages.add("HTML");

        assertNotSame(languages,moreLanguages);

    }

    //3//
    @Test
    public void testIfArraysAreEqual(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers,otherNumbers);
    }

    //4//
    @Test
    public void verifyContents(){
        String language = "PHP";
        assertTrue(language.contains("H")); // use assertTrue for this statement
        assertFalse(language.contains("J")); // use assertFalse for this statement
    }







    @Test
    public void testIfChangeIsCorrect(){
        Double price = 10.0;
        Double discount = 4.5;

        assertEquals(5.5, price-discount, 0);
        assertEquals(5.1, price-discount, 0.5);
        assertNotEquals(4.9, price-discount, 0.5);
    }



//    @Test
//    public void testIfObjectsAreDifferent(){
//        Object dog = new Object();
//
//    }

    @Test
    public void testIfArrayEquals() {
        char[] expected = {'J','u','n','i','t'};
        char[] actual = "Junit".toCharArray();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testIfGreaterOrLesserThanWorks() {

        boolean learningTDD = true;

        assertTrue(learningTDD);
        assertTrue(" No 5 is greater than 4", 5 < 4);
        assertFalse("5 is not greater than 6", 5 > 6);
    }

    @Test
    public void testIfInstanceIsNull() {
        Object phone = new Object();
        Object laptop = null;
        assertNull(null);
        assertNotNull(phone);
        assertNull(laptop);
    }

}
