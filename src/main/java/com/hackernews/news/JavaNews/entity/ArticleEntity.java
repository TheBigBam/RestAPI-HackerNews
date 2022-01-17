package com.hackernews.news.JavaNews.entity;

import java.util.Date;
import java.util.List;

public class ArticleEntity {
    
    public Date created_at;

    public String title;

    public String url;

    public Integer points;

    public String story_text;

    public String comment_text;

    public Integer num_comments;

    public Integer story_id;

    public String story_title;
    
    public String story_url;

    public Integer parent_id;

    public List<String> _tags;

    public HighlightResultEntity _highlightResult;

}
