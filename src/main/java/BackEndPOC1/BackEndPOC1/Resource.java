package BackEndPOC1.BackEndPOC1;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Resource 
{	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int signId;
	private String signFirstname;
    private int signAge;
    private Float signSalary;
    private String signArea;
    private String[] signSkills;
	
	public Resource(int signId, String signFirstname, int signAge, Float signSalary, String signArea,
			String[] signSkills) {
		super();
		this.signId = signId;
		this.signFirstname = signFirstname;
		this.signAge = signAge;
		this.signSalary = signSalary;
		this.signArea = signArea;
		this.signSkills = signSkills;
	}
	public Resource(String signFirstname, int signAge, Float signSalary, String signArea, String[] signSkills) {
		super();
		this.signFirstname = signFirstname;
		this.signAge = signAge;
		this.signSalary = signSalary;
		this.signArea = signArea;
		this.signSkills = signSkills;
	}
	@Override
	public String toString() {
		return "Resource [signId=" + signId + ", signFirstname=" + signFirstname + ", signAge=" + signAge
				+ ", signSalary=" + signSalary + ", signArea=" + signArea + ", signSkills="
				+ Arrays.toString(signSkills) + "]";
	}
	public int getSignId() {
		return signId;
	}
	public void setSignId(int signId) {
		this.signId = signId;
	}
	public String getSignFirstname() {
		return signFirstname;
	}
	public void setSignFirstname(String signFirstname) {
		this.signFirstname = signFirstname;
	}
	public int getSignAge() {
		return signAge;
	}
	public void setSignAge(int signAge) {
		this.signAge = signAge;
	}
	public Float getSignSalary() {
		return signSalary;
	}
	public void setSignSalary(Float signSalary) {
		this.signSalary = signSalary;
	}
	public String getSignArea() {
		return signArea;
	}
	public void setSignArea(String signArea) {
		this.signArea = signArea;
	}
	public String[] getSignSkills() {
		return signSkills;
	}
	public void setSignSkills(String[] signSkills) {
		this.signSkills = signSkills;
	}
}
