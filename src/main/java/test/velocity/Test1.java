package test.velocity;

import org.apache.velocity.app.Velocity;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.context.Context;

import java.io.Writer;
import java.io.StringWriter;

public class Test1 {

	public Test1() throws Exception {

		Velocity.init("src/main/java/velocity.properties");

		/* Get Velocity template */
		final Template template = Velocity.getTemplate("Test4.vm");

		/* Get Velocity context */
		final Context context = new VelocityContext();

		/* Get Writer */
		final Writer writer = new StringWriter();

		/* Merge data into velocity template */
		template.merge(context, writer);

		System.out.println(writer.toString());
	}
}
