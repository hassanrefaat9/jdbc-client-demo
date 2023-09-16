package io.nerd.jdbcclientdemo.post;

import java.util.List;
import java.util.Optional;

public interface PostService {
    List<Post> findAll();

    Optional<Post> findById(String id);

    void createPost(Post post);

    void updatePost(String id);

    void deletePost(String id);
}
