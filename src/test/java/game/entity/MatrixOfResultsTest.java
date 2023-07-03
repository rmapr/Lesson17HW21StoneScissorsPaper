package game.entity;

import game.exceptions.IndexOutOfRangeException;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

class MatrixOfResultsTest {

    @ParameterizedTest
    @MethodSource("provideParametersMatrixOfResult")
    void getMatrixOfResultTest(Integer i, Integer j, Integer result) {
        MatrixOfResults matrix = new MatrixOfResults();
        assertEquals(result,matrix.getMatrixOfResult(i, j));
    }
    private static Stream<Arguments> provideParametersMatrixOfResult() {
        return Stream.of(
                Arguments.of(0, 0, 6),
                Arguments.of(1, 1, 7),
                Arguments.of(2, 2, 8),
                Arguments.of(0, 1, 0),
                Arguments.of(0, 2, 1),
                Arguments.of(1, 0, 2),
                Arguments.of(1, 2, 3),
                Arguments.of(2, 0, 4),
                Arguments.of(2, 1, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    void runIndexOfRangeExceptionTest(Integer i, Integer j){
        assertThrowsExactly(IndexOutOfRangeException.class, () -> new MatrixOfResults().getMatrixOfResult(i, j),
                "Index out of range.");
    }

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(-1, 0),
                Arguments.of(3, 0),
                Arguments.of(0, -1),
                Arguments.of(0, 3)
        );
    }
}