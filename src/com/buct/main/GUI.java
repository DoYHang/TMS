package com.buct.main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.filechooser.FileSystemView;

import com.buct.matlab.Mat;
import com.buct.matlab.ReadResult;

import matlabcontrol.MatlabConnectionException;
import matlabcontrol.MatlabInvocationException;
import matlabcontrol.MatlabProxy;
import matlabcontrol.MatlabProxyFactory;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class GUI {

	private JFrame frame;
	private javax.swing.JFileChooser jFileChooser2;
	private String logo = "D:\\javawork\\TMS\\config\\logo.png";
	private String projPath = "D:\\javawork\\TMS\\config";
	public static MatlabProxyFactory factory = new MatlabProxyFactory();
	
	public static MatlabProxy proxy;
	private JTextField bancheN;
	private JTextField step;
	private JTextField jiangeL;
	private JTextField jiangeR;
	private JTextField jiangeT;
	private JTextField alpha;
	private JTextField beta;
	private JTextField popSize;
	private JTextField generation;
	private JTextField pc;
	private JTextField pm;
	private JTextArea IGAtext;
	private String filename;
	private JLabel lblNewLabel_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws MatlabConnectionException 
	 */
	public GUI() throws MatlabConnectionException {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("城市交通智慧管理系统");
		frame.setBounds(249, 100, 900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFileChooser2 = new javax.swing.JFileChooser();
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
		);
		
		JPanel panel1 = new JPanel();
		panel1.setToolTipText("");
		tabbedPane.addTab("\u516C\u5171\u4EA4\u901A", null, panel1, null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_panel1 = new GroupLayout(panel1);
		gl_panel1.setHorizontalGroup(
			gl_panel1.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane_1, GroupLayout.DEFAULT_SIZE, 879, Short.MAX_VALUE)
		);
		gl_panel1.setVerticalGroup(
			gl_panel1.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane_1, GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
		);
		
		JPanel panel11 = new JPanel();
		tabbedPane_1.addTab("\u5730\u94C1", null, panel11, null);
		
		JPanel panel111 = new JPanel();
		
		JPanel panel112 = new JPanel();
		GroupLayout gl_panel11 = new GroupLayout(panel11);
		gl_panel11.setHorizontalGroup(
			gl_panel11.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel11.createSequentialGroup()
					.addComponent(panel111, GroupLayout.PREFERRED_SIZE, 386, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel112, GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE))
		);
		gl_panel11.setVerticalGroup(
			gl_panel11.createParallelGroup(Alignment.LEADING)
				.addComponent(panel111, GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
				.addComponent(panel112, GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
		);
		
		JLabel label_1 = new JLabel("\u7ED3\u679C\u5C55\u793A");
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton cleanbutton = new JButton("清空文本区");
		cleanbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				IGAtext.setText("");
			}
		});
		GroupLayout gl_panel112 = new GroupLayout(panel112);
		gl_panel112.setHorizontalGroup(
			gl_panel112.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel112.createSequentialGroup()
					.addGroup(gl_panel112.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel112.createSequentialGroup()
							.addGap(35)
							.addComponent(label_1)
							.addGap(265)
							.addComponent(cleanbutton)
							.addGap(31))
						.addGroup(gl_panel112.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_panel112.setVerticalGroup(
			gl_panel112.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel112.createSequentialGroup()
					.addGap(21)
					.addGroup(gl_panel112.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(cleanbutton))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE))
		);
		
		IGAtext = new JTextArea();
		 
		scrollPane.setViewportView(IGAtext);
		panel112.setLayout(gl_panel112);
		
		JLabel label = new JLabel("\u8BF7\u8F93\u5165\u53C2\u6570");
		
		JButton buttonOpenLocalText = new JButton("\u8BF7\u9009\u62E9\u8F93\u5165\u6587\u4EF6");
		buttonOpenLocalText.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonOpenLocalTextActionPerformed(evt);
			}
		});
		
		
		JButton button = new JButton("\u5F00\u59CB");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				startIGAActionPerformed(evt);
			}
		});
		
		bancheN = new JTextField();
		bancheN.setColumns(10);
		bancheN.setText("10");
		
		JLabel label_2 = new JLabel("\u53D1\u8F66\u73ED\u6B21\u6570");
		
		step = new JTextField();
		step.setColumns(10);
		step.setText("10");
		
		JLabel label_3 = new JLabel("\u80FD\u91CF\u5438\u6536\u8BA1\u7B97\u6B65\u957F");
		
		jiangeL = new JTextField();
		jiangeL.setColumns(10);
		jiangeL.setText("90");
		
		JLabel lblNewLabel = new JLabel("\u53D1\u8F66\u95F4\u9694\u4E0B\u754C");
		
		jiangeR = new JTextField();
		jiangeR.setText("600");
		jiangeR.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u53D1\u8F66\u95F4\u9694\u4E0A\u754C");
		
		jiangeT = new JTextField();
		jiangeT.setText("3600");
		jiangeT.setColumns(10);
		
		JLabel label_4 = new JLabel("\u672B\u73ED\u8F66\u4E0E\u9996\u73ED\u8F66\u7684\u53D1\u8F66\u65F6\u95F4\u95F4\u9694");
		
		alpha = new JTextField();
		alpha.setText("0.9");
		alpha.setColumns(10);
		
		JLabel label_5 = new JLabel("\u518D\u751F\u7535\u80FD\u5438\u6536\u5229\u7528\u7387");
		
		beta = new JTextField();
		beta.setText("0.9");
		beta.setColumns(10);
		
		JLabel label_6 = new JLabel("发车间隔均匀水平");
		
		popSize = new JTextField();
		popSize.setText("50");
		popSize.setColumns(10);
		
		JLabel label_7 = new JLabel("\u7B97\u6CD5\u79CD\u7FA4\u6570\u91CF");
		
		generation = new JTextField();
		generation.setText("10");
		generation.setColumns(10);
		
		JLabel label_8 = new JLabel("\u7B97\u6CD5\u8FED\u4EE3\u6B21\u6570");
		
		pc = new JTextField();
		pc.setText("0.5");
		pc.setColumns(10);
		
		JLabel label_9 = new JLabel("\u7B97\u6CD5\u4EA4\u53C9\u7387");
		
		pm = new JTextField();
		pm.setText("0.1");
		pm.setColumns(10);
		
		JLabel label_10 = new JLabel("\u7B97\u6CD5\u53D8\u5F02\u7387");
		ImageIcon imageIcon=new ImageIcon(logo);
		lblNewLabel_2 = new JLabel(imageIcon);
		GroupLayout gl_panel111 = new GroupLayout(panel111);
		gl_panel111.setHorizontalGroup(
			gl_panel111.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel111.createSequentialGroup()
					.addGap(23)
					.addGroup(gl_panel111.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel111.createSequentialGroup()
							.addComponent(pc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(label_9))
						.addGroup(gl_panel111.createSequentialGroup()
							.addComponent(generation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(label_8))
						.addGroup(gl_panel111.createSequentialGroup()
							.addComponent(popSize, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(label_7))
						.addGroup(gl_panel111.createSequentialGroup()
							.addComponent(beta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(label_6))
						.addGroup(gl_panel111.createSequentialGroup()
							.addComponent(jiangeR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblNewLabel_1))
						.addGroup(gl_panel111.createSequentialGroup()
							.addComponent(alpha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(label_5))
						.addGroup(gl_panel111.createSequentialGroup()
							.addComponent(buttonOpenLocalText)
							.addGap(53)
							.addComponent(button, GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE))
						.addGroup(gl_panel111.createSequentialGroup()
							.addComponent(pm, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(label_10)
							.addPreferredGap(ComponentPlacement.RELATED, 310, Short.MAX_VALUE))
						.addGroup(gl_panel111.createSequentialGroup()
							.addComponent(jiangeT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(label_4))
						.addGroup(gl_panel111.createSequentialGroup()
							.addGroup(gl_panel111.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel111.createSequentialGroup()
									.addComponent(jiangeL, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(lblNewLabel))
								.addGroup(gl_panel111.createParallelGroup(Alignment.LEADING)
									.addComponent(label)
									.addGroup(gl_panel111.createSequentialGroup()
										.addComponent(step, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(label_3))
									.addGroup(gl_panel111.createSequentialGroup()
										.addComponent(bancheN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(label_2))))
							.addPreferredGap(ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
							.addGap(24)))
					.addContainerGap())
		);
		gl_panel111.setVerticalGroup(
			gl_panel111.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel111.createSequentialGroup()
					.addGap(38)
					.addGroup(gl_panel111.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel111.createSequentialGroup()
							.addComponent(label)
							.addGap(18)
							.addGroup(gl_panel111.createParallelGroup(Alignment.BASELINE)
								.addComponent(bancheN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_2))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel111.createParallelGroup(Alignment.BASELINE)
								.addComponent(step, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_3))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel111.createParallelGroup(Alignment.BASELINE)
								.addComponent(jiangeL, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel)))
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel111.createParallelGroup(Alignment.BASELINE)
						.addComponent(jiangeR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel111.createParallelGroup(Alignment.BASELINE)
						.addComponent(jiangeT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_4))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel111.createParallelGroup(Alignment.BASELINE)
						.addComponent(alpha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_5))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel111.createParallelGroup(Alignment.BASELINE)
						.addComponent(beta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_6))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel111.createParallelGroup(Alignment.BASELINE)
						.addComponent(popSize, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_7))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel111.createParallelGroup(Alignment.BASELINE)
						.addComponent(generation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_8))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel111.createParallelGroup(Alignment.BASELINE)
						.addComponent(pc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_9))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel111.createParallelGroup(Alignment.BASELINE)
						.addComponent(pm, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_10))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel111.createParallelGroup(Alignment.BASELINE)
						.addComponent(buttonOpenLocalText)
						.addComponent(button))
					.addGap(38))
		);
		panel111.setLayout(gl_panel111);
		panel11.setLayout(gl_panel11);
		
		JPanel panel12 = new JPanel();
		tabbedPane_1.addTab("\u516C\u4EA4", null, panel12, null);
		GroupLayout gl_panel12 = new GroupLayout(panel12);
		gl_panel12.setHorizontalGroup(
			gl_panel12.createParallelGroup(Alignment.LEADING)
				.addGap(0, 874, Short.MAX_VALUE)
		);
		gl_panel12.setVerticalGroup(
			gl_panel12.createParallelGroup(Alignment.LEADING)
				.addGap(0, 444, Short.MAX_VALUE)
		);
		panel12.setLayout(gl_panel12);
		
		JPanel panel13 = new JPanel();
		tabbedPane_1.addTab("\u51FA\u79DF\u8F66", null, panel13, null);
		panel1.setLayout(gl_panel1);
		
		JPanel panel2 = new JPanel();
		tabbedPane.addTab("\u5171\u4EAB\u4EA4\u901A", null, panel2, null);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_panel2 = new GroupLayout(panel2);
		gl_panel2.setHorizontalGroup(
			gl_panel2.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane_2, GroupLayout.DEFAULT_SIZE, 879, Short.MAX_VALUE)
		);
		gl_panel2.setVerticalGroup(
			gl_panel2.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane_2, GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
		);
		
		JPanel panel21 = new JPanel();
		tabbedPane_2.addTab("\u5355\u8F66", null, panel21, null);
		
		JPanel panel22 = new JPanel();
		tabbedPane_2.addTab("\u7F51\u7EA6\u8F66", null, panel22, null);
		
		JPanel panel23 = new JPanel();
		tabbedPane_2.addTab("\u5B9A\u5236\u5DF4\u58EB", null, panel23, null);
		
		JPanel panel24 = new JPanel();
		tabbedPane_2.addTab("\u5171\u4EAB\u6C7D\u8F66", null, panel24, null);
		panel2.setLayout(gl_panel2);
		
		JPanel panel3 = new JPanel();
		tabbedPane.addTab("\u7EFC\u5408\u4EA4\u901A", null, panel3, null);
		
		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_panel3 = new GroupLayout(panel3);
		gl_panel3.setHorizontalGroup(
			gl_panel3.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane_3, GroupLayout.DEFAULT_SIZE, 879, Short.MAX_VALUE)
		);
		gl_panel3.setVerticalGroup(
			gl_panel3.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane_3, GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
		);
		
		JPanel panel31 = new JPanel();
		tabbedPane_3.addTab("\u5355\u8F66+\u5730\u94C1", null, panel31, null);
		
		JPanel panel32 = new JPanel();
		tabbedPane_3.addTab("\u51FA\u79DF\u8F66+\u7F51\u7EA6\u8F66+\u5B9A\u5236\u5DF4\u58EB", null, panel32, null);
		
		JPanel panel33 = new JPanel();
		tabbedPane_3.addTab("\u51FA\u79DF\u8F66+\u7F51\u7EA6\u8F66", null, panel33, null);
		panel3.setLayout(gl_panel3);
		
		JPanel panel4 = new JPanel();
		tabbedPane.addTab("\u7EBF\u8DEF....", null, panel4, null);
		GroupLayout gl_panel4 = new GroupLayout(panel4);
		gl_panel4.setHorizontalGroup(
			gl_panel4.createParallelGroup(Alignment.LEADING)
				.addGap(0, 879, Short.MAX_VALUE)
		);
		gl_panel4.setVerticalGroup(
			gl_panel4.createParallelGroup(Alignment.LEADING)
				.addGap(0, 473, Short.MAX_VALUE)
		);
		panel4.setLayout(gl_panel4);
		frame.getContentPane().setLayout(groupLayout);
		
		try {
			proxy = factory.getProxy();
		} catch (MatlabConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void startIGAActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		new Thread() {
			public void run() {
				JProgressBar bar = new JProgressBar(JProgressBar.HORIZONTAL);
				bar.setStringPainted(false);
				bar.setIndeterminate(true);
				bar.setSize(new Dimension(300, 100));
				bar.setForeground(Color.GREEN);
				JDialog jdg = new JDialog();
				jdg.setTitle("运算中，请稍候。。。");
				jdg.setSize(new Dimension(300, 100));
				jdg.setLocation(550, 260);
				jdg.getContentPane().add(bar);
				jdg.setResizable(false);

				jdg.show(true);
				int n = Integer.parseInt((String)bancheN.getText());
				int s = Integer.parseInt((String)step.getText());
				int l = Integer.parseInt((String)jiangeL.getText());
				int r = Integer.parseInt((String)jiangeR.getText());
				int t = Integer.parseInt((String)jiangeT.getText());
				double a = Double.parseDouble((String)alpha.getText());
				double b = Double.parseDouble((String)beta.getText());
				int ps = Integer.parseInt((String)popSize.getText());
				int g = Integer.parseInt((String)generation.getText());
				double p_c = Double.parseDouble((String)pc.getText());
				double p_m = Double.parseDouble((String)pm.getText());
				String fn = filename;
				String out = "";
				try {
					Mat.iga(factory, proxy, n, s, l, r, t, a, b, ps, g, p_c, p_m, fn);
					ImageIcon imageIcon1=new ImageIcon("D:\\javawork\\TMS\\config\\1.jpg");
					lblNewLabel_2.setIcon(imageIcon1); 
					out = "Solution:"+ReadResult.readFile("./Solution.txt");
					out += "Objective:"+ReadResult.readFile("./Objective.txt")+"\n";
				} catch (MatlabConnectionException | MatlabInvocationException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					jdg.dispose();
				}
				jdg.dispose();
				IGAtext.append(out);
			}
		}.start();
	}

	protected void buttonOpenLocalTextActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO Auto-generated method stub
		new Thread() {
			public void run() {
				jFileChooser2.setDialogTitle("请选择文件");
				jFileChooser2.setApproveButtonText("确定");
				FileSystemView fsv = FileSystemView.getFileSystemView();
				jFileChooser2.setFileSelectionMode(JFileChooser.FILES_ONLY);
				File dir = new File(projPath);
				jFileChooser2.setCurrentDirectory(fsv.getParentDirectory(dir));
				if (JFileChooser.APPROVE_OPTION == jFileChooser2
						.showOpenDialog(null)) {
					filename = jFileChooser2.getSelectedFile().getName();
					System.out.println(filename);
					
				}
			}
			
		}.start();
		
	}
}
