package run.chronicle.wire.demo;

import java.net.Socket;
import java.util.concurrent.TimeUnit;

import net.openhft.chronicle.wire.WireToOutputStream;
import net.openhft.chronicle.wire.WireType;

public class ChronicleClient {

    public static void main(String[] args) throws Exception {
        try(Socket s = new Socket("localhost", 8888)){
            WireToOutputStream w = new WireToOutputStream(WireType.BINARY, s.getOutputStream());
            Data d = new Data("msg", 111, TimeUnit.DAYS, 123.45);
            w.getWire().writeDocument(d);
            w.flush();
        }
    }
    
}
