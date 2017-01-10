package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {
	@RequestMapping("/hello")
	public String test() {
		System.out.println("hello, world! This com from spring!");
		return "jsp/hello";
	}

	public static void main(String[] args) throws IOException {
		while (true) {
			File file = new File("D:\\hello.txt");
			FileInputStream fis = null;
			fis = new FileInputStream(file);
			int tempbyte;
			while ((tempbyte = fis.read()) != -1) {
				System.out.println(tempbyte);
			}
		}
	}
}