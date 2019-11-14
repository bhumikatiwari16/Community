package Community.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Community.model.Post;
import Community.service.PostService;

@RestController
public class PostController {

	@Autowired
	private PostService postService;

	@RequestMapping(path="/posts", method = RequestMethod.POST)
	public String create(@RequestParam Date timestamp, @RequestParam String title, @RequestParam String body,
			@RequestParam String author, @RequestParam String category, @RequestParam int voteScore,
			@RequestParam boolean deleted, @RequestParam int commentCount) {
		Post p = postService.create(timestamp, title, body, author, category, voteScore, deleted, commentCount);
		return p.toString();
	}

	@RequestMapping(path = "/posts", method = RequestMethod.GET)
	public List<Post> getAll() {
		return postService.getAll();
	}
}