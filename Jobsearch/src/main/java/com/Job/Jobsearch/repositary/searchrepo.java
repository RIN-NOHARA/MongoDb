package com.Job.Jobsearch.repositary;

import com.Job.Jobsearch.model.Post;

import java.util.List;

public interface searchrepo {
    List<Post> findByText(String text);
}
