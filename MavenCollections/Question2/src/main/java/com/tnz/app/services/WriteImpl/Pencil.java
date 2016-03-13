package com.tnz.app.services.WriteImpl;

import com.tnz.app.domain.Writer;
import com.tnz.app.services.WritingImplement;

/**
 * Created by Admin on 3/10/16.
 */
public class Pencil implements WritingImplement {

    private Writer write;

    public Pencil(){
        write = new Writer("Lead");
    }

    public Writer getWriting() {
        return write;
    }

    @Override
    public String toString(){
        return write.toString();
    }
}
