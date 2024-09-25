package com.dsdJobApp.JobApp.service;

import com.dsdJobApp.JobApp.model.JobPost;
import com.dsdJobApp.JobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobPost) {
        repo.save(jobPost);
    }

    public List<JobPost> getAllJobs() {
        return repo.findAll();
    }

    public JobPost getJob(int postId) {
        return repo.findById(postId).orElse(new JobPost());
    }

    public void updateJob(JobPost job) {
        repo.save(job);
    }

    public void deleteJob(int postId) {
        repo.deleteById(postId);
    }

    public void load() {
        List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Java1 Developer", "Must have experience in core Java", 3, List.of("Java", "JavaScript", "TypeScript", "SpringBoot")),
            new JobPost(2, "Java2 Developer", "Must have experience in core Java", 3, List.of("Java", "JavaScript", "TypeScript", "SpringBoot")),
            new JobPost(3, "Java3 Developer", "Must have experience in core Java", 3, List.of("Java", "JavaScript", "TypeScript", "SpringBoot")),
            new JobPost(4, "Java4 Developer", "Must have experience in core Java", 3, List.of("Java", "JavaScript", "TypeScript", "SpringBoot"))
        ));

        repo.saveAll(jobs);
    }
}
