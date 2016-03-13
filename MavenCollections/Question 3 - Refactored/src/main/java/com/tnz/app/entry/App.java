package com.tnz.app.entry;

import com.tnz.app.services.WriteImpl.Crayon;
import com.tnz.app.services.WriteImpl.Pen;
import com.tnz.app.services.WriteImpl.Pencil;
import com.tnz.app.services.WritingImplement;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Pen pen = new Pen();
        Crayon crayon = new Crayon();
        Pencil pencil = new Pencil();

        List<WritingImplement> writers = new ArrayList<WritingImplement>();

        writers.add(pen);
        writers.add(pencil);
        writers.add(crayon);

        for (WritingImplement w : writers){
            out.println(w);
        }

        WritingImplement currentWriter = crayon;
    }
}
