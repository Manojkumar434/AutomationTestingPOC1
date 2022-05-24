package BackEndPOC1.BackEndPOC1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@Configuration
public class EntryExit extends WebSecurityConfigurerAdapter
{
	@Autowired
	AuthoritiesService service;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.userDetailsService(service).passwordEncoder(getEncode());
		
		auth.inMemoryAuthentication().withUser("Manoj").
		password(getEncode().encode("Manoj123")).roles("ADMIN");
	}
	@Bean
	public PasswordEncoder getEncode()
	{
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.authorizeRequests().anyRequest().authenticated();
		http.httpBasic();
		http.formLogin();
		http.csrf().disable();
	}
	
	
}
