package com.feviscom.common;

public class TestCase<EXPECTED_TYPE, ACTUAL_TYPE> {

    public final EXPECTED_TYPE expected;
    public final ACTUAL_TYPE actual;

    public TestCase(EXPECTED_TYPE expected, ACTUAL_TYPE actual) {
        this.expected = expected;
        this.actual = actual;
    }
}
