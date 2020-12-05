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
import javax.swing.plaf.FontUIResource;

import com.buct.image.WriteImage;
import com.buct.matlab.BusMain;
import com.buct.matlab.Mat;
import com.buct.matlab.ReadResult;

import matlabcontrol.MatlabConnectionException;
import matlabcontrol.MatlabInvocationException;
import matlabcontrol.MatlabProxy;
import matlabcontrol.MatlabProxyFactory;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.GridLayout;
import javax.swing.SpringLayout;
import javax.swing.UIManager;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;

public class GUI {

	private JFrame frame;
	private javax.swing.JFileChooser jFileChooser2;
	private String logo = "./config/logo.png";
	private String projPath = "./config";
	private String issus1 = "./config/issues1.jpg";
	private String issus2 = "./config/issues2.jpg";
	private String startIga = "./config/logo.jpg";
	private String resultIga = "./config/iga.jpg";
	private String igaImageName = "./Uniform_level.jpg";
	private String startBusTimeImage = "./config/bus_start.jpg";
	private String busTimeImageName = "./ResultsFigure.png";
	private String resultBusTime = "./config/busTime.jpg";
	private String busTimeissus1 = "./config/bus_issues1.png";
	private String busTimeissus2 = "./config/bus_issues2.png";
	
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
	private String filename;
	private JTextField objective1;
	private JTextField objective3;
	private JTextField objective2;
	private JTextField user_rate;
	private ImageIcon igaresultImage;
	private JLabel lblResultlabel;
	private JTextField fachebanci;
	private JTextField shoumobancheshijian;
	private JTextField ranyoujiage;
	private JTextField min_fachejiange;
	private JTextField max_fachejiange;
	private JTextField diedaishu;
	private JTextField zhongqunguimo;
	private JTextField jiaochagailv;
	private JTextField bianyigailv;
	private JTextField zonghaoyou;
	private String busDisranceFile;
	private String busTimeFile;
	private ImageIcon busresultImage;
	private JLabel startbus;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					initGlobalFontSetting(new Font("宋体", Font.PLAIN, 14));
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
	public static void initGlobalFontSetting(Font fnt)

	{
	    FontUIResource fontRes = new FontUIResource(fnt);
	    for(Enumeration keys = UIManager.getDefaults().keys(); keys.hasMoreElements();)

	{
	        Object key = keys.nextElement();
	        Object value = UIManager.get(key);
	        if(value instanceof FontUIResource)
	            UIManager.put(key, fontRes);
	    }

	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("城市交通智慧管理系统");
		frame.setBounds(200, 50, 1000, 650);
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
		
		JTabbedPane tabbedPane_4 = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_panel11 = new GroupLayout(panel11);
		gl_panel11.setHorizontalGroup(
			gl_panel11.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane_4, GroupLayout.DEFAULT_SIZE, 974, Short.MAX_VALUE)
		);
		gl_panel11.setVerticalGroup(
			gl_panel11.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane_4, GroupLayout.PREFERRED_SIZE, 553, Short.MAX_VALUE)
		);
		
		JPanel panel111 = new JPanel();
		tabbedPane_4.addTab("时刻表优化", null, panel111, null);
		
		JPanel panel1111 = new JPanel();
		
		JButton issusButton = new JButton("问题介绍");
		issusButton.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				String name = "问题介绍";
				String issusImagePath = issus1;
				issusActionPerformed(evt,name,issusImagePath,800,600);
			}
		});
		
		JButton imageButton = new JButton("算法介绍");
		imageButton.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				String name = "算法介绍";
				String issusImagePath = issus2;
				issusActionPerformed(evt,name,issusImagePath,800,600);
			}
		});
		
		JPanel panel11111 = new JPanel();
		
		JPanel panel11112 = new JPanel();
		GroupLayout gl_panel1111 = new GroupLayout(panel1111);
		gl_panel1111.setHorizontalGroup(
			gl_panel1111.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel1111.createSequentialGroup()
					.addGap(40)
					.addGroup(gl_panel1111.createParallelGroup(Alignment.LEADING)
						.addComponent(panel11112, GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
						.addGroup(gl_panel1111.createSequentialGroup()
							.addComponent(issusButton)
							.addGap(48)
							.addComponent(imageButton))
						.addComponent(panel11111, GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel1111.setVerticalGroup(
			gl_panel1111.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel1111.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel1111.createParallelGroup(Alignment.BASELINE)
						.addComponent(issusButton)
						.addComponent(imageButton))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel11111, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel11112, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE)
					.addGap(11))
		);
		
		JLabel label_1 = new JLabel("               算法参数\r\n");
		panel11112.setLayout(new MigLayout("", "[66px][18px][168px]", "[60px][60px][60px][60px][60px][60px]"));
		panel11112.add(label_1, "cell 0 0 3 1,alignx left,aligny center");
		
		step = new JTextField();
		panel11112.add(step, "cell 0 1");
		step.setColumns(10);
		step.setText("10");
		
		JLabel label_3 = new JLabel("能量吸收计算步长 ");
		panel11112.add(label_3, "cell 2 1");
		
		popSize = new JTextField();
		popSize.setText("50");
		popSize.setColumns(10);
		panel11112.add(popSize, "cell 0 2,alignx left,aligny center");
		
		JLabel label_7 = new JLabel("\u7B97\u6CD5\u79CD\u7FA4\u6570\u91CF");
		panel11112.add(label_7, "cell 2 2,alignx left,aligny center");
		
		generation = new JTextField();
		generation.setText("10");
		generation.setColumns(10);
		panel11112.add(generation, "cell 0 3,alignx left,aligny center");
		
		JLabel label_8 = new JLabel("\u7B97\u6CD5\u8FED\u4EE3\u6B21\u6570");
		panel11112.add(label_8, "cell 2 3,alignx left,aligny center");
		
		pc = new JTextField();
		pc.setText("0.5");
		pc.setColumns(10);
		panel11112.add(pc, "cell 0 4,alignx left,aligny center");
		
		JLabel label_9 = new JLabel("\u7B97\u6CD5\u4EA4\u53C9\u7387");
		panel11112.add(label_9, "cell 2 4,alignx left,aligny center");
		
		pm = new JTextField();
		pm.setText("0.1");
		pm.setColumns(10);
		panel11112.add(pm, "cell 0 5,alignx left,aligny center");
		
		JLabel label_10 = new JLabel("\u7B97\u6CD5\u53D8\u5F02\u7387");
		panel11112.add(label_10, "cell 2 5,alignx left,aligny center");
		
		bancheN = new JTextField();
		bancheN.setColumns(10);
		bancheN.setText("10");
		
		JLabel label_2 = new JLabel("\u53D1\u8F66\u73ED\u6B21\u6570");
		
		JLabel label = new JLabel("               模型参数");
		panel11111.setLayout(new MigLayout("", "[66px][18px][168px]", "[60px][60px][60px][60px][60px][60px][60px]"));
		panel11111.add(bancheN, "cell 0 1,alignx left,aligny center");
		panel11111.add(label_2, "cell 2 1,alignx left,aligny center");
		
		jiangeR = new JTextField();
		jiangeR.setText("600");
		jiangeR.setColumns(10);
		panel11111.add(jiangeR, "cell 0 2,alignx left,aligny center");
		
		JLabel lblNewLabel = new JLabel("发车间隔上界");
		panel11111.add(lblNewLabel, "cell 2 2,alignx left,aligny center");
		
		jiangeL = new JTextField();
		jiangeL.setColumns(10);
		jiangeL.setText("90");
		panel11111.add(jiangeL, "cell 0 3,alignx left,aligny center");
		
		JLabel lblNewLabel_1 = new JLabel("发车间隔下界");
		panel11111.add(lblNewLabel_1, "cell 2 3,alignx left,aligny center");
		
		jiangeT = new JTextField();
		jiangeT.setText("3600");
		jiangeT.setColumns(10);
		panel11111.add(jiangeT, "cell 0 4,alignx left,aligny center");
		
		JLabel label_4 = new JLabel("末首班车的发车时间间隔");
		panel11111.add(label_4, "cell 2 4,alignx left,aligny center");
		
		alpha = new JTextField();
		alpha.setText("0.9");
		alpha.setColumns(10);
		panel11111.add(alpha, "cell 0 5,alignx left,aligny center");
		panel11111.add(label, "cell 0 0 3 1,alignx left,aligny center");
		
		JLabel label_5 = new JLabel("\u518D\u751F\u7535\u80FD\u5438\u6536\u5229\u7528\u7387");
		panel11111.add(label_5, "cell 2 5,alignx left,aligny center");
		
		beta = new JTextField();
		panel11111.add(beta, "cell 0 6");
		beta.setText("0.9");
		beta.setColumns(10);
		
		JLabel label_6 = new JLabel("发车间隔均匀水平");
		panel11111.add(label_6, "cell 2 6");
		panel1111.setLayout(gl_panel1111);
		
		JPanel panel1112 = new JPanel();
		
		JButton cleanbutton = new JButton("清空文本区");
		cleanbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				objective1.setText("");
				objective2.setText("");
				objective3.setText("");
				user_rate.setText("");
			}
		});
		
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
		
		JPanel panel = new JPanel();	
		JPanel panel_image = new JPanel();
		GroupLayout gl_panel1112 = new GroupLayout(panel1112);
		gl_panel1112.setHorizontalGroup(
			gl_panel1112.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel1112.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel1112.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel1112.createSequentialGroup()
							.addGap(44)
							.addComponent(buttonOpenLocalText)
							.addGap(32)
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
							.addGap(50)
							.addComponent(cleanbutton))
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 489, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(137, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel1112.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(panel_image, GroupLayout.PREFERRED_SIZE, 650, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel1112.setVerticalGroup(
			gl_panel1112.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel1112.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel1112.createParallelGroup(Alignment.BASELINE)
						.addComponent(buttonOpenLocalText)
						.addComponent(button)
						.addComponent(cleanbutton))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_image, GroupLayout.PREFERRED_SIZE, 385, Short.MAX_VALUE))
		);
		igaresultImage = new ImageIcon(startIga);
		Image img = igaresultImage.getImage();
        img = img.getScaledInstance(530,350, Image.SCALE_DEFAULT);
        igaresultImage.setImage(img);
		lblResultlabel = new JLabel(igaresultImage);
		lblResultlabel.setIcon(igaresultImage);
		GroupLayout gl_panel_image = new GroupLayout(panel_image);
		gl_panel_image.setHorizontalGroup(
			gl_panel_image.createParallelGroup(Alignment.TRAILING)
				.addComponent(lblResultlabel, GroupLayout.PREFERRED_SIZE, 626, Short.MAX_VALUE)
		);
		gl_panel_image.setVerticalGroup(
			gl_panel_image.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_image.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblResultlabel, GroupLayout.PREFERRED_SIZE, 365, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_image.setLayout(gl_panel_image);
		JLabel lblobjective1 = new JLabel("吸收能量：");
		
		JLabel lblobjective3 = new JLabel("再生能量：");
		
		JLabel lblobjective2 = new JLabel("牵引能量：");
		
		JLabel lblUserate = new JLabel("再生能量利用率：");
		
		objective1 = new JTextField();
		objective1.setColumns(10);
		
		objective3 = new JTextField();
		objective3.setColumns(10);
		
		objective2 = new JTextField();
		objective2.setColumns(10);
		
		user_rate = new JTextField();
		user_rate.setColumns(10);
		panel.setLayout(new MigLayout("", "[100px][100px][100px][100px]", "[100px][100px]"));
		panel.add(lblobjective1, "cell 0 0,alignx center,aligny center");
		panel.add(lblobjective3, "cell 0 1,alignx center,aligny center");
		panel.add(lblobjective2, "cell 2 0,alignx center,aligny center");
		panel.add(lblUserate, "cell 2 1,alignx center,aligny center");
		panel.add(objective1, "cell 1 0,alignx left,aligny center");
		panel.add(objective3, "cell 1 1,alignx left,aligny center");
		panel.add(objective2, "cell 3 0,alignx left,aligny center");
		panel.add(user_rate, "cell 3 1,alignx left,aligny center");
		panel1112.setLayout(gl_panel1112);
		GroupLayout gl_panel111 = new GroupLayout(panel111);
		gl_panel111.setHorizontalGroup(
			gl_panel111.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel111.createSequentialGroup()
					.addComponent(panel1111, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel1112, GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE))
		);
		gl_panel111.setVerticalGroup(
			gl_panel111.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel111.createSequentialGroup()
					.addGroup(gl_panel111.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(panel1112, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel1111, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE))
					.addContainerGap())
		);
		panel111.setLayout(gl_panel111);
		
		JPanel panel112 = new JPanel();
		tabbedPane_4.addTab("速度曲线优化", null, panel112, null);
		ImageIcon imageIcon=new ImageIcon(logo);
		panel11.setLayout(gl_panel11);
		
		JPanel panel12 = new JPanel();
		tabbedPane_1.addTab("\u516C\u4EA4", null, panel12, null);
		
		JTabbedPane tabbedPane_5 = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_panel12 = new GroupLayout(panel12);
		gl_panel12.setHorizontalGroup(
			gl_panel12.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel12.createSequentialGroup()
					.addComponent(tabbedPane_5, GroupLayout.PREFERRED_SIZE, 977, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		gl_panel12.setVerticalGroup(
			gl_panel12.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane_5, GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
		);
		
		JPanel panel_1 = new JPanel();
		tabbedPane_5.addTab("时刻表优化", null, panel_1, null);
		
		JButton bus_issues_button = new JButton("问题介绍");
		bus_issues_button.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				String name = "问题介绍";
				String issusImagePath = busTimeissus1;
				issusActionPerformed(evt,name,issusImagePath,800,600);
			}
		});
		
		JButton bus_algorithm_button = new JButton("算法介绍");
		bus_algorithm_button.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				String name = "算法介绍";
				String issusImagePath = busTimeissus2;
				issusActionPerformed(evt,name,issusImagePath,600,700);
			}
		});
		
		JPanel panel_2 = new JPanel();
		
		JPanel panel_3 = new JPanel();
		
		JButton bus_distance = new JButton("导入站间距离");
		bus_distance.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonOfBusDistance(evt);
			}
		});
		
		JButton bus_time = new JButton("导入站间运行时间");
		bus_time.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonOfBusTime(evt);
			}
		});
		
		JButton bus_start = new JButton("开始");
		bus_start.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				//buttonOfStartBusTime(evt);
			}
		});
		
		JButton bus_clean = new JButton("清空文本区");
		bus_clean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zonghaoyou.setText("");
			}
		});
		
		JLabel label_21 = new JLabel("总耗油成本（元）：");
		
		zonghaoyou = new JTextField();
		zonghaoyou.setColumns(10);
		
		JPanel panel_busTimeImage = new JPanel();
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(40)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(bus_issues_button)
							.addGap(48)
							.addComponent(bus_algorithm_button)
							.addGap(126)
							.addComponent(bus_distance)
							.addGap(44)
							.addComponent(bus_time)
							.addGap(42)
							.addComponent(bus_start)
							.addGap(47)
							.addComponent(bus_clean))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 286, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE))
							.addGap(19)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(210)
									.addComponent(label_21)
									.addGap(44)
									.addComponent(zonghaoyou, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(49)
									.addComponent(panel_busTimeImage, GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)))))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(bus_issues_button)
						.addComponent(bus_algorithm_button)
						.addComponent(bus_distance)
						.addComponent(bus_time)
						.addComponent(bus_start)
						.addComponent(bus_clean))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(6)
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(36)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_21)
								.addComponent(zonghaoyou, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addComponent(panel_busTimeImage, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addContainerGap())
		);
		busresultImage = new ImageIcon(startBusTimeImage);
		Image busimg = busresultImage.getImage();
        busimg = busimg.getScaledInstance(530,350, Image.SCALE_DEFAULT);
        busresultImage.setImage(busimg);
		startbus = new JLabel(busresultImage);
		startbus.setIcon(busresultImage);
		GroupLayout gl_panel_busTimeImage = new GroupLayout(panel_busTimeImage);
		gl_panel_busTimeImage.setHorizontalGroup(
			gl_panel_busTimeImage.createParallelGroup(Alignment.LEADING)
				.addComponent(startbus, GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
		);
		gl_panel_busTimeImage.setVerticalGroup(
			gl_panel_busTimeImage.createParallelGroup(Alignment.LEADING)
				.addComponent(startbus, GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
		);
		panel_busTimeImage.setLayout(gl_panel_busTimeImage);
		
		JLabel label_16 = new JLabel("算法参数");
		panel_3.setLayout(new MigLayout("", "[66px][18px][168px]", "[50px][50px][50px][50px]"));
		
		zhongqunguimo = new JTextField();
		zhongqunguimo.setText("200");
		zhongqunguimo.setColumns(10);
		panel_3.add(zhongqunguimo, "cell 0 1,alignx left,aligny center");
		
		JLabel label_18 = new JLabel("种群规模");
		panel_3.add(label_18, "cell 2 1,alignx left,aligny center");
		
		jiaochagailv = new JTextField();
		jiaochagailv.setText("0.8");
		jiaochagailv.setColumns(10);
		panel_3.add(jiaochagailv, "cell 0 2,alignx left,aligny center");
		
		JLabel label_19 = new JLabel("交叉概率");
		panel_3.add(label_19, "cell 2 2,alignx left,aligny center");
		
		bianyigailv = new JTextField();
		bianyigailv.setText("0.7");
		bianyigailv.setColumns(10);
		panel_3.add(bianyigailv, "cell 0 3,alignx left,aligny center");
		
		JLabel label_20 = new JLabel("变异概率");
		panel_3.add(label_20, "cell 2 3,alignx left,aligny center");
		
		diedaishu = new JTextField();
		diedaishu.setText("100");
		diedaishu.setColumns(10);
		panel_3.add(diedaishu, "cell 0 4,alignx left,aligny center");
		panel_3.add(label_16, "cell 0 0 3 1,alignx center,aligny center");
		
		JLabel label_17 = new JLabel("迭代数");
		panel_3.add(label_17, "cell 2 4,alignx left,aligny center");
		
		JLabel label_11 = new JLabel("模型参数");
		
		fachebanci = new JTextField();
		fachebanci.setText("74");
		fachebanci.setColumns(10);
		
		JLabel label_12 = new JLabel("发车趟次数");
		
		shoumobancheshijian = new JTextField();
		shoumobancheshijian.setText("990");
		shoumobancheshijian.setColumns(10);
		
		JLabel label_13 = new JLabel("末首班车的发车时间间隔(分钟)");
		panel_2.setLayout(new MigLayout("", "[66px][18px][168px]", "[50px][50px][50px][50px][50px][50px]"));
		panel_2.add(label_11, "cell 0 0 3 1,alignx center,aligny center");
		panel_2.add(fachebanci, "cell 0 1,alignx left,aligny center");
		panel_2.add(label_12, "cell 2 1,alignx left,aligny center");
		panel_2.add(shoumobancheshijian, "cell 0 2,alignx left,aligny center");
		panel_2.add(label_13, "cell 2 2,alignx left,aligny center");
		
		min_fachejiange = new JTextField();
		min_fachejiange.setText("8");
		min_fachejiange.setColumns(10);
		panel_2.add(min_fachejiange, "cell 0 3,alignx left,aligny center");
		
		JLabel label_15 = new JLabel("最小发车间隔(分钟)");
		panel_2.add(label_15, "cell 2 3,alignx left,aligny center");
		
		max_fachejiange = new JTextField();
		max_fachejiange.setText("20");
		max_fachejiange.setColumns(10);
		panel_2.add(max_fachejiange, "cell 0 4,alignx left,aligny center");
		
		JLabel lblNewLabel_2 = new JLabel("最大发车间隔(分钟)");
		panel_2.add(lblNewLabel_2, "cell 2 4,alignx left,aligny center");
		
		ranyoujiage = new JTextField();
		ranyoujiage.setText("6.43");
		ranyoujiage.setColumns(10);
		panel_2.add(ranyoujiage, "cell 0 5,alignx left,aligny center");
		
		JLabel label_14 = new JLabel("单位燃油价格(元/升)");
		panel_2.add(label_14, "cell 2 5,alignx left,aligny center");
		panel_1.setLayout(gl_panel_1);
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

	

	

	

	protected void issusActionPerformed(java.awt.event.ActionEvent evt,
			String name,String issusImagePath,int width,int height) {
		// TODO Auto-generated method stub
		new Thread() {
			public void run() {
				JFrame issusFrame = new JFrame(name);
				JPanel issueJPanel =  new JPanel();
				issueJPanel.setLayout(new BorderLayout());
				ImageIcon issusImage = new ImageIcon(issusImagePath);
//				issusImage = new ImageIcon(issusImage.getImage()
//						.getScaledInstance(issusImage.getIconWidth(), issusImage.getIconHeight(), Image.SCALE_DEFAULT));
				issusImage = new ImageIcon(issusImage.getImage()
						.getScaledInstance(width, height, Image.SCALE_DEFAULT));
				JLabel issusLabel = new JLabel(issusImage);
				
				issueJPanel.add(issusLabel);
				issusFrame.getContentPane().add(issueJPanel, BorderLayout.CENTER);
				issusFrame.pack();
				issusFrame.setVisible(true);
				issusFrame.setLocationRelativeTo(null);
				//System.out.println("成功");
			}
		}.start();
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
				String obj1 = "";
				String obj2 = "";
				String obj3 = "";
				String obj4 = "";
				try {
					//开始运行时间
					long startTime = System.currentTimeMillis();
					//运行matlab
					Mat.iga(factory, proxy, n, s, l, r, t, a, b, ps, g, p_c, p_m, fn);
					//结束运行时间
					long endTime = System.currentTimeMillis();
					System.out.println("运行时长为"+(endTime - startTime)/1000+"s");
					//将大内存图转小
					WriteImage.changeImage(igaImageName, resultIga);
					obj1 = ReadResult.readFile("./result1.txt");
					obj2 = ReadResult.readFile("./result2.txt");
					obj3 = ReadResult.readFile("./result3.txt");
					obj4 = ReadResult.readFile("./result4.txt");
					objective1.setText(obj1);
					objective2.setText(obj2);
					objective3.setText(obj3);
					user_rate.setText(obj4);
					igaresultImage = new ImageIcon(resultIga);
					Image img = igaresultImage.getImage();
			        img = img.getScaledInstance(600,350, Image.SCALE_DEFAULT);
			        igaresultImage.setImage(img);
			        lblResultlabel.setIcon(igaresultImage);
					//lblResultlabel = new JLabel(resultImage);
				} catch ( MatlabConnectionException | MatlabInvocationException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					jdg.dispose();
				}
				jdg.dispose();
				//IGAtext.append(out);
			}
		}.start();
	}
	protected void buttonOfStartBusTime(ActionEvent evt) {
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
				int k = Integer.parseInt((String)fachebanci.getText());
				int t_e = Integer.parseInt((String)shoumobancheshijian.getText());
				int hmin = Integer.parseInt((String)min_fachejiange.getText());
				int hmax = Integer.parseInt((String)max_fachejiange.getText());
				double p = Double.parseDouble((String)ranyoujiage.getText());
				
				int pz = Integer.parseInt((String)zhongqunguimo.getText());
				double p_c = Double.parseDouble((String)jiaochagailv.getText());
				double p_m = Double.parseDouble((String)bianyigailv.getText());
				int g = Integer.parseInt((String)diedaishu.getText());
				String distancefile = busDisranceFile;
				String timefile = busTimeFile;
				String obj = "";
				
				try {
					//开始运行时间
					long startTime = System.currentTimeMillis();
					//运行matlab
					BusMain.busTime(factory, proxy, k, t_e, hmin, hmax, p, pz, p_c, p_m, g, distancefile,timefile);
					//结束运行时间
					long endTime = System.currentTimeMillis();
					System.out.println("运行时长为"+(endTime - startTime)/1000+"s");
					//将大内存图转小
					WriteImage.changeImage(busTimeImageName, resultBusTime);
					obj = ReadResult.readFile("./bus_Gbest.txt");
					
					zonghaoyou.setText(obj);
					
					busresultImage = new ImageIcon(resultBusTime);
					Image img = busresultImage.getImage();
			        img = img.getScaledInstance(500,350, Image.SCALE_DEFAULT);
			        busresultImage.setImage(img);
			        startbus.setIcon(busresultImage);
					//lblResultlabel = new JLabel(resultImage);
				} catch (MatlabInvocationException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					jdg.dispose();
				} 
				jdg.dispose();
				//IGAtext.append(out);
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
	protected void buttonOfBusDistance(ActionEvent evt) {
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
					busDisranceFile = jFileChooser2.getSelectedFile().getName();
					System.out.println(busDisranceFile);
					
				}
			}
			
		}.start();
	}
	protected void buttonOfBusTime(ActionEvent evt) {
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
					busTimeFile = jFileChooser2.getSelectedFile().getName();
					System.out.println(busTimeFile);
					
				}
			}
			
		}.start();
	}
}
