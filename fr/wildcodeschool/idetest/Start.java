package fr.wildcodeschool.idetest;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class Start {

	public static void main(String[] args) throws MalformedURLException {
		System.out.println(ProcessHandle.current().pid());

	     JFrame jf = new JFrame("Gotcha!");
	     jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	     jf.add(new JLabel(new ImageIcon(new URL("https://i2.cdscdn.com/pdt2/1/5/0/1/700x700/est2009818763150/rw/50pcs-graines-de-fleur-rose-arc-en-ciel-rare-pour.jpg"))));
	     jf.pack();
	     jf.setVisible(true);
	}

}
