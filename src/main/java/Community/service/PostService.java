package Community.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
		public List<Post> getByCategory(String category) {
			return postRepository.findByCategory(category);
		}
		//Delete operation
		public void deleteAll() {
			postRepository.deleteAll();
		}
		
}
