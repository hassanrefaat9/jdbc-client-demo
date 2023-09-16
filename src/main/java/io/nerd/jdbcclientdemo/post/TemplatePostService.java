package io.nerd.jdbcclientdemo.post;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TemplatePostService implements PostService{
    @Override
    public List<Post> findAll() {
        return null;
    }

    @Override
    public Optional<Post> findById(String id) {
        return Optional.empty();
    }

    @Override
    public void createPost(Post post) {

    }

    @Override
    public void updatePost(String id) {

    }

    @Override
    public void deletePost(String id) {

    }
}
