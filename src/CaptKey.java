
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class CaptKey extends JFrame implements NativeKeyListener{
    private int temoin, temoin2;
    public CaptKey() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(new Dimension (300, 100));
        setTitle("Copy Paste Hidden");
        System.out.println("lancement affichage");
        
        temoin = 0;
        temoin2 = 0;
        //temoin3 = 0;

        setVisible(true);
    }
    
    public static void main(String[] args) {
        new CaptKey();
        try {
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException e) {
            //e.printStackTrace();
        }

        GlobalScreen.addNativeKeyListener(new CaptKey());
    }
    
    //recuperation du press papier
    public static String getSysClipboardText() {
        String ret = "";
        Clipboard sysClip = Toolkit.getDefaultToolkit().getSystemClipboard();

        Transferable clipTf = sysClip.getContents(null);

        if (clipTf != null) {

            if (clipTf.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                try {
                    ret = (String) clipTf
                            .getTransferData(DataFlavor.stringFlavor);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return ret;
    }
      
    
    @Override
    public void nativeKeyTyped(NativeKeyEvent arg0) {      
    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent e) {
        int codeDeLaTouche = e.getKeyCode();
         
        switch (codeDeLaTouche) // Les valeurs sont contenue dans NativeKeyEvent.
        {
	        case NativeKeyEvent.VC_CONTROL :
	        	temoin++;
	        	fonctionPast();
	        	
	            break;
	        case NativeKeyEvent.VC_I: 
	        	temoin2++;
	        	fonctionPast();
	        	
	            break;
        }
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent e) {
        // touche relachée
    	System.out.println("touche relachée");
    	temoin = 0;
    	temoin2 = 0;
    	//temoin3 = 0;
    }
    
    public void fonctionPast()
    {
    	if((temoin > 0) && (temoin2 > 0)) {
    		temoin = 0;
            temoin2 = 0;
            //temoin3 = 0;
            //&& (temoin3 > 0)
            String test = getSysClipboardText();
            try {Thread.sleep(3000);} catch (InterruptedException ie) {}
            System.out.println(test);
            
            // Creating array of string length 
            char[] ch = new char[test.length()];
            
            // Copy character by character into array 
            for (int i = 0; i < test.length(); i++) { 
                ch[i] = test.charAt(i); 
            } 
            
            // Printing content of array 
            for (char c : ch) { 
            	c = Character.toLowerCase(c);
                robotFrape(c);
            } 
        }
    }
    public void robotFrape(char charFrape){
    	//emulation de la frape
    	try {Thread.sleep(10);} catch (InterruptedException ie) {}
    	switch(charFrape) {
    	
    	case 'à' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_0);
                robot.keyRelease(KeyEvent.VK_0);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
        	break;

    	case '&' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_1);
                robot.keyRelease(KeyEvent.VK_1);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
        	break;

    	case 'é' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_2);
                robot.keyRelease(KeyEvent.VK_2);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
        	break;

    	case '"' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_3);
                robot.keyRelease(KeyEvent.VK_3);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
        	break;

    	

    	case '(' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_5);
                robot.keyRelease(KeyEvent.VK_5);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
        	break;

    	case '-' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_6);
                robot.keyRelease(KeyEvent.VK_6);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
        	break;

    	case 'è' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_7);
                robot.keyRelease(KeyEvent.VK_7);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
        	break;

    	case '_' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_8);
                robot.keyRelease(KeyEvent.VK_8);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
        	break;

    	case 'ç' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_9);
                robot.keyRelease(KeyEvent.VK_9);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
        	break;
    	/*
    	case 'é' :
    	try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_E);
            robot.keyRelease(KeyEvent.VK_E);
    	    } catch (AWTException e) {
    	            e.printStackTrace();
    	    }
    	fonctionPast();
    	break;
    	
    	case 'ç' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_C);
                robot.keyRelease(KeyEvent.VK_C);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
        	break;
    	
    	case 'è' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_E);
                robot.keyRelease(KeyEvent.VK_E);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
        	break;*/

    	case '!' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_EXCLAMATION_MARK);
                robot.keyRelease(KeyEvent.VK_EXCLAMATION_MARK);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
            break;
            
        case ' ' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_SPACE);
                robot.keyRelease(KeyEvent.VK_SPACE);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
            break;

        case '=' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_EQUALS);
                robot.keyRelease(KeyEvent.VK_EQUALS);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
            break;

        case ':' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_COLON);
                robot.keyRelease(KeyEvent.VK_COLON);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
            break;

        case ';' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_COMMA);
                robot.keyRelease(KeyEvent.VK_COMMA);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
            break;
    	
        case 'a' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_A);
                robot.keyRelease(KeyEvent.VK_A);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
            break;
            
        case 'b' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_B);
                robot.keyRelease(KeyEvent.VK_B);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
            break;
            
        case 'c' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_C);
                robot.keyRelease(KeyEvent.VK_C);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
            break;
            
        case 'd' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_D);
                robot.keyRelease(KeyEvent.VK_D);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
            break;
            
        case 'e' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_E);
                robot.keyRelease(KeyEvent.VK_E);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
            break;
            
        case 'f' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_F);
                robot.keyRelease(KeyEvent.VK_F);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
            break;
            
        case 'g' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_G);
                robot.keyRelease(KeyEvent.VK_G);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
            break;
            
        case 'h' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_H);
                robot.keyRelease(KeyEvent.VK_H);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
            break;
            
        case 'i' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_I);
                robot.keyRelease(KeyEvent.VK_I);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
            break;
            
        case 'j' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_J);
                robot.keyRelease(KeyEvent.VK_J);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
            break;
            
        case 'k' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_K);
                robot.keyRelease(KeyEvent.VK_K);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
            break;
            
        case 'l' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_L);
                robot.keyRelease(KeyEvent.VK_L);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
            break;
            
        case 'm' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_M);
                robot.keyRelease(KeyEvent.VK_M);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
            break;
            
        case 'n' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_N);
                robot.keyRelease(KeyEvent.VK_N);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
            break;
            
        case 'o' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_O);
                robot.keyRelease(KeyEvent.VK_O);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
            break;
            
        case 'p' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_P);
                robot.keyRelease(KeyEvent.VK_P);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
            break;
            
        case 'q' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_Q);
                robot.keyRelease(KeyEvent.VK_Q);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
            break;
            
        case 'r' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_R);
                robot.keyRelease(KeyEvent.VK_R);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
            break;
            
        case 's' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_S);
                robot.keyRelease(KeyEvent.VK_S);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
            break;
            
        case 't' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_T);
                robot.keyRelease(KeyEvent.VK_T);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
            break;
            
        case 'u' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_U);
                robot.keyRelease(KeyEvent.VK_U);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
            break;
            
        case 'v' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_V);
                robot.keyRelease(KeyEvent.VK_V);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
            break;
            
        case 'w' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_W);
                robot.keyRelease(KeyEvent.VK_W);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
            break;
            
        case 'x' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_X);
                robot.keyRelease(KeyEvent.VK_X);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
            break;
            
        case 'y' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_Y);
                robot.keyRelease(KeyEvent.VK_Y);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
            break;
            
        case 'z' :
        	try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_Z);
                robot.keyRelease(KeyEvent.VK_Z);
        	    } catch (AWTException e) {
        	            e.printStackTrace();
        	    }
        	fonctionPast();
            break;
            
        }
    }
    
}
