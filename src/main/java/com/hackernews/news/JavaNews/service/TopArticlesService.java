package com.hackernews.news.JavaNews.service;

import java.util.List;

import com.hackernews.news.JavaNews.entity.ArticleEntity;
import com.hackernews.news.JavaNews.entity.TopArticlesEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TopArticlesService {
    
    @Autowired
    private Environment env;

    public List<ArticleEntity> GetTopArticles(){
        RestTemplate restTemplate = new RestTemplate();
        String url = env.getProperty("HACKER_NEWS_URL");
        TopArticlesEntity result = restTemplate.getForObject(url, TopArticlesEntity.class);
        return result.hits;
    }
}
