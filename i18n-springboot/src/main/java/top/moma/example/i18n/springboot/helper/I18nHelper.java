package top.moma.example.i18n.springboot.helper;

import org.springframework.context.MessageSource;
import top.moma.example.i18n.springboot.helper.spring.ContextHelper;

import java.util.Locale;

/**
 * I18nHelper
 *
 * @version 1.0
 * @author Created by ivan at 17:56.
 */
public enum I18nHelper {
  INSTANCE;

  public String getMessage(String key, String local) {
    MessageSource messageSource = ContextHelper.getBeanByType(MessageSource.class);
    return messageSource.getMessage(key, null, new Locale(local));
  }
}
