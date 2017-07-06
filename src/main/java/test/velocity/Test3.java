package test.velocity;

import bean.Product;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.context.Context;

import java.io.Writer;
import java.io.StringWriter;
import java.util.Date;

public class Test3 {

	public Test3() throws Exception {

		Velocity.init("src/main/java/velocity.properties");

		/* Get Velocity template */
		final Template template = Velocity.getTemplate("Test3.vm");

		/* Get Velocity context */
		final Context context = new VelocityContext();
		context.put("name", "Vova");
		context.put("age", 21);
		context.put("flag", true);
		context.put("today", new Date());
		context.put("product", new Product("Book", 12.3));

		/* Get Writer */
		final Writer writer = new StringWriter();

		/* Merge data into velocity template */
		template.merge(context, writer);

		System.out.println(writer.toString());
	}
}
