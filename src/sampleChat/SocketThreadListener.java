package sampleChat;

import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public interface SocketThreadListener {

    void onSocketStart(SocketThread thread, Socket socket);
    void onSocketStop(SocketThread thread);
    void onSocketReady(SocketThread thread, Socket socket);
    void onReceiveString(SocketThread thread, Socket socket, String msg);
    void onSocketException(SocketThread thread, Exception exception);
}