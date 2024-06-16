package com.Job.Jobsearch.controller;

import com.Job.Jobsearch.repositary.PostRepositary;
import com.Job.Jobsearch.model.Post;
import com.Job.Jobsearch.repositary.searchrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class PostController {


    @Autowired
    PostRepositary repo;
    @Autowired
    searchrepo  srepo;



    @GetMapping("/p")
public List<Post> getAllPosts()
{
    return repo.findAll();
}


@PostMapping("/post")
public Post addPost(@RequestBody Post post)
{
   return repo.save(post);
}
@GetMapping("/p/{text}")
public  List<Post> search(@PathVariable String text)
{
    return srepo.findByText(text);
}
}
