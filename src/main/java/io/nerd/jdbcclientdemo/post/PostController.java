package io.nerd.jdbcclientdemo.post;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    private final PostService postService;

    public PostController(ClientPostService postService) {
        this.postService = postService;
    }

    @GetMapping
    List<Post> findAll() {
        return postService.findAll();
    }

    @GetMapping("/{id}")
    Optional<Post>findById(@PathVariable String id) {
        return postService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    void createPost(@RequestBody Post post) {
        postService.createPost(post);
    }

    @PutMapping("/{id}")
    void updatePost(@PathVariable String id) {
        postService.updatePost(id);
    }

    @DeleteMapping("/{id}")
    void deletePost(@PathVariable String id) {
        postService.deletePost(id);
    }

}
