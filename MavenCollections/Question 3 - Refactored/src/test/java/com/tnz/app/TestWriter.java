package com.tnz.app;

import com.tnz.app.configuration.AppConfig;
import com.tnz.app.domain.Writer;
import com.tnz.app.services.WritingImplement;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Admin on 3/10/16.
 */

public class TestWriter {

    private WritingImplement writer;
    private ApplicationContext ctx;
    private Writer write;


    @Before
    public void start(){

        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        writer = (WritingImplement) ctx.getBean("default");
    }

    @Test
    public void testWax()
    {
        write = writer.getWriting();
        Assert.assertEquals(write.toString(), "Matrial Type: Wax");
    }

    @Test
    public void testPen()
    {
        writer = (WritingImplement) ctx.getBean("pen");
        write = writer.getWriting();
        Assert.assertEquals(write.toString(), "Matrial Type: Ink");
    }

    @Test
    public void testPencil()
    {
        write = writer.getWriting();
        Assert.assertNotEquals(write.toString(), "Matrial Type: Crayon");
    }
}
