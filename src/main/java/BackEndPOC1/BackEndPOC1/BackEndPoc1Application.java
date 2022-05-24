package BackEndPOC1.BackEndPOC1;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class BackEndPoc1Application {
	@Autowired
	AuthoritiesService serv;
	
	@Autowired
	PasswordEncoder encoder;

	public static void main(String[] args) {
		SpringApplication.run(BackEndPoc1Application.class, args);
	}
//	@PostConstruct
//	public void hai()
//	{
//	
//		Authorities auth1=new Authorities("Manojkumar",encoder.encode("Manojkumar123"),9789355930L,"Manojkumar123@gmail.com");
//		Authorities auth2=new Authorities("Pavithra",encoder.encode("Pavithra123"),8933455930L,"Pavithra123@gmail.com");
//		 serv.createUser(auth1);
//		 serv.createUser(auth2);
//	}
}
