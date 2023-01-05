package dev.gentile.base.business.util;

import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringUtil
{
  public static boolean isEmpty(String value)
  {
    return value == null || value.isEmpty();
  }

  public static String format(String value, Object ... args)
  {
    if (value == null || value.isEmpty())
      return null;

    return String.format(value, args);
  }

  public static String toNumber(String value)
  {
    if (value == null || value.isEmpty())
      return null;

    value = org.apache.commons.lang3.StringUtils.trimToEmpty(value);
    value = Pattern.compile("\\d+").matcher(value).results().map(MatchResult::group).collect(Collectors.joining());

    return value;
  }

  public static String toAlpha(String value)
  {
    if (value == null || value.isEmpty())
      return null;

    value = org.apache.commons.lang3.StringUtils.trimToEmpty(value);
    value = Pattern.compile("^[a-zA-Z\\s]+").matcher(value).results().map(MatchResult::group).collect(Collectors.joining());

    return value;
  }

  public static String onlyNumber(String value)
  {
    if (value == null || value.isEmpty())
      return null;

    return value.replaceAll("[^0-9]", "");
  }
}