import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BooleanReturnTest {

    @Test
    void trueCase() {
        assertTrue(BooleanReturn.isGreater(2, 1));
    }

    @Test
    void falseCase() {
        assertFalse(BooleanReturn.isGreater(1, 2));
    }
}