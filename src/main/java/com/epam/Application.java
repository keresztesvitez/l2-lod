package com.epam;

import com.epam.domain.Document;

public class Application {

	private void start() {
		DocumentCreator documentCreator = new DocumentCreator();
		Document document = documentCreator.createDocument();
		document.print();
	}

	public static void main(String[] args) {
		new Application().start();
	}
}
