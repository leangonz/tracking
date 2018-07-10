package com.tacking.back.gpsreader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.stream.Collectors;


public class ServerSocketTCP {

	public static void main(String[] args) {
		ServerSocket socket;
		try {
			socket = new ServerSocket(6000);
			do {
				Socket socket_cli = socket.accept();
				String result = new BufferedReader(new InputStreamReader(socket_cli.getInputStream()))
						  .lines().collect(Collectors.joining("\n"));
				System.out.println(result);
			} while (1 > 0);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.exit(1);
		}
	}
}
