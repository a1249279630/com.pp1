    package day05;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.io.PrintWriter;
    import java.net.ServerSocket;
    import java.net.Socket;

    public class service {
        public static void main(String[] args) throws IOException {
            String readline=null;
            String inTemp=null;
            String turnLine="\n";
            final String client="Client:";
            final String server="Server:";
            int port =4400;

            ServerSocket serverSocket=new ServerSocket(port);

            Socket socket=serverSocket.accept();

            //创建三个流，系统输入流BufferedReader systemIn，socket输入流BufferedReader socketIn，socket输出流PrintWriter socketOut;
            BufferedReader systemIn = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader socketIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter socketOut = new PrintWriter(socket.getOutputStream());

            while(readline!="bye"){
                inTemp=socketIn.readLine();
                System.out.println(client+turnLine+inTemp);
                System.out.println(server);
                readline=systemIn.readLine();
                socketOut.println(readline);
                socketOut.flush();    //赶快刷新使Client收到，也可以换成socketOut.println(readline, ture)

            }
            systemIn.close();
            socketIn.close();
            socketOut.close();
            socket.close();
            serverSocket.close();
        }
    }
