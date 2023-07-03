package game.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {

    @ParameterizedTest
    @MethodSource("provideParametersForComputerResultTest")
    void computerResultTest(int i) {
        assertNotEquals(i, new Service().computerResult());
    }
    private static Stream<Arguments> provideParametersForComputerResultTest() {
        return Stream.of(
                Arguments.of(-1),
                Arguments.of(3),
                Arguments.of(4),
                Arguments.of(5),
                Arguments.of(6),
                Arguments.of(7),
                Arguments.of(8)
        );
    }
}