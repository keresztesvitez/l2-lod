package com.epam.domain;

public final class Line {

	private final String content;

	public Line(final String content) {
		this.content = content;
	}

	public void print() {
		System.out.println(this.content);
	}

}
