package generics.chap3;

import java.io.*;
import java.nio.CharBuffer;

public class MultipleBounds {

    public static void main(String[] args) throws IOException {
        int size = 32;
        FileReader r = new FileReader("/dev/urandom");
        FileWriter w = new FileWriter("file.out");
        copy(r, w, size);
        BufferedReader br = new BufferedReader(new FileReader("file.in"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("file.out"));
        copy(br, bw, size);
    }

    public static <S extends Readable & Closeable, T extends Appendable & Closeable>
        void copy(S src, T target, int size) throws IOException {
        try {
            CharBuffer buf = CharBuffer.allocate(size);
            int i = src.read(buf);
            while (i >= 0) {
                buf.flip();
                target.append(buf);
                buf.clear();
                i = src.read(buf);
            }
        } finally {
            src.close();
            target.close();
        }
    }
}
