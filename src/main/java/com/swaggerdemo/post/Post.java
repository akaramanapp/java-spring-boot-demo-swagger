package com.swaggerdemo.post;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value ="Post DTO", description ="Post Data Transfer Object")
public class Post {
    public Post(Long id, String title, String bodyText) {
        this.id = id;
        this.title = title;
        this.bodyText = bodyText;
    }

    @ApiModelProperty(value="Post dto Id alanı.", required = true)
    public Long id;

    @ApiModelProperty(value="Post dto title alanı.", required = true)
    public String title;

    @ApiModelProperty(value="Post dto bodytextalanı.", required = true)
    public String bodyText;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBodyText() {
        return bodyText;
    }

    public void setBodyText(String bodyText) {
        this.bodyText = bodyText;
    }
}
