package BackEndPOC1.BackEndPOC1;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ResourceController 
{
	@Autowired
	ResourceService service;
	
	@PostMapping("/newone")
	public String makeCreate(@RequestBody Resource res)
	{
		return service.create(res).getSignFirstname()+" has recruited successfully added in database";
	}
	@GetMapping("/home")
	public List<Resource> makeList()
	{
		return service.list();
	}
	@GetMapping("/update")
	public String makeUpdate(@RequestBody Resource res)
	{
		return service.create(res).getSignFirstname()+"has Updated";
	}
	@DeleteMapping("/del/{unique}")
	public String makeRemove(@PathVariable("unique") int unique)
	{
		return service.remove(unique);
	}
	@GetMapping("/getting/{quiz}")
	public Optional<Resource> makeRead(@PathVariable("quiz") int quiz)
	{
		return service.read(quiz);
	}
}
