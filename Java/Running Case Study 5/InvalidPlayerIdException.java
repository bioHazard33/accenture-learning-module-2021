package com.sbcc.exception;

/*The class and methods should be declared as publicand all the attributes should be declared as private.*/public class InvalidPlayerIdException
  extends Exception {

  public InvalidPlayerIdException(String message) {
    super(message);
  }
}
