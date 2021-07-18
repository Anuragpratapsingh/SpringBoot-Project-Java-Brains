package org.springBootApp.topics;

public class topics {
	private int id;
	private String subject;
	private String teacher;
	
	public topics(int id, String subject, String teacher) {
		super();
		this.id = id;
		this.subject = subject;
		this.teacher = teacher;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

}
