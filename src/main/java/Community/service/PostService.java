package Community.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import Community.model.Post;
import Community.repository.PostRepository;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;
	
		//Create operation
		public Post create(Post post) {
			return postRepository.save(post);
		}
		//Retrieve operation
		public List<Post> getAll(){
			return postRepository.findAll();
		}
		//Find by category operation
		public List<Post> findByCategory(String category) {
			return postRepository.findByCategory(category);
		}
		//Delete operation
		public void deleteAll() {
			postRepository.deleteAll();
		}
		//Sort by date operation
		public List<Post> sortByDate() {
			return postRepository.findAll(Sort.by(Sort.Direction.ASC, "timestamp"));
		}
		// operation
		public Post findPostBy_id(String _id) {
			return postRepository.findPostBy_id(_id);
		}
		
}
