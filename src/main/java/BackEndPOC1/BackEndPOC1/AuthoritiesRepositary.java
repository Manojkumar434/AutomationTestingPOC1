package BackEndPOC1.BackEndPOC1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthoritiesRepositary extends JpaRepository<Authorities, Integer>
{
	public Authorities findByUsername(String username);

}
