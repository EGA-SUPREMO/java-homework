package sciigo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Praktiketo extends JFrame implements WindowFocusListener {//391 kontraŭ 241
	
	public static void main(String[] args) {
		new Praktiketo().setVisible(true);
	}
	@Override
	public void windowGainedFocus(WindowEvent e) {
		setTitle("Praktiko granda");
	}
	@Override
	public void windowLostFocus(WindowEvent e) {
		setTitle("Esperanto estas la plej bona lingvo de la mondo tuta, eĉ pli bona ol Ido!");
	}
	
	private String M = "Fenestrego", B = "Tipo de ";
	
	private int arg2 = 1, oT = 1;
	
	private JPanel pp = new JPanel(), hh = new JPanel();
	
	private Object a = new Object();
	private Object gv[] = {"Teksto... TEKSTO POR VI KAJ VIA FELIĈO",
			new ImageIcon(Praktiketo.class.getResource("/ikonoj/Sen surskribo n.png")), pp, new Date(), hh, null};
	private Object h[] = {"Teksto... TEKSTO POR VI KAJ VIA FELIĈO",
			new ImageIcon(Praktiketo.class.getResource("/ikonoj/Sen surskribo n.png")), pp, new Date()};
	
	private r rbtn_k1[] = {new r("Mensaĝo"), new r("Konfirmado"), new r("Enigado de informon"),
			new r("Miksito el la supraj")};
	private r rbtn_k2[] = {new r("Malplena"), new r("Iksa formo"), new r("Informaĵo"), new r("Sciigoj"),
			new r("Demando")};
	private r rbtn_k3[] = {new r("Teksto"), new r("Ikono"), new r("Komponanto"), new r("Alio(dato)"),
			new r("Ĉiu"), new r("Malplena")};
	private r rbtn_k4[] = {new r("Bone"), new r("Jes kaj ne"), new r("Jes, ne kaj nuligi"), new r("Bone kaj nuligi")};
	private r rbtn_k5[] = {new r("Teksto"), new r("Elektado")};
	private r rbtn_k6[] = {new r("Tekstoj"), new r("Ikonoj"), new r("Miksado")};
	
	public Praktiketo() {
		
		JPanel g = new JPanel(new BorderLayout()), h = new JPanel(), j = new JPanel(new GridLayout(2, 3));
		
		Box k[] = {Box.createVerticalBox(), Box.createVerticalBox(), Box.createVerticalBox(), Box.createVerticalBox(),
				Box.createVerticalBox(), Box.createVerticalBox()};
		
		JButton btn_mon = new JButton("Montri");
		
		ButtonGroup oo[] = {new ButtonGroup(), new ButtonGroup(), new ButtonGroup(), new ButtonGroup(),
				new ButtonGroup(), new ButtonGroup()};
		
		String ob[] = {"fenestro:", "ikono:", "mensaĝo:", "komfirmado:", "enigado de informo:", "miksado:"};
		
		setTitle("Praktiko granda");
		setSize(850, 580);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		addWindowFocusListener(this);
		setContentPane(g);
		
		for(int i = 0;i<6;i++)
			k[i].setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), B + ob[i]));
		
		pp.setBackground(new Color(0, 200, 175));
		
		rbtn_k1[0].setSelected(true);///////////
		rbtn_k2[2].setSelected(true);///////////4
		rbtn_k3[0].setSelected(true);///////////
		rbtn_k4[0].setSelected(true);
		rbtn_k5[0].setSelected(true);
		rbtn_k6[0].setSelected(true);
		
		hh.add(new JLabel("Teksto... TEKSTO POR VI KAJ VIA FELIĈO"));
		hh.add(new JLabel(new ImageIcon(Praktiketo.class.getResource("/ikonoj/Sen surskribo n.png"))));
		hh.add(pp);
		hh.add(new JLabel(new Date().toString()));
		
		for(int i = 0;i<4;i++) {
			
			k[0].add(rbtn_k1[i]);
			oo[0].add(rbtn_k1[i]);
			
			
		}
		
		for(int i = 0;i<5;i++) {
			
			oo[1].add(rbtn_k2[i]);
			k[1].add(rbtn_k2[i]);
			
		}

		
		for(int i = 0;i<6;i++) {
			
			oo[2].add(rbtn_k3[i]);
			k[2].add(rbtn_k3[i]);
			
		}
		
		for(int i = 0;i<4;i++) {
			
			oo[3].add(rbtn_k4[i]);
			k[3].add(rbtn_k4[i]);
			rbtn_k4[i].setEnabled(rbtn_k1[1].isSelected());
			
		}
		
		for(int i = 0;i<2;i++) {
			
			oo[4].add(rbtn_k5[i]);
			k[4].add(rbtn_k5[i]);
			rbtn_k5[i].setEnabled(rbtn_k1[2].isSelected());
			
		}
		
		for(int i = 0;i<3;i++) {
			
			oo[5].add(rbtn_k6[i]);
			k[5].add(rbtn_k6[i]);
			rbtn_k6[i].setEnabled(rbtn_k1[3].isSelected());
			
		}
		
		for(int i = 0;i<6;i++)
			j.add(k[i]);
		
		h.add(btn_mon);
		
		btn_mon.addActionListener(new gg());
		
		g.add(h, BorderLayout.SOUTH);
		g.add(j, BorderLayout.CENTER);
		
	}
	
	private class gg implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			for(int i = -1;i<4;i++) 
				if(rbtn_k2[i+1].isSelected()) {
					arg2 = i;
					break;
				}
			
			for(int i =0;i < 6;i++)
				if(rbtn_k3[i].isSelected()) {
					a = gv[i];
					break;
				}
			
			for(int i = -1;i<3;i++)
				if(rbtn_k4[i+1].isSelected()) {
					oT = i;
					break;
				}
			
			if(rbtn_k1[0].isSelected()) {
				JOptionPane.showMessageDialog(Praktiketo2.this, a, M, arg2);
			}else if(rbtn_k1[1].isSelected()) {
				JOptionPane.showConfirmDialog(Praktiketo2.this, a, M, oT, arg2);
			}else if(rbtn_k1[2].isSelected()) {
				
				if(rbtn_k5[0].isSelected()) {
					JOptionPane.showInputDialog(Praktiketo2.this, a, M, arg2);
				}else {
					JOptionPane.showInputDialog(Praktiketo2.this, a, M, arg2, null, new String[]
							{"ESPAÑOL", "ENGLISH", "ESP... Ĉu tio ĉi havas sencon?"}, 0);
				}
				
			}else if(rbtn_k1[3].isSelected()) {
				
				if(rbtn_k6[1].isSelected()) {
					JOptionPane.showOptionDialog(Praktiketo2.this, a, M, 0, arg2, null, new ImageIcon[] {
							new ImageIcon(Praktiketo.class.getResource("/ikonoj/Sen surskribo n.png")),
									new ImageIcon(Praktiketo.class.getResource("/ikonoj/Sen surskribo n1.png")),
									new ImageIcon(Praktiketo.class.getResource("/ikonoj/Sen surskribo n2.png"))}, 0);
				}else if(rbtn_k6[2].isSelected()) {
					JOptionPane.showOptionDialog(Praktiketo2.this, a, "Vera " + M.toLowerCase(), 0, arg2, null, h, 0);
				}else {
					JOptionPane.showOptionDialog(Praktiketo2.this, a, M, 0, arg2, null, new String[]
							{"Ĉu mi sentas vin?", "Mi volas duiĝi", "Ĉu ankaŭ ĉi tio havas sencon?"}, 0);
				}
				
			}
			
		}
		
	}
	private class kk implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			for(int it = 0;it<4;it++)
				rbtn_k4[it].setEnabled(rbtn_k1[1].isSelected());
			
			rbtn_k5[0].setEnabled(rbtn_k1[2].isSelected());
			rbtn_k5[1].setEnabled(rbtn_k1[2].isSelected());
			
			for(int ig = 0;ig<3;ig++)
				rbtn_k6[ig].setEnabled(rbtn_k1[3].isSelected());
			
		}
		
	}
	
	private class r extends JRadioButton {
		
		public r(String g) {
			
			setText(g);
			addActionListener(new kk());
			
		}
		
	}
	
}