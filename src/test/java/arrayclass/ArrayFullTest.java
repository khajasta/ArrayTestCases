package arrayclass;

//import static org.junit.Assert.*;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayFullTest {
	int []array;
	@Before
	public void setUp() throws Exception {
		array=new int[100];
	      ArrayFull.array=new int [100];
		 for(int i=0;i<ArrayFull.array.length;i++)
		    	ArrayFull.array[i]=i+1;
	}

	@Test
	public void testinsert() {
	    for(int i=0;i<ArrayFull.array.length;i++)
	    	ArrayFull.insert(i+2, i);
	}
	@Test(expected=IndexOutOfBoundsException.class)
   public void testbounds()
   {
	int size=ArrayFull.array.length;
	ArrayFull.insert(2, size);
	ArrayFull.insert(2, -1);
	ArrayFull.delete(size);
	ArrayFull.delete(-1);
	ArrayFull.binarySearch(-1, -1, -2);
	ArrayFull.binarySearch(60, 50, 120);
   }
	@Test(timeout=100)
	public void testsize()
	{
		ArrayFull.bubbleSort();
	}
	@Test
	public void deleteindex()
	{
		ArrayFull.delete(99);
		ArrayFull.delete(98);
		ArrayFull.delete(97);
	    
	}
	@Test
	public void updatesizeondeletion()
	{
	    
		ArrayFull.delete(96);
		ArrayFull.delete(95);
		ArrayFull.delete(94);
	    Assert.assertEquals(94,ArrayFull.size);
	}
	@Test
	public void linearsearch()
	{
	
		Assert.assertTrue(ArrayFull.linearSearch(30));
		Assert.assertFalse(ArrayFull.linearSearch(789));
	}
	@Test 
	public void binarysearch()
	{
		Assert.assertTrue(ArrayFull.binarySearch(30, 0, 50));
		Assert.assertFalse(ArrayFull.binarySearch(-1, 0, 0));
	}
	@Test
	public void bubblesort()
	{ 
		int j=100; 
		for(int i=ArrayFull.size;i>0;i--,j++)
			{
			if(i%2==0)
			ArrayFull.array[i]=j+1;
			else 
				ArrayFull.array[i]=j+2;
			}
		ArrayFull.bubbleSort();
		for(int i=0;i<ArrayFull.size;i++){
			System.out.print(ArrayFull.array[i] + " ");
		}
	}
}
