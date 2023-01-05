package dev.gentile.base.business.util;

import org.apache.commons.lang3.ObjectUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorUtil
{
  public static boolean isPhoneNumber(String value)
  {
    value = StringUtil.toNumber(value);

    if (ObjectUtils.isEmpty(value))
      return false;

    Pattern pattern = Pattern.compile("\\d{2}\\d{4,5}\\d{4}");
    Matcher matcher = pattern.matcher(value);

    return matcher.matches();
  }

  public static boolean isUUID(String value)
  {
    Pattern UUID_REGEX = Pattern.compile("^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$");
    return UUID_REGEX.matcher(value).matches();
  }
}