package mt.caseone.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import mt.caseone.Foo;

public class FooTest {
    private Foo foo;

    @BeforeEach
    void setup() {
        foo = new Foo();
    }

    @BeforeEach
    void tearDown() {
        foo = null;
    }

    @Test
    public void test() {
    }

    @ParameterizedTest
    @MethodSource
    void parameterTest(int[] data) {
        foo.solution(data);
    }

    static List<int[]> parameterTest() {
        ArrayList<int[]> result = new ArrayList<>();
        result.add(new int[] { 1, 5, 2, 1, 4, 0 });

        return result;
    }
}
