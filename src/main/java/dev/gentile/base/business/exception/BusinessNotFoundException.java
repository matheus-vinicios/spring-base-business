package dev.gentile.base.business.exception;

public class BusinessNotFoundException extends RuntimeException
{
  public BusinessNotFoundException()
  {
    super();
  }

  public BusinessNotFoundException(String message)
  {
    super(message);
  }
}