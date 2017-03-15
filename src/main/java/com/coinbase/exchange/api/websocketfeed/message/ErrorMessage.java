package com.coinbase.exchange.api.websocketfeed.message;

/**
 * If you send a message that is not recognized or an error
 * occurs, the error message will be sent and you will be
 * disconnected.
 *
 * {
     "type": "error",
     "message": "error message"
 }
 *
 * Created by robevansuk on 15/03/2017.
 */
public class ErrorMessage extends Message {

}
