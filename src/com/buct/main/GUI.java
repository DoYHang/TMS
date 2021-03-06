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
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.plaf.FontUIResource;

import com.buct.image.WriteImage;
import com.buct.matlab.BicycleMain;
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
import javax.swing.Icon;

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
	private String busPassengerImageName = "./MaxPassenger_ResultsFigure.png";
	private String resultBusTime = "./config/busTime.jpg";
	private String resultBusPassangerTime = "./config/busPassangerTime.jpg";
	private String busTimeissus1 = "./config/bus_issues1.png";
	private String busTimeissus2 = "./config/bus_issues2.png";
	private String youhaozhanshi = "./config/youhaoissue1.png";
	private String dancheResult = "./tour_FFBS.jpg";
	private String dancheResult1 = "./config/danche.jpg";
	private String dancheissueimage1 = "./config/dancheissue1.png";
	private String dancheissueimage2 = "./config/dancheissue2.png";
	private String danchezhanshiImage = "./config/danchezhanshi.jpg";
	private String chuanchezhanshiImage = "./config/chuancheshouye.jpg";
	private String chuancheResult = "./ShortTurning_Figure.png";
	private String chuancheResult1 = "./config/chuancheresult.jpg";
	private String chuancheissueImage1 = "./config/chuancheissue1.png";
	private String shuangxiangshouye = "./config/shuangxiangyouhuazhanshi.jpg";
	private String shuangxiangissueImage1 = "./config/shuangxiangissue1.png";
	private String shuangxiangissueImage2 = "";
	private String shuangxiangResult1 = "./Bidirection_MaxPassenger_Figure.png";
	private String shuangxiangResult2 = "./config/shuangxiang.jpg";
	
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
	private JTextField buspassenger_result;
	private JTextField fachebanci2;
	private JTextField shoumobancheshijian2;
	private JTextField min_fachejiange2;
	private JTextField max_fachejiange2;
	private JTextField ranyoujiage2;
	private JTextField zhongqunguimo2;
	private JTextField jiaochagailv2;
	private JTextField bianyigailv2;
	private JTextField diedaishu2;
	private ImageIcon busresultImage2;
	private JLabel startbus2;
	private String busDisranceFile2;
	private String busTimeFile2;
	private JTextField Tmax;
	private JTextField Qmax;
	private JTextField banyuncheC;
	private JTextField feiyongzhuanhuan;
	private JTextField del_rate;
	private JTextField iterations;
	private JTextField segments;
	private JTextField gengxinr;
	private JTextField cooling_rate;
	private JTextField wendu;
	private JTextField banyunchenum;
	private JTextField banyunfeiyong;
	private String nodeList;
	private String danchedistance;
	private ImageIcon dancheresultImage;
	private JLabel danchezhanshi;
	private JTextField uniform_Objective1;
	private JTextField uniform_use_rate;
	private JTextField chuanchezongtangci;
	private JTextField chuanchequjiantangci;
	private JTextField chuanchewaite1;
	private JTextField chuanchewaite2;
	private JLabel chuanchezhanshilabel;
	private ImageIcon chuancheresultImage;
	private String chuanchejihuashijian;
	private String chuancheshijishijian;
	private String chuanchechengkedaodalv;
	private JTextField shuangxiangtangci;
	private JTextField shangxingshouban;
	private JTextField shangxingmoban;
	private JTextField xiaxingshouban;
	private JTextField xiaxingmoban;
	private JTextField shuangxiangzuixiao;
	private JTextField shuangxiangzuida;
	private JTextField shuangxiangzhongqun;
	private JTextField shuangxiangjiaocha;
	private JTextField shuangxiangbianyi;
	private JTextField shuangxiangdiedai;
	private JTextField shuangxiangkeliu;
	private JTextField shangxingpeiche;
	private JTextField xiaxingpeiche;
	private JLabel shuangxiangzhanshi;
	private ImageIcon shuangxiangresultImage;
	private String shuangxiangODFile;
	private String shuangxiangzhanjianFile;
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
				issusActionPerformed(evt,name,issusImagePath,3.5);
			}
		});
		
		JButton imageButton = new JButton("算法介绍");
		imageButton.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				String name = "算法介绍";
				String issusImagePath = issus2;
				issusActionPerformed(evt,name,issusImagePath,3.5);
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
		
		JLabel label_4 = new JLabel("首末班车的发车时间间隔");
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
			gl_panel1112.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel1112.createSequentialGroup()
					.addGap(54)
					.addComponent(buttonOpenLocalText)
					.addGap(32)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
					.addGap(50)
					.addComponent(cleanbutton)
					.addContainerGap(241, Short.MAX_VALUE))
				.addGroup(gl_panel1112.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(panel_image, GroupLayout.PREFERRED_SIZE, 650, GroupLayout.PREFERRED_SIZE))
				.addGroup(Alignment.LEADING, gl_panel1112.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 609, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(41, Short.MAX_VALUE))
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
				.addGroup(gl_panel_image.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblResultlabel, GroupLayout.PREFERRED_SIZE, 650, Short.MAX_VALUE))
		);
		gl_panel_image.setVerticalGroup(
			gl_panel_image.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_image.createSequentialGroup()
					.addComponent(lblResultlabel, GroupLayout.PREFERRED_SIZE, 365, Short.MAX_VALUE)
					.addGap(20))
		);
		panel_image.setLayout(gl_panel_image);
		JLabel lblobjective1 = new JLabel("牵引能量：");
		
		JLabel lblobjective3 = new JLabel("吸收能量：");
		
		JLabel lblobjective2 = new JLabel("再生能量：");
		
		JLabel lblUserate = new JLabel("再生能量利用率：");
		
		user_rate = new JTextField();
		user_rate.setColumns(10);
		panel.setLayout(new MigLayout("", "[100px][100px,grow][100px][100px,grow]", "[100px][100px][100px]"));
		panel.add(lblobjective1, "cell 0 0,alignx center,aligny center");
		
		objective3 = new JTextField();
		objective3.setColumns(10);
		panel.add(objective3, "cell 3 0,alignx left,aligny center");
		panel.add(lblobjective3, "cell 0 1,alignx center,aligny center");
		panel.add(lblobjective2, "cell 2 0,alignx center,aligny center");
		panel.add(lblUserate, "cell 2 1,alignx center,aligny center");
		panel.add(user_rate, "cell 3 1,alignx left,aligny center");
		
		JLabel label_47 = new JLabel("均匀间隔时的吸收能量：");
		panel.add(label_47, "cell 0 2,alignx trailing");
		
		uniform_Objective1 = new JTextField();
		panel.add(uniform_Objective1, "cell 1 2,alignx left,aligny center");
		uniform_Objective1.setColumns(10);
		
		JLabel label_48 = new JLabel("均匀间隔时的利用率：");
		panel.add(label_48, "cell 2 2,alignx trailing");
		
		uniform_use_rate = new JTextField();
		panel.add(uniform_use_rate, "cell 3 2,alignx left,aligny center");
		uniform_use_rate.setColumns(10);
		
		objective2 = new JTextField();
		objective2.setColumns(10);
		panel.add(objective2, "cell 1 0,alignx left,aligny center");
		
		objective1 = new JTextField();
		objective1.setColumns(10);
		panel.add(objective1, "cell 1 1,alignx left,aligny center");
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
		tabbedPane_5.addTab("油耗优化", null, panel_1, null);
		
		JButton bus_issues_button = new JButton("问题介绍");
		bus_issues_button.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				String name = "问题介绍";
				String issusImagePath = youhaozhanshi;
				issusActionPerformed(evt,name,issusImagePath,1);
			}
		});
		
		JButton bus_algorithm_button = new JButton("算法介绍");
		bus_algorithm_button.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				String name = "算法介绍";
				String issusImagePath = busTimeissus2;
				issusActionPerformed(evt,name,issusImagePath,1.7);
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
				buttonOfStartBusTime(evt);
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
								.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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
		
		JLabel label_17 = new JLabel("迭代次数");
		panel_3.add(label_17, "cell 2 4,alignx left,aligny center");
		
		JLabel label_11 = new JLabel("模型参数");
		
		fachebanci = new JTextField();
		fachebanci.setText("74");
		fachebanci.setColumns(10);
		
		JLabel label_12 = new JLabel("发车趟次数");
		
		shoumobancheshijian = new JTextField();
		shoumobancheshijian.setText("990");
		shoumobancheshijian.setColumns(10);
		
		JLabel label_13 = new JLabel("首末趟次的时间间隔(分钟)");
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
		
		JLabel label_15 = new JLabel("最小发车时间间隔(分钟)");
		panel_2.add(label_15, "cell 2 3,alignx left,aligny center");
		
		max_fachejiange = new JTextField();
		max_fachejiange.setText("20");
		max_fachejiange.setColumns(10);
		panel_2.add(max_fachejiange, "cell 0 4,alignx left,aligny center");
		
		JLabel lblNewLabel_2 = new JLabel("最大发车时间间隔(分钟)");
		panel_2.add(lblNewLabel_2, "cell 2 4,alignx left,aligny center");
		
		ranyoujiage = new JTextField();
		ranyoujiage.setText("6.43");
		ranyoujiage.setColumns(10);
		panel_2.add(ranyoujiage, "cell 0 5,alignx left,aligny center");
		
		JLabel label_14 = new JLabel("单位燃油价格(元/升)");
		panel_2.add(label_14, "cell 2 5,alignx left,aligny center");
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_4 = new JPanel();
		tabbedPane_5.addTab("客流量优化", null, panel_4, null);
		
		JButton buspassenger_issus_button = new JButton("问题介绍");
		buspassenger_issus_button.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				String name = "问题介绍";
				String issusImagePath = busTimeissus1;
				issusActionPerformed(evt,name,issusImagePath,1);
			}
		});
		
		JButton buspassenger_al_button = new JButton("算法介绍");
		buspassenger_al_button.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				String name = "算法介绍";
				String issusImagePath = busTimeissus2;
				issusActionPerformed(evt,name,issusImagePath,1.7);
			}
		});
		
		JButton buspassenger_distance_button = new JButton("导入OD客流");
		buspassenger_distance_button.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonOfBusDistance2(evt);
			}
		});
		
		JButton buspassenger_time_button = new JButton("导入站间运行时间");
		buspassenger_time_button.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonOfBusTime2(evt);
			}
		});
		
		JButton buspassenger_start_button = new JButton("开始");
		buspassenger_start_button.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonOfStartBusTime2(evt);
			}
		});
		
		JButton buspassenger_clean_button = new JButton("清空文本区");
		buspassenger_clean_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buspassenger_result.setText("");
			}
		});
		
		JPanel panel_5 = new JPanel();
		
		JPanel panel_6 = new JPanel();
		
		buspassenger_result = new JTextField();
		buspassenger_result.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		
		busresultImage2 = new ImageIcon(startBusTimeImage);
		Image busimg2 = busresultImage2.getImage();
        busimg2 = busimg2.getScaledInstance(530,350, Image.SCALE_DEFAULT);
        busresultImage2.setImage(busimg2);
		startbus2 = new JLabel(busresultImage2);
		startbus2.setIcon(busresultImage2);
		GroupLayout gl_panel_7 = new GroupLayout(panel_7);
		gl_panel_7.setHorizontalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGap(0, 568, Short.MAX_VALUE)
				.addComponent(startbus2, GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
		);
		gl_panel_7.setVerticalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGap(0, 406, Short.MAX_VALUE)
				.addComponent(startbus2, GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
		);
		panel_7.setLayout(gl_panel_7);
		
		JLabel label_22 = new JLabel("乘客数量（人次）：");
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(40)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 286, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(buspassenger_issus_button, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
							.addGap(46)
							.addComponent(buspassenger_al_button, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)))
					.addGap(68)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 568, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(buspassenger_distance_button, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
							.addGap(39)
							.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_4.createSequentialGroup()
									.addComponent(label_22)
									.addGap(44)
									.addComponent(buspassenger_result, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_4.createSequentialGroup()
									.addComponent(buspassenger_time_button, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
									.addComponent(buspassenger_start_button, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
									.addGap(47)
									.addComponent(buspassenger_clean_button)))))
					.addContainerGap())
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(buspassenger_clean_button)
						.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
							.addComponent(buspassenger_issus_button)
							.addComponent(buspassenger_al_button))
						.addComponent(buspassenger_start_button)
						.addComponent(buspassenger_distance_button)
						.addComponent(buspassenger_time_button))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGap(30)
							.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_22)
								.addComponent(buspassenger_result, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 406, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		zhongqunguimo2 = new JTextField();
		zhongqunguimo2.setText("200");
		zhongqunguimo2.setColumns(10);
		
		JLabel label_30 = new JLabel("种群规模");
		
		jiaochagailv2 = new JTextField();
		jiaochagailv2.setText("0.8");
		jiaochagailv2.setColumns(10);
		
		JLabel label_31 = new JLabel("交叉概率");
		
		bianyigailv2 = new JTextField();
		bianyigailv2.setText("0.7");
		bianyigailv2.setColumns(10);
		
		JLabel label_32 = new JLabel("变异概率");
		
		diedaishu2 = new JTextField();
		diedaishu2.setText("100");
		diedaishu2.setColumns(10);
		
		JLabel label_33 = new JLabel("算法参数");
		
		JLabel label_34 = new JLabel("迭代次数");
		panel_6.setLayout(new MigLayout("", "[66px][18px][168px]", "[50px][50px][50px][50px]"));
		panel_6.add(zhongqunguimo2, "cell 0 1,growx,aligny center");
		panel_6.add(label_30, "cell 2 1,alignx left,aligny center");
		panel_6.add(jiaochagailv2, "cell 0 2,growx,aligny center");
		panel_6.add(label_31, "cell 2 2,alignx left,aligny center");
		panel_6.add(bianyigailv2, "cell 0 3,growx,aligny center");
		panel_6.add(label_32, "cell 2 3,alignx left,aligny center");
		panel_6.add(diedaishu2, "cell 0 4,growx,aligny center");
		panel_6.add(label_34, "cell 2 4,alignx left,aligny center");
		panel_6.add(label_33, "cell 0 0 3 1,alignx center,aligny center");
		
		JLabel label_24 = new JLabel("模型参数");
		
		fachebanci2 = new JTextField();
		fachebanci2.setText("20");
		fachebanci2.setColumns(10);
		
		JLabel label_25 = new JLabel("发车趟次数");
		
		shoumobancheshijian2 = new JTextField();
		shoumobancheshijian2.setText("300");
		shoumobancheshijian2.setColumns(10);
		
		JLabel label_26 = new JLabel("首末趟次的时间间隔(分钟)");
		
		min_fachejiange2 = new JTextField();
		min_fachejiange2.setText("8");
		min_fachejiange2.setColumns(10);
		
		JLabel label_27 = new JLabel("最小发车时间间隔(分钟)");
		
		max_fachejiange2 = new JTextField();
		max_fachejiange2.setText("20");
		max_fachejiange2.setColumns(10);
		
		JLabel label_28 = new JLabel("最大发车时间间隔(分钟)");
		
		ranyoujiage2 = new JTextField();
		ranyoujiage2.setText("65");
		ranyoujiage2.setColumns(10);
		
		JLabel label_29 = new JLabel("标准趟次耗时(分钟)");
		panel_5.setLayout(new MigLayout("", "[66px][18px][168px]", "[50px][50px][50px][50px][50px][50px]"));
		panel_5.add(fachebanci2, "cell 0 1,alignx left,aligny center");
		panel_5.add(label_25, "cell 2 1,alignx left,aligny center");
		panel_5.add(shoumobancheshijian2, "cell 0 2,alignx left,aligny center");
		panel_5.add(label_26, "cell 2 2,alignx left,aligny center");
		panel_5.add(min_fachejiange2, "cell 0 3,alignx left,aligny center");
		panel_5.add(label_27, "cell 2 3,alignx left,aligny center");
		panel_5.add(max_fachejiange2, "cell 0 4,alignx left,aligny center");
		panel_5.add(label_28, "cell 2 4,alignx left,aligny center");
		panel_5.add(ranyoujiage2, "cell 0 5,alignx left,aligny center");
		panel_5.add(label_29, "cell 2 5,alignx left,aligny center");
		panel_5.add(label_24, "cell 0 0 3 1,alignx center,aligny center");
		panel_4.setLayout(gl_panel_4);
		
		JPanel panel_12 = new JPanel();
		tabbedPane_5.addTab("串车优化", null, panel_12, null);
		
		JButton chuancheissue1 = new JButton("问题介绍");
		chuancheissue1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = "问题介绍";
				String issusImagePath = chuancheissueImage1;
				issusActionPerformed(e,name,issusImagePath,1);
			}
		});
		
		JButton chuancheissue2 = new JButton("算法介绍");
		chuancheissue2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = "算法介绍";
				String issusImagePath = busTimeissus1;
				issusActionPerformed(e
						,name,issusImagePath,1);
			}
		});
		
		JButton chuanchejihua = new JButton("导入到达各站的计划时间");
		chuanchejihua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonofchuanchejihua(e);
			}
		});
		
		JButton chuancheshiji = new JButton("导入到达各站的实际时间");
		chuancheshiji.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonofchuancheshiji(e);
			}
		});
		
		JButton chuanchestart = new JButton("开始");
		chuanchestart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonofchuanchestart(e);
			}
		});
		
		JButton chuancheclean = new JButton("清空文本区");
		chuancheclean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chuanchewaite1.setText("");
				chuanchewaite2.setText("");
			}
		});
		
		JPanel panel_13 = new JPanel();
		
		JButton chuanchedaodalv = new JButton("导入各站的乘客到达率");
		chuanchedaodalv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonofchuanchechengkedaoda(e);
			}
		});
		
		JLabel label_52 = new JLabel("优化前的乘客等待时间(分钟)：");
		
		JLabel label_53 = new JLabel("优化后的乘客等待时间(分钟)：");
		
		chuanchewaite1 = new JTextField();
		chuanchewaite1.setColumns(10);
		
		chuanchewaite2 = new JTextField();
		chuanchewaite2.setColumns(10);
		
		JPanel panel_14 = new JPanel();
		GroupLayout gl_panel_12 = new GroupLayout(panel_12);
		gl_panel_12.setHorizontalGroup(
			gl_panel_12.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_12.createSequentialGroup()
					.addGap(41)
					.addGroup(gl_panel_12.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_12.createSequentialGroup()
							.addGap(25)
							.addGroup(gl_panel_12.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_12.createParallelGroup(Alignment.LEADING, false)
									.addComponent(chuancheshiji, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(chuanchejihua, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(chuanchedaodalv, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(gl_panel_12.createSequentialGroup()
									.addGap(56)
									.addComponent(chuanchestart))))
						.addComponent(panel_13, GroupLayout.PREFERRED_SIZE, 292, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_12.createSequentialGroup()
							.addComponent(chuancheissue1)
							.addGap(47)
							.addComponent(chuancheissue2)))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel_12.createParallelGroup(Alignment.TRAILING)
						.addComponent(chuancheclean)
						.addGroup(gl_panel_12.createSequentialGroup()
							.addComponent(label_52)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chuanchewaite1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(32)
							.addComponent(label_53)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chuanchewaite2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel_14, GroupLayout.PREFERRED_SIZE, 541, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(67, Short.MAX_VALUE))
		);
		gl_panel_12.setVerticalGroup(
			gl_panel_12.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_12.createSequentialGroup()
					.addGroup(gl_panel_12.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_12.createSequentialGroup()
							.addContainerGap()
							.addComponent(chuancheclean)
							.addGap(29)
							.addGroup(gl_panel_12.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_12.createParallelGroup(Alignment.BASELINE)
									.addComponent(label_53)
									.addComponent(chuanchewaite2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_12.createParallelGroup(Alignment.BASELINE)
									.addComponent(label_52)
									.addComponent(chuanchewaite1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(8)
							.addComponent(panel_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_12.createSequentialGroup()
							.addGap(23)
							.addGroup(gl_panel_12.createParallelGroup(Alignment.BASELINE)
								.addComponent(chuancheissue1)
								.addComponent(chuancheissue2))
							.addGap(46)
							.addGroup(gl_panel_12.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_13, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_12.createSequentialGroup()
									.addGap(190)
									.addComponent(chuanchejihua)
									.addGap(18)
									.addComponent(chuancheshiji)))
							.addGap(18)
							.addComponent(chuanchedaodalv)
							.addGap(30)
							.addComponent(chuanchestart)))
					.addContainerGap(54, Short.MAX_VALUE))
		);
		chuancheresultImage = new ImageIcon(chuanchezhanshiImage);
		Image imgchuanche = chuancheresultImage.getImage();
		imgchuanche = imgchuanche.getScaledInstance(500,400, Image.SCALE_DEFAULT);
		chuancheresultImage.setImage(imgchuanche);
		chuanchezhanshilabel = new JLabel(chuancheresultImage);
		chuanchezhanshilabel.setIcon(chuancheresultImage);
		GroupLayout gl_panel_14 = new GroupLayout(panel_14);
		gl_panel_14.setHorizontalGroup(
			gl_panel_14.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_14.createSequentialGroup()
					.addComponent(chuanchezhanshilabel)
					.addContainerGap(557, Short.MAX_VALUE))
		);
		gl_panel_14.setVerticalGroup(
			gl_panel_14.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_14.createSequentialGroup()
					.addComponent(chuanchezhanshilabel)
					.addContainerGap(380, Short.MAX_VALUE))
		);
		panel_14.setLayout(gl_panel_14);
		
		JLabel label_49 = new JLabel("模型参数");
		
		chuanchezongtangci = new JTextField();
		chuanchezongtangci.setText("5");
		chuanchezongtangci.setColumns(10);
		
		chuanchequjiantangci = new JTextField();
		chuanchequjiantangci.setText("2");
		chuanchequjiantangci.setColumns(10);
		
		JLabel label_50 = new JLabel("总发车趟次数");
		
		JLabel label_51 = new JLabel("区间车发车趟次数");
		GroupLayout gl_panel_13 = new GroupLayout(panel_13);
		gl_panel_13.setHorizontalGroup(
			gl_panel_13.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_13.createSequentialGroup()
					.addGroup(gl_panel_13.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_13.createSequentialGroup()
							.addGap(101)
							.addComponent(label_49))
						.addGroup(gl_panel_13.createSequentialGroup()
							.addGap(26)
							.addGroup(gl_panel_13.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_13.createSequentialGroup()
									.addComponent(chuanchequjiantangci, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(label_51))
								.addGroup(gl_panel_13.createSequentialGroup()
									.addComponent(chuanchezongtangci, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(label_50)))))
					.addContainerGap(128, Short.MAX_VALUE))
		);
		gl_panel_13.setVerticalGroup(
			gl_panel_13.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_13.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_49)
					.addGap(18)
					.addGroup(gl_panel_13.createParallelGroup(Alignment.BASELINE)
						.addComponent(chuanchezongtangci, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_50))
					.addGap(18)
					.addGroup(gl_panel_13.createParallelGroup(Alignment.BASELINE)
						.addComponent(chuanchequjiantangci, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_51))
					.addContainerGap(113, Short.MAX_VALUE))
		);
		panel_13.setLayout(gl_panel_13);
		panel_12.setLayout(gl_panel_12);
		
		JPanel panel_15 = new JPanel();
		tabbedPane_5.addTab("双向客流量优化", null, panel_15, null);
		
		JButton shuangxiangissue1 = new JButton("问题介绍");
		shuangxiangissue1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = "问题介绍";
				String issusImagePath = shuangxiangissueImage1;
				issusActionPerformed(e,name,issusImagePath,1);
			}
		});
		
		JButton shuangxiangissue2 = new JButton("算法介绍");
		shuangxiangissue2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = "算法介绍";
				String issusImagePath = shuangxiangissueImage1;
				issusActionPerformed(e,name,issusImagePath,1);
			}
		});
		
		JPanel panel_16 = new JPanel();
		
		JPanel panel_17 = new JPanel();
		
		JButton shuangxiangOD = new JButton("导入双向OD客流");
		shuangxiangOD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonofshuangxiangOD(e);
			}
		});
		
		JButton shuangxiangzhanjian = new JButton("导入双向站间旅行时间");
		shuangxiangzhanjian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonofshuangxiangzhanjian(e);
			}
		});
		
		JButton shuangxiangstart = new JButton("开始");
		shuangxiangstart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonofshuangxiangstart(e);
			}
		});
		
		JButton shuangxiangclean = new JButton("清空文本区");
		shuangxiangclean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				shuangxiangkeliu.setText("");
				shangxingpeiche.setText("");
				xiaxingpeiche.setText("");
			}
		});
		
		JLabel label_67 = new JLabel("公交线路总客流量(人次)：");
		
		JLabel label_68 = new JLabel("上行场站所需配车数(辆)：");
		
		JLabel label_69 = new JLabel("下行场站所需配车数(辆)：");
		
		shuangxiangkeliu = new JTextField();
		shuangxiangkeliu.setColumns(10);
		
		shangxingpeiche = new JTextField();
		shangxingpeiche.setColumns(10);
		
		xiaxingpeiche = new JTextField();
		xiaxingpeiche.setText("");
		xiaxingpeiche.setColumns(10);
		
		JPanel panel_18 = new JPanel();
		GroupLayout gl_panel_15 = new GroupLayout(panel_15);
		gl_panel_15.setHorizontalGroup(
			gl_panel_15.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_15.createSequentialGroup()
					.addGap(43)
					.addGroup(gl_panel_15.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_15.createSequentialGroup()
							.addComponent(shuangxiangissue1)
							.addGap(45)
							.addComponent(shuangxiangissue2))
						.addComponent(panel_17, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_16, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel_15.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel_15.createSequentialGroup()
							.addGap(26)
							.addGroup(gl_panel_15.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_15.createSequentialGroup()
									.addComponent(shuangxiangOD)
									.addGap(46)
									.addComponent(shuangxiangzhanjian)
									.addGap(31)
									.addComponent(shuangxiangstart)
									.addGap(37)
									.addComponent(shuangxiangclean))
								.addGroup(gl_panel_15.createSequentialGroup()
									.addGap(135)
									.addGroup(gl_panel_15.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_15.createSequentialGroup()
											.addComponent(label_69)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(xiaxingpeiche, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel_15.createSequentialGroup()
											.addComponent(label_68)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(shangxingpeiche, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel_15.createSequentialGroup()
											.addComponent(label_67)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(shuangxiangkeliu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
							.addGap(76))
						.addGroup(Alignment.TRAILING, gl_panel_15.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(panel_18, GroupLayout.PREFERRED_SIZE, 565, GroupLayout.PREFERRED_SIZE)
							.addGap(21))))
		);
		gl_panel_15.setVerticalGroup(
			gl_panel_15.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_15.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_15.createParallelGroup(Alignment.BASELINE)
						.addComponent(shuangxiangissue1)
						.addComponent(shuangxiangissue2)
						.addComponent(shuangxiangOD)
						.addComponent(shuangxiangzhanjian)
						.addComponent(shuangxiangstart)
						.addComponent(shuangxiangclean))
					.addGroup(gl_panel_15.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_15.createSequentialGroup()
							.addGap(27)
							.addComponent(panel_16, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(panel_17, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_15.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_panel_15.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_67)
								.addComponent(shuangxiangkeliu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_15.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_68)
								.addComponent(shangxingpeiche, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_15.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_69)
								.addComponent(xiaxingpeiche, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_18, GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)))
					.addContainerGap())
		);
		shuangxiangresultImage = new ImageIcon(shuangxiangshouye);
		Image shuangxiangimg = shuangxiangresultImage.getImage();
		shuangxiangimg = shuangxiangimg.getScaledInstance(530,350, Image.SCALE_DEFAULT);
		shuangxiangresultImage.setImage(shuangxiangimg);
		shuangxiangzhanshi = new JLabel(shuangxiangresultImage);
		shuangxiangzhanshi.setIcon(shuangxiangresultImage);
		GroupLayout gl_panel_18 = new GroupLayout(panel_18);
		gl_panel_18.setHorizontalGroup(
			gl_panel_18.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_18.createSequentialGroup()
					.addComponent(shuangxiangzhanshi)
					.addContainerGap(588, Short.MAX_VALUE))
		);
		gl_panel_18.setVerticalGroup(
			gl_panel_18.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_18.createSequentialGroup()
					.addComponent(shuangxiangzhanshi)
					.addContainerGap(363, Short.MAX_VALUE))
		);
		panel_18.setLayout(gl_panel_18);
		
		JLabel label_62 = new JLabel("算法参数");
		
		shuangxiangzhongqun = new JTextField();
		shuangxiangzhongqun.setText("200");
		shuangxiangzhongqun.setColumns(10);
		
		JLabel label_63 = new JLabel("种群规模");
		
		shuangxiangjiaocha = new JTextField();
		shuangxiangjiaocha.setText("0.8");
		shuangxiangjiaocha.setColumns(10);
		
		JLabel label_64 = new JLabel("交叉概率");
		
		shuangxiangbianyi = new JTextField();
		shuangxiangbianyi.setText("0.3");
		shuangxiangbianyi.setColumns(10);
		
		JLabel label_65 = new JLabel("变异概率");
		
		shuangxiangdiedai = new JTextField();
		shuangxiangdiedai.setText("50");
		shuangxiangdiedai.setColumns(10);
		
		JLabel label_66 = new JLabel("迭代次数");
		GroupLayout gl_panel_17 = new GroupLayout(panel_17);
		gl_panel_17.setHorizontalGroup(
			gl_panel_17.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_17.createSequentialGroup()
					.addGroup(gl_panel_17.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_17.createSequentialGroup()
							.addGap(77)
							.addComponent(label_62))
						.addGroup(gl_panel_17.createSequentialGroup()
							.addContainerGap()
							.addComponent(shuangxiangzhongqun, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(label_63))
						.addGroup(gl_panel_17.createSequentialGroup()
							.addContainerGap()
							.addComponent(shuangxiangjiaocha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(label_64))
						.addGroup(gl_panel_17.createSequentialGroup()
							.addContainerGap()
							.addComponent(shuangxiangbianyi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(label_65))
						.addGroup(gl_panel_17.createSequentialGroup()
							.addContainerGap()
							.addComponent(shuangxiangdiedai, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(label_66)))
					.addContainerGap(101, Short.MAX_VALUE))
		);
		gl_panel_17.setVerticalGroup(
			gl_panel_17.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_17.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_62)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_17.createParallelGroup(Alignment.BASELINE)
						.addComponent(shuangxiangzhongqun, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_63))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_17.createParallelGroup(Alignment.BASELINE)
						.addComponent(shuangxiangjiaocha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_64))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_17.createParallelGroup(Alignment.BASELINE)
						.addComponent(shuangxiangbianyi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_65))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_17.createParallelGroup(Alignment.BASELINE)
						.addComponent(shuangxiangdiedai, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_66))
					.addContainerGap(30, Short.MAX_VALUE))
		);
		panel_17.setLayout(gl_panel_17);
		
		JLabel label_54 = new JLabel("模型参数");
		
		shuangxiangtangci = new JTextField();
		shuangxiangtangci.setText("70");
		shuangxiangtangci.setColumns(10);
		
		shangxingshouban = new JTextField();
		shangxingshouban.setText("0");
		shangxingshouban.setColumns(10);
		
		shangxingmoban = new JTextField();
		shangxingmoban.setText("500");
		shangxingmoban.setColumns(10);
		
		xiaxingshouban = new JTextField();
		xiaxingshouban.setText("20");
		xiaxingshouban.setColumns(10);
		
		xiaxingmoban = new JTextField();
		xiaxingmoban.setText("480");
		xiaxingmoban.setColumns(10);
		
		shuangxiangzuixiao = new JTextField();
		shuangxiangzuixiao.setText("8");
		shuangxiangzuixiao.setColumns(10);
		
		shuangxiangzuida = new JTextField();
		shuangxiangzuida.setText("20");
		shuangxiangzuida.setColumns(10);
		
		JLabel label_55 = new JLabel("公交线路双向发车趟次数");
		
		JLabel label_56 = new JLabel("上行方向的首班车发车时间");
		
		JLabel label_57 = new JLabel("上行方向的末班车发车时间");
		
		JLabel label_58 = new JLabel("下行方向的首班车发车时间");
		
		JLabel label_59 = new JLabel("下行方向的末班车发车时间");
		
		JLabel label_60 = new JLabel("最小发车时间间隔(分钟)");
		
		JLabel label_61 = new JLabel("最大发车时间间隔(分钟)");
		GroupLayout gl_panel_16 = new GroupLayout(panel_16);
		gl_panel_16.setHorizontalGroup(
			gl_panel_16.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_16.createSequentialGroup()
					.addGroup(gl_panel_16.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_16.createSequentialGroup()
							.addGap(86)
							.addComponent(label_54))
						.addGroup(gl_panel_16.createSequentialGroup()
							.addContainerGap()
							.addComponent(shuangxiangtangci, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(label_55))
						.addGroup(gl_panel_16.createSequentialGroup()
							.addContainerGap()
							.addComponent(shangxingshouban, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(label_56))
						.addGroup(gl_panel_16.createSequentialGroup()
							.addContainerGap()
							.addComponent(shangxingmoban, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(label_57))
						.addGroup(gl_panel_16.createSequentialGroup()
							.addContainerGap()
							.addComponent(xiaxingshouban, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(label_58))
						.addGroup(gl_panel_16.createSequentialGroup()
							.addContainerGap()
							.addComponent(xiaxingmoban, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(label_59))
						.addGroup(gl_panel_16.createSequentialGroup()
							.addContainerGap()
							.addComponent(shuangxiangzuixiao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(label_60))
						.addGroup(gl_panel_16.createSequentialGroup()
							.addContainerGap()
							.addComponent(shuangxiangzuida, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(label_61)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_16.setVerticalGroup(
			gl_panel_16.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_16.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_54)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_16.createParallelGroup(Alignment.BASELINE)
						.addComponent(shuangxiangtangci, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_55))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_16.createParallelGroup(Alignment.BASELINE)
						.addComponent(shangxingshouban, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_56))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_16.createParallelGroup(Alignment.BASELINE)
						.addComponent(shangxingmoban, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_57))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_16.createParallelGroup(Alignment.BASELINE)
						.addComponent(xiaxingshouban, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_58))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_16.createParallelGroup(Alignment.BASELINE)
						.addComponent(xiaxingmoban, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_59))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_16.createParallelGroup(Alignment.BASELINE)
						.addComponent(shuangxiangzuixiao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_60))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_16.createParallelGroup(Alignment.BASELINE)
						.addComponent(shuangxiangzuida, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_61))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		panel_16.setLayout(gl_panel_16);
		panel_15.setLayout(gl_panel_15);
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
		
		JTabbedPane tabbedPane_6 = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_panel21 = new GroupLayout(panel21);
		gl_panel21.setHorizontalGroup(
			gl_panel21.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel21.createSequentialGroup()
					.addComponent(tabbedPane_6, GroupLayout.PREFERRED_SIZE, 980, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(18, Short.MAX_VALUE))
		);
		gl_panel21.setVerticalGroup(
			gl_panel21.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane_6, GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
		);
		
		JPanel panel_8 = new JPanel();
		tabbedPane_6.addTab("单车调度优化", null, panel_8, null);
		
		JButton dancheissue1 = new JButton("问题介绍");
		dancheissue1.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				String name = "问题介绍";
				String issusImagePath = dancheissueimage1;
				issusActionPerformed(evt,name,issusImagePath,5);
			}
		});
		
		JButton dancheissue2 = new JButton("算法介绍");
		dancheissue2.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				String name = "算法介绍";
				String issusImagePath = dancheissueimage2;
				issusActionPerformed(evt,name,issusImagePath,4.3);
			}
		});
		
		JPanel panel_10 = new JPanel();
		
		JButton banyunweizhi = new JButton("导入自行车位置列表");
		banyunweizhi.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonOfbanyunweizhi(evt,"node");
			}
		});
		
		JButton julijuzhen = new JButton("导入距离矩阵");
		julijuzhen.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonOfbanyunweizhi(evt,"dis");
			}
		});
		
		JButton danchestart = new JButton("开始");
		danchestart.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				startdanche(evt);
			}
		});
		
		JButton dancheclean = new JButton("清空文本区");
		
		JLabel label_45 = new JLabel("搬运车的使用数量：");
		
		banyunchenum = new JTextField();
		banyunchenum.setColumns(10);
		
		JLabel label_46 = new JLabel("搬运费用：");
		
		banyunfeiyong = new JTextField();
		banyunfeiyong.setColumns(10);
		
		JPanel panel_11 = new JPanel();
		
		JPanel panel_9 = new JPanel();
		
		JLabel label_23 = new JLabel("模型参数");
		
		Tmax = new JTextField();
		Tmax.setText("1000");
		Tmax.setColumns(10);
		
		JLabel label_35 = new JLabel("最大搬运时间");
		
		Qmax = new JTextField();
		Qmax.setText("5");
		Qmax.setColumns(10);
		
		JLabel label_36 = new JLabel("搬运车容量");
		
		banyuncheC = new JTextField();
		banyuncheC.setText("10");
		banyuncheC.setColumns(10);
		
		JLabel label_37 = new JLabel("搬运车单价");
		
		feiyongzhuanhuan = new JTextField();
		feiyongzhuanhuan.setText("0.3");
		feiyongzhuanhuan.setColumns(10);
		
		JLabel label_38 = new JLabel("路径费用转换系数");
		panel_9.setLayout(new MigLayout("", "[66px][18px][168px]", "[60px][60px][60px][60px][60px]"));
		panel_9.add(Tmax, "cell 0 1,alignx left,aligny center");
		panel_9.add(Qmax, "cell 0 2,alignx left,aligny center");
		panel_9.add(banyuncheC, "cell 0 3,alignx left,aligny center");
		panel_9.add(feiyongzhuanhuan, "cell 0 4,alignx left,aligny center");
		panel_9.add(label_38, "cell 2 4,alignx left,aligny center");
		panel_9.add(label_36, "cell 2 2,alignx left,aligny center");
		panel_9.add(label_35, "cell 2 1,alignx left,aligny center");
		panel_9.add(label_37, "cell 2 3,alignx left,aligny center");
		panel_9.add(label_23, "cell 0 0 3 1,alignx center,aligny center");
		GroupLayout gl_panel_8 = new GroupLayout(panel_8);
		gl_panel_8.setHorizontalGroup(
			gl_panel_8.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_8.createSequentialGroup()
					.addGap(40)
					.addGroup(gl_panel_8.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_8.createSequentialGroup()
							.addComponent(dancheissue1)
							.addGap(49)
							.addComponent(dancheissue2)
							.addGap(119)
							.addComponent(banyunweizhi)
							.addGap(36)
							.addComponent(julijuzhen)
							.addGap(48)
							.addComponent(danchestart)
							.addGap(52)
							.addComponent(dancheclean))
						.addGroup(gl_panel_8.createSequentialGroup()
							.addGroup(gl_panel_8.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_9, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_8.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_8.createSequentialGroup()
									.addGap(63)
									.addComponent(panel_11, GroupLayout.PREFERRED_SIZE, 607, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_8.createSequentialGroup()
									.addGap(118)
									.addComponent(label_45)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(banyunchenum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(64)
									.addComponent(label_46)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(banyunfeiyong, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap())
		);
		gl_panel_8.setVerticalGroup(
			gl_panel_8.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_8.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_8.createParallelGroup(Alignment.BASELINE)
						.addComponent(dancheissue1)
						.addComponent(dancheissue2)
						.addComponent(banyunweizhi)
						.addComponent(julijuzhen)
						.addComponent(danchestart)
						.addComponent(dancheclean))
					.addGroup(gl_panel_8.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_8.createSequentialGroup()
							.addGap(41)
							.addGroup(gl_panel_8.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_45)
								.addComponent(banyunchenum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_46)
								.addComponent(banyunfeiyong, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addComponent(panel_11, GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_panel_8.createSequentialGroup()
							.addGap(18)
							.addComponent(panel_9, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		dancheresultImage = new ImageIcon(danchezhanshiImage);
		Image img1 = dancheresultImage.getImage();
        img1 = img1.getScaledInstance(530,350, Image.SCALE_DEFAULT);
        dancheresultImage.setImage(img1);
		danchezhanshi = new JLabel(dancheresultImage);
		danchezhanshi.setIcon(dancheresultImage);
		GroupLayout gl_panel_11 = new GroupLayout(panel_11);
		gl_panel_11.setHorizontalGroup(
			gl_panel_11.createParallelGroup(Alignment.LEADING)
				.addComponent(danchezhanshi, GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
		);
		gl_panel_11.setVerticalGroup(
			gl_panel_11.createParallelGroup(Alignment.LEADING)
				.addComponent(danchezhanshi, GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
		);
		panel_11.setLayout(gl_panel_11);
		
		JLabel label_39 = new JLabel("算法参数");
		
		del_rate = new JTextField();
		del_rate.setText("0.2");
		del_rate.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("破坏比例");
		
		iterations = new JTextField();
		iterations.setText("500");
		iterations.setColumns(10);
		
		JLabel label_40 = new JLabel("迭代层数");
		
		segments = new JTextField();
		segments.setText("10");
		segments.setColumns(10);
		
		JLabel label_41 = new JLabel("每层更新次数");
		
		gengxinr = new JTextField();
		gengxinr.setText("0.1");
		gengxinr.setColumns(10);
		
		JLabel label_42 = new JLabel("权重更新系数");
		
		cooling_rate = new JTextField();
		cooling_rate.setText("0.99999");
		cooling_rate.setColumns(10);
		
		JLabel label_43 = new JLabel("冷却速度");
		
		wendu = new JTextField();
		wendu.setText("5");
		wendu.setColumns(10);
		
		JLabel label_44 = new JLabel("初始温度值");
		panel_10.setLayout(new MigLayout("", "[66px][18px][168px]", "[60px][60px][60px][60px][60px][60px][60px]"));
		panel_10.add(label_39, "cell 0 0 3 1,alignx center,aligny center");
		panel_10.add(iterations, "cell 0 2,alignx left,aligny center");
		panel_10.add(segments, "cell 0 3,alignx left,aligny center");
		panel_10.add(del_rate, "cell 0 1,alignx left,aligny center");
		panel_10.add(gengxinr, "cell 0 4,alignx left,aligny center");
		panel_10.add(cooling_rate, "cell 0 5,alignx left,aligny center");
		panel_10.add(wendu, "cell 0 6,alignx left,aligny center");
		panel_10.add(label_44, "cell 2 6,alignx left,aligny center");
		panel_10.add(label_43, "cell 2 5,alignx left,aligny center");
		panel_10.add(label_42, "cell 2 4,alignx left,aligny center");
		panel_10.add(label_41, "cell 2 3,alignx left,aligny center");
		panel_10.add(label_40, "cell 2 2,alignx left,aligny center");
		panel_10.add(lblNewLabel_3, "cell 2 1,alignx left,aligny center");
		panel_8.setLayout(gl_panel_8);
		panel21.setLayout(gl_panel21);
		
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
			String name,String issusImagePath,double d) {
		// TODO Auto-generated method stub
		new Thread() {
			public void run() {
				JFrame issusFrame = new JFrame(name);
				JPanel issueJPanel =  new JPanel();
				issueJPanel.setLayout(new BorderLayout());
				ImageIcon issusImage = new ImageIcon(issusImagePath);
				issusImage = new ImageIcon(issusImage.getImage()
						.getScaledInstance((int) (issusImage.getIconWidth()/d), (int) (issusImage.getIconHeight()/d), Image.SCALE_DEFAULT));
//				issusImage = new ImageIcon(issusImage.getImage()
//						.getScaledInstance(width, height, Image.SCALE_DEFAULT));
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
				String obj5 = "";
				String obj6 = "";
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
					obj1 = ReadResult.readFile("./IGAObjective1.txt");
					obj2 = ReadResult.readFile("./IGAObjective2.txt");
					obj3 = ReadResult.readFile("./IGAObjective3.txt");
					obj4 = ReadResult.readFile("./IGAuse_rate.txt");
					obj5 = ReadResult.readFile("./IGAUniform_Objective1.txt");
					obj6 = ReadResult.readFile("./IGAUniform_use_rate.txt");
					objective1.setText(obj1);
					objective2.setText(obj2);
					objective3.setText(obj3);
					user_rate.setText(obj4);
					uniform_Objective1.setText(obj5);
					uniform_use_rate.setText(obj6);
					
					igaresultImage = new ImageIcon(resultIga);
					Image img = igaresultImage.getImage();
			        img = img.getScaledInstance((int) (igaresultImage.getIconWidth()/3.5),(int) (igaresultImage.getIconHeight()/3.5), Image.SCALE_DEFAULT);
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
	
	protected void buttonOfStartBusTime2(ActionEvent evt) {
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
				int k = Integer.parseInt((String)fachebanci2.getText());
				int t_e = Integer.parseInt((String)shoumobancheshijian2.getText());
				int hmin = Integer.parseInt((String)min_fachejiange2.getText());
				int hmax = Integer.parseInt((String)max_fachejiange2.getText());
				int p = Integer.parseInt((String)ranyoujiage2.getText());
				
				int pz = Integer.parseInt((String)zhongqunguimo2.getText());
				double p_c = Double.parseDouble((String)jiaochagailv2.getText());
				double p_m = Double.parseDouble((String)bianyigailv2.getText());
				int g = Integer.parseInt((String)diedaishu2.getText());
				String distancefile = busDisranceFile2;
				String timefile = busTimeFile2;
				String obj = "";
				
				try {
					//开始运行时间
					long startTime = System.currentTimeMillis();
					//运行matlab
					BusMain.busPassenger(factory, proxy, k, t_e, hmin, hmax, p, pz, p_c, p_m, g, distancefile,timefile);
					//结束运行时间
					long endTime = System.currentTimeMillis();
					System.out.println("运行时长为"+(endTime - startTime)/1000+"s");
					//将大内存图转小
					WriteImage.changeImage(busPassengerImageName, resultBusPassangerTime);
					obj = ReadResult.readFile("./MaxPassenger_Gbest.txt");
					
					buspassenger_result.setText(obj);
					
					busresultImage2 = new ImageIcon(resultBusPassangerTime);
					Image img = busresultImage2.getImage();
			        img = img.getScaledInstance(450,450, Image.SCALE_DEFAULT);
			        busresultImage2.setImage(img);
			        startbus2.setIcon(busresultImage2);
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
	
	protected void startdanche(ActionEvent evt) {
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
				int tmax = Integer.parseInt((String)Tmax.getText());
				int qmax = Integer.parseInt((String)Qmax.getText());
				int c = Integer.parseInt((String)banyuncheC.getText());
				double alpha = Double.parseDouble((String)feiyongzhuanhuan.getText());
				
				double dr = Double.parseDouble((String)del_rate.getText());
				int it = Integer.parseInt((String)iterations.getText());
				int sg = Integer.parseInt((String)segments.getText());
				double r = Double.parseDouble((String)gengxinr.getText());
				double cr = Double.parseDouble((String)cooling_rate.getText());
				int t = Integer.parseInt((String)wendu.getText());
				String file1 = nodeList;
				String file2 = danchedistance;
				
				String obj = "";
				
				try {
					//开始运行时间
					long startTime = System.currentTimeMillis();
					//运行matlab
					BicycleMain.bicycle(factory, proxy, tmax, qmax, c, alpha, dr, it, sg, r, cr, t, file1,file2);
					//结束运行时间
					long endTime = System.currentTimeMillis();
					System.out.println("运行时长为"+(endTime - startTime)/1000+"s");
					//将大内存图转小
					WriteImage.changeImage(dancheResult, dancheResult1);
					obj = ReadResult.readFile("./bicycle_num_of_vehicle.txt");
					banyunchenum.setText(obj);
					obj = ReadResult.readFile("./bicycle_total_cost.txt");
					banyunfeiyong.setText(obj);
					
					dancheresultImage = new ImageIcon(dancheResult1);
					Image img = dancheresultImage.getImage();
			        img = img.getScaledInstance(450,400, Image.SCALE_DEFAULT);
			        dancheresultImage.setImage(img);
			        danchezhanshi.setIcon(dancheresultImage);
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
	
	protected void buttonofchuanchestart(ActionEvent e) {
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
				int k = Integer.parseInt((String)chuanchezongtangci.getText());
				int k1 = Integer.parseInt((String)chuanchequjiantangci.getText());
				
				String file1 = chuanchejihuashijian;
				String file2 = chuancheshijishijian;
				String file3 = chuanchechengkedaodalv;
				
				String obj = "";
				
				try {
					//开始运行时间
					long startTime = System.currentTimeMillis();
					//运行matlab
					BusMain.buschuanche(factory, proxy, k, k1, file1,file2,file3);
					//结束运行时间
					long endTime = System.currentTimeMillis();
					System.out.println("运行时长为"+(endTime - startTime)/1000+"s");
					//将大内存图转小
					WriteImage.changeImage(chuancheResult, chuancheResult1);
					obj = ReadResult.readFile("./chuancheWait1.txt");
					chuanchewaite1.setText(obj);
					obj = ReadResult.readFile("./chuancheWait2.txt");
					chuanchewaite2.setText(obj);
					
					chuancheresultImage = new ImageIcon(chuancheResult1);
					Image img = chuancheresultImage.getImage();
			        img = img.getScaledInstance(450,400, Image.SCALE_DEFAULT);
			        chuancheresultImage.setImage(img);
			        chuanchezhanshilabel.setIcon(chuancheresultImage);
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
	
	protected void buttonofshuangxiangstart(ActionEvent e) {
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
				int k = Integer.parseInt((String)shuangxiangtangci.getText());
				int ts1 = Integer.parseInt((String)shangxingshouban.getText());
				int te1 = Integer.parseInt((String)shangxingmoban.getText());
				int ts2 = Integer.parseInt((String)xiaxingshouban.getText());
				int te2 = Integer.parseInt((String)xiaxingmoban.getText());
				int hmin = Integer.parseInt((String)shuangxiangzuixiao.getText());
				int hmax = Integer.parseInt((String)shuangxiangzuida.getText());
				int popsize = Integer.parseInt((String)shuangxiangzhongqun.getText());
				double pc = Double.parseDouble((String)shuangxiangjiaocha.getText());
				double pm = Double.parseDouble((String)shuangxiangbianyi.getText());
				int g = Integer.parseInt((String)shuangxiangdiedai.getText());
				
				
				String file1 = shuangxiangODFile;
				String file2 = shuangxiangzhanjianFile;
				
				String obj = "";
				
				try {
					//开始运行时间
					long startTime = System.currentTimeMillis();
					//运行matlab
					BusMain.busshuangxiang(factory, proxy, k, ts1, te1, ts2, te2, hmin, hmax, popsize, pc, pm, g, file1,file2);
					//结束运行时间
					long endTime = System.currentTimeMillis();
					System.out.println("运行时长为"+(endTime - startTime)/1000+"s");
					//将大内存图转小
					WriteImage.changeImage(shuangxiangResult1, shuangxiangResult2);
					obj = ReadResult.readFile("./shuangxiangGbest.txt");
					shuangxiangkeliu.setText(obj);
					obj = ReadResult.readFile("./shuangxiangBusNumber1.txt");
					shangxingpeiche.setText(obj);
					obj = ReadResult.readFile("./shuangxiangBusNumber2.txt");
					xiaxingpeiche.setText(obj);
					
					shuangxiangresultImage = new ImageIcon(shuangxiangResult2);
					Image img = shuangxiangresultImage.getImage();
			        img = img.getScaledInstance(500,390, Image.SCALE_DEFAULT);
			        shuangxiangresultImage.setImage(img);
			        shuangxiangzhanshi.setIcon(shuangxiangresultImage);
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
				ExcelFileFilter excelFilter = new ExcelFileFilter(); //excel过滤器
				jFileChooser2.addChoosableFileFilter(excelFilter);
				jFileChooser2.setFileFilter(excelFilter);
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
				ExcelFileFilter excelFilter = new ExcelFileFilter(); //excel过滤器
				jFileChooser2.addChoosableFileFilter(excelFilter);
				jFileChooser2.setFileFilter(excelFilter);
				if (JFileChooser.APPROVE_OPTION == jFileChooser2
						.showOpenDialog(null)) {
					busDisranceFile = jFileChooser2.getSelectedFile().getName();
					System.out.println(busDisranceFile);
					
				}
			}
			
		}.start();
	}
	protected void buttonOfBusDistance2(ActionEvent evt) {
		// TODO Auto-generated method stub
		new Thread() {
			public void run() {
				jFileChooser2.setDialogTitle("请选择文件");
				jFileChooser2.setApproveButtonText("确定");
				FileSystemView fsv = FileSystemView.getFileSystemView();
				jFileChooser2.setFileSelectionMode(JFileChooser.FILES_ONLY);
				File dir = new File(projPath);
				jFileChooser2.setCurrentDirectory(fsv.getParentDirectory(dir));
				ExcelFileFilter excelFilter = new ExcelFileFilter(); //excel过滤器
				jFileChooser2.addChoosableFileFilter(excelFilter);
				jFileChooser2.setFileFilter(excelFilter);
				if (JFileChooser.APPROVE_OPTION == jFileChooser2
						.showOpenDialog(null)) {
					busDisranceFile2 = jFileChooser2.getSelectedFile().getName();
					System.out.println(busDisranceFile2);
					
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
				ExcelFileFilter excelFilter = new ExcelFileFilter(); //excel过滤器
				jFileChooser2.addChoosableFileFilter(excelFilter);
				jFileChooser2.setFileFilter(excelFilter);
				if (JFileChooser.APPROVE_OPTION == jFileChooser2
						.showOpenDialog(null)) {
					busTimeFile = jFileChooser2.getSelectedFile().getName();
					System.out.println(busTimeFile);
					
				}
			}
			
		}.start();
	}
	protected void buttonOfBusTime2(ActionEvent evt) {
		// TODO Auto-generated method stub
		new Thread() {
			public void run() {
				jFileChooser2.setDialogTitle("请选择文件");
				jFileChooser2.setApproveButtonText("确定");
				 
				FileSystemView fsv = FileSystemView.getFileSystemView();
				jFileChooser2.setFileSelectionMode(JFileChooser.FILES_ONLY);
				File dir = new File(projPath);
				jFileChooser2.setCurrentDirectory(fsv.getParentDirectory(dir));
				ExcelFileFilter excelFilter = new ExcelFileFilter(); //excel过滤器
				jFileChooser2.addChoosableFileFilter(excelFilter);
				jFileChooser2.setFileFilter(excelFilter);
				if (JFileChooser.APPROVE_OPTION == jFileChooser2
						.showOpenDialog(null)) {
					busTimeFile2 = jFileChooser2.getSelectedFile().getName();
					System.out.println(busTimeFile2);
					
				}
			}
			
		}.start();
	}
	
	protected void buttonOfbanyunweizhi(ActionEvent evt,String flag) {
		// TODO Auto-generated method stub
		new Thread() {
			public void run() {
				jFileChooser2.setDialogTitle("请选择文件");
				jFileChooser2.setApproveButtonText("确定");
				 
				FileSystemView fsv = FileSystemView.getFileSystemView();
				jFileChooser2.setFileSelectionMode(JFileChooser.FILES_ONLY);
				File dir = new File(projPath);
				jFileChooser2.setCurrentDirectory(fsv.getParentDirectory(dir));
				ExcelFileFilter excelFilter = new ExcelFileFilter(); //excel过滤器
				jFileChooser2.addChoosableFileFilter(excelFilter);
				jFileChooser2.setFileFilter(excelFilter);
				if (JFileChooser.APPROVE_OPTION == jFileChooser2
						.showOpenDialog(null)) {
					if (flag=="node") {
						nodeList = jFileChooser2.getSelectedFile().getName();
						System.out.println(nodeList);
						
					}else if(flag == "dis") {
						danchedistance = jFileChooser2.getSelectedFile().getName();
						System.out.println(danchedistance);
					}
					
				}
			}
			
		}.start();
	}

	protected void buttonOfjulijuzhen(ActionEvent evt) {
		// TODO Auto-generated method stub
		new Thread() {
			public void run() {
				jFileChooser2.setDialogTitle("请选择文件");
				jFileChooser2.setApproveButtonText("确定");
				 
				FileSystemView fsv = FileSystemView.getFileSystemView();
				jFileChooser2.setFileSelectionMode(JFileChooser.FILES_ONLY);
				File dir = new File(projPath);
				jFileChooser2.setCurrentDirectory(fsv.getParentDirectory(dir));
				ExcelFileFilter excelFilter = new ExcelFileFilter(); //excel过滤器
				jFileChooser2.addChoosableFileFilter(excelFilter);
				jFileChooser2.setFileFilter(excelFilter);
				if (JFileChooser.APPROVE_OPTION == jFileChooser2
						.showOpenDialog(null)) {
					danchedistance = jFileChooser2.getSelectedFile().getName();
					System.out.println(danchedistance);
					
				}
			}
			
		}.start();
	}
	protected void buttonofchuanchejihua(ActionEvent e) {
		// TODO Auto-generated method stub
		new Thread() {
			public void run() {
				jFileChooser2.setDialogTitle("请选择文件");
				jFileChooser2.setApproveButtonText("确定");
				 
				FileSystemView fsv = FileSystemView.getFileSystemView();
				jFileChooser2.setFileSelectionMode(JFileChooser.FILES_ONLY);
				File dir = new File(projPath);
				jFileChooser2.setCurrentDirectory(fsv.getParentDirectory(dir));
				ExcelFileFilter excelFilter = new ExcelFileFilter(); //excel过滤器
				jFileChooser2.addChoosableFileFilter(excelFilter);
				jFileChooser2.setFileFilter(excelFilter);
				if (JFileChooser.APPROVE_OPTION == jFileChooser2
						.showOpenDialog(null)) {
					chuanchejihuashijian = jFileChooser2.getSelectedFile().getName();
					System.out.println(chuanchejihuashijian);
					
				}
			}
			
		}.start();
	}
	protected void buttonofchuancheshiji(ActionEvent e) {
		// TODO Auto-generated method stub
		new Thread() {
			public void run() {
				jFileChooser2.setDialogTitle("请选择文件");
				jFileChooser2.setApproveButtonText("确定");
				 
				FileSystemView fsv = FileSystemView.getFileSystemView();
				jFileChooser2.setFileSelectionMode(JFileChooser.FILES_ONLY);
				File dir = new File(projPath);
				jFileChooser2.setCurrentDirectory(fsv.getParentDirectory(dir));
				ExcelFileFilter excelFilter = new ExcelFileFilter(); //excel过滤器
				jFileChooser2.addChoosableFileFilter(excelFilter);
				jFileChooser2.setFileFilter(excelFilter);
				if (JFileChooser.APPROVE_OPTION == jFileChooser2
						.showOpenDialog(null)) {
					chuancheshijishijian = jFileChooser2.getSelectedFile().getName();
					System.out.println(chuancheshijishijian);
					
				}
			}
			
		}.start();
	}
	protected void buttonofchuanchechengkedaoda(ActionEvent e) {
		// TODO Auto-generated method stub
		new Thread() {
			public void run() {
				jFileChooser2.setDialogTitle("请选择文件");
				jFileChooser2.setApproveButtonText("确定");
				 
				FileSystemView fsv = FileSystemView.getFileSystemView();
				jFileChooser2.setFileSelectionMode(JFileChooser.FILES_ONLY);
				File dir = new File(projPath);
				jFileChooser2.setCurrentDirectory(fsv.getParentDirectory(dir));
				ExcelFileFilter excelFilter = new ExcelFileFilter(); //excel过滤器
				jFileChooser2.addChoosableFileFilter(excelFilter);
				jFileChooser2.setFileFilter(excelFilter);
				if (JFileChooser.APPROVE_OPTION == jFileChooser2
						.showOpenDialog(null)) {
					chuanchechengkedaodalv = jFileChooser2.getSelectedFile().getName();
					System.out.println(chuanchechengkedaodalv);
					
				}
			}
			
		}.start();
	}
	
	protected void buttonofshuangxiangOD(ActionEvent e) {
		// TODO Auto-generated method stub
		new Thread() {
			public void run() {
				jFileChooser2.setDialogTitle("请选择文件");
				jFileChooser2.setApproveButtonText("确定");
				 
				FileSystemView fsv = FileSystemView.getFileSystemView();
				jFileChooser2.setFileSelectionMode(JFileChooser.FILES_ONLY);
				File dir = new File(projPath);
				jFileChooser2.setCurrentDirectory(fsv.getParentDirectory(dir));
				ExcelFileFilter excelFilter = new ExcelFileFilter(); //excel过滤器
				jFileChooser2.addChoosableFileFilter(excelFilter);
				jFileChooser2.setFileFilter(excelFilter);
				if (JFileChooser.APPROVE_OPTION == jFileChooser2
						.showOpenDialog(null)) {
					shuangxiangODFile = jFileChooser2.getSelectedFile().getName();
					System.out.println(shuangxiangODFile);
					
				}
			}
			
		}.start();
	}
	
	protected void buttonofshuangxiangzhanjian(ActionEvent e) {
		// TODO Auto-generated method stub
		new Thread() {
			public void run() {
				jFileChooser2.setDialogTitle("请选择文件");
				jFileChooser2.setApproveButtonText("确定");
				 
				FileSystemView fsv = FileSystemView.getFileSystemView();
				jFileChooser2.setFileSelectionMode(JFileChooser.FILES_ONLY);
				File dir = new File(projPath);
				jFileChooser2.setCurrentDirectory(fsv.getParentDirectory(dir));
				ExcelFileFilter excelFilter = new ExcelFileFilter(); //excel过滤器
				jFileChooser2.addChoosableFileFilter(excelFilter);
				jFileChooser2.setFileFilter(excelFilter);
				if (JFileChooser.APPROVE_OPTION == jFileChooser2
						.showOpenDialog(null)) {
					shuangxiangzhanjianFile = jFileChooser2.getSelectedFile().getName();
					System.out.println(shuangxiangzhanjianFile);
					
				}
			}
			
		}.start();
	}
	
	class ExcelFileFilter extends FileFilter {  
		public String getDescription() {  
			return "*.xls;*.xlsx;*.mat";  
		}  
  
		public boolean accept(File file) {  
			String name = file.getName();  
			return file.isDirectory() || name.toLowerCase().endsWith(".xls") || name.toLowerCase().endsWith(".xlsx")
					|| name.toLowerCase().endsWith(".mat");  // 仅显示目录和xls、xlsx文件
		}  
	} 
}

