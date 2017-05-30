package com.epam.domain;

import java.util.ArrayList;
import java.util.List;

public final class Document {

	private final List<Paragraph> paragraphs;

	public Document(){
		paragraphs = new ArrayList<>();
	}

	public void addLine(String lineText) {
		paragraphs.add(new Paragraph(lineText));
	}

	public void print() {
		for (Paragraph paragraph : this.paragraphs) {
			paragraph.print();
		}
	}
}
