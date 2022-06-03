import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    List<String> first = Arrays.asList("0","1","3");
    List<String> second = Arrays.asList();

    List<String> actual = Arrays.asList("0", "#", "0", "#", "0", "#", "#", "0", "#");
    List<String> expected = Arrays.asList("2", "#", "2", "#", "3", "#", "#", "2", "#");


    @Test
    void everyStatementKriterium(){
        IllegalArgumentException ex1, ex2;
         ex1 = assertThrows(IllegalArgumentException.class, () -> SILab2.function(second));
         assertTrue(ex1.getMessage().contains("List length should be greater than 0"));

        ex2 = assertThrows(IllegalArgumentException.class, () -> SILab2.function(first));
        assertTrue(ex2.getMessage().contains("List length should be a perfect square"));

        assertEquals(expected, SILab2.function(actual));
    }

    List<String> actual1 = Arrays.asList("0", "#", "0", "#", "0", "#", "#", "0", "#","0", "#", "0", "#", "0", "#", "#");
    List<String> expected1 = Arrays.asList("1", "#", "3", "#", "2", "#", "#", "2", "#","3", "#", "2", "#", "2", "#", "#");

    @Test
    void everyBranchKriterium(){
        IllegalArgumentException ex1, ex2;
        ex1 = assertThrows(IllegalArgumentException.class, () -> SILab2.function(second));
        assertTrue(ex1.getMessage().contains("List length should be greater than 0"));

        ex2 = assertThrows(IllegalArgumentException.class, () -> SILab2.function(first));
        assertTrue(ex2.getMessage().contains("List length should be a perfect square"));

        assertEquals(expected1, SILab2.function(actual1));
    }







}