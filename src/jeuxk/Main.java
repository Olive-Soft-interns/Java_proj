package jeuxk;

import javax.swing.JFrame;

public class Main {
	public static Scene scene ; 
	public static void main(String[] arg) {
	int a ;
	int b ;
	int c; 
		
		JFrame fenetre = new JFrame("mario 2018");//cr�er un Jframe
		  fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fenetre
		  fenetre.setSize(700, 360);
		  fenetre.setLocationRelativeTo(null);
		  fenetre.setResizable(false);
		  fenetre.setAlwaysOnTop(true);
		  
		 scene=new Scene() ; 
		 fenetre.setContentPane(scene);
		 fenetre.setVisible(true);
		 
		  
		   
		
	}

}
