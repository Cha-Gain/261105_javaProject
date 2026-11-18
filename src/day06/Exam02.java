package day06;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 그림파일만 출력 => 확장자가 .jpg .png
		// 없으면 그림파일이 없습니다
		
		String[] fileName = {
				"이것이자바다.jpg.java", "java의정석.java", "array.txt",
				"array.java","String.txt", "StringMethod.jpg",
				"ArrayMethod.jpg", "method.png", "javaMethod.png" 
		};
		
		int count = 0;
		
		for(int i=0; i<fileName.length; i++) {
			String search = fileName[i].substring(fileName[i].lastIndexOf(".")+1);
			if(search.equals("jpg") || search.equals("png")) {
				System.out.println(fileName[i]);
				count++;
			}
		}
		
		if(count == 0) {
			System.out.println("그림파일이 없습니다");
		} else {
			System.out.println("검색결과 : " + count + "개");
		}
		

	}

}
