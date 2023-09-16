package io.nerd.jdbcclientdemo.post;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

@Service
public class ClientPostService implements PostService {
    private final JdbcClient jdbcClient;
    public ClientPostService(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }
    @Override
    public List<Post> findAll() {
        return jdbcClient.sql("SELECT * FROM posts")
                .query(Post.class)
                .list();
    }
    @Override
    public Optional<Post> findById(String id) {
        return jdbcClient.sql("SELECT * FROM posts WHERE id = :id")
                .param("id", id)
                .query(Post.class)
                .optional();
    }
    @Override
    public void createPost(Post post) {
        int update = jdbcClient.sql("INSERT INTO posts (id, title, slug, date, time_to_read, tags) VALUES (:id, :title, :slug, :date, :timeToRead, :tags)")
                .param("id", post.id())
                .param("title", post.title())
                .param("slug", post.slug())
                .param("date", post.date())
                .param("timeToRead", post.timeToRead())
                .param("tags", post.tags())
                .update();
        Assert.state(update == 1, "failed to create post");
    }

    @Override
    public void updatePost(String id) {

    }

    @Override
    public void deletePost(String id) {

    }
}
