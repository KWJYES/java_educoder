package step3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
	private Socket socket;
	private OutputStream socketOutputStream;
	private InputStream socketInputStream;
	public void relation() {
		try{
			/********** Begin *********/
            socketInputStream = socket.getInputStream();
            byte[] bytes = new byte[1000];
            int length = socketInputStream.read(bytes);
            String serverData = new String(bytes,0,length);
            System.out.print("Client has recevied: " + serverData);

			/********** End *********/
			socket.shutdownInput();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void start() {
		try {
			socket = new Socket("localhost",6000);
			/********** Begin *********/

            socketOutputStream = socket.getOutputStream();
            socketOutputStream.write("I am Client!".getBytes());

			/********** End *********/
			socket.shutdownOutput();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void stop() {
		try {
			socket.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
