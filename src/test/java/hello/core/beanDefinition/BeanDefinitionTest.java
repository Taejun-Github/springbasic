package hello.core.beanDefinition;

import hello.core.AppConfig;
import hello.core.order.ConfigTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BeanDefinitionTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    AnnotationConfigApplicationContext ac2 = new AnnotationConfigApplicationContext(ConfigTest.class);

    GenericXmlApplicationContext ac3 = new GenericXmlApplicationContext("test.xml");

    @Test
    void findApplicationBean() {
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();

        for (String beanDefinitionName : beanDefinitionNames) {
            BeanDefinition beanDefinition = ac.getBeanDefinition(beanDefinitionName);

            if(beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION) {
                System.out.println(beanDefinitionName + " " + beanDefinition);
            }
        }
    }
}
