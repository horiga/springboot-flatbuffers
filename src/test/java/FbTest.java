import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import lombok.extern.slf4j.Slf4j;
import org.horiga.study.springboot.flatbuffers.protocol.messages.User;
import org.horiga.study.springboot.flatbuffers.protocol.messages.UserAnswer;
import org.junit.Test;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;

@Slf4j
public class FbTest {

	@Test
	public void simple() throws Exception {

		Method[] declaredMethods = User.class.getDeclaredMethods();

		for( Method m : declaredMethods) {
			log.debug("name:{}", m.getName());
		}

		log.debug(">> User.class.getName:{}",User.class.getName());
		log.debug(">> User.class.getTypeName:{}",User.class.getTypeName());
		log.debug(">> User.class.getSimpleName:{}", User.class.getSimpleName());

		//Method enclosingMethod = FUser.class.getEnclosingMethod();
		//log.debug("Enclosing method.name:{}", enclosingMethod.getName());
		Class<? extends Table> klass = User.class;

		Method m = klass.getMethod("getRootAs" + klass.getSimpleName(), ByteBuffer.class);

	}

	@Test
	public void test_fbb() {

		// test
		FlatBufferBuilder fbb = new FlatBufferBuilder(0);
		fbb.finish(UserAnswer.createUserAnswer(fbb,
				fbb.createString("Hiroyuki Horigami"),
				fbb.createString("12345"),
				fbb.createString("//scontent-nrt1-1.xx.fbcdn.net/hphotos-xpa1/t31.0-8/891598_504258659637103_960802615_o.jpg")));

		UserAnswer answer = UserAnswer.getRootAsUserAnswer(fbb.dataBuffer());

		log.debug("displayName:{}, mid:{}, pictureUrl:{}",
				answer.displayName(), answer.mid(), answer.pictureUrl());
	}

}
