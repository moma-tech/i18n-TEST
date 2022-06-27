package top.moma.example.i18n.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import top.moma.example.i18n.springboot.constant.I18nConstants;
import top.moma.example.i18n.springboot.helper.I18nHelper;

@SpringBootApplication
public class I18nSpringbootApplication {

  public static void main(String[] args) {
    SpringApplication.run(I18nSpringbootApplication.class, args);
    String t = I18nHelper.INSTANCE.getMessage(I18nConstants.HELLO, "tt");
    System.out.println(t);
  }
}
