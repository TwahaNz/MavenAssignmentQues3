package com.tnz.app.services.WriteImpl;

import com.tnz.app.domain.Writer;
import com.tnz.app.services.WritingImplement;

/**
 * Created by Admin on 3/10/16.
 */
public class Pen implements WritingImplement {

    private Writer write;

    public Pen(){
        write = new Writer("Ink");
    }

    public Writer getWriting() {
        return write;
    }

    @Override
    public String toString(){
        return write.toString();
    }
}
