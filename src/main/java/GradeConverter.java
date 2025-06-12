
/**
 * Converter class for converting numeric scores to letter grades.
 * This class provides functionality to convert integer scores to corresponding letter grades.
 */
public final class GradeConverter {

    /** Minimum score for grade A. */
    private static final int GRADE_A_MIN = 90;
    /** Maximum score for grade A. */
    private static final int GRADE_A_MAX = 100;
    /** Minimum score for grade B. */
    private static final int GRADE_B_MIN = 80;
    /** Maximum score for grade B. */
    private static final int GRADE_B_MAX = 89;
    /** Minimum score for grade C. */
    private static final int GRADE_C_MIN = 70;
    /** Maximum score for grade C. */
    private static final int GRADE_C_MAX = 79;
    /** Minimum score for grade D. */
    private static final int GRADE_D_MIN = 60;
    /** Maximum score for grade D. */
    private static final int GRADE_D_MAX = 69;
    /** Minimum score for grade E. */
    private static final int GRADE_E_MIN = 0;
    /** Maximum score for grade E. */
    private static final int GRADE_E_MAX = 59;

    /**
     * Converts a numeric score to a letter grade.
     *
     * @param score the numeric score to convert (should be between 0-100)
     * @return the corresponding letter grade (A, B, C, D, E) or "Invalid" for out-of-range scores
     */
    public String convert(final int score) {
        if (score <= GRADE_A_MAX && score >= GRADE_A_MIN) {
            return "A";
        } else if (score <= GRADE_B_MAX && score >= GRADE_B_MIN) {
            return "B";
        } else if (score <= GRADE_C_MAX && score >= GRADE_C_MIN) {
            return "C";
        } else if (score <= GRADE_D_MAX && score >= GRADE_D_MIN) {
            return "D";
        } else if (score <= GRADE_E_MAX && score >= GRADE_E_MIN) {
            return "E";
        } else {
            return "Invalid";
        }
    }
}
