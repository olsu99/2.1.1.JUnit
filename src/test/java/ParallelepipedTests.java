import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ParallelepipedTests {
    Parallelepiped sut;

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Тестирование началось.");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("Тестирование завершилось.");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("Начало");
        sut = new Parallelepiped();
    }

    @AfterEach
    public void AfterEach(){
        System.out.println("Конец");
        sut = null;
    }

    @Test
    public void testPerimeter(){
        //given
        int a = 2, b = 3, c = 4, expected = 36;
        //when
        int result = sut.perimeter(a, b, c);
        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testVolume(){
        //given
        int a = 1, b = 1, c = 2, expected = 2;
        //when
        int result = sut.volume(a, b, c);
        //then
        Assertions.assertEquals(expected, result);
    }

    public static Stream<Arguments> source(){
        return Stream.of(Arguments.of(1, 2, 3, 22),
                Arguments.of(1, 3, 5, 46));
    }

    @ParameterizedTest
    @MethodSource("source")
    public void testArea(int a, int b, int c, int expected){
        //when
        int result = sut.area(a, b, c);
        //then
        Assertions.assertEquals(expected, result);
    }
}
