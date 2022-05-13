package BackEndPOC1.BackEndPOC1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Optional;
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
		
		assertSame("Salem",service.list().get(0).getSignArea());
	}
	@Test
	public void testList3()
	{
		Resource res1=new Resource(62327,"Manojkumar",21,3.4F,"Salem",new String[] {"React","HTML","MUI","BS"});
		Resource res2=new Resource(822232,"Pavithra",23,5.4F,"bangalore",new String[] {"Python","Spring","React"});
		Resource res3=new Resource(452327,"Uma",25,7.4F,"Namakkal",new String[] {"HTML","BS","JS","React"});
		Resource res4=new Resource(22327,"Aarthi",26,9.4F,"Trichy",new String[] {"Spring","Hibernate","Java"});
		
		when(repo.findAll()).thenReturn(Stream.of(res1,res2,res3,res4).collect(Collectors.toList()));
		
		assertTrue(Arrays.toString(service.list().get(1).getSignSkills()).contains("Spring"));
	}
	@Test
	public void testCreate()
	{
		Resource res1=new Resource(62327,"Manojkumar",21,3.4F,"Salem",new String[] {"React","HTML","MUI","BS"});
		Resource res2=new Resource(822232,"Pavithra",23,5.4F,"bangalore",new String[] {"Python","Spring","React"});
		
		when(repo.save(res1)).thenReturn(res1);
		
		assertNotSame("Annamalai", service.create(res1).getSignFirstname());
	}
	
	@Test
	public void testRead()
	{
		Optional<Resource> res1=Optional.of(new Resource(62327,"Manojkumar",21,3.4F,"Salem",new String[] {"React","HTML","MUI","BS"}));
		Optional<Resource> res2=Optional.of(new Resource(6232457,"Swathy",23,43.4F,"Hosur",new String[] {"Blood test","HTML","CSS","BS"}));
		
		when(repo.findById(62327)).thenReturn(res1);
		
		assertTrue(service.read(62327).get().getSignSalary()<5.5F);
	}
}
