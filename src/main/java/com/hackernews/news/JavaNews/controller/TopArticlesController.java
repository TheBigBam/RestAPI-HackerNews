package com.hackernews.news.JavaNews.controller;

import com.hackernews.news.JavaNews.entity.ArticleEntity;
import com.hackernews.news.JavaNews.entity.TopArticlesEntity;
import com.hackernews.news.JavaNews.service.TopArticlesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/java-news")
public class TopArticlesController {

    @Autowired
    private TopArticlesService service;

    @CrossOrigin
    @GetMapping("/top")
    public List<ArticleEntity> GetTopNews(){
        return service.GetTopArticles();
    }
}
