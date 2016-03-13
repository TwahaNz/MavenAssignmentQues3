package com.tnz.app;

import com.tnz.app.domain.Writer;
import com.tnz.app.services.WriteImpl.Crayon;
import com.tnz.app.services.WriteImpl.Pen;
import com.tnz.app.services.WriteImpl.Pencil;
import com.tnz.app.services.WritingImplement;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Admin on 3/10/16.
 */

public class TestWriter {


    @Test
    public void testCrayon()
    {
        Writer write = new Crayon().getWriting();
        Assert.assertEquals(write.toString(), "Matrial Type: Wax");
    }

    @Test
    public void testPen()
    {
        Writer write = new Pen().getWriting();
        Assert.assertEquals(write.toString(), "Matrial Type: Ink");
    }

    @Test
    public void testPencil()
    {
        Writer write = new Pencil().getWriting();
        Assert.assertNotEquals(write.toString(), "Matrial Type: Wax");
    }

}
