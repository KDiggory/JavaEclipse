package com.qa.mementoDesign2;

public class Originator { // This is the originator
	
	private long id;
	private String title;
	private String content;
	
	public Originator(long id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
		
	public Memento createMemento() {
		Memento m = new Memento(id, title, content);
		return m;
	}
	
	public void restore(Memento m) {
		this.id = m.getId();
		this.title = m.getTitle();
		this.content = m.getContent();
	}
	

	
	
	// Plus getters and setters as well as toString method 
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Article [The id:" + id + ", The title: " + title + ", The content:" + content + "]";
	}

}
