package test;

import java.nio.*;
import java.util.*;

public class bigEndian_littleEndian {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int r = kb.nextInt();
		if (r >= 1 && r <= 10000) {
			while (r-- > 0) {
				String s = kb.next();
				long l1 = 2147483647;
				long l2 = Long.parseLong(s);
				if (l2 > l1) {
					System.out.println(l2);
				} else {
					int C = Integer.parseInt(s);
					ByteBuffer buf = ByteBuffer.allocate(Integer.SIZE / 8);
					buf.putInt(C);
					buf.order(ByteOrder.LITTLE_ENDIAN);
					buf.flip();
					long a = buf.getInt();
					System.out.println(unsigned32(a));
				}
			}
		}
	}

	public static long unsigned32(long n) {
		return n & 0xFFFFFFFFL;
	}
}
