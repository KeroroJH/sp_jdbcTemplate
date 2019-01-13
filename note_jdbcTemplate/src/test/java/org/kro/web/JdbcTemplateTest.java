package org.kro.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/spring/root-context.xml"})
public class JdbcTemplateTest {
	
	@Autowired
	JdbcTemplate jdbct;

	@Test
	public void test() {
		System.out.println(jdbct.toString());
	}

}
