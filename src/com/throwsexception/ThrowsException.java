package com.throwsexception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsException {

	public static void main(String[] args) {
		System.out.println("����һ���ı���");
		//�ֽ���System.inת��Ϊ�ַ���InputStreamReader
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader inputReader = new BufferedReader(isr);	//�ַ�������
		String inputLine;
		try {
			inputLine = inputReader.readLine();
			System.out.println("������ı��ǣ�" + inputLine);
		} catch (IOException e) {
			System.out.println("�����쳣��" + e);
		}
		

	}

}
