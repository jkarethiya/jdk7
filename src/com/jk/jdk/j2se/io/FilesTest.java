package com.jk.jdk.j2se.io;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class FilesTest {
	public static void main(String[] args) throws Exception {
		// Files.lines(Paths.get(".settings\\org.eclipse.core.resources.prefs")).forEach(System.out::println);

		System.out.println(readFileAsString(".settings\\org.eclipse.core.resources.prefs"));
		
		System.out.println(readFileInList(".settings\\org.eclipse.core.resources.prefs").size());
	}

	public static String readFileAsString(String fileName) {
		String data = "";
		try {
			data = new String(Files.readAllBytes(Paths.get(fileName)));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}

	public static List<String> readFileInList(String fileName) {
		List<String> lines = Collections.emptyList();
		try {
			lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines;
	}

}
