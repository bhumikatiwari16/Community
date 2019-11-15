package Community.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import Community.model.Post;
@Repository
public interface PostRepository extends MongoRepository<Post, Integer> {

	public List<Post> findByCategory(String category);
}
