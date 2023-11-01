package data.graduate.JobFair.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import data.graduate.JobFair.Entity.Job;

public interface JobRepository extends JpaRepository<Job, Integer>{

}
