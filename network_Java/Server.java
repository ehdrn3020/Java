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
			System.err.println("������ ��Ʈ ��ȣ�� ������ �� �����ϴ�: 5551");
			System.exit(1);
		}
		Socket clientSocket = null;
		try { // ������ ���ӿ�û�� �޴´�
			clientSocket = serverSocket.accept();
		} catch (IOException e) {
			System.err.println("accept() ����");
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
		} // Ŭ���̾�Ʈ�� ���� ��û�� �о, ��� ���� ���� �д´�
		out.close();
		in.close();
		clientSocket.close();
		serverSocket.close();
	}
}
