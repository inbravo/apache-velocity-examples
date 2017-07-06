package test.velocity;

import org.apache.velocity.app.Velocity;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.context.Context;

import java.io.Writer;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;

import bean.Product;

class Test6 {

	public Test6() throws Exception {

		Velocity.init("src/main/java/velocity.properties");

		Context context = new VelocityContext();

		final Collection<Product> products = new ArrayList<>();

		products.add(new Product("Widget", 12.99));
		products.add(new Product("Wotsit", 13.99));
		products.add(new Product("Thingy", 11.99));

		context.put("products", products);

		Template template2 = Velocity.getTemplate("Test7.vm");

		Writer writer2 = new StringWriter();
		template2.merge(context, writer2);
		System.out.println(writer2.toString());
	}
}
