package com.cooksys.schema.person;

public class Interests {
	private String title;
	private Long inter_id;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Long getInter_id() {
		return inter_id;
	}
	public void setInter_id(Long inter_id) {
		this.inter_id = inter_id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((inter_id == null) ? 0 : inter_id.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Interests other = (Interests) obj;
		if (inter_id == null) {
			if (other.inter_id != null)
				return false;
		} else if (!inter_id.equals(other.inter_id))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Interests [title=" + title + ", inter_id=" + inter_id + "]";
	}
	
	
}
