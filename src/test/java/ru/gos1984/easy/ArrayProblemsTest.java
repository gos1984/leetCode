package ru.gos1984.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.gos1984.easy.array.TwoSum;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayProblemsTest {

    private final TwoSum twoSum = new TwoSum();

    @Test
    @DisplayName("1. Two Sum")
    void twoSum() {
        assertAll(
                () -> assertArrayEquals(new int[]{0,1}, twoSum.twoSum(new int[]{2,7,11,15}, 9)),
                () -> assertArrayEquals(new int[]{1,2}, twoSum.twoSum(new int[]{3,2,4}, 6)),
                () -> assertArrayEquals(new int[]{0,1}, twoSum.twoSum(new int[]{3,3}, 6)),
                () -> assertArrayEquals(new int[]{0,2}, twoSum.twoSum(new int[]{3,2,3}, 6))
        );
    }
}
