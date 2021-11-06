package tn.esprit.spring;

import java.text.ParseException;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@ContextConfiguration(classes = TimesheetProjectDevOpsApplication.class)
@RunWith(SpringRunner.class)
@SpringBootTest
class TimesheetProjectDevOpsApplicationTests {

	@Test
	void contextLoads() throws ParseException {
	}

}
