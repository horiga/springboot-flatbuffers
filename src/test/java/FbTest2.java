import com.google.flatbuffers.Table;
import org.horiga.study.springboot.flatbuffers.protocol.messages.v2.Token;
import org.horiga.study.springboot.flatbuffers.protocol.messages.v2.MessageId;
import org.horiga.study.springboot.flatbuffers.protocol.messages.v2.Pager;
import org.horiga.study.springboot.flatbuffers.protocol.messages.v2.Request;
import org.horiga.study.springboot.flatbuffers.protocol.messages.v2.RequestBody;
import org.horiga.study.springboot.flatbuffers.util.Utils;
import org.junit.Test;

import com.google.flatbuffers.FlatBufferBuilder;

import lombok.extern.slf4j.Slf4j;

import java.nio.ByteBuffer;

@Slf4j
public class FbTest2 {


	@Test
	public void fbs_union() {

		try {

			//
			// - serialize
			//

			FlatBufferBuilder fbb = new FlatBufferBuilder(0);

			// Pager
			int offset = 1;
			int limit = 100;
			int offsetPager = Pager.createPager(fbb, offset, limit);

			// Token
			int offsetToken = Token.createToken(fbb, fbb.createString("this-is-v2-message-token"));

			// Request
			Request.startRequest(fbb);
			Request.addMsg(fbb, MessageId.TOKEN);
			Request.addToken(fbb, offsetToken);
			Request.addBodyType(fbb, RequestBody.Pager);
			Request.addBody(fbb, offsetPager);
			fbb.finish(Request.endRequest(fbb));

			ByteBuffer buffer = fbb.dataBuffer();
			Utils.hex(buffer, "in serialize");


			//
			// - deserialize process.
			//

			Request deserialize = Request.getRootAsRequest(buffer);
			Utils.hex(deserialize.getByteBuffer(), "out deserialize");
			Pager pager = (Pager)deserialize.body(new Pager());

			log.info("msg_id   : {}", deserialize.msg());
			log.info("token    : {}", deserialize.token().token());
			log.info("body_type: {}", RequestBody.name(deserialize.bodyType()));
			log.info("body     : pager.limit:{}, pager.offset:{}", pager.limit(), pager.offset());

		} catch (Exception e) {
			log.error("Failed to flatbuffers SerDe!!", e);


		}

	}

}
