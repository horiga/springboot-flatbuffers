import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import entity.fbs.social.FUser;

import java.lang.reflect.Method;

@Slf4j
public class FbTest {

	@Test
	public void simple() throws Exception {
		FUser user = null;

		Method[] declaredMethods = FUser.class.getDeclaredMethods();

		for( Method m : declaredMethods) {
			log.debug("name:{}", m.getName());
		}

		log.debug("FUser.class.getName:{}",FUser.class.getName());
		log.debug("FUser.class.getTypeName:{}",FUser.class.getTypeName());
		log.debug("FUser.class.getSimpleName:{}", FUser.class.getSimpleName());
		//Method enclosingMethod = FUser.class.getEnclosingMethod();
		//log.debug("Enclosing method.name:{}", enclosingMethod.getName());
		Class<?> klass = FUser.class;
		Method m = klass.getMethod("getRootAs" + klass.getSimpleName());
		m.invoke(klass);

	}

}
