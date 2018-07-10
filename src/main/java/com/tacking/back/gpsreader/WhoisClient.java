package com.tacking.back.gpsreader;

import java.io.ByteArrayInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class WhoisClient {

	public static void main(String[] args) {
		// Crea el Socket
	    
		try {
			DatagramSocket dasSocket = new DatagramSocket(5001);
			System.err.println("Escuchando puerto " + dasSocket.getPort());
			System.err.println("Escuchando puerto local " + dasSocket.getLocalPort());
			System.err.println("Escuchando inetaddress " + dasSocket.getLocalSocketAddress());
			String strMensaje = null;
			int intLonMsg = 0, intIndex = 0;
			while (true){
				// Crea el espacio para los mensajes
				byte [] bytCadena = new byte[100] ;
				DatagramPacket dapMensaje = new DatagramPacket(bytCadena, bytCadena.length);
				
				// Recibe y muestra el primer mensaje
				dasSocket.receive(dapMensaje);
				
				// Muestra el contenido del paquete
				ByteArrayInputStream baiBin = new ByteArrayInputStream(dapMensaje.getData());
				//Procesamos el mensajes
				System.out.println ("------------------------------------- ") ;
				System.out.println("Source : " + dapMensaje.getAddress() + " ");
				System.out.println("Length : " + dapMensaje.getLength() + " ");
				System.out.println("Offset : " + dapMensaje.getOffset() + " ");
				System.out.println("Port : " + dapMensaje.getPort() + " ");
				System.out.println("SocketAddress : " + dapMensaje.getSocketAddress() + " ");
				
				byte[] data = dapMensaje.getData();
				String s = new String(data, 0, data.length);
				System.out.println(s);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
