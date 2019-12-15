package sciigo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import java.util.Date;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Praktiketo extends JFrame implements WindowFocusListener {

	public static void main(String[] args) {
		new Praktiketo().setVisible(true);
	}
	
	private String MM = "Fenestrego";
	private Object arg1 = new Object();
	private int arg2 = 1;
	private int oT = 1;
	private JPanel pp = new JPanel();
	private JPanel hh = new JPanel();
	
	private JRadioButton rbtn_k1_M = new JRadioButton("Mensaĝo");
	private JRadioButton rbtn_k1_C = new JRadioButton("Konfirmado");
	private JRadioButton rbtn_k1_I = new JRadioButton("Enigado de informon");
	private JRadioButton rbtn_k1_MM = new JRadioButton("Miksito el la supraj");
	
	private JRadioButton rbtn_k2_IF = new JRadioButton("Iksa formo");
	private JRadioButton rbtn_k2_I = new JRadioButton("Informaĵo");
	private JRadioButton rbtn_k2_S = new JRadioButton("Sciigoj");
	private JRadioButton rbtn_k2_D = new JRadioButton("Demando");
	private JRadioButton rbtn_k2_M = new JRadioButton("Malplena");
	
	private JRadioButton rbtn_k3_T = new JRadioButton("Teksto");
	private JRadioButton rbtn_k3_I = new JRadioButton("Ikono");
	private JRadioButton rbtn_k3_K = new JRadioButton("Komponanto");
	private JRadioButton rbtn_k3_A = new JRadioButton("Alio(dato)");
	private JRadioButton rbtn_k3_CX = new JRadioButton("Ĉiu");
	private JRadioButton rbtn_k3_M = new JRadioButton("Malplena");
	
	private JRadioButton rbtn_k4_N = new JRadioButton("Bone");
	private JRadioButton rbtn_k4_J = new JRadioButton("Jes kaj ne");
	private JRadioButton rbtn_k4_NN = new JRadioButton("Jes, ne kaj nuligi");
	private JRadioButton rbtn_k4_B = new JRadioButton("Bone kaj nuligi");
	
	private JRadioButton rbtn_k5_T = new JRadioButton("Teksto");
	private JRadioButton rbtn_k5_M = new JRadioButton("Elektado");
	
	private JRadioButton rbtn_k6_T = new JRadioButton("Tekstoj");
	private JRadioButton rbtn_k6_I = new JRadioButton("Ikonoj");
	private JRadioButton rbtn_k6_M = new JRadioButton("Miksado");
	
	public Praktiketo() {
		
		JPanel g = new JPanel(new BorderLayout());
		
		JPanel h = new JPanel();
		
		JPanel j = new JPanel(new GridLayout(2, 3));
		
		kk l = new kk();

		Box k1 = Box.createVerticalBox();
		Box k2 = Box.createVerticalBox();
		Box k3 = Box.createVerticalBox();
		Box k4 = Box.createVerticalBox();
		Box k5 = Box.createVerticalBox();
		Box k6 = Box.createVerticalBox();
		
		JButton btn_mon = new JButton("Montri");
		
		ButtonGroup oo = new ButtonGroup();
		ButtonGroup ou = new ButtonGroup();
		ButtonGroup oe = new ButtonGroup();
		ButtonGroup ox = new ButtonGroup();
		ButtonGroup or = new ButtonGroup();
		ButtonGroup ov = new ButtonGroup();
		
		JLabel lb_k1 = new JLabel("Tipoj de fenestro:");
		JLabel lb_k2 = new JLabel("Tipoj de ikono:");
		JLabel lb_k3 = new JLabel("Tipoj de mensaĝo:");
		JLabel lb_k4 = new JLabel("Tipoj de komfirmado:");
		JLabel lb_k5 = new JLabel("Tipoj de enigado de informo:");
		JLabel lb_k6 = new JLabel("Tipoj de miksado:");
		
		oo.add(rbtn_k1_M);
		oo.add(rbtn_k1_C);
		oo.add(rbtn_k1_I);
		oo.add(rbtn_k1_MM);
		
		ou.add(rbtn_k2_IF);
		ou.add(rbtn_k2_S);
		ou.add(rbtn_k2_I);
		ou.add(rbtn_k2_D);
		ou.add(rbtn_k2_M);
		
		ox.add(rbtn_k3_T);
		ox.add(rbtn_k3_I);
		ox.add(rbtn_k3_K);
		ox.add(rbtn_k3_A);
		ox.add(rbtn_k3_M);
		ox.add(rbtn_k3_CX);
		
		oe.add(rbtn_k4_J);
		oe.add(rbtn_k4_N);
		oe.add(rbtn_k4_NN);
		oe.add(rbtn_k4_B);
		
		or.add(rbtn_k5_T);
		or.add(rbtn_k5_M);
		
		ov.add(rbtn_k6_I);
		ov.add(rbtn_k6_T);
		ov.add(rbtn_k6_M);
		
		setTitle("Praktiko granda");
		setSize(850, 580);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		addWindowFocusListener(this);
		setContentPane(g);
		
		pp.setBackground(new Color(0, 200, 175));
		
		rbtn_k1_M.setSelected(true);
		rbtn_k2_I.setSelected(true);
		rbtn_k3_T.setSelected(true);
		rbtn_k4_N.setSelected(true);
		rbtn_k5_T.setSelected(true);
		rbtn_k6_T.setSelected(true);
		
		rbtn_k4_N.setEnabled(false);
		rbtn_k4_J.setEnabled(false);
		rbtn_k4_NN.setEnabled(false);
		rbtn_k4_B.setEnabled(false);
		
		rbtn_k5_T.setEnabled(false);
		rbtn_k5_M.setEnabled(false);
		
		rbtn_k6_T.setEnabled(false);
		rbtn_k6_M.setEnabled(false);
		rbtn_k6_I.setEnabled(false);
		
		hh.add(new JLabel("Teksto... TEKSTO POR VI KAJ VIA FELIĈO"));
		hh.add(new JLabel(new ImageIcon(Praktiketo.class.getResource("/ikonoj/Sen surskribo n.png"))));
		hh.add(pp);
		hh.add(new JLabel(new Date().toString()));
		
		rbtn_k1_M.addActionListener(l);
		rbtn_k1_MM.addActionListener(l);
		rbtn_k1_C.addActionListener(l);
		rbtn_k1_I.addActionListener(l);
		
		rbtn_k4_N.addActionListener(l);
		rbtn_k4_N.addActionListener(l);
		rbtn_k4_N.addActionListener(l);
		rbtn_k4_N.addActionListener(l);
		
		rbtn_k5_T.addActionListener(l);
		rbtn_k5_M.addActionListener(l);
		
		rbtn_k6_T.addActionListener(l);
		rbtn_k6_I.addActionListener(l);
		rbtn_k6_M.addActionListener(l);
		
		k1.add(lb_k1);
		k1.add(rbtn_k1_M);
		k1.add(rbtn_k1_C);
		k1.add(rbtn_k1_I);
		k1.add(rbtn_k1_MM);
		
		k2.add(lb_k2);
		k2.add(rbtn_k2_IF);
		k2.add(rbtn_k2_I);
		k2.add(rbtn_k2_S);
		k2.add(rbtn_k2_D);
		k2.add(rbtn_k2_M);
		
		k3.add(lb_k3);
		k3.add(rbtn_k3_T);
		k3.add(rbtn_k3_I);
		k3.add(rbtn_k3_K);
		k3.add(rbtn_k3_A);
		k3.add(rbtn_k3_M);
		k3.add(rbtn_k3_CX);
		
		k4.add(lb_k4);
		k4.add(rbtn_k4_N);
		k4.add(rbtn_k4_J);
		k4.add(rbtn_k4_NN);
		k4.add(rbtn_k4_B);
		
		k5.add(lb_k5);
		k5.add(rbtn_k5_T);
		k5.add(rbtn_k5_M);
		
		k6.add(lb_k6);
		k6.add(rbtn_k6_T);
		k6.add(rbtn_k6_I);
		k6.add(rbtn_k6_M);
		
		j.add(k1);
		j.add(k2);
		j.add(k3);
		j.add(k4);
		j.add(k5);
		j.add(k6);
		
		h.add(btn_mon);
		
		btn_mon.addActionListener(new gg());
		
		g.add(h, BorderLayout.SOUTH);
		g.add(j, BorderLayout.CENTER);
		
	}
	
	@Override
	public void windowGainedFocus(WindowEvent e) {
		setTitle("Praktiko granda");
	}
	
	@Override
	public void windowLostFocus(WindowEvent e) {
		setTitle("Esperanto estas la plej bona lingvo de la mondo tuta, eĉ pli bona ol Ido!");
	}
	
	private class gg implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(rbtn_k2_IF.isSelected()) {
				arg2 = 0;
			}else if(rbtn_k2_I.isSelected()) {
				arg2 = 1;
			}else if(rbtn_k2_S.isSelected()) {
				arg2 = 2;
			}else if(rbtn_k2_D.isSelected()) {
				arg2 = 3;
			}else if(rbtn_k2_M.isSelected()) {
				arg2 = -1;
			}
			
			if(rbtn_k3_T.isSelected()) {
				arg1 = "Teksto... TEKSTO POR VI KAJ VIA FELIĈO";
			}else if(rbtn_k3_I.isSelected()) {
				arg1 = new ImageIcon(Praktiketo.class.getResource("/ikonoj/Sen surskribo n.png"));
			}else if(rbtn_k3_K.isSelected()) {
				arg1 = pp;
			}else if(rbtn_k3_A.isSelected()) {
				arg1 = new Date();
			}else if(rbtn_k3_CX.isSelected()) {
				arg1 = hh;
			}else if(rbtn_k3_M.isSelected()) {
				arg1 = null;
			}
			
			if(rbtn_k4_N.isSelected()) {
				oT = -1;
			}else if(rbtn_k4_J.isSelected()) {
				oT = JOptionPane.YES_NO_OPTION;
			}else if(rbtn_k4_NN.isSelected()) {
				oT = JOptionPane.YES_NO_CANCEL_OPTION;
			}else if(rbtn_k4_B.isSelected()) {
				oT = JOptionPane.OK_CANCEL_OPTION;
			}
			
			if(rbtn_k1_M.isSelected()) {
				JOptionPane.showMessageDialog(Praktiketo.this, arg1, MM, arg2);
			}else if(rbtn_k1_C.isSelected()) {
				JOptionPane.showConfirmDialog(Praktiketo.this, arg1, MM, oT, arg2);
			}else if(rbtn_k1_I.isSelected()) {
				
				if(rbtn_k5_T.isSelected()) {
					JOptionPane.showInputDialog(Praktiketo.this, arg1, MM, arg2);
				}else {
					JOptionPane.showInputDialog(Praktiketo.this, arg1, MM, arg2, null, new String[]
							{"ESPAÑOL", "ENGLISH", "ESP... Ĉu tio ĉi havas sencon?"}, 0);
				}
				
			}else if(rbtn_k1_MM.isSelected()) {
				
				if(rbtn_k6_I.isSelected()) {
					JOptionPane.showOptionDialog(Praktiketo.this, arg1, MM, 0, arg2, null, new ImageIcon[] {
							new ImageIcon(Praktiketo.class.getResource("/ikonoj/Sen surskribo n.png")),
									new ImageIcon(Praktiketo.class.getResource("/ikonoj/Sen surskribo n1.png")),
									new ImageIcon(Praktiketo.class.getResource("/ikonoj/Sen surskribo n2.png"))}, 0);
				}else if(rbtn_k6_M.isSelected()) {
					JOptionPane.showOptionDialog(Praktiketo.this, arg1, MM, 0, arg2, null, new Object[] {
							"Teksto... TEKSTO POR VI KAJ VIA FELIĈO",
									new ImageIcon(Praktiketo.class.getResource("/ikonoj/Sen surskribo n.png")), pp,
									new Date()}, 0);
				}else {
					JOptionPane.showOptionDialog(Praktiketo.this, arg1, MM, 0, arg2, null, new String[]
							{"Ĉu mi sentas vin?", "Mi volas duiĝi", "Ĉu ankaŭ ĉi tio havas sencon?"}, 0);
				}
				
			}
			
		}
		
	}
	
	private class kk implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(rbtn_k1_M.isSelected()) {
				
				rbtn_k4_N.setEnabled(false);
				rbtn_k4_J.setEnabled(false);
				rbtn_k4_NN.setEnabled(false);
				rbtn_k4_B.setEnabled(false);
				
				rbtn_k5_T.setEnabled(false);
				rbtn_k5_M.setEnabled(false);
				
				rbtn_k6_T.setEnabled(false);
				rbtn_k6_M.setEnabled(false);
				rbtn_k6_I.setEnabled(false);
				
			}
			
			if(rbtn_k1_C.isSelected()) {
				
				rbtn_k4_N.setEnabled(true);
				rbtn_k4_J.setEnabled(true);
				rbtn_k4_NN.setEnabled(true);
				rbtn_k4_B.setEnabled(true);
				
				rbtn_k5_T.setEnabled(false);
				rbtn_k5_M.setEnabled(false);
				
				rbtn_k6_T.setEnabled(false);
				rbtn_k6_M.setEnabled(false);
				rbtn_k6_I.setEnabled(false);
				
			}
			
			if(rbtn_k1_I.isSelected()) {
				
				rbtn_k4_N.setEnabled(false);
				rbtn_k4_J.setEnabled(false);
				rbtn_k4_NN.setEnabled(false);
				rbtn_k4_B.setEnabled(false);
				
				rbtn_k5_T.setEnabled(true);
				rbtn_k5_M.setEnabled(true);
				
				rbtn_k6_T.setEnabled(false);
				rbtn_k6_M.setEnabled(false);
				rbtn_k6_I.setEnabled(false);
				
			}
			
			if(rbtn_k1_MM.isSelected()) {
				
				rbtn_k4_N.setEnabled(false);
				rbtn_k4_J.setEnabled(false);
				rbtn_k4_NN.setEnabled(false);
				rbtn_k4_B.setEnabled(false);
				
				rbtn_k5_T.setEnabled(false);
				rbtn_k5_M.setEnabled(false);
				
				rbtn_k6_T.setEnabled(true);
				rbtn_k6_M.setEnabled(true);
				rbtn_k6_I.setEnabled(true);
				
			}
			
		}
		
	}
	
}