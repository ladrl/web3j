package org.web3j.protocol.exceptions;

import org.web3j.protocol.core.methods.response.EthSendTransaction;
import org.web3j.protocol.core.methods.request.RawTransaction;

/**
 * Transaction timeout exception indicates that the associated transaction failed
 */
public class TransactionFailedException extends Exception {
    public TransactionFailedException(RawTransaction transaction, EthSendTransaction response) {
      super(String.format("Unable to process %s: %s", transaction, response));
    }
    public TransactionFailedException(String message) {
        super(message);
    }

    public TransactionFailedException(String message, Throwable cause) {
        super(message, cause);
    }
}
