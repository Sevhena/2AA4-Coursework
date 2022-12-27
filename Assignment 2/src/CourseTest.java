import org.junit.*;
import static org.junit.Assert.*;

public class CourseTest {
	private Course c1;
	private Course c2;
	private Course c3;
	private Course c4;
    private Course c10;
    
	
	@Before
	public void setUp() {
		/*set up c1
		 * c1 just has one lecture and is day 1 and hour 8*/
		c1 = new Course("2Z03");
		c1.addLecture(1, 8);
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
        //c3.addLecture(6, 8);
        //c3.addLecture(6, 8);
        c3.addLecture(5, 8);
        //c3.addLecture(10, 8);
        //c3.addLecture(10, 12);
        //c3.addLecture(10, 3);
		
		/*set up c4*/
		c4 = new Course("2DA4");
		c4.addLecture(3, 8);
        c4.addLecture(4, 8);
        c4.addLecture(5, 8);
        c4.addLecture(2, 11);
        c4.addLecture(1, 8);
        c4.addLecture(5, 15);
        //c4.addLecture(10, 8);
        //c4.addLecture(10, 12);
        //c4.addLecture(10, 3);

        c10 = new Course("2CC3");
		//c10.addLecture(6, 8); // not valid
	}
	
	@After
	public void tearDown() {
		c1 = null; c2 = null;
		c3 = null; c4 = null;
	}
	
	/* Test m1 */
	@Test
	public void test1() {
		assertEquals(c1.hasLectureOn(1), true);
	}
	
	/* Test m2 */
	@Test
	public void test2() {
		assertEquals(c2.hasLectureOn(2), false);
	}
	
	/* Test m3 */
	@Test
	public void test3() {
		assertEquals(c3.hasLectureOn(3), true);
	}
	
	/* Test m3 */
	@Test
	public void test4() {
		assertEquals(c3.hasLectureOn(10), false);
		System.out.println(c3.hasLectureOn(6));
		assertEquals(c3.hasLectureOn(6), false);
	}
	
	/* Test m3 */
	@Test
	public void test5() {
		assertEquals(c1.conflictsWith(c2),false);
        assertEquals(c2.conflictsWith(c1),false);
		assertEquals(c1.conflictsWith(c4),true);
		assertEquals(c3.conflictsWith(c4), true);
        assertEquals(c3.conflictsWith(c10), false);
	}
	
	// /* Test m3 */
	 @Test
	 public void test6() {
	 	assertEquals(c3.hasLectureAt(4, 8),true);
	 	assertEquals(c3.hasLectureAt(5, 8),true);
	 	assertEquals(c3.hasLectureAt(6, 7),false);
        assertEquals(c3.hasLectureAt(10, 8),false);
	}
	

	/* Test m3 */
	@Test
	public void test7() {
		assertEquals(c1.getCode(),"2Z03");
		assertEquals(c2.getCode(),"2C03");
		assertEquals(c3.getCode(),"2AA4");
        assertEquals(c4.getCode(),"2DA4");
	}
	
	/* Test m3 */
	@Test
	public void test8() {
		assertEquals(c3.hasLectureAt(3, 8),true);
        assertEquals(c3.hasLectureAt(4, 8),true);
        assertEquals(c3.hasLectureAt(5, 8),true);
        assertEquals(c3.hasLectureAt(6, 8),false);
        assertEquals(c3.hasLectureAt(10, 8),false);
        assertEquals(c3.hasLectureAt(10, 3),false);
        assertEquals(c3.hasLectureAt(4, 3),false);
	}
	
	/* Test m3 */
	@Test
	public void test9() {
		assertEquals(c3.hasLectureOn(3), true);
        assertEquals(c3.hasLectureOn(4), true);
        assertEquals(c3.hasLectureOn(5), true);
        assertEquals(c3.hasLectureOn(6), false);
	}
	
	// /* Test m3 */
	// @Test
	// public void test10() {
	// 	assertEquals(m3.getNext(), 2.9, 0.001);
	// 	assertEquals(m3.getNext(), 6.6, 0.001);
	// 	assertEquals(m3.getNext(), 5.5, 0.001);
	// 	assertEquals(m3.getNext(), 1.9, 0.001);
	// 	assertEquals(m3.getNext(), 5.9, 0.001);
	// 	assertEquals(m3.getNext(), 4.4, 0.001);
	// 	assertEquals(m3.getNext(), 12.3, 0.001);
	// 	assertEquals(m3.getNext(), 3.3, 0.001);
	// }
	
	// /* Test m3 */
	// @Test
	// public void test11() {
	// 	assertEquals(m3.getNext(), 2.9, 0.001);
	// 	assertEquals(m3.getNext(), 6.6, 0.001);
	// 	assertEquals(m3.getNext(), 5.5, 0.001);
	// 	assertEquals(m3.getNext(), 1.9, 0.001);
	// 	assertEquals(m3.getNext(), 5.9, 0.001);
	// 	assertEquals(m3.getNext(), 4.4, 0.001);
	// 	assertEquals(m3.getNext(), 12.3, 0.001);
	// 	assertEquals(m3.getNext(), 3.3, 0.001);
	// 	assertEquals(m3.getNext(), 2.2, 0.001);
	// }
	
	// /* Test m3 */
	// @Test
	// public void test12() {
	// 	assertEquals(m3.getNext(), 2.9, 0.001);
	// 	assertEquals(m3.getNext(), 6.6, 0.001);
	// 	assertEquals(m3.getNext(), 5.5, 0.001);
	// 	assertEquals(m3.getNext(), 1.9, 0.001);
	// 	assertEquals(m3.getNext(), 5.9, 0.001);
	// 	assertEquals(m3.getNext(), 4.4, 0.001);
	// 	assertEquals(m3.getNext(), 12.3, 0.001);
	// 	assertEquals(m3.getNext(), 3.3, 0.001);
	// 	assertEquals(m3.getNext(), 2.2, 0.001);
	// 	assertEquals(m3.getNext(), 11.4, 0.001);
	// }
	
	// /* Test m3 */
	// @Test
	// public void test13() {
	// 	assertEquals(m3.getNext(), 2.9, 0.001);
	// 	assertEquals(m3.getNext(), 6.6, 0.001);
	// 	assertEquals(m3.getNext(), 5.5, 0.001);
	// 	assertEquals(m3.getNext(), 1.9, 0.001);
	// 	assertEquals(m3.getNext(), 5.9, 0.001);
	// 	assertEquals(m3.getNext(), 4.4, 0.001);
	// 	assertEquals(m3.getNext(), 12.3, 0.001);
	// 	assertEquals(m3.getNext(), 3.3, 0.001);
	// 	assertEquals(m3.getNext(), 2.2, 0.001);
	// 	assertEquals(m3.getNext(), 11.4, 0.001);
	// 	assertEquals(m3.getNext(), 7.9, 0.001);
	// }
	
	// /* Test m3 */
	// @Test
	// public void test14() {
	// 	assertEquals(m3.getNext(), 2.9, 0.001);
	// 	assertEquals(m3.getNext(), 6.6, 0.001);
	// 	assertEquals(m3.getNext(), 5.5, 0.001);
	// 	assertEquals(m3.getNext(), 1.9, 0.001);
	// 	assertEquals(m3.getNext(), 5.9, 0.001);
	// 	assertEquals(m3.getNext(), 4.4, 0.001);
	// 	assertEquals(m3.getNext(), 12.3, 0.001);
	// 	assertEquals(m3.getNext(), 3.3, 0.001);
	// 	assertEquals(m3.getNext(), 2.2, 0.001);
	// 	assertEquals(m3.getNext(), 11.4, 0.001);
	// 	assertEquals(m3.getNext(), 7.9, 0.001);
	// 	assertEquals(m3.getNext(), 7.5, 0.001);
	// }
	
	// /* Test m3 */
	// @Test
	// public void test15() {
	// 	assertEquals(m3.getNext(), 2.9, 0.001);
	// 	assertEquals(m3.getNext(), 6.6, 0.001);
	// 	assertEquals(m3.getNext(), 5.5, 0.001);
	// 	assertEquals(m3.getNext(), 1.9, 0.001);
	// 	assertEquals(m3.getNext(), 5.9, 0.001);
	// 	assertEquals(m3.getNext(), 4.4, 0.001);
	// 	assertEquals(m3.getNext(), 12.3, 0.001);
	// 	assertEquals(m3.getNext(), 3.3, 0.001);
	// 	assertEquals(m3.getNext(), 2.2, 0.001);
	// 	assertEquals(m3.getNext(), 11.4, 0.001);
	// 	assertEquals(m3.getNext(), 7.9, 0.001);
	// 	assertEquals(m3.getNext(), 7.5, 0.001);
	// 	assertEquals(m3.getNext(), 9.9, 0.001);
	// }
	
	// /* Test m3 */
	// @Test
	// public void test16() {
	// 	assertEquals(m3.getNext(), 2.9, 0.001);
	// 	assertEquals(m3.getNext(), 6.6, 0.001);
	// 	assertEquals(m3.getNext(), 5.5, 0.001);
	// 	assertEquals(m3.getNext(), 1.9, 0.001);
	// 	assertEquals(m3.getNext(), 5.9, 0.001);
	// 	assertEquals(m3.getNext(), 4.4, 0.001);
	// 	assertEquals(m3.getNext(), 12.3, 0.001);
	// 	assertEquals(m3.getNext(), 3.3, 0.001);
	// 	assertEquals(m3.getNext(), 2.2, 0.001);
	// 	assertEquals(m3.getNext(), 11.4, 0.001);
	// 	assertEquals(m3.getNext(), 7.9, 0.001);
	// 	assertEquals(m3.getNext(), 7.5, 0.001);
	// 	assertEquals(m3.getNext(), 9.9, 0.001);
	// 	assertEquals(m3.getNext(), 8.9, 0.001);
	// }
	
	// /* Test m3 */
	// @Test
	// public void test17() {
	// 	assertEquals(m3.getNext(), 2.9, 0.001);
	// 	assertEquals(m3.getNext(), 6.6, 0.001);
	// 	assertEquals(m3.getNext(), 5.5, 0.001);
	// 	assertEquals(m3.getNext(), 1.9, 0.001);
	// 	assertEquals(m3.getNext(), 5.9, 0.001);
	// 	assertEquals(m3.getNext(), 4.4, 0.001);
	// 	assertEquals(m3.getNext(), 12.3, 0.001);
	// 	assertEquals(m3.getNext(), 3.3, 0.001);
	// 	assertEquals(m3.getNext(), 2.2, 0.001);
	// 	assertEquals(m3.getNext(), 11.4, 0.001);
	// 	assertEquals(m3.getNext(), 7.9, 0.001);
	// 	assertEquals(m3.getNext(), 7.5, 0.001);
	// 	assertEquals(m3.getNext(), 9.9, 0.001);
	// 	assertEquals(m3.getNext(), 8.9, 0.001);
	// 	assertEquals(m3.getNext(), 1.1, 0.001);
	// }
	
	// /* Test m4 */
	// @Test
	// public void test18() {
	// 	assertEquals(m4.getNext(), 7.08, 0.001);
	// }
	
	// @Test
	// public void test19() {
	// 	assertEquals(m4.getNext(), 7.08, 0.001);
	// 	assertEquals(m4.getNext(), 28.00, 0.001);
	// }
	
	// @Test
	// public void test20() {
	// 	assertEquals(m4.getNext(), 7.08, 0.001);
	// 	assertEquals(m4.getNext(), 28.00, 0.001);
	// 	assertEquals(m4.getNext(), 13.16, 0.001);
	// }
	
	// @Test
	// public void test21() {
	// 	assertEquals(m4.getNext(), 7.08, 0.001);
	// 	assertEquals(m4.getNext(), 28.00, 0.001);
	// 	assertEquals(m4.getNext(), 13.16, 0.001);
	// 	assertEquals(m4.getNext(), 2.5, 0.001);
	// }
	
	// @Test
	// public void test22() {
	// 	assertEquals(m4.getNext(), 7.08, 0.001);
	// 	assertEquals(m4.getNext(), 28.00, 0.001);
	// 	assertEquals(m4.getNext(), 13.16, 0.001);
	// 	assertEquals(m4.getNext(), 2.5, 0.001);
	// 	assertEquals(m4.getNext(), 142.76, 0.001);
	// }
	
	// @Test
	// public void test23() {
	// 	assertEquals(m4.getNext(), 7.08, 0.001);
	// 	assertEquals(m4.getNext(), 28.00, 0.001);
	// 	assertEquals(m4.getNext(), 13.16, 0.001);
	// 	assertEquals(m4.getNext(), 2.5, 0.001);
	// 	assertEquals(m4.getNext(), 142.76, 0.001);
	// 	assertEquals(m4.getNext(), 4.8, 0.001);
	// }
	
	// @Test
	// public void test24() {
	// 	assertEquals(m4.getNext(), 7.08, 0.001);
	// 	assertEquals(m4.getNext(), 28.00, 0.001);
	// 	assertEquals(m4.getNext(), 13.16, 0.001);
	// 	assertEquals(m4.getNext(), 2.5, 0.001);
	// 	assertEquals(m4.getNext(), 142.76, 0.001);
	// 	assertEquals(m4.getNext(), 4.8, 0.001);
	// 	assertEquals(m4.getNext(), 1.03, 0.001);
	// }
	
	// @Test
	// public void test25() {
	// 	assertEquals(m4.getNext(), 7.08, 0.001);
	// 	assertEquals(m4.getNext(), 28.00, 0.001);
	// 	assertEquals(m4.getNext(), 13.16, 0.001);
	// 	assertEquals(m4.getNext(), 2.5, 0.001);
	// 	assertEquals(m4.getNext(), 142.76, 0.001);
	// 	assertEquals(m4.getNext(), 4.8, 0.001);
	// 	assertEquals(m4.getNext(), 1.03, 0.001);
	// 	assertEquals(m4.getNext(), 17.64, 0.001);
	// }
	
	// @Test
	// public void test26() {
	// 	assertEquals(m4.getNext(), 7.08, 0.001);
	// 	assertEquals(m4.getNext(), 28.00, 0.001);
	// 	assertEquals(m4.getNext(), 13.16, 0.001);
	// 	assertEquals(m4.getNext(), 2.5, 0.001);
	// 	assertEquals(m4.getNext(), 142.76, 0.001);
	// 	assertEquals(m4.getNext(), 4.8, 0.001);
	// 	assertEquals(m4.getNext(), 1.03, 0.001);
	// 	assertEquals(m4.getNext(), 17.64, 0.001);
	// 	assertEquals(m4.getNext(), 0.0615, 0.001);
	// }
	
	// @Test
	// public void test27() {
	// 	assertEquals(m4.getNext(), 7.08, 0.001);
	// 	assertEquals(m4.getNext(), 28.00, 0.001);
	// 	assertEquals(m4.getNext(), 13.16, 0.001);
	// 	assertEquals(m4.getNext(), 2.5, 0.001);
	// 	assertEquals(m4.getNext(), 142.76, 0.001);
	// 	assertEquals(m4.getNext(), 4.8, 0.001);
	// 	assertEquals(m4.getNext(), 1.03, 0.001);
	// 	assertEquals(m4.getNext(), 17.64, 0.001);
	// 	assertEquals(m4.getNext(), 0.0615, 0.001);
	// 	assertEquals(m4.getNext(), 19.95, 0.001);
	// }
	
	// @Test
	// public void test28() {
	// 	assertEquals(m4.getNext(), 7.08, 0.001);
	// 	assertEquals(m4.getNext(), 28.00, 0.001);
	// 	assertEquals(m4.getNext(), 13.16, 0.001);
	// 	assertEquals(m4.getNext(), 2.5, 0.001);
	// 	assertEquals(m4.getNext(), 142.76, 0.001);
	// 	assertEquals(m4.getNext(), 4.8, 0.001);
	// 	assertEquals(m4.getNext(), 1.03, 0.001);
	// 	assertEquals(m4.getNext(), 17.64, 0.001);
	// 	assertEquals(m4.getNext(), 0.0615, 0.001);
	// 	assertEquals(m4.getNext(), 19.95, 0.001);
	// 	assertEquals(m4.getNext(), 6.87, 0.001);
	// }
	
	// @Test
	// public void test29() {
	// 	assertEquals(m4.getNext(), 7.08, 0.001);
	// 	assertEquals(m4.getNext(), 28.00, 0.001);
	// 	assertEquals(m4.getNext(), 13.16, 0.001);
	// 	assertEquals(m4.getNext(), 2.5, 0.001);
	// 	assertEquals(m4.getNext(), 142.76, 0.001);
	// 	assertEquals(m4.getNext(), 4.8, 0.001);
	// 	assertEquals(m4.getNext(), 1.03, 0.001);
	// 	assertEquals(m4.getNext(), 17.64, 0.001);
	// 	assertEquals(m4.getNext(), 0.0615, 0.001);
	// 	assertEquals(m4.getNext(), 19.95, 0.001);
	// 	assertEquals(m4.getNext(), 6.87, 0.001);
	// 	assertEquals(m4.getNext(), 1.33, 0.001);
	// }
	
	// @Test
	// public void test30() {
	// 	assertEquals(m4.getNext(), 7.08, 0.001);
	// 	assertEquals(m4.getNext(), 28.00, 0.001);
	// 	assertEquals(m4.getNext(), 13.16, 0.001);
	// 	assertEquals(m4.getNext(), 2.5, 0.001);
	// 	assertEquals(m4.getNext(), 142.76, 0.001);
	// 	assertEquals(m4.getNext(), 4.8, 0.001);
	// 	assertEquals(m4.getNext(), 1.03, 0.001);
	// 	assertEquals(m4.getNext(), 17.64, 0.001);
	// 	assertEquals(m4.getNext(), 0.0615, 0.001);
	// 	assertEquals(m4.getNext(), 19.95, 0.001);
	// 	assertEquals(m4.getNext(), 6.87, 0.01);
	// 	assertEquals(m4.getNext(), 1.33, 0.001);
	// 	assertEquals(m4.getNext(), 0.97, 0.001);
	// }
	
	// @Test
	// public void test31() {
	// 	assertEquals(m4.getNext(), 7.08, 0.001);
	// 	assertEquals(m4.getNext(), 28.00, 0.001);
	// 	assertEquals(m4.getNext(), 13.16, 0.001);
	// 	assertEquals(m4.getNext(), 2.5, 0.001);
	// 	assertEquals(m4.getNext(), 142.76, 0.001);
	// 	assertEquals(m4.getNext(), 4.8, 0.001);
	// 	assertEquals(m4.getNext(), 1.03, 0.001);
	// 	assertEquals(m4.getNext(), 17.64, 0.001);
	// 	assertEquals(m4.getNext(), 0.0615, 0.001);
	// 	assertEquals(m4.getNext(), 19.95, 0.001);
	// 	assertEquals(m4.getNext(), 6.87, 0.001);
	// 	assertEquals(m4.getNext(), 1.33, 0.001);
	// 	assertEquals(m4.getNext(), 0.97, 0.001);
	// 	assertEquals(m4.getNext(), 0.062, 0.001);
	// }
	
	// @Test
	// public void test32() {
	// 	assertEquals(m4.getNext(), 7.08, 0.001);
	// 	assertEquals(m4.getNext(), 28.00, 0.001);
	// 	assertEquals(m4.getNext(), 13.16, 0.001);
	// 	assertEquals(m4.getNext(), 2.5, 0.001);
	// 	assertEquals(m4.getNext(), 142.76, 0.001);
	// 	assertEquals(m4.getNext(), 4.8, 0.001);
	// 	assertEquals(m4.getNext(), 1.03, 0.001);
	// 	assertEquals(m4.getNext(), 17.64, 0.001);
	// 	assertEquals(m4.getNext(), 0.0615, 0.001);
	// 	assertEquals(m4.getNext(), 19.95, 0.001);
	// 	assertEquals(m4.getNext(), 6.87, 0.001);
	// 	assertEquals(m4.getNext(), 1.33, 0.001);
	// 	assertEquals(m4.getNext(), 0.97, 0.001);
	// 	assertEquals(m4.getNext(), 0.062, 0.001);
	// 	assertEquals(m4.getNext(), 5.25, 0.001);
	// }	
	
	// @Test
	// public void print_m3() {
	// 	System.out.println("printing m3");
	// 	for (int i = 0; i < 15; i++) {
	// 		System.out.println(c3.getNext());
	// 	}
	// }
	
	// @Test
	// public void print_m4() {
	// 	System.out.println("----------------------------");
	// 	System.out.println("printing m4");
	// 	for (int i = 0; i < 15; i++) {
	// 		System.out.println(c4.getNext());
	// 	}
	// }
	
}
