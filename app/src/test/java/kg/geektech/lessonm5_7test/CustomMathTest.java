package kg.geektech.lessonm5_7test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CustomMathTest {
    CustomMath math;

    //@Before до работы
    //@After после работы

    @BeforeClass
    public static void beforeClass() {
        System.out.println("beforeClass");
    }

    @Before
    public void setup() {
        math = new CustomMath();
        System.out.println("Setup");
    }

    @Test
    public void nullCase() {
        System.out.println("nullCase");
        assertEquals("Второе значение пустое",math.add(2, null));
    }

    @Test
    public void simpleDivCase() {
        System.out.println("simpleDivCase");
        assertEquals("2", math.div(4, 2));
        math = null;
    }

    @Test
    public void divByZero() {
        System.out.println("divByZero");
        assertEquals("Нельзя делить на ноль", math.div(2, 0));
        math = null;
    }

    @After
    public void tearDown() {
        System.out.println("tearDown");
        math = null;
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("AfterClass");
    }
}
