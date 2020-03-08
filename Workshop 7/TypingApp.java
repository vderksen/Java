//JAC444NEE
//Valentina Derksen
//Student id: 153803184

// Workshop 7
// Date: 2020-03-08


import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class TypingApp {

	public static void main(String[] args) {
		// Set a name for the Frame
		JFrame frame = new JFrame("Typing Tutor");
		frame.setSize(620, 450);
		frame.setResizable(false);
		frame.setLayout(new GridLayout(2,0));
			
		// CREATE PANEL FOR THE TEXT AREA AND LABELS
		JPanel text = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel txt1 = new JLabel("Type some text using keyboard. The keys press will be highlighted and the text will be displayed.");       
		JLabel txt2 = new JLabel("Note: Clicking the buttos with your mouse will not perform any actions.");    
		JTextArea txtArea=new JTextArea();
		txtArea.setPreferredSize(new Dimension(600, 200));
		
		text.add(txt1);
		text.add(txt2);
		text.add(txtArea);
		
		// SET A GROUP OF KEYBUTTONS IN THE 1st ROW
		JButton btn = new JButton("~");
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
        JButton btn0 = new JButton("0");
        JButton btnMin = new JButton("-");
        JButton btnPl = new JButton("+");
        JButton btnBckSp = new JButton("Backspace");
        btnBckSp.setPreferredSize(new Dimension(80, 40));
        
        JButton[] group1 = new JButton[]{btn,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnMin,btnPl,btnBckSp};
        JPanel btnGroup1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        for (JButton i : group1) {
        	btnGroup1.add(i);
        }
		             
		// SET A GROUP OF KEYBUTTONS IN THE 2nd ROW
		JButton btnTab = new JButton("Tab");
        btnTab.setPreferredSize(new Dimension(60, 40));
        JButton btnQ = new JButton("Q");
        JButton btnW = new JButton("W");
        JButton btnE = new JButton("E");
        JButton btnR = new JButton("R");
        JButton btnT = new JButton("T");
        JButton btnY = new JButton("Y");
        JButton btnU = new JButton("U");
        JButton btnI = new JButton("I");
        JButton btnO = new JButton("O");
        JButton btnP = new JButton("P");
        JButton btnSqBr1 = new JButton("[");
        JButton btnSqBr2 = new JButton("]");
        JButton btnFr = new JButton("\\");

        JButton[] group2 = new JButton[]{btnTab,btnQ,btnW,btnE,btnR,btnT,btnY,btnU,btnI,btnO,btnP,btnSqBr1,btnSqBr2,btnFr};
        JPanel btnGroup2 = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        for (JButton i : group2) {
        	btnGroup2.add(i);
        }

		// SET A GROUP OF KEYBUTTONS IN THE 3d ROW
        JButton btnCaps = new JButton("Caps");
        btnCaps.setPreferredSize(new Dimension(60, 40));
        JButton btnA = new JButton("A");
        JButton btnS = new JButton("S");
        JButton btnD = new JButton("D");
        JButton btnF = new JButton("F");
        JButton btnG = new JButton("G");
        JButton btnH = new JButton("H");
        JButton btnJ = new JButton("J");
        JButton btnK = new JButton("K");
        JButton btnL = new JButton("L");
        JButton btnCol = new JButton(":");
        JButton btnBrac = new JButton("\"");
        JButton btnEnter = new JButton("Enter");
        btnEnter.setPreferredSize(new Dimension(80, 40));
        
        JButton[] group3 = new JButton[] {btnCaps,btnA,btnS,btnD,btnF,btnG,btnH,btnJ,btnK,btnL,btnCol,btnBrac,btnEnter};
        JPanel btnGroup3 = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        for (JButton i : group3) {
        	btnGroup3.add(i);
        }
		        
        // SET A GROUP OF KEYBUTTONS IN THE 4th ROW
        JButton btnShift = new JButton("Shift");
        btnShift.setPreferredSize(new Dimension(80, 40));
        JButton btnZ = new JButton("Z");
        JButton btnX = new JButton("X");
        JButton btnC = new JButton("C");
        JButton btnV = new JButton("V");
        JButton btnB = new JButton("B");
        JButton btnN = new JButton("N");
        JButton btnM = new JButton("M");
        JButton btnComma = new JButton(",");
        JButton btnDot = new JButton(".");
        JButton btnQuest = new JButton("?");
        JButton btnTop = new JButton("^");
        JPanel btnTopHolder= new JPanel();
        btnTopHolder.add(btnTop);
        //btnTop.setPreferredSize(new Dimension(40, 40));
        btnTopHolder.setBorder(BorderFactory.createEmptyBorder(0, 15, 0, 0));

        JButton[] group4 = new JButton[] {btnShift,btnZ,btnX,btnC,btnV,btnB,btnN,btnM,btnComma,btnDot,btnQuest};
        JPanel btnGroup4 = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        btnGroup4.setBorder(BorderFactory.createEmptyBorder(-5, 0, -5, 0));

        for (JButton i : group4) {
        	btnGroup4.add(i);
        }
        btnGroup4.add(btnTopHolder);

        
        // SET A GROUP OF KEYBUTTONS IN THE 5th ROW
        JButton btnSpace = new JButton("");
        JPanel btnSpaceHolder= new JPanel();
        btnSpaceHolder.add(btnSpace);
        btnSpace.setPreferredSize(new Dimension(250, 40));
        btnSpaceHolder.setBorder(BorderFactory.createEmptyBorder(0, 150, 0, 50));

        JButton btnLeft = new JButton("<");
        JButton btnBottom = new JButton("v");
        JButton btnRight = new JButton(">");

        JButton[] group5 = new JButton[] {btnLeft,btnBottom,btnRight};
        JPanel btnGroup5 = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        btnGroup5.setBorder(BorderFactory.createEmptyBorder(-5, 0, -5, 0));

        btnGroup5.add(btnSpaceHolder);
        for (JButton i : group5) {
        	btnGroup5.add(i);
        }
        
        // SET A SIZE FOR SMALL BUTTONS
        JButton[] buttons = new JButton[]{
        		btn,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnMin,btnPl,
        		btnQ,btnW,btnE,btnR,btnT,btnY,btnU,btnI,btnO,btnP,btnSqBr1,btnSqBr2,btnFr,
        		btnA,btnS,btnD,btnF,btnG,btnH,btnJ,btnK,btnL,btnCol,btnBrac,
        		btnZ,btnX,btnC,btnV,btnB,btnN,btnM,btnComma,btnDot,btnQuest,btnTop,btnLeft,btnBottom, btnRight};
       
        for (JButton i : buttons) {
        	   i.setPreferredSize(new Dimension(40, 40));
        }
        
        // CREATE KEYBOARD PANEL
        JPanel keyboard = new JPanel();
        keyboard.add(btnGroup1);
        keyboard.add(btnGroup2);
        keyboard.add(btnGroup3);
        keyboard.add(btnGroup4);
        keyboard.add(btnGroup5);
        
        FlowLayout keyboardLayout = new FlowLayout(FlowLayout.LEFT);
        keyboardLayout.setVgap(-2);
        keyboardLayout.setHgap(-2);
        keyboard.setLayout(keyboardLayout);
        keyboard.setBorder(BorderFactory.createEmptyBorder(20, 10, 0, 0));
        
        // PLACE ALL NODES ON THE PANE
        frame.add(text); 
        frame.add(keyboard); 
        
       
        /************** EVENTS HANDLING ******************/
        
        // ADD KEYLISTENER TO THE TEXT AREA
        txtArea.addKeyListener(new KeyAdapter() {
      			Color originalColor = btn.getBackground(); // save the original buttons color
      			
      			// CHANGE BACKGROUND COLOR WHEN KEY PRESSED
      			public void keyPressed(KeyEvent e) {
      				int keyCode = e.getKeyCode(); // get key code
      				switch(keyCode){
      				case KeyEvent.VK_0:
      	        	    btn0.setOpaque(true);
      					btn0.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_1:
      	        	    btn1.setOpaque(true);
      					btn1.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_2:
      	        	    btn2.setOpaque(true);
      					btn2.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_3:
      	        	    btn3.setOpaque(true);
      					btn3.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_4:
      					btn4.setOpaque(true);
      					btn4.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_5:
      					btn5.setOpaque(true);
      					btn5.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_6:
      					btn6.setOpaque(true);
      					btn6.setBackground(Color.RED);
      					break;	
      				case KeyEvent.VK_7:
      					btn7.setOpaque(true);
      					btn7.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_8:
      					btn8.setOpaque(true);
      					btn8.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_9:
      					btn9.setOpaque(true);
      					btn9.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_A:
      					btnA.setOpaque(true);
      					btnA.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_B:
      					btnB.setOpaque(true);
      					btnB.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_C:
      					btnC.setOpaque(true);
      					btnC.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_D:
      					btnD.setOpaque(true);
      					btnD.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_E:
      					btnE.setOpaque(true);
      					btnE.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_F:
      					btnF.setOpaque(true);
      					btnF.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_G:
      					btnG.setOpaque(true);
      					btnG.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_H:
      					btnH.setOpaque(true);
      					btnH.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_I:
      					btnI.setOpaque(true);
      					btnI.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_J:
      					btnJ.setOpaque(true);
      					btnJ.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_K:
      					btnK.setOpaque(true);
      					btnK.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_L:
      					btnL.setOpaque(true);
      					btnL.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_M:
      					btnM.setOpaque(true);
      					btnM.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_N:
      					btnN.setOpaque(true);
      					btnN.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_O:
      					btnO.setOpaque(true);
      					btnO.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_P:
      					btnP.setOpaque(true);
      					btnP.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_Q:
      					btnQ.setOpaque(true);
      					btnQ.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_R:
      					btnR.setOpaque(true);
      					btnR.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_S:
      					btnS.setOpaque(true);
      					btnS.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_T:
      					btnT.setOpaque(true);
      					btnT.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_U:
      					btnU.setOpaque(true);
      					btnU.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_V:
      					btnV.setOpaque(true);
      					btnV.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_W:
      					btnW.setOpaque(true);
      					btnW.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_X:
      					btnX.setOpaque(true);
      					btnX.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_Y:
      					btnY.setOpaque(true);
      					btnY.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_Z:
      					btnZ.setOpaque(true);
      					btnZ.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_EQUALS:
      					btnPl.setOpaque(true);
      					btnPl.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_MINUS:
      					btnMin.setOpaque(true);
      					btnMin.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_TAB:
      					btnTab.setOpaque(true);
      					btnTab.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_SHIFT:
      					btnShift.setOpaque(true);
      					btnShift.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_ENTER:
      					btnEnter.setOpaque(true);
      					btnEnter.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_CAPS_LOCK:
      					btnCaps.setOpaque(true);
      					btnCaps.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_BACK_SPACE:
      					btnBckSp.setOpaque(true);
      					btnBckSp.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_SEMICOLON:
      					btnCol.setOpaque(true);
      					btnCol.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_BACK_SLASH:
      					btnFr.setOpaque(true);
      					btnFr.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_OPEN_BRACKET:
      					btnSqBr1.setOpaque(true);
      					btnSqBr1.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_CLOSE_BRACKET:
      					btnSqBr2.setOpaque(true);
      					btnSqBr2.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_COMMA:
      					btnComma.setOpaque(true);
      					btnComma.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_QUOTE:
      					btnBrac.setOpaque(true);
      					btnBrac.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_PERIOD:
      					btnDot.setOpaque(true);
      					btnDot.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_SLASH:
      					btnQuest.setOpaque(true);
      					btnQuest.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_SPACE:
      					btnSpace.setOpaque(true);
      					btnSpace.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_BACK_QUOTE:
      					btn.setOpaque(true);
      					btn.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_UP:
      					btnTop.setOpaque(true);
      					btnTop.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_DOWN:
      					btnBottom.setOpaque(true);
      					btnBottom.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_LEFT:
      					btnLeft.setOpaque(true);
      					btnLeft.setBackground(Color.RED);
      					break;
      				case KeyEvent.VK_RIGHT:
      					btnRight.setOpaque(true);
      					btnRight.setBackground(Color.RED);
      					break;
      				}
      			}
      			//  BACK TO ORIGINAL COLOR WHEN KEY RELEASED
      			public void keyReleased(KeyEvent e) {
      				int keyCode = e.getKeyCode(); // get key code
      				switch(keyCode){
      				case KeyEvent.VK_0:
      					btn0.setBackground(originalColor);
      					break;			
      				case KeyEvent.VK_1:
      					btn1.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_2:
      					btn2.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_3:
      					btn3.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_4:
      					btn4.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_5:
      					btn5.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_6:
      					btn6.setBackground(originalColor);
      					break;	
      				case KeyEvent.VK_7:
      					btn7.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_8:
      					btn8.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_9:
      					btn9.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_A:
      					btnA.setBackground(originalColor);
      					break;	
      				case KeyEvent.VK_B:	
      					btnB.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_C:
      					btnC.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_D:
      					btnD.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_E:
      					btnE.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_F:
      					btnF.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_G:
      					btnG.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_H:
      					btnH.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_I:
      					btnI.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_J:
      					btnJ.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_K:
      					btnK.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_L:
      					btnL.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_M:
      					btnM.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_N:
      					btnN.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_O:
      					btnO.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_P:
      					btnP.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_Q:
      					btnQ.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_R:
      					btnR.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_S:
      					btnS.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_T:
      					btnT.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_U:
      					btnU.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_V:
      					btnV.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_W:
      					btnW.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_X:
      					btnX.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_Y:
      					btnY.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_Z:
      					btnZ.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_EQUALS:
      					btnPl.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_MINUS:
      					btnMin.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_TAB:
      					btnTab.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_SHIFT:
      					btnShift.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_ENTER:
      					btnEnter.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_CAPS_LOCK:
      					btnCaps.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_BACK_SPACE:
      					btnBckSp.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_SEMICOLON:
      					btnCol.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_BACK_SLASH:
      					btnFr.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_OPEN_BRACKET:
      					btnSqBr1.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_CLOSE_BRACKET:
      					btnSqBr2.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_COMMA:
      					btnComma.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_QUOTE:
      					btnBrac.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_PERIOD:
      					btnDot.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_SLASH:
      					btnQuest.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_SPACE:
      					btnSpace.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_BACK_QUOTE:
      					btn.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_UP:
      					btnTop.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_DOWN:
      					btnBottom.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_LEFT:
      					btnLeft.setBackground(originalColor);
      					break;
      				case KeyEvent.VK_RIGHT:
      					btnRight.setBackground(originalColor);
      					break;
      				}
      			}
      		});
        

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
