package com.dsdJobApp.JobApp.service;

import com.dsdJobApp.JobApp.model.JobPost;
import com.dsdJobApp.JobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public JobPost addJob(JobPost jobPost) {
        repo.addJob(jobPost);
        return repo.getJob(jobPost.getPostId());
    }

    public List<JobPost> getAllJobs() {
        return repo.getAllJobs(); 
    }

    public JobPost getJob(int postId) {
        return repo.getJob(postId);
    }

    public void updateJob(JobPost job) {
        repo.updateJob(job);
    }

    public void deleteJob(int postId) {
        repo.deleteJob(postId);
    }

}
