package org.horiga.study.springboot.flatbuffers.controller;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import lombok.extern.slf4j.Slf4j;
import org.horiga.study.springboot.flatbuffers.protocol.messages.Me;
import org.horiga.study.springboot.flatbuffers.protocol.messages.UserAnswer;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Callable;

@RestController
@Slf4j
public class APIController {

	@RequestMapping(value = "/api", method = RequestMethod.POST)
	public Callable<Table> onMessage(
			@RequestBody Table message
	) {

		// test
		if (message instanceof Me) {
			log.info("accessToken:{}", ((Me) message).token().accessToken());
			log.info("id         :{}", ((Me) message).token().id());
			log.info("created    :{}", ((Me) message).token().created());
		}

		return () -> {
			FlatBufferBuilder fbb = new FlatBufferBuilder(0);
			fbb.finish(UserAnswer.createUserAnswer(fbb,
					fbb.createString("Hiroyuki Horigami"),
					fbb.createString("12345"),
					fbb.createString("//scontent-nrt1-1.xx.fbcdn.net/hphotos-xpa1/t31.0-8/891598_504258659637103_960802615_o.jpg")));
			UserAnswer resultMessage = UserAnswer.getRootAsUserAnswer(UserAnswer.getRootAsUserAnswer(fbb.dataBuffer()).getByteBuffer());
			return resultMessage;
		};
	}
}
