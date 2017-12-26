package entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Publisher {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	@OneToMany(mappedBy = "publisher")
	private List<Book> books;

	protected Publisher() {
	}

	public Publisher(String name) {
		this.name = name;
	}

}
