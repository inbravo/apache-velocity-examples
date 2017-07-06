package test.velocity;

import bean.Product;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.context.Context;

import java.io.Writer;
import java.io.StringWriter;
import java.util.ArrayList;

public class Test5 {

	public Test5() throws Exception {

		Velocity.init("src/main/java/velocity.properties");

		/* Get Velocity template */
		final Template template = Velocity.getTemplate("Test5.vm");

		/* Get Velocity context */
		final Context context = new VelocityContext();

		context.put("products", new ArrayList<Product>() {

			private static final long serialVersionUID = 1L;

			{
				add(new Product("Apple", 10));
				add(new Product("Orange", 12));
				add(new Product("Banana", 11));
			}
		});

		/* Get Writer */
		final Writer writer = new StringWriter();

		/* Merge data into velocity template */
		template.merge(context, writer);

		System.out.println(writer.toString());
	}
}
