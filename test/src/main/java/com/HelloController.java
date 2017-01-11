package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

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

	public static void getStr() throws IOException {
		List<User> list = new ArrayList<User>();
		while (true) {
//			try {
//				Thread.sleep(1);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			list.add(new User());
		}
	}

	public static void main(String[] args) throws IOException {
		getStr();
	}
}