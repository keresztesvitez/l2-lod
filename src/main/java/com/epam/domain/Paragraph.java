package com.epam.domain;

import java.util.ArrayList;
import java.util.List;

public final class Paragraph {

	private final List<Line> lines = new ArrayList<>();

	public Paragraph(final String lineText) {
		lines.add(new Line(lineText));
	}

	public void print() {
		for (Line line : this.lines) {
			line.print();
			System.out.println();
		}
	}

}
