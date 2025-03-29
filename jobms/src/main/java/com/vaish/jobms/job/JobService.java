package com.vaish.jobms.job;

import java.util.List;
import com.vaish.jobms.job.dto.JobDTO;
public interface JobService {



    List<JobDTO> findAll();

    void createJob(Job job);

    JobDTO getJobById(Long id);

    boolean deleteJobByid(Long id);

    boolean updateJob(Long id, Job updatedJob);


}

