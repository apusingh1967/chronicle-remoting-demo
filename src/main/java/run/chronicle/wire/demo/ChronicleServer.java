package run.chronicle.wire.demo;

import java.net.ServerSocket;
import java.net.Socket;

import net.openhft.chronicle.wire.InputStreamToWire;
import net.openhft.chronicle.wire.Wire;
import net.openhft.chronicle.wire.WireType;

public class ChronicleServer {

    public static void main(String[] args) throws Exception {
        
        try(ServerSocket ss = new ServerSocket(8888)){
            while(true){
                Socket s = ss.accept(); 
                InputStreamToWire i2w = new InputStreamToWire(WireType.BINARY, s.getInputStream());
                Wire w = i2w.readOne();
                Data d = new Data();
                w.readDocument(d);
                System.out.println(d);
            }
        } 
    }
    
}
