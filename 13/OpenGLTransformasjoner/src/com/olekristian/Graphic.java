package com.olekristian;

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
	    
	    private double num = 0;
	    private double camY = 0;

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
	    public void drawGLSceneObjects(GLAutoDrawable glDrawable) {
	    	GL2 gl = glDrawable.getGL().getGL2();
	    	gl.glClear(GL_COLOR_BUFFER_BIT| GL_DEPTH_BUFFER_BIT);
	    	gl.glLoadIdentity();
	    	
	    	gl.glTranslatef(-8.0f, 5.0f, -20.0f);
	    	
	    	// Punkt
	    	gl.glColor3f(0.0f, 1.0f, 0.0f);
	    	gl.glBegin(GL_POINTS);
	    		gl.glVertex3f(0.0f, 2.0f, 0.0f); // P0
	    		gl.glVertex3f(1.5f, 1.5f, 0.0f); // P1
		    	gl.glVertex3f(2.0f, 0.0f, 0.0f); // P2
		    	gl.glVertex3f(1.5f, -1.5f, 0.0f); // P3
		    	gl.glVertex3f(0.0f, -2.0f, 0.0f); // P4
		    	gl.glVertex3f(-1.5f, -1.5f, 0.0f); // P5
		    	gl.glVertex3f(-2.0f, 0.0f, 0.0f); // P6
			    gl.glVertex3f(-1.5f, 1.5f, 0.0f); // P7
	    	gl.glEnd();
	    	
	    	gl.glTranslatef(5.0f, 0.0f, 0.0f);
	    	
	    	// Linje
	    	gl.glColor3f(0.0f, 1.0f, 0.0f);
	    	gl.glBegin(GL_LINES);
		    	gl.glVertex3f(0.0f, 2.0f, 0.0f); // P0
	    		gl.glVertex3f(1.5f, 1.5f, 0.0f); // P1
		    	gl.glVertex3f(2.0f, 0.0f, 0.0f); // P2
		    	gl.glVertex3f(1.5f, -1.5f, 0.0f); // P3
		    	gl.glVertex3f(0.0f, -2.0f, 0.0f); // P4
		    	gl.glVertex3f(-1.5f, -1.5f, 0.0f); // P5
		    	gl.glVertex3f(-2.0f, 0.0f, 0.0f); // P6
			    gl.glVertex3f(-1.5f, 1.5f, 0.0f); // P7
		    gl.glEnd();
		    
		    gl.glTranslatef(5.0f, 0.0f, 0.0f);
		    
		    gl.glColor3f(0.0f, 1.0f, 0.0f);
	    	gl.glBegin(GL_LINE_STRIP);
		    	gl.glVertex3f(0.0f, 2.0f, 0.0f); // P0
	    		gl.glVertex3f(1.5f, 1.5f, 0.0f); // P1
		    	gl.glVertex3f(2.0f, 0.0f, 0.0f); // P2
		    	gl.glVertex3f(1.5f, -1.5f, 0.0f); // P3
		    	gl.glVertex3f(0.0f, -2.0f, 0.0f); // P4
		    	gl.glVertex3f(-1.5f, -1.5f, 0.0f); // P5
		    	gl.glVertex3f(-2.0f, 0.0f, 0.0f); // P6
			    gl.glVertex3f(-1.5f, 1.5f, 0.0f); // P7
		    gl.glEnd();
		    
		    gl.glTranslatef(-10.0f, -5.0f, 0.0f);
		    
		    gl.glColor3f(0.0f, 1.0f, 0.0f);
	    	gl.glBegin(GL_LINE_LOOP);
		    	gl.glVertex3f(0.0f, 2.0f, 0.0f); // P0
	    		gl.glVertex3f(1.5f, 1.5f, 0.0f); // P1
		    	gl.glVertex3f(2.0f, 0.0f, 0.0f); // P2
		    	gl.glVertex3f(1.5f, -1.5f, 0.0f); // P3
		    	gl.glVertex3f(0.0f, -2.0f, 0.0f); // P4
		    	gl.glVertex3f(-1.5f, -1.5f, 0.0f); // P5
		    	gl.glVertex3f(-2.0f, 0.0f, 0.0f); // P6
			    gl.glVertex3f(-1.5f, 1.5f, 0.0f); // P7
		    gl.glEnd();
		    
		    gl.glTranslatef(5.0f, 0.0f, 0.0f);
		    
		    gl.glColor3f(0.0f, 1.0f, 0.0f);
	    	gl.glBegin(GL_TRIANGLES);
		    	gl.glVertex3f(0.0f, 2.0f, 0.0f); // P0
	    		gl.glVertex3f(1.5f, 1.5f, 0.0f); // P1
		    	gl.glVertex3f(2.0f, 0.0f, 0.0f); // P2
		    	gl.glVertex3f(1.5f, -1.5f, 0.0f); // P3
		    	gl.glVertex3f(0.0f, -2.0f, 0.0f); // P4
		    	gl.glVertex3f(-1.5f, -1.5f, 0.0f); // P5
		    	gl.glVertex3f(-2.0f, 0.0f, 0.0f); // P6
			    gl.glVertex3f(-1.5f, 1.5f, 0.0f); // P7
		    gl.glEnd();
		    
		    gl.glTranslatef(5.0f, 0.0f, 0.0f);
		    
		    gl.glColor3f(0.0f, 1.0f, 0.0f);
	    	gl.glBegin(GL_TRIANGLE_STRIP);
		    	gl.glVertex3f(0.0f, 2.0f, 0.0f); // P0
	    		gl.glVertex3f(1.5f, 1.5f, 0.0f); // P1
		    	gl.glVertex3f(2.0f, 0.0f, 0.0f); // P2
		    	gl.glVertex3f(1.5f, -1.5f, 0.0f); // P3
		    	gl.glVertex3f(0.0f, -2.0f, 0.0f); // P4
		    	gl.glVertex3f(-1.5f, -1.5f, 0.0f); // P5
		    	gl.glVertex3f(-2.0f, 0.0f, 0.0f); // P6
			    gl.glVertex3f(-1.5f, 1.5f, 0.0f); // P7
		    gl.glEnd();
		    
		    gl.glTranslatef(-10.0f, -5.0f, 0.0f);
		    
		    gl.glColor3f(0.0f, 1.0f, 0.0f);
	    	gl.glBegin(GL_TRIANGLE_FAN);
		    	gl.glVertex3f(0.0f, 2.0f, 0.0f); // P0
	    		gl.glVertex3f(1.5f, 1.5f, 0.0f); // P1
		    	gl.glVertex3f(2.0f, 0.0f, 0.0f); // P2
		    	gl.glVertex3f(1.5f, -1.5f, 0.0f); // P3
		    	gl.glVertex3f(0.0f, -2.0f, 0.0f); // P4
		    	gl.glVertex3f(-1.5f, -1.5f, 0.0f); // P5
		    	gl.glVertex3f(-2.0f, 0.0f, 0.0f); // P6
			    gl.glVertex3f(-1.5f, 1.5f, 0.0f); // P7
		    gl.glEnd();
		    
		    gl.glTranslatef(5.0f, 0.0f, 0.0f);
		    
		    gl.glColor3f(0.0f, 1.0f, 0.0f);
	    	gl.glBegin(GL_QUADS);
		    	gl.glVertex3f(0.0f, 2.0f, 0.0f); // P0
	    		gl.glVertex3f(1.5f, 1.5f, 0.0f); // P1
		    	gl.glVertex3f(2.0f, 0.0f, 0.0f); // P2
		    	gl.glVertex3f(1.5f, -1.5f, 0.0f); // P3
		    	gl.glVertex3f(0.0f, -2.0f, 0.0f); // P4
		    	gl.glVertex3f(-1.5f, -1.5f, 0.0f); // P5
		    	gl.glVertex3f(-2.0f, 0.0f, 0.0f); // P6
			    gl.glVertex3f(-1.5f, 1.5f, 0.0f); // P7
		    gl.glEnd();
		    
		    gl.glTranslatef(5.0f, 0.0f, 0.0f);
		    
		    gl.glColor3f(0.0f, 1.0f, 0.0f);
	    	gl.glBegin(GL_QUAD_STRIP);
		    	gl.glVertex3f(0.0f, 2.0f, 0.0f); // P0
	    		gl.glVertex3f(1.5f, 1.5f, 0.0f); // P1
		    	gl.glVertex3f(2.0f, 0.0f, 0.0f); // P2
		    	gl.glVertex3f(1.5f, -1.5f, 0.0f); // P3
		    	gl.glVertex3f(0.0f, -2.0f, 0.0f); // P4
		    	gl.glVertex3f(-1.5f, -1.5f, 0.0f); // P5
		    	gl.glVertex3f(-2.0f, 0.0f, 0.0f); // P6
			    gl.glVertex3f(-1.5f, 1.5f, 0.0f); // P7
		    gl.glEnd();
		    
		    gl.glTranslatef(5.0f, 0.0f, 0.0f);
		    
		    gl.glColor3f(0.0f, 1.0f, 0.0f);
	    	gl.glBegin(GL_POLYGON);
		    	gl.glVertex3f(0.0f, 2.0f, 0.0f); // P0
	    		gl.glVertex3f(1.5f, 1.5f, 0.0f); // P1
		    	gl.glVertex3f(2.0f, 0.0f, 0.0f); // P2
		    	gl.glVertex3f(1.5f, -1.5f, 0.0f); // P3
		    	gl.glVertex3f(0.0f, -2.0f, 0.0f); // P4
		    	gl.glVertex3f(-1.5f, -1.5f, 0.0f); // P5
		    	gl.glVertex3f(-2.0f, 0.0f, 0.0f); // P6
			    gl.glVertex3f(-1.5f, 1.5f, 0.0f); // P7
		    gl.glEnd();
		    
	    }
	    
	    
	    public void drawGLSceneCubes(GLAutoDrawable glDrawable) {
	    	GL2 gl = glDrawable.getGL().getGL2();
	    	gl.glClear(GL_COLOR_BUFFER_BIT| GL_DEPTH_BUFFER_BIT);
	    	gl.glLoadIdentity();
	    	
	    	gl.glTranslatef(-2.0f, 0.0f, -10.0f);
	    	
	    	// Cube trådmodell v1
	    	gl.glColor3f(0.0f, 1.0f, 0.0f);
	    	
	    	// Topp
	    	gl.glBegin(GL_LINE_LOOP); 
	    		gl.glVertex3f(1.0f, 1.0f, 1.0f);
	    		gl.glVertex3f(1.0f, -1.0f, 1.0f);
	    		gl.glVertex3f(-1.0f, -1.0f, 1.0f);
	    		gl.glVertex3f(-1.0f, 1.0f, 1.0f);
	    	gl.glEnd();
	    	
	    	// Side 1
	    	gl.glBegin(GL_LINE_LOOP); 
	    		gl.glVertex3f(-1.0f, -1.0f, 1.0f);
	    		gl.glVertex3f(-1.0f, 1.0f, 1.0f);
	    		gl.glVertex3f(-1.0f, 1.0f, -1.0f);
	    		gl.glVertex3f(-1.0f, -1.0f, -1.0f);
    		gl.glEnd();
    		
    		// Side 2
	    	gl.glBegin(GL_LINE_LOOP); 
	    		gl.glVertex3f(1.0f, -1.0f, 1.0f);
	    		gl.glVertex3f(1.0f, 1.0f, 1.0f);
	    		gl.glVertex3f(1.0f, 1.0f, -1.0f);
	    		gl.glVertex3f(1.0f, -1.0f, -1.0f);
    		gl.glEnd();
    		
    		// Side 3
	    	gl.glBegin(GL_LINE_LOOP); 
	    		gl.glVertex3f(1.0f, 1.0f, 1.0f);
	    		gl.glVertex3f(-1.0f, 1.0f, 1.0f);
	    		gl.glVertex3f(-1.0f, 1.0f, -1.0f);
	    		gl.glVertex3f(1.0f, 1.0f, -1.0f);
    		gl.glEnd();
    		
    		// Side 4
	    	gl.glBegin(GL_LINE_LOOP); 
	    		gl.glVertex3f(-1.0f, 1.0f, 1.0f);
	    		gl.glVertex3f(1.0f, 1.0f, 1.0f);
	    		gl.glVertex3f(1.0f, 1.0f, -1.0f);
	    		gl.glVertex3f(-1.0f, 1.0f, -1.0f);
    		gl.glEnd();
    		
    		// Bunn
    		gl.glBegin(GL_LINE_LOOP); 
	    		gl.glVertex3f(-1.0f, 1.0f, -1.0f);
	    		gl.glVertex3f(-1.0f, -1.0f, -1.0f);
	    		gl.glVertex3f(1.0f, -1.0f, -1.0f);
	    		gl.glVertex3f(1.0f, 1.0f, -1.0f);
	    	gl.glEnd();
	    		
	    	gl.glTranslatef(4.0f, 0.0f, 0.0f);
	    	
	    	// Cube trådmodell v2
	    	glut.glutWireCube(2.0f);
	    	
	    }
	    
	    public void drawGLSceneTransform(GLAutoDrawable glDrawable) {
	    	GL2 gl = glDrawable.getGL().getGL2();
	    	gl.glClear(GL_COLOR_BUFFER_BIT| GL_DEPTH_BUFFER_BIT);
	    	gl.glLoadIdentity();
	    	
	    	glu.gluLookAt(0.0, camY, 10.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0);
	    	
	    	gl.glColor3f(0.0f, 1.0f, 0.0f);
	    	
	    	gl.glTranslatef(-3.0f, 0.0f, 0.0f);
	    	glut.glutWireCube(2.0f);
	    	gl.glTranslatef(3.0f, 0.0f, 0.0f);
	    	gl.glRotatef(50.0f, 0.0f, 1.0f, 0.0f);
	    	glut.glutWireCube(2.0f);
	    	gl.glTranslatef(3.0f, 0.0f, 0.0f);
	    	gl.glRotatef(-50.0f, 0.0f, 1.0f, 0.0f);
	    	gl.glScalef(1.0f, 2.0f, 1.0f);
	    	glut.glutWireCube(2.0f);
	    	
	    }

	    public void display(GLAutoDrawable glDrawable) {
	        GL2 gl = glDrawable.getGL().getGL2();
	        
	        // Oppgave 2.1
	        //drawGLSceneObjects(glDrawable);
	        
	        // Oppgave 2.2
	        //drawGLSceneCubes(glDrawable);
	        
	        // Oppgave 2.3
	        drawGLSceneTransform(glDrawable);
	        num += 0.1;
	        double value = Math.sin(num) * 10;
	        camY = value;
	        
	        gl.glFlush(); // Tvinger tidligere buffrede OpenGL kommandoer til å utføres med en gang.
	    }
}
