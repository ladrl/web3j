package org.web3j.abi;

import org.web3j.abi.datatypes.Function;

public class FunctionCallFailedException extends RuntimeException {
  public FunctionCallFailedException(Function function, Exception cause) {
    super(String.format("Function[%s]", function), cause);
  }
}