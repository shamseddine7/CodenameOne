/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.share;

import com.codename1.ui.Command;
import com.codename1.ui.Image;
import com.codename1.ui.events.ActionEvent;

/**
 * This is an abstract sharing service.
 * 
 * @author Chen
 */
public abstract class ShareService extends Command{

    private String message;
    
    /**
     * Constructor with the service name and icon
     * @param name the service name
     * @param icon the service icon
     */
    public ShareService(String name, Image icon) {
        super(name, icon);
    }

    /**
     * @inheritDoc
     */
    public void actionPerformed(ActionEvent evt) {
        share(message);
    }
    
    /**
     * This is the sharing method which should be implemented by the service.
     * @param toShare 
     */
    public abstract void share(String toShare);
    
    /**
     * Sets the message to share, this is done by the ShareButton and shouldn't
     * be used by the developers
     * @param message 
     */
    public void setMessage(String message){
        this.message = message;
    }

}
