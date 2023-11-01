package data.graduate.JobFair.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import data.graduate.JobFair.Entity.Job;
import data.graduate.JobFair.Repository.JobRepository;
import data.graduate.JobFair.Service.JobService;

@Service
public class JobServiceImpl implements JobService {
	
	JobRepository jobRepository;
	
	public JobServiceImpl(JobRepository jobRepository) {
		this.jobRepository=jobRepository;
	}

	@Override
	public String createJob(Job job) {
		jobRepository.save(job);
		return ("Successfully Created");
	}

	@Override
	public String updateJob(Job job) {
		jobRepository.save(job);
		return ("Successfully Updated");
	}

	@Override
	public List<Job> getAllJobs() {
		return jobRepository.findAll();
	}

	@Override
	public Job getJob(Integer jobId) {
		return jobRepository.findById(jobId).get();
		}

	@Override
	public  String deleteJob(Integer jobId) {
		 jobRepository.deleteById(jobId);
		 return "Successfully Deleted";
	}

}
