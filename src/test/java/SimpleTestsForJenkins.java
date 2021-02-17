import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTestsForJenkins {

    @Test
    void simplePositiveTest(){
        assertEquals(true, true);
    }

    @Test
    void simpleNegativeTest(){
        assertEquals(true, false);
    }

}
