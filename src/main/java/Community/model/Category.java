package Community.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "category")
public class Category {

	 String name;
	 String path;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}
