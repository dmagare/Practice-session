
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Hello{
	public static void main(String[] args){
	//System.out.println("Hello, World");
	try (ServerSocket server = new ServerSocket(8080)) {
		while (true) {
			Socket request = server.accept();
			PrintWriter writer = new PrintWriter(request.getOutputStream());
			writer.println("HTTP/1.1 200 ok\r\nContent-Lenght: 14\r\nContent-Type: plain/text\r\n\r\nHello,World");
			writer.flush();
			request.close();
			}
		} catch (IOException ex) {
			System.err.println("Oops");
		}
	}
}
