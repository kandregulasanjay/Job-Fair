package data.graduate.JobFair.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="job_fair")
public class Job {

	@Id
	private Integer jobId;
	private String Company;
	private String Location;
	private String Role;
	private String Qualification;
	private String Experience;
	
	public Job() {
		
	}

	public Job(int jobId, String company, String location, String role, String qualification, String experience) {
		super();
		this.jobId = jobId;
		Company = company;
		Location = location;
		Role = role;
		Qualification = qualification;
		Experience = experience;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public String getQualification() {
		return Qualification;
	}

	public void setQualification(String qualification) {
		Qualification = qualification;
	}

	public String getExperience() {
		return Experience;
	}

	public void setExperience(String experience) {
		Experience = experience;
	}

	@Override
	public String toString() {
		return "Job [jobId=" + jobId + ", Company=" + Company + ", Location=" + Location + ", Role=" + Role
				+ ", Qualification=" + Qualification + ", Experience=" + Experience + "]";
	}
	
	
}
