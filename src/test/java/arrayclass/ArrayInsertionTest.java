package arrayclass;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;

//import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class ArrayInsertionTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	@SuppressWarnings("unused")
	private final PrintStream originalOut = System.out;
	@SuppressWarnings("unused")
	private final PrintStream originalErr = System.err;
	 int [] array;
	@Before
	public void test() throws Exception {
		
		array=new int [3];
	}
    @After
    public void later()
    {
    	array=new int[0];
    }
	@Test
	public void test1() {
    ArrayInsertion.insert(array, 0, 0);
	ArrayInsertion.insert(array, 1, 1);
    Assert.assertEquals(0, array[0]);
    Assert.assertEquals(1, array[1]);

	}
	@Test
	public void test2() {
		//negative test case 
		//the size of array is 3 so it should allow three entries
		//the code is not accepting 3 values for an array of size 3
		    ArrayInsertion.insert(array, 0, 0);
			ArrayInsertion.insert(array, 1, 1);
			ArrayInsertion.insert(array, 1, 2);

	}
	@Test(expected=IndexOutOfBoundsException.class)
    public void outOfBounds() {
			ArrayInsertion.insert(array, 1, -1);
	        ArrayInsertion.insert(array, 0, 4);
	        
		
    }
	 @Test(timeout=100)
	 public void testAssertThatNotEqual() {
	    int size=3;
	    Assert.assertNotEquals(size, ArrayInsertion.size);
	    }
	 
	 @Test 
	public void test6() {
		 float [] arraytwo=new float[3];
		 Assert.assertNotSame(arraytwo,array);
		 Assert.assertNotNull(array);
		  Assert.assertTrue(4>ArrayInsertion.size);
		 Assert.assertFalse(3<ArrayInsertion.size);
		 
		 
	 }
	
}
	    

