package com.hust.soict.quoctoan.client_server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	
	public static void main(String[] args) throws Exception, IOException {
		Socket socket = new Socket("127.0.0.1", 9898);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
				 
		System.out.println(in.readLine());
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			System.out.println("Enter your array: ");
			String input = scanner.nextLine();
			if (input.isEmpty()) {
				break;
			}
			out.println(input);
			System.out.println("Sorted Array:" +in.readLine());
        }
		System.out.println("Finish!");

		socket.close();
		scanner.close();
	}
}
