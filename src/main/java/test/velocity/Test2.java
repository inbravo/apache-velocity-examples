package test.velocity;

import org.apache.velocity.app.Velocity;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.context.Context;

import java.io.Writer;
import java.io.StringWriter;

public class Test2 {

	public Test2() throws Exception {

		Velocity.init("src/main/java/velocity.properties");

		/* Get Velocity template */
		final Template template = Velocity.getTemplate("Test2.vm");

		/* Get Velocity context */
		final Context context = new VelocityContext();

		context.put("name", "Vova");
		context.put("surname", "Ivanov");

		/* Get Writer */
		final Writer writer = new StringWriter();

		/* Merge data into velocity template */
		template.merge(context, writer);

		System.out.println(writer.toString());
	}
}
