package com.macro.mall.andy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

public class AndyLombokTest {
    AndyLombok solver = new AndyLombok(1, "andy");

    @Test
    public void test1() {
        System.out.println(solver.getAge());
        // 1
    }
}
