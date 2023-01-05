package dev.gentile.base.business.exception;

public class BusinessConstraintException extends RuntimeException
{
  public BusinessConstraintException()
  {
    super();
  }

  public BusinessConstraintException(String message)
  {
    super(message);
  }
}