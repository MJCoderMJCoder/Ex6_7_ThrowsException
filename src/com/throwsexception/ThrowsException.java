package com.throwsexception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsException {

	public static void main(String[] args) {
		System.out.println("输入一行文本：");
		//字节流System.in转换为字符流InputStreamReader
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader inputReader = new BufferedReader(isr);	//字符缓冲流
		String inputLine;
		try {
			inputLine = inputReader.readLine();
			System.out.println("输入的文本是：" + inputLine);
		} catch (IOException e) {
			System.out.println("发生异常：" + e);
		}
		

	}

}
