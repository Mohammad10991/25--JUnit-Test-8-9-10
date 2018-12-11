import static org.junit.Assert.*;

import org.junit.*;

public class LeftNavigationLightJUniTest {
		private LeftNavigationLight NManufacturer,NId,NPosition;
        private LightType green;
		private LightType NType= green;
		private Position port, starboard;
		 String manufacturer=" Boeing";
		 LightType type= green;
		 String id ="234f";
		 Position position = port;
	    private boolean isOn;
	    LeftNavigationLight test= new LeftNavigationLight(manufacturer,type,id,position,isOn);
	   
	  @Test
	  public void versionTest(){
		 //NType=new LightType(type);
		  test = new LeftNavigationLight(null,green,null,null,false);
		  assertEquals("234f-green",test.version());
	  }
	  @Before
	  public void setUp() throws Exception{
	 	 System.out.println("Run @Before");
	 	 NManufacturer = new LeftNavigationLight("Airbus",null,null,null,false);
	 	NType = new  LeftNavigationLight(null,green,null,null,false);
	 	 NId = new LeftNavigationLight(null,null,"09825h",null,false);
	 	NPosition = new LeftNavigationLight(null,null,null,starboard,false);
	 	 isOn=true;
	 	 test.on();
	 	 
	  }
	  @After
	  public void tearDown() throws Exception{
	 	 System.out.println("Run @Test testGetterSettter");
	 	 test.off();
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
	 	 assertEquals(green,NType.getType());
	 	 NType.setType(type);
	 	 assertEquals(type,NType.getType());
	  }
	  @Test
	  public void testGetterSetterId(){
	 	 System.out.println("Run @Test testGetterSetter");
	 	 assertEquals("09825h",NId.getId());
	 	 NId.setId("980929z");
	 	 assertEquals("980929z",NId.getId());
	  }
	@Test
	public void testGetterSetterIsOn(){
		System.out.println("Run @Test testGetterSetter");
		assertEquals(true,test.getIsOn());
		test.setIsOn(false);
		assertEquals(false,test.getIsOn());
	}

	}
