package com.dsdJobApp.JobApp;

import com.dsdJobApp.JobApp.model.JobPost;
import com.dsdJobApp.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class JobController {

    @Autowired
    private JobService service;

//    @GetMapping ({"/", "home"})
//    public String home() {
//        return "home";
//    }
//
//    @GetMapping("addjob")
//    public String addJob() {
//
//        return "addjob";
//    }

//    @PostMapping("handleForm")
//    public String handleForm(JobPost jobPost) {
//        service.addJob(jobPost);
//        return "success";
//    }

//    @RequestMapping("/success")
//    public String success() {
//        return "success";
//    }
//
    @GetMapping("/jobPosts")
    public List<JobPost> viewAllJobs(Model m) {
        return service.getAllJobs();
    }
}
