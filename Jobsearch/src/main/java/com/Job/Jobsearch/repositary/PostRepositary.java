package com.Job.Jobsearch.repositary;

import com.Job.Jobsearch.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepositary extends MongoRepository<Post,String> {

}
