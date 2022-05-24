package BackEndPOC1.BackEndPOC1;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name="users")
public class Authorities implements UserDetails
{
	@Id @GeneratedValue(strategy =GenerationType.IDENTITY)
	private int aId;
	private String username;
	private String password;
	private Long contact;
	private String email;
	public Authorities() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Authorities(String username, String password, Long contact, String email) {
		super();
		this.username = username;
		this.password = password;
		this.contact = contact;
		this.email = email;
	}
	public Authorities(int aId, String username, String password, Long contact, String email) {
		super();
		this.aId = aId;
		this.username = username;
		this.password = password;
		this.contact = contact;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Authorities [aId=" + aId + ", username=" + username + ", password=" + password + ", contact=" + contact
				+ ", email=" + email + "]";
	}
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getContact() {
		return contact;
	}
	public void setContact(Long contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
}
