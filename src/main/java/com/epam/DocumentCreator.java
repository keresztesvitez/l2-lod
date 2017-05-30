package com.epam;

import com.epam.domain.Document;

public class DocumentCreator {

	public Document createDocument() {
		Document document = new Document();
		document.addLine("A line.");
		document.addLine("Another line.");
		document.addLine("Second paragraph");
		document.addLine("This is the end :(");
		return document;
	}

}
