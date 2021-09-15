package main;

import org.junit.*;

public class MySolutionTest {
private static int[] asd;

    @BeforeClass        // ez csak 1x fog lefutni (ha az össes test-et futtatod akkor is)
    public static void setUp(){    // olyan mint 1 konstructor(de nem az).
        asd = new int[]{1,2,3,4,5};
    }
    @AfterClass
    public static void tearDownClass(){
        System.out.println("AAAAAAAAAAAAA");
    }

    @Before         // JUnit5-ben BeforeEach (jelenleg JU4-et használsz). Minden egyes test előtt lefut.
    public void init(){
        System.out.println("Started");
    }
    @After
    public void ASD(){
        System.out.println("finished");
    }

    @Test
    public void testExample() {  //köteletően public void!
        int x = 10;

        Assert.assertEquals(10, x);

    }

    @Test
    public void countSameNumbersTest() {

        Assert.assertEquals(2, MySolution.countSameNumbers(new int[]{0, 1, 2, 3, 4}, new int[]{5, 6, 5, 4, 4, 4, 3}));

    }

    @Test
    public void findMaxIndexTest() {
        int[] arr = {2, 3, 66, 4, 34};
        Assert.assertEquals(2, MySolution.findMaxIndex(arr));
    }

    @Test
    public void willWizardsBeTogetherTest() {
        Assert.assertFalse(MySolution.willWizardsBeTogether(3,4,2,1));
        Assert.assertFalse(MySolution.willWizardsBeTogether(3,4,4,1));
        Assert.assertTrue(MySolution.willWizardsBeTogether(6,2,2,4));

    }


}
