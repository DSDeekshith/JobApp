package com.dsdJobApp.JobApp.repo;

import com.dsdJobApp.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Java1 Developer", "Must have experience in core Java", 3, List.of("Java", "JavaScript", "TypeScript", "SpringBoot")),
            new JobPost(2, "Java2 Developer", "Must have experience in core Java", 3, List.of("Java", "JavaScript", "TypeScript", "SpringBoot")),
            new JobPost(3, "Java3 Developer", "Must have experience in core Java", 3, List.of("Java", "JavaScript", "TypeScript", "SpringBoot")),
            new JobPost(4, "Java4 Developer", "Must have experience in core Java", 3, List.of("Java", "JavaScript", "TypeScript", "SpringBoot"))
    ));

    public List<JobPost> getAllJobs() {
        System.out.println(jobs);
        return jobs;
    }

    public void addJob(JobPost job) {
        jobs.add(job);
    }

    public JobPost getJob(int postId) {

        for(JobPost job: jobs){
            if(job.getPostId() == postId) {
                return job;
            }
        }

        return null;
    }

    public void updateJob(JobPost jobPost) {
        for(JobPost jobPost1 : jobs) {
            if(jobPost1.getPostId() == jobPost.getPostId()){
                jobPost1.setPostProfile(jobPost.getPostProfile());
                jobPost1.setPostDesc(jobPost.getPostDesc());
                jobPost1.setReqExperience(jobPost.getReqExperience());
                jobPost1.setPostTechStack(jobPost.getPostTechStack());
            }
        }
    }

    public void deleteJob(int postId) {
        for(JobPost jobPost : jobs) {
            if(jobPost.getPostId() == postId){
                jobs.remove(jobPost);
            }
        }
    }

}
