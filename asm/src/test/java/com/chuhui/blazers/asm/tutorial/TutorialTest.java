package com.chuhui.blazers.asm.tutorial;

import org.objectweb.asm.ClassReader;

import java.io.IOException;


/**
 * TutorialTest
 *
 * @author: 纯阳子
 * @Date: 2019/4/12
 * @Description:TODO
 */
public class TutorialTest {

    public void classPrinterTest() throws IOException {

        ClassPrinter cp = new ClassPrinter();

        ClassReader reader = new ClassReader("java.util.HashMap");

        reader.accept(cp, 0);

    }

    public static void main(String[] args) throws IOException {
        ClassPrinter cp = new ClassPrinter();

        ClassReader reader = new ClassReader("java.util.HashMap");

        reader.accept(cp,0);

//        cp.visitMethod()


    }


}
