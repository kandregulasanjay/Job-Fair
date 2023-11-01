package data.graduate.JobFair.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import data.graduate.JobFair.Entity.Job;
import data.graduate.JobFair.Service.JobService;

@RestController
@RequestMapping("/job")
public class JobController {
	
	JobService jobService;
	
	public JobController(JobService jobService) {
		this.jobService=jobService;
	}
	
	@GetMapping
	public List<Job> getAllJobsDetails(){
		return jobService.getAllJobs();
	}

	@GetMapping("{jobId}")
	public Job getJobDetails(@PathVariable("jobId") Integer jobId) {
	    return jobService.getJob(jobId);
	}
	
	@PostMapping
	public String createJobDetails(@RequestBody Job job) {		
		jobService.createJob(job);
		return "Created Successfully";
		
	}
	
	@PutMapping
	public String updateJobDetails(@RequestBody Job job) {		
		jobService.updateJob(job);
		return "Updated Successfully";
		
	}
	
	@DeleteMapping("{jobId}")
	public String deleteJobDetails(@PathVariable("jobId") Integer jobId) {
		jobService.deleteJob(jobId);
		return "Deleted Successfully";
	}
}
