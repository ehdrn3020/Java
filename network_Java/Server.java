//Constructor and Destructor Thread example.

package network_Java;

import java.net.*;
import java.io.*;

public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5333);
		} catch (IOException e) {
			System.err.println("다음의 포트 번호에 연결할 수 없습니다: 5551");
			System.exit(1);
		}
		Socket clientSocket = null;
		try { // 서버로 접속요청을 받는다
			clientSocket = serverSocket.accept();
		} catch (IOException e) {
			System.err.println("accept() 실패");
			System.exit(1);
		}
		PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
		BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		String inputLine, outputLine;
		Protocol qp = new Protocol();
		outputLine = qp.process(null);
		out.println(outputLine);
		while ((inputLine = in.readLine()) != null) {
			outputLine = qp.process(inputLine);
			out.println(outputLine);
			if (outputLine.equals("quit"))
				break;
		} // 클라이언트로 부터 요청을 읽어서, 퀴즈를 내고 답을 읽는다
		out.close();
		in.close();
		clientSocket.close();
		serverSocket.close();
	}
}
