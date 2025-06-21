package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void testAdd() {
        Main m = new Main();
        int result = m.add(2, 3);
        assertEquals(5, result);
    }
}
