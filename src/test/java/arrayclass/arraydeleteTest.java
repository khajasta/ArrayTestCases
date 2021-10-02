package arrayclass;

//import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class arraydeleteTest {

	 int [] array;

	@Before
	public void setUp() throws Exception {
		array=new int [4];
		for(int i=0;i<array.length;i++)
			array[i]=i+1;
	}

	@After
	public void tearDown() throws Exception {
		arraydelete.display(array);
	}
     @Test 
     public void deleteelement()
     {
    	 arraydelete.delete(array,0);
     }
	@Test	
	public void test() {
		arraydelete.delete(array,0);
		 int [] arrayone=new int [4];
		arrayone[0]=2;
		arrayone[1]=3;
		arrayone[2]=4;
		arrayone[3]=-1;
		Assert.assertArrayEquals(arrayone, array);
	}
	@Test
    public void decrementsizeondeletion()
    {
		 arraydelete.delete(array,1);
		 int sizeofarray=array.length;
		 //when an element is deleted size should be reduced
		 Assert.assertEquals(3, sizeofarray);
     }
	@Test(timeout=100)
	public void checktimeout()
	 {
		 arraydelete.delete(array,-1);
	 }
	@Test(expected=IndexOutOfBoundsException.class)
    public void outOfBounds() {
			//code should throw exception when outofbound index is accessed
		 arraydelete.delete(array,-1);
		 arraydelete.delete(array,1000);
      }
	@Test
	public void test3()
	  {
		Assert.assertFalse(4>array.length);
		Assert.assertTrue(4==array.length);
		
	   }
	@Test
	public void test4()
	{
		float [] arrayone=new float[4];
		Assert.assertNotNull(array);
		Assert.assertNotEquals(array, arrayone);
	}
	}
    

