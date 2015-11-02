package com.olekristian;

import com.jogamp.opengl.awt.GLCanvas;

import javax.swing.*;

public class Vindu extends JFrame {
    public Vindu(String tittel) {
        setTitle(tittel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        GLCanvas canvas = new GLCanvas();
        canvas.setBounds(0, 0, 500, 500);
        TegningOv1_1JOGL tegningen = new TegningOv1_1JOGL(canvas);
        add(canvas);
        pack();
    }

}