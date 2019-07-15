package io;

import java.nio.ByteBuffer;

public class BufferTest {
    public static void main(String[] args) {
        byte[] array = {'a', 'b'};
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        System.out.println(byteBuffer.toString());

        byteBuffer.put(array);
        byteBuffer.put(array);
        System.out.println(byteBuffer.toString());

        byteBuffer.flip();
        System.out.println(byteBuffer.toString());

        System.out.println(byteBuffer.get());
    }
}
