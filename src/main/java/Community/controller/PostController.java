package Community.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Community.model.Post;
import Community.service.PostService;

@RestController
public class PostController {
	public static final Logger logger = LoggerFactory.getLogger(PostController.class);

	@Autowired
	private PostService postService;

	@PostMapping(path = "/posts")
	public String create(@RequestBody Post post) {

		Post p = postService.create(post);
		logger.info("Creating Post : {}");
		System.out.println("ID is " + p._id);

		return p._id;
	}

	@RequestMapping(path = "/posts")
	public List<Post> getAll() {
		return postService.getAll();
	}
}