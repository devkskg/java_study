package com.gn.practice05;

import java.util.Objects;

public class Song01 {
	public String name;
	public String singer;
	public Song01() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Song01(String name, String singer) {
		super();
		this.name = name;
		this.singer = singer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, singer);
	}
	
	public boolean equals(Object o) {
		boolean result = false;
		if(o instanceof Song01) {
			Song01 other = (Song01) o;
			if(other.singer.equals(singer) && other.name.equals(name)) {
				result = true;
			}
		}
		return result;
	}
	
	
	
	@Override
	public String toString() {
		return "노래=" + name + ",가수=" + singer;
	}
	
	
}
