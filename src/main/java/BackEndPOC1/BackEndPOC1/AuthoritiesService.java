package BackEndPOC1.BackEndPOC1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AuthoritiesService implements UserDetailsService
{
	@Autowired
	AuthoritiesRepositary repo;
	
	public Authorities createUser(Authorities authorities)
	{
		return repo.save(authorities);
	}
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Authorities auth= repo.findByUsername(username);
		if(auth==null)
		{
			throw new UsernameNotFoundException(username);
		}
		return auth;
	}

}
