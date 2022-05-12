package BackEndPOC1.BackEndPOC1;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ResourceService 
{
	@Autowired
	ResourceRepository repo;
	
	public Resource create(Resource resource)
	{
		return repo.save(resource);
	}
	public List<Resource> list()
	{
		return (List<Resource>)repo.findAll();
	}
}
