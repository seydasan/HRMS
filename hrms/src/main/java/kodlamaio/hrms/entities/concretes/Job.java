package kodlamaio.hrms.entities.concretes;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="jobs")
public class Job 
{
	@Id
	@GeneratedValue
	@Column(name="id")
	public int id;
	
	@Column(name="name")
	public String name;
	
	public Job() {}
	public Job(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}
