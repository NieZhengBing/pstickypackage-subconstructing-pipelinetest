package com.nzb.netty.pstickypackage_subconstructing_pipelinetest.server;

import java.io.IOException;
import java.net.Socket;

public class Client {
	public static void main(String... args) throws IOException {

		Socket socket = new Socket("127.0.0.1", 10101);

		socket.getOutputStream().write("hello".getBytes());

		socket.close();
	}

}
