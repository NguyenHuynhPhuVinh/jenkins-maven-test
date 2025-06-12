import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

/**
 * Test class for GradeConverter.
 * This class contains unit tests to verify the functionality of the GradeConverter class.
 */
public class GradeConverterTest {

    /** Test score for perfect grade. */
    private static final int PERFECT_SCORE = 100;
    /** Test score for minimum A grade. */
    private static final int MIN_A_SCORE = 90;
    /** Test score for minimum B grade. */
    private static final int MIN_B_SCORE = 80;
    /** Test score for minimum C grade. */
    private static final int MIN_C_SCORE = 70;
    /** Test score for minimum D grade. */
    private static final int MIN_D_SCORE = 60;
    /** Test score for E grade. */
    private static final int E_GRADE_SCORE = 50;
    /** Test score above valid range. */
    private static final int INVALID_HIGH_SCORE = 101;
    /** Test score below valid range. */
    private static final int INVALID_LOW_SCORE = -10;

    /** The GradeConverter instance used for testing. */
    private GradeConverter converter;

    /**
     * Sets up the test fixture before each test method.
     *
     * @throws Exception if setup fails
     */
    @Before
    public void setUp() throws Exception {
        converter = new GradeConverter();
    }

    /**
     * Tests conversion of perfect score (100) to grade A.
     *
     * @throws Exception if test fails
     */
    @Test
    public void testConvert1() throws Exception {
        String expected = "A";
        String actual = converter.convert(PERFECT_SCORE);
        assertEquals(expected, actual);
    }

    /**
     * Tests conversion of minimum A grade score (90) to grade A.
     *
     * @throws Exception if test fails
     */
    @Test
    public void testConvert2() throws Exception {
        String expected = "A";
        String actual = converter.convert(MIN_A_SCORE);
        assertEquals(expected, actual);
    }

    /**
     * Tests conversion of minimum B grade score (80) to grade B.
     *
     * @throws Exception if test fails
     */
    @Test
    public void testConvert3() throws Exception {
        String expected = "B";
        String actual = converter.convert(MIN_B_SCORE);
        assertEquals(expected, actual);
    }

    /**
     * Tests conversion of minimum C grade score (70) to grade C.
     *
     * @throws Exception if test fails
     */
    @Test
    public void testConvert4() throws Exception {
        String expected = "C";
        String actual = converter.convert(MIN_C_SCORE);
        assertEquals(expected, actual);
    }

    /**
     * Tests conversion of minimum D grade score (60) to grade D.
     *
     * @throws Exception if test fails
     */
    @Test
    public void testConvert5() throws Exception {
        String expected = "D";
        String actual = converter.convert(MIN_D_SCORE);
        assertEquals(expected, actual);
    }

    /**
     * Tests conversion of E grade score (50) to grade E.
     *
     * @throws Exception if test fails
     */
    @Test
    public void testConvert6() throws Exception {
        String expected = "E";
        String actual = converter.convert(E_GRADE_SCORE);
        assertEquals(expected, actual);
    }

    /**
     * Tests conversion of score above valid range (101) to "Invalid".
     *
     * @throws Exception if test fails
     */
    @Test
    public void testConvert7() throws Exception {
        String expected = "Invalid";
        String actual = converter.convert(INVALID_HIGH_SCORE);
        assertEquals(expected, actual);
    }

    /**
     * Tests conversion of score below valid range (-10) to "Invalid".
     *
     * @throws Exception if test fails
     */
    @Test
    public void testConvert8() throws Exception {
        String expected = "Invalid";
        String actual = converter.convert(INVALID_LOW_SCORE);
        assertEquals(expected, actual);
    }


}
