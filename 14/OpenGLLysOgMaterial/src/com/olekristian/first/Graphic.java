package com.olekristian.first;

//Java classes
import javax.swing.*;

//JOGL2 klasser
import static com.jogamp.opengl.GL2.*;//slipper å bruke GL2.konstant
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.awt.GLCanvas;
import static com.jogamp.opengl.fixedfunc.GLMatrixFunc.GL_MODELVIEW;
import static com.jogamp.opengl.fixedfunc.GLMatrixFunc.GL_PROJECTION;
import com.jogamp.opengl.util.FPSAnimator;
import com.jogamp.opengl.util.gl2.GLUT;

public class Graphic extends GLCanvas implements GLEventListener {
		
	    private GLCanvas canvas;
	    private float angle;
	    private GLU glu = new GLU();
	    private GLUT glut = new GLUT();

	    public Graphic() {
	        
	        addGLEventListener(this);
	        
	        FPSAnimator animate = new FPSAnimator(this, 60);
	        animate.start();
	        
	    }

	    public void init(GLAutoDrawable glDrawable) {
	    	GL2 gl = glDrawable.getGL().getGL2();
	        gl.glClearColor(0.0f, 0.0f, 0.0f, 1.0f); // Sets the background colour to white
	        gl.glMatrixMode(GL_PROJECTION); // Select The Projection Matrix
	        gl.glLoadIdentity(); // Reset the view matrix to the identity matrix
	        glu.gluPerspective(45.0, 1.25, 2.0, 50.0); // Specify the projection matrix (fov, w/h, near plane, far plane)
	        gl.glMatrixMode(GL_MODELVIEW);
	    }

	    public void reshape(GLAutoDrawable glDrawable, int i, int i1, int i2, int i3) {
	    }

	    public void dispose(GLAutoDrawable d) {
	    }

	    /* Mathod used for drawing */
	    public void drawGLSceneCircle(GLAutoDrawable glDrawable) {
	    	GL2 gl = glDrawable.getGL().getGL2();
	    	gl.glClear(GL_COLOR_BUFFER_BIT| GL_DEPTH_BUFFER_BIT);
	    	gl.glLoadIdentity();
	    	
	    	glu.gluLookAt(0.0, 0.0, 10.0, 0.0, 2.0, 0.0, 0.0, 1.0, 0.0);
	    	int hue = 0;
	    	for (int i = 1; i <= 30; i++) {
	    		double alpha = ((2 * Math.PI) / 30) * i;
		    	double x = Math.cos( alpha ) * 0.5;
		    	double y = Math.sin( alpha ) * 0.5;
		    	gl.glTranslated(x, y, 0.0);
		    	gl.glColor3d(Math.sin(alpha), Math.cos(alpha), 1);
		    	drawCircle(0.5, gl);
	    	}
	    	
	    }
	    
	    public void drawCircle(double radius, GL2 gl) {
	    	
	    	gl.glBegin(GL_LINE_LOOP);
	    	for (int i = 1; i <= 100; i++) {
		    	double alpha = ((2 * Math.PI) / 100) * i;
		    	double x = Math.cos( alpha ) * radius;
		    	double y = Math.sin( alpha ) * radius;
		    	gl.glVertex3d(x, y, 0.0);
	    	}
	    	gl.glEnd();
	    }

	    public void display(GLAutoDrawable glDrawable) {
	        GL2 gl = glDrawable.getGL().getGL2();
	        
	        // Oppgave 3.1
	        drawGLSceneCircle(glDrawable);
	        
	        gl.glFlush(); // Tvinger tidligere buffrede OpenGL kommandoer til å utføres med en gang.
	    }
}
