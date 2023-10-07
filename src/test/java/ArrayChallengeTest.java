import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayChallengeTest {
    @Test
    void arrayChallenge_oddCountElementsArray_notOk() {
        int[] arr = new int[]{1};
        String exceptedResult = "-1";
       assertEquals(exceptedResult, ArrayChallenge.arrayChallenge(arr));
    }

    @Test
    void arrayChallenge_goodResult_ok() {
        int[] array1 = {16, 22, 35, 8, 20, 1, 21, 11};
        String exceptedResult1 = "1,11,20,35,8,16,21,22";
        assertEquals(exceptedResult1, ArrayChallenge.arrayChallenge(array1));
        int[] array2 = {1, 2, 3, 4};
        String exceptedResult2 = "1,4,2,3";
        assertEquals(exceptedResult2, ArrayChallenge.arrayChallenge(array2));
    }

    @Test
    void arrayChallenge_wrongResult_notOk() {
        int[] array1 = {1, 2, 1, 5};
        String exceptedResult1 = "-1";
        assertEquals(exceptedResult1, ArrayChallenge.arrayChallenge(array1));
    }
}