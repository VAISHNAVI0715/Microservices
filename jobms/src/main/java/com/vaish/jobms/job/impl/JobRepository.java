package com.vaish.jobms.job.impl;


import com.vaish.jobms.job.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {


}
