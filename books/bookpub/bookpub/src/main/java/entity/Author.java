package entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Author {
	@Id
	@GeneratedValue
	private Long id;
	private String firstName;
	private String lastName;
	@OneToMany (mappedBy = "author")
	private List<Book> books;
	
	protected Author(){}
	
	public Author (String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
}
