package data.graduate.JobFair.Service;

import java.util.List;

import data.graduate.JobFair.Entity.Job;

public interface JobService {
	
	public String createJob(Job job);
	
	public String updateJob(Job job);
	
	public List<Job> getAllJobs();
	
	public Job getJob(Integer jobId);
	
	public String deleteJob(Integer jobId); 

}
