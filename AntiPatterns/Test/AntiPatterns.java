import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AntiPatterns {

    @Test
    void testDataClass(){
        DataClass testDataClass = new DataClass("Hr", "Anders Fredensborg",
                "test@fuckkenni.dk", "TestAddressenHosFuckingKenni", 69, 420.322);
    }

    @Test
    void testAnotherClass(){
        AnotherClass testClass = new AnotherClass("CorrectAddress", 54, 2);
        assertEquals(54, testClass.houseNumber);
    }

    @Test(expected = ArithmeticException.class)
    void testCalculateNetWorthAtSixtyYearsOld(){
        DataClass testDataClass = new DataClass("Hr", "Anders Fredensborg",
                "test@fuckkenni.dk", "TestAddressenHosFuckingKenni", 10, 420.322);
        assertEquals(69, testDataClass.calculateNetWorthAtSixtyYearsOld());
    }


}
