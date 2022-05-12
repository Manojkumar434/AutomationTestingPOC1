package BackEndPOC1.BackEndPOC1;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class BackEndPoc1ApplicationTests 
{	
	@MockBean
	ResourceRepository repo;
	
	@Autowired
	ResourceService service;
	
	@Test
	public  void testList1()
	{
		Resource res1=new Resource(62327,"Manojkumar",21,3.4F,"Salem",new String[] {"React","HTML","MUI","BS"});
		Resource res2=new Resource(822232,"Pavithra",23,5.4F,"bangalore",new String[] {"Python","Spring","React"});
		Resource res3=new Resource(452327,"Uma",25,7.4F,"Namakkal",new String[] {"HTML","BS","JS","React"});
		Resource res4=new Resource(22327,"Aarthi",26,9.4F,"Trichy",new String[] {"Spring","Hibernate","Java"});
		
		when(repo.findAll()).thenReturn(Stream.of(res1,res2,res3,res4).collect(Collectors.toList()));
		
		//assertNotNull(service.list());
		
		assertSame("Salem",service.list().get(0).getSignArea());
	}
	@Test
	public void testList2()
	{
		Resource res1=new Resource(62327,"Manojkumar",21,3.4F,"Salem",new String[] {"React","HTML","MUI","BS"});
		Resource res2=new Resource(822232,"Pavithra",23,5.4F,"bangalore",new String[] {"Python","Spring","React"});
		
		when(repo.findAll()).thenReturn(Stream.of(res1,res2).collect(Collectors.toList()));
		
		//assertSame("Salem",service.list().get(0).getSignArea());
		//assertEquals("Salem", service.list().get(0).getSignArea());
		
		//assertNull(service.list());
	}
	
	
}
