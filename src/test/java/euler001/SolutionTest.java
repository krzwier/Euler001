package euler001;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
class SolutionTest {
    
    @Test
    void MutlipleOfThree_Input3_True() {
        assertTrue(Solution.MultipleOfThree(3));
    
    }

    @Test
    void MutlipleOfThree_Input1_False() {
        assertFalse(Solution.MultipleOfThree(1));
    
    }

    @Test
    void MutlipleOfThree_Input6_True() {
        assertTrue(Solution.MultipleOfThree(6));
    
    }

    @Test
    void MultipleOfFive_Input5_True() {
        assertTrue(Solution.MultipleOfFive(5));
    }

    @Test
    void MultipleOfFive_Input2_False() {
        assertFalse(Solution.MultipleOfFive(2));
    }
    
    @Test
    void MultipleOfFive_Input10_True() {
        assertTrue(Solution.MultipleOfFive(10));
    }

    @Test
    void SumOfMultiples_Input10_23() {
        assertEquals(23, Solution.SumOfMultiples(10));
    }

    @Test
    void SumOfMultiples_Input12_33() {
        assertEquals(33, Solution.SumOfMultiples(12));
    }

    @Test
    void SumOfMultiples_Input13_45() {
        assertEquals(45, Solution.SumOfMultiples(13));
    }

    @Test
    void SumOfMultiples_Input1_0() {
        assertEquals(0, Solution.SumOfMultiples(1));
    }

    @Test
    void SumOfMultiples_Input100_2318() {
        assertEquals(2318, Solution.SumOfMultiples(100));
    }


}
