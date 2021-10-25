package com.java.spring.si.map.dependent;

public class Landmark {

	private String mark;
	private String locality;

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	@Override
	public String toString() {
		return "Landmark [mark=" + mark + ", locality=" + locality + "]";
	}

}
