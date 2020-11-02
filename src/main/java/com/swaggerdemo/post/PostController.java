package com.swaggerdemo.post;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/post")
@Api(value = "Post API Dökümantasyonu")
public class PostController {

    private List<Post> postList = new ArrayList<Post>();

    @PostConstruct
    public void init() {
        postList.add(new Post( 1L, "Lorem Ipsum is simply dummy text", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. "));
    }

    @GetMapping()
    @ApiOperation(value="Post listesi döner")
    public ResponseEntity<List<Post>> getPosts() {
        return ResponseEntity.ok(postList);
    }

    @PostMapping()
    @ApiOperation(value="Post ekler.")
    public ResponseEntity<List<Post>> savePost(@RequestBody @ApiParam("Post parametresi") Post post) {
        postList.add(post);
        return ResponseEntity.ok(postList);
    }
}
