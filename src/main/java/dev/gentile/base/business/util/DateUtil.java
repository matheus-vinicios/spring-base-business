package dev.gentile.base.business.util;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateUtil
{
  public static Date toDate(LocalDate value)
  {
    if (value == null)
      return null;

    return Date.from(value.atStartOfDay(ZoneId.of("America/Cuiaba")).toInstant());
  }

  public static Date toDate(LocalDateTime value)
  {
    if (value == null)
      return null;

    return Date.from(value.atZone(ZoneId.of("America/Cuiaba")).toInstant());
  }

  public static Date nowDate()
  {
    return Timestamp.valueOf(nowLocalDateTime());
  }

  public static LocalDate toLocalDate(Date value)
  {
    if (value == null)
      return null;

    return value.toInstant().atZone(ZoneId.of("America/Cuiaba")).toLocalDate();
  }

  public static LocalDate toLocalDate(String value)
  {
    if (value == null || value.isEmpty())
      return null;

    return LocalDate.parse(value, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
  }

  public static LocalDate nowLocalDate()
  {
    return LocalDate.now(ZoneId.of("America/Cuiaba"));
  }

  public static String toString(LocalDate value)
  {
    return value.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
  }

  public static String toString(LocalDate value, String formatter)
  {
    return value.format(DateTimeFormatter.ofPattern(formatter));
  }

  public static LocalDateTime toLocalDateTime(Date value)
  {
    if (value == null)
      return  null;

    return value.toInstant().atZone(ZoneId.of("America/Cuiaba")).toLocalDateTime();
  }

  public static LocalDateTime toLocalDateTime(String value)
  {
    if (value == null || value.isEmpty())
      return null;

    return LocalDateTime.parse(value, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
  }

  public static LocalDateTime nowLocalDateTime()
  {
    return LocalDateTime.now(ZoneId.of("America/Cuiaba"));
  }

  public static String toString(LocalDateTime value)
  {
    return value.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
  }

  public static String toString(LocalDateTime value, String formatter)
  {
    return value.format(DateTimeFormatter.ofPattern(formatter));
  }
}