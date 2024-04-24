package com.luv2code.junitdemo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

//@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
class DemoUtilsTest {

    DemoUtils demoUtils;

    @BeforeEach
    void  setupBeforeEach(){
        demoUtils = new DemoUtils();
        System.out.println("@BeforeEach is been executed");
    }


    @Test
    @DisplayName("Equals and Not Equals")
    void testEqualsAndNotEquals() {
        //System.out.println("Running test: testEqualsAndNotEquals ");

        assertEquals(6, demoUtils.add(2, 4), "2+4 must be 6");
        assertNotEquals(6, demoUtils.add(1, 9), "1+9 must not be 6");

    }

    @Test
    @DisplayName("Null and Not Null")
    void testNullAndNotNull(){
        //System.out.println("Running test: testNullAndNotNull ");

        String one = null;
        String two = "love2code";

        assertNull(demoUtils.checkNull(one), "Object should be null");
        assertNotNull(demoUtils.checkNull(two), "Object should not be null");
    }

    @DisplayName("Same and Not Same")
    @Test
    void testSameAndNotSame() {
        String str = "love2code";
        assertSame(demoUtils.getAcademy(),demoUtils.getAcademyDuplicate(), "Same Objects");
        assertNotSame(str,demoUtils.getAcademyDuplicate(), "NOT the Same Objects");
    }

    @DisplayName("True and False")
    @Test
    void testTrueFalse(){
        int gradeOne = 10;
        int gradeTwo = 5;

        assertTrue(demoUtils.isGreater(gradeOne,gradeTwo), "This should be true");
        assertFalse(demoUtils.isGreater(gradeTwo,gradeOne), "This should be false");

    }
}
/*
@AfterEach
void tearDownAfterEach(){
    System.out.println("@AfterEach is been executed");
}

@BeforeAll
static void setupBeforeAll() {
    System.out.println("@BeforeAll is been executed");
}

@AfterAll
static void setupAfterAll() {
    System.out.println("@AfterAll is been executed");
}
*/