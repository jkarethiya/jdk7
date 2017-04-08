package com.jk.jdk.j2se.io;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LastModifiedTime {
	public static void main(String[] args) throws Exception {

		System.out.println("Finding the last modified time of file and directory in Java 6 and before");
		File source = new File(".project");
		long lastModified = source.lastModified();
		String time = format(lastModified);
		System.out.printf("file %s was last modified at %s %n", source.getName(), time);

		File settings = new File(".settings");
		long lastChanged = settings.lastModified();
		String lastUpdated = format(lastChanged);
		System.out.printf("directory %s was last updated at %s %n", settings.getName(), lastUpdated);

		// Finding last modified time of a file in Java 7 and 8
		System.out.println("Finding the last modified time of file and directory in Java 7 and 8");
		Path location = Paths.get(".project");
		FileTime lastModifiedTime = Files.getLastModifiedTime(location, LinkOption.NOFOLLOW_LINKS);
		String lastModifiedTimeAsString = format(lastModifiedTime.toMillis());
		System.out.printf("file %s was last modified at %s %n", location, lastModifiedTimeAsString);

	}

	public static String format(long time) {
		DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		return sdf.format(new Date(time));
	}

}
