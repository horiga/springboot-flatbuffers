package org.horiga.study.springboot.flatbuffers.controller;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import lombok.extern.slf4j.Slf4j;
import org.horiga.study.springboot.flatbuffers.protocol.messages.UserAnswer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class APIController {

	@RequestMapping(value = "/api", method = RequestMethod.POST,
			consumes = "application/x-fb", produces = "application/x-fb")
	public Table api(
			Table message
		) {

		log.debug("in:{}", message);

		// test
		FlatBufferBuilder fbb = new FlatBufferBuilder(0);
		fbb.finish(UserAnswer.createUserAnswer(fbb,
				fbb.createString("Hiroyuki Horigami"),
				fbb.createString("12345"),
				fbb.createString("//scontent-nrt1-1.xx.fbcdn.net/hphotos-xpa1/t31.0-8/891598_504258659637103_960802615_o.jpg")));

		return UserAnswer.getRootAsUserAnswer(fbb.dataBuffer());
	}
}
