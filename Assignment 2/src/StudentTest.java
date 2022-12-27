import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class StudentTest {
	private Course c1;
	private Course c2;
	private Course c3;
	private Course c4;
    private Course c5;
    private Course c6;
    private Course c7;
    private Course c8;
    private Course c9;
    private Course c10;
    private Course c11;
    private Course c12;
    private Course c13;
    private Course c14;
    private Course c15;
    private Student s1;
    
	
	@Before
	public void setUp() {
		/*set up c1
		 * c1 just has one lecture and is day 1 and hour 8*/
        c1 = new Course("2Z03");
		c1.addLecture(1, 8);  

        /*set up s1
		 * s1 just has Student: BigBird*/
		s1 = new Student("BigBird");
		test1();
		
		/* set up c2
		 * c2 just has one lecture and max case*/
		c2 = new Course("2C03");
		c2.addLecture(5, 17); 
		
		/* set up c3 */
		c3 = new Course("2AA4");
		c3.addLecture(3, 8);
        c3.addLecture(4, 8);
        c3.addLecture(5, 8);
        c3.addLecture(6, 8);
        c3.addLecture(6, 8);
        c3.addLecture(5, 8);
        c3.addLecture(10, 8);
        c3.addLecture(10, 12);
        c3.addLecture(10, 3);
		
		/*set up c4*/
		c4 = new Course("2DA4");
		c4.addLecture(3, 9); 

        /*set up c5*/
		c5 = new Course("1XX3");
		c5.addLecture(1, 8);  

        /*set up c6*/
		c6 = new Course("1P13");
		c6.addLecture(2, 8); 

        /*set up c7*/
		c7 = new Course("2PX3");
		c7.addLecture(3, 8);  

        /*set up c8*/
		c8 = new Course("3PX4");
		c8.addLecture(4, 8); 

        /*set up c9*/
		c9 = new Course("4PX4");
		c9.addLecture(5, 8); 

        /*set up c10*/
		c10 = new Course("2CC3");
		c10.addLecture(6, 8); 

        /*set up c11*/
		c11 = new Course("3C03");
		c11.addLecture(3, 4); 

        /*set up c12*/
		c12 = new Course("1F03");
		c12.addLecture(3, 8); 

        /*set up c13*/
		c13 = new Course("1Z03");
		c13.addLecture(3, 8); 

        /*set up c14*/
		c14 = new Course("2GA3");
		c14.addLecture(3, 8); 

        /*set up c15*/
		c15 = new Course("1PX3");
		c15.addLecture(3, 8); 
        
        /*set up s1 with all courses*/
        
	}
	
	@After
	public void tearDown() {
		c1 = null; c2 = null; c5 = null; c6 = null; c9 = null; c10 = null; c13 = null; c14 = null;
		c3 = null; c4 = null; c7 = null; c8 = null; c11 = null; c12 = null; c15 = null; s1 = null;
	}
	
	/* Test m1 */
	@Test
	public void test1() {
		assertEquals(s1.getName(), "BigBird");
	}
	
	/* Test m2 */
	@Test
	public void test2() {
        s1.addDesiredCourse(c1);
        s1.addDesiredCourse(c2);
        s1.addDesiredCourse(c3);
        s1.addDesiredCourse(c4);
        s1.addDesiredCourse(c5);
        s1.addDesiredCourse(c6);
        s1.addDesiredCourse(c7);
        s1.addDesiredCourse(c8);
        s1.addDesiredCourse(c9);
        s1.addDesiredCourse(c10);
        s1.addDesiredCourse(c11);
        s1.addDesiredCourse(c12);
        s1.addDesiredCourse(c13);
        s1.addDesiredCourse(c14);
        s1.addDesiredCourse(c15);
        ArrayList<Course> temp = s1.getBestSchedule();
        ArrayList<String> temper = new ArrayList<>();
        for (int i = 0; i< 5; i++) {
            temper.add(temp.get(i).getCode());
        }
		assertEquals(temper.contains("2Z03") || temper.contains("1P13") || temper.contains("2C03") || temper.contains("2DA4"),true);
	}
	
	/* Test m3 */
	@Test
	public void test3() {
		s1.addDesiredCourse(c1);
        s1.addDesiredCourse(c2);
        s1.addDesiredCourse(c4);
        s1.addDesiredCourse(c10);
        s1.addDesiredCourse(c11);
        ArrayList<Course> temp = s1.getBestSchedule();
        ArrayList<String> temper = new ArrayList<>();
        for (int i = 0; i< 5; i++) {
            temper.add(temp.get(i).getCode());
            System.out.println(temp.get(i).getCode());
        }
		assertEquals(temper.contains("2Z03") && temper.contains("2C03") && temper.contains("2DA4") && temper.contains("2CC3") && temper.contains("3C03"),true);
	}
	
	// /* Test m3 */
	@Test
	public void test4() {
		s1.addDesiredCourse(c1);
        s1.addDesiredCourse(c2);
        s1.addDesiredCourse(c4);
        s1.addDesiredCourse(c10);
        ArrayList<Course> temp = s1.getBestSchedule();
		assertEquals(temp,null);
	}
	@Test(timeout=3000)
    public void test_ManyDesired() {
        // NOTE: the actual tests will only have n <= 10
        // a good (non powerset) solution could even go way higher than n=63
        final int n = 30; // 1 << 31 overflows int
        final Student s = new Student("");
        for (String a = ""; a.length() < n; a += "a")
            s.addDesiredCourse(new Course(a));
        ArrayList<Course> b = s.getBestSchedule();
        assertNotEquals(b, null);
    }

    @Test
    public void test_AllSameDay() {
        final Student s = new Student("");
        final ArrayList<Course> c = new ArrayList<>();
        for (int i = 0; i < 10; ++i)
            c.add(new Course("" + (char)(i+(int)'0')));
        c.forEach(x -> s.addDesiredCourse(x));

        c.get(0).addLecture(1,8);

        c.get(1).addLecture(1,9);
        c.get(1).addLecture(2,9);

        c.get(2).addLecture(1,10);
        c.get(2).addLecture(2,10);
        c.get(2).addLecture(3,10);
        
        c.get(3).addLecture(1,11);
        c.get(3).addLecture(2,11);
        c.get(3).addLecture(3,11);
        c.get(3).addLecture(4,11);
        
        c.get(4).addLecture(1,12);
        c.get(4).addLecture(2,12);
        c.get(4).addLecture(3,12);
        c.get(4).addLecture(4,12);
        c.get(4).addLecture(5,12);
        
        c.get(5).addLecture(1,8); // conflict with 0
        c.get(5).addLecture(1,13);
        
        c.get(6).addLecture(1,14);
        
        c.get(7).addLecture(1,15);
        
        c.get(8).addLecture(1,16);
        
        c.get(9).addLecture(1,17);
        c.get(9).addLecture(1,13); // conflict with 5

        // mon: 0123456789
        // tue:  1234     
        // wed:   234     
        // thu:    34     
        // fri:     4     
        // 0 and 5 conflict
        // 5 and 9 conflict
        // only best (1 day) is 06789
        
        final ArrayList<Course> b = s.getBestSchedule();
        assertNotEquals(b, null);
        assertEquals(b.size(), 5);

        final ArrayList<String> l = new ArrayList<>(b.size());
        b.forEach(x -> l.add(x.getCode()));

        assertEquals(
            l.contains("0") &&
            l.contains("6") &&
            l.contains("7") &&
            l.contains("8") &&
            l.contains("9"),true);
    }
}
