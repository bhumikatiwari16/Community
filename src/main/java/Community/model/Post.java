package Community.model;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Post {

	@Id
	private String _id;
	
	private Date timestamp;
	private String title;

	private String body;
	private String author;
	private String category;

	private int voteScore;

	private boolean deleted;

	private int commentCount;

	public Post(Date timestamp, String title, String body, String author, String category, int voteScore,
			boolean deleted, int commentCount) {
		super();
		this.timestamp = timestamp;
		this.title = title;
		this.body = body;
		this.author = author;
		this.category = category;
		this.voteScore = voteScore;
		this.deleted = deleted;
		this.commentCount = commentCount;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getVoteScore() {
		return voteScore;
	}

	public void setVoteScore(int voteScore) {
		this.voteScore = voteScore;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public int getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}
	public String toString() {
		return "Post Category: "+category +" Post Title:"+title+" Post Dec:"+body;
	}
}
