package com.Job.Jobsearch.repositary;

import com.Job.Jobsearch.model.Post;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Component
public class searchrepoimpl implements searchrepo{

    @Autowired
    MongoClient client;
    @Autowired
    MongoConverter converted;
    @Override
    public List<Post> findByText(String text) {
       final List<Post>posts = new ArrayList<>();


        MongoDatabase database = client.getDatabase("JobList");
        MongoCollection<Document> collection = database.getCollection("Joblisting");
        AggregateIterable<Document> result = collection.aggregate(Arrays.asList(new Document("$search", new Document("text", new Document("query", text).append("path",new Document("wildcard", "*")))), new Document("$sort", new Document("exp", 1L)), new Document("$limit", 2L)));
        result.forEach(document -> posts.add(converted.read(Post.class,document)));
       return posts;
    }
}
