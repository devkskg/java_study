package com.gn.homework02;

import java.util.Objects;

public class Lottery implements Comparable<Lottery> {
	private String name;
	private String phone;

	public Lottery() {
		super();
	}

	public Lottery(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public int compareTo(Lottery other) {
		return this.name.compareTo(other.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, phone);
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj instanceof Lottery) {
			Lottery other = (Lottery) obj;
			if (other.name.equals(this.name) && other.phone.equals(this.phone)) {
				result = true;
			}
		}
		return result;
	}

	@Override
	public String toString() {
		return "[이름=" + name + ", 휴대폰 번호=" + phone + "]";

	}

}
