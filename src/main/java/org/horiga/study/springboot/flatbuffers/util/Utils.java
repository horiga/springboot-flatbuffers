package org.horiga.study.springboot.flatbuffers.util;

import lombok.extern.slf4j.Slf4j;

import java.nio.ByteBuffer;

@Slf4j
public final class Utils {


	public static ByteBuffer hex(ByteBuffer bb, String message) {
		StringBuilder sb = new StringBuilder();
		int n = 1;
		for (byte b : bb.array()) {
			String s = Integer.toHexString(0xff & b);
			if (s.length() == 1) {
				sb.append("0");
			}
			sb.append(s);
			sb.append(n%8==0 ? "\n" : " ");
			n++;

		}
		log.info("\n>>>>>>>>> [{}] - pos:{}, limit:{}, cap:{}\n{}\n<<<<<<<<< [{}]",
				message, bb.position(), bb.limit(), bb.capacity(), sb.toString(), message);
		return bb;
	}

	public static ByteBuffer hex(ByteBuffer bb) {
		hex(bb, "to hex");
		return bb;
	}

}
