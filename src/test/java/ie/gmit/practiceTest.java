package ie.gmit;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class practiceTest {

    private practice Practice;

    @BeforeAll
    public static void init()
    {
        System.out.println("Starting tests");
    }

    @BeforeEach
    public void setUp()
    {
        Practice = new practice("", "", "", "", 0);
    }

    @Test
    public void testSetTitleSuccess()
    {
        Practice.setTitle("Mr");
        assertEquals("Mr", Practice.getTitle());

        Practice.setTitle("Mrs");
        assertEquals("Mrs", Practice.getTitle());

        Practice.setTitle("Ms");
        assertEquals("Ms", Practice.getTitle());
    }

    @Test
    public void testSetTitleFail()
    {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
            Practice.setTitle("hello");
        });
        assertEquals("Invalid title", ex.getMessage());
    }

    @Test
    public void testSetNameSuccess()
    {
        Practice.setName("Jason Keane");
        assertEquals("Jason Keane", Practice.getName());
    }

    @Test
    public void testSetNameFail()
    {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
            Practice.setName("a");
        });
        assertEquals("Invalid name", ex.getMessage());
    }

    @Test
    public void testSetIdSuccess()
    {
        Practice.setId("A1B2C3D4E5F6");
        assertEquals("A1B2C3D4E5F6", Practice.getId());
    }

    @Test
    public void testSetIdFail()
    {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
            Practice.setId("a");
        });
        assertEquals("Invalid ID", ex.getMessage());
    }

    @Test
    public void testSetPhoneSuccess()
    {
        Practice.setPhone("0852706378");
        assertEquals("0852706378", Practice.getPhone());
    }

    @Test
    public void testSetPhoneFail()
    {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
            Practice.setPhone("a");
        });
        assertEquals("Invalid phone", ex.getMessage());
    }

    @Test
    public void testSetAgeSuccess()
    {
        Practice.setAge(23);
        assertEquals(23, Practice.getAge());
    }

    @Test
    public void testSetAgeFail()
    {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
            Practice.setAge(10);
        });
        assertEquals("Age too young", ex.getMessage());
    }

}
