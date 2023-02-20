package com.deg;

import com.deg540.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void convert_1_to_1() {
        assertEquals("1", new Main().main());
    }
}

