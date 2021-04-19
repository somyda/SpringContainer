package springcontainer;

import org.springframework.stereotype.Component;

@Component
public class User {
	//	Field
	private Long no;
	private String name;
	
	//	생성자
	public User() {
		
	}
	
	public User(String name) {
		this.name = name;
	}
	
	public User(Long no, String name) {
		this.no = no;
		this.name = name;
	}

	//	Getters/Setters
	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [no=" + no + ", name=" + name + "]";
	}
}