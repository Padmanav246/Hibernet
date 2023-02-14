package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
	@SuppressWarnings("resource")
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/configuration.xml");
		@SuppressWarnings("unused")
		JdbcTemplate jdbcTemplate=(JdbcTemplate) context.getBean("jdbctemplete");
		String query="insert into student(id,name,address) values(?,?,?)";
		int a=jdbcTemplate.update(query,2,"rajesh","jjkr");
		System.out.println(a);
		
		
    }
}
