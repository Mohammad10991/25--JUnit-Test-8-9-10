import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.*;
public class OxygenBottleJUnitTest{
	private OxygenBottle   NManufacturer,NType,NId,NCapacity;
	String manufacturer = "Boeing";
	String type = "Einstahlig";
	String id = "32492�498";
	 int currentAmount = 0;
	 int capacity= 100;
	 OxygenBottle test = new  OxygenBottle(manufacturer,type,id,capacity);
@Test
  public void testVersion(){	
	
		assertEquals("32492�498-Einstahlig",test.version());
}
@Test 
   public void takeOutTestZero(){
	test.takeOut(3);
	assertEquals(0,test.getCurrentAmount());}
@Test
	 public void takeOutTestCapacity(){
	test.takeOut(-260);
	assertEquals(100,test.getCurrentAmount());}
@Test
	 public void takeOutTest(){
	test.takeOut(-3);
	assertEquals(3,test.getCurrentAmount());
	}
@Test 
public void refillCapacity(){
	test.refill(110);
	assertEquals(100,test.getCurrentAmount());
	}
@Test 
public void refillZero(){
	test.refill(-1);
	assertEquals(0,test.getCurrentAmount());
	}
@Test 
public void refill(){
	test.refill(90);
	assertEquals(90,test.getCurrentAmount());
	}
@Before
public void setUp() throws Exception {
System.out.println("Run @Before");
NManufacturer= new OxygenBottle("Airbus",null,null);
NType = new  OxygenBottle(null,"zweistahlig",null);
NId= new OxygenBottle(null,null,"09876544");
NCapacity = new  OxygenBottle(null,null,null,50);

}
@After
public void tearDownManufacturer() throws Exception {
   System.out.println("Run @After"); // for illustration
   test.refill();
   }
@Test
public void testGetterSetterManufacturer(){
   System.out.println("Run @Test testGetterSetter");
   assertEquals("Airbus",NManufacturer.getManufacturer());
   NManufacturer.setManufacturer("Boeing");
   assertEquals("Boeing",NManufacturer.getManufacturer());
}  
@Test
public void testGetterSetterType(){
   System.out.println("Run @Test testGetterSetter");
   assertEquals("zweistahlig",NType.getType());
   NType.setType("Einstahlig");
   assertEquals("Einstahlig",NType.getType());
}
@Test
public void testGetterSetterId(){
   System.out.println("Run @Test testGetterSetter");
    assertEquals("09876544",NId.getId());
    NId.setId("6653890");
   assertEquals("6653890",NId.getId());
}
@Test
public void testGetterIsActive(){
   System.out.println("Run @Test testGetterSetter");
}
@Test
public void testGettersetterCapacity() {
  System.out.println("Run @Test testGetterSetter");
  assertEquals(50,NCapacity.getCapacity());
  NCapacity.setCapacity(-2);
  assertEquals(0,NCapacity.getCapacity());
  NCapacity.setCapacity(42);
 assertEquals(42,NCapacity.getCapacity());  
} 
@Test
public void testsetCurrentAmountCapacity() {
	System.out.println("Run @Test testGetterSetter");
	assertEquals(0,test.getCurrentAmount());
	NCapacity = new OxygenBottle(null,null,null,200);
	test=new OxygenBottle(null,null,null,200);
    test.setCurrentAmount(300);
	 assertEquals(200,test.getCurrentAmount());  	  
} 
@Test
public void testsetCurrentAmountZero() {
	System.out.println("Run @Test testGetterSetter");
	test.setCurrentAmount(-4);;
	  assertEquals(0,test.getCurrentAmount());	  
} 
@Test
public void testsetCurrentAmount() {
	System.out.println("Run @Test testGetterSetter");
	test.setCurrentAmount(100);;
	  assertEquals(100,test.getCurrentAmount());	  
} 

}
