/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sims2_bacc_appli;

/**
 *
 * @author adrie
 */
public class ChienChatException extends Exception{

    public ChienChatException() {
    }

    public ChienChatException(String message) {
        super(message);
    }

    public ChienChatException(String message, Throwable cause) {
        super(message, cause);
    }

    public ChienChatException(Throwable cause) {
        super(cause);
    }

    public ChienChatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
