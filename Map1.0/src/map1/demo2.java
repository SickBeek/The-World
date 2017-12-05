package map1;

import java.awt.*;
import java.awt.event.*;
import java.awt.Canvas;
import java.awt.Graphics;
public class demo2 {
	public static int[][] outline_x = {{21,178,234,164,48,},//5
		 							   {48,164,164,232,239,165,83},//7
		 							   {230,239,272,288,306,290,294,307,256,220},//10
		 							   {164,196,285,264,230,232,164},//7
		 							   {230,264,279,315,337,325,310,314,288,272,239},//11
		 							   {290,306,314,312,334,347,347,294},//8								
		 							   {196,234,240,306,314,330,341,320,315,279,264,285},//12					
		 							   {240,311,436,402,433,472,468,306},//8								
		 							   {306,327,330,314},//4												
		 							   {433,471,522,558,538,469,472},//7									
		 							   {469,538,496,468},//4												
		 							   {430,468,496,460,461,442,},//6										
		 							   {330,327,366,350,337,315,320,341},//8								
		 							   {366,393,386,357},												
		 							   {404,411,421,413},												
		 							   {413,421,430,424},												
		 							   {393,430,442,430,411,404,424,426,410,386},//10						
		 							   {357,386,410,407,354},											
		 							   {410,426,469,443,409},											
		 							   {310,325,337,350,355,338,347,347,334,312},//10重庆					
		 							   {338,355,350,354,407,413,394,347},//8//21								
		 							   {407,409,418,446,438,413},//6										
		 							   {418,443,474,453,446},											
		 							   {453,463,475,463},										
		 							   {438,446,453,477,462},											
		 							   {347,394,394,373,361,347},//6										
		 							   {294,361,373,352,323},											
		 							   {394,413,438,443,431,420,394},									
		 							   {420,431,443,462,451,433},										
		 							   {352,373,394,420,433,404,401,396,398,395,392,387,390,359,357,352},
		 							   {396,401,404,398},												
		 							   {387,392,395,390},												
		 							   {339,362,364,351,338},											
		 							   {466,474,484,476}};
	public static int[][] outline_y= {{120,49,134,199,194},
									  {194,199,232,260,297,314,268},
									  {300,297,331,311,317,330,353,369,394,353},
									  {199,171,207,256,240,260,232},
									  {240,256,241,260,265,287,295,318,311,331,297},
									  {330,317,318,308,304,314,341,353},								
									  {170,134,136,206,228,199,217,233,260,241,256,207},					
									  {136,151,89,77,9,28,125,206},								
									  {206,195,199,228},												
									  {9,6,58,47,113,92,28},									
									  {92,113,149,125},												
									  {145,125,149,178,153,168},										
									  {199,195,177,266,265,260,233,217},								
									  {177,163,217,235},												
									  {172,162,172,180},												
									  {180,172,180,189},												
									  {163,145,168,180,162,172,189,193,220,217},						
									  {235,217,220,270,249},											
									  {220,193,200,228,231},											
									  {295,287,265,266,279,288,298,314,304,308},//重庆						
									  {288,279,266,249,270,290,298,298},//9								
									  {270,231,230,272,297,290},										
									  {230,228,267,272,272},											
									  {272,270,274,278},										
									  {297,272,272,286,321},											
									  {298,298,344,356,338,341},//6										
									  {353,338,356,392,390},											
									  {298,290,297,303,313,351,344},									
									  {351,313,303,321,347,364},										
									  {392,356,344,351,364,377,372,375,379,380,376,379,383,396,404,404},
									  {375,372,377,379},												
									  {379,376,380,383},												
									  {417,411,414,431,429},											
									  {371,342,342,381}};
	public static int metrix[][]={{0,1,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},//1新疆
								  {1,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},//2西藏
								  {0,1,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0},//3云南
								  {1,1,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},//4青海
								  {0,1,1,1,0,1,1,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},//5四川
								  {0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,1,0,0,0,0,0,0,0},//6贵州
								  {1,0,0,1,1,0,0,1,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},//7甘肃
								  {0,0,0,0,0,0,1,0,1,1,1,1,1,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},//8内蒙古
								  {0,0,0,0,0,0,1,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},//9宁夏
								  {0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},//10黑龙江
								  {0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},//11吉林
								  {0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},//12辽宁
								  {0,0,0,0,1,0,1,1,1,0,0,0,0,1,0,0,0,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0},//13陕西
								  {0,0,0,0,0,0,0,1,0,0,0,0,1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},//14山西
								  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},//15北京
								  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},//16天津
								  {0,0,0,0,0,0,0,1,0,0,0,1,0,1,1,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},//17河北
								  {0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,1,0,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0},//18河南
								  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0},//19山东
								  {0,0,0,0,1,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0},//20重庆
								  {0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1,0,1,0,1,0,0,0,1,0,1,0,0,0,0,0,0},//21湖北
								  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,0,1,0,0,1,0,0,0,0,0,0},//22安徽
								  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,1,1,0,0,0,0,0,0,0,0,0},//23江苏
								  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0},//24上海
								  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,1,1,0,0,0,0,0},//25浙江
								  {0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,1,1,0,1,0,0,0,0},//26湖南
								  {0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0},//27广西
								  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,1,1,0,0,1,1,0,0,0,0},//28江西
								  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,1,0,0,0,0},//29福建
								  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,1,1,0,0},//30广东
								  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0},//31香港
								  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0},//32澳门
								  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},//33海南
								  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};//34台湾
	public static void main(String[] args) {
        Polygon[] p = new Polygon[34];
		for(int i=0;i<34;i++){
			p[i] = new Polygon();
			p[i].npoints = outline_x[i].length;
			p[i].xpoints = outline_x[i];
			p[i].ypoints = outline_y[i];
		}
		Frame frame = new Frame();
		frame.setLayout(null);
		frame.setBounds(300, 150, 800, 500);
		frame.setTitle("地图着色");
		frame.setResizable(false);
        frame.setBackground(Color.lightGray);
        //Panel panel = new Panel();
        MapColor mc = new MapColor(p);
        mc.setBounds(20, 40, 640, 440);
        mc.setBackground(Color.white);
        frame.add(mc);
        Label label = new Label("所用时间：");
        label.setBounds(680, 40, 100, 20);
        frame.add(label);
        TextField text = new TextField();
        text.setBounds(680,60,100,30);
        text.setEditable(false);
        frame.add(text);
        Checkbox cbx = new Checkbox("延时",false);
        cbx.setBounds(680, 110, 100, 40);
        frame.add(cbx);
        frame.setVisible(true);
        frame.addWindowListener(new MyWindowListener());
        Graphics g = mc.getGraphics();
        mc.paint(g);
        Button b1 = new Button("回溯");
        b1.setBounds(680, 170, 100, 40);
        b1.addActionListener(new Monitor(mc,p,text,cbx,metrix));
        Button b2 = new Button("优化");
        b2.setBounds(680, 230, 100, 40);
        b2.addActionListener(new Monitor(mc,p,text,cbx,metrix));
        Button b3 = new Button("重置");
        b3.setBounds(680, 290, 100, 40);
        b3.addActionListener(new Monitor(mc,p,text,cbx,metrix));
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
	}

}
class MapColor extends Canvas{
	private Color[] c = {Color.yellow,Color.blue,Color.green,Color.red,Color.white};
	private Polygon[] p;
	public MapColor(Polygon[] p){
		this.p = p;
	}
	public void paint(Graphics g){
		g.setColor(Color.black);
		for(int i=0;i<34;i++)
			g.drawPolygon(p[i]);
	}
	public void fillColor(Graphics g,int i,int j){
		g.setColor(c[j]);
		g.fillPolygon(p[i]);
		
	}
}
class MyWindowListener implements WindowListener{
	public void windowClosing(WindowEvent e){
		((Frame)e.getComponent()).dispose();
		System.exit(0);
	}
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}

}
class Monitor implements ActionListener{
	private MapColor mc;
	private Polygon[] p;
	private TextField text;
	private Checkbox cbx; 
	private int[][] metrix;
	public Monitor(MapColor mc,Polygon[] p,TextField text,Checkbox cbx,int[][] metrix){
		this.mc=mc;
		this.p=p;
		this.text=text;
		this.cbx=cbx;
		this.metrix=metrix;
	}
	public void actionPerformed(ActionEvent event){
		Object obj = event.getSource();
		Button btn = (Button)obj;
		if(btn.getLabel().equals("回溯")){
			demo1 de = new demo1(mc,p,cbx,metrix);
			long startTime=System.currentTimeMillis();   //获取开始时间
			de.backtrack();
            long endTime=System.currentTimeMillis(); //获取结束时间
            text.setText((endTime-startTime)+"ms");
		}
		else if(btn.getLabel().equals("优化")){
			demo3 de = new demo3(mc,p,cbx,metrix);
			long startTime=System.currentTimeMillis();   //获取开始时间
			de.optimize();
            long endTime=System.currentTimeMillis(); //获取结束时间
            text.setText((endTime-startTime)+"ms");
		}
		else{
			demo1 de = new demo1(mc,p,cbx,metrix);
			de.resetMap();
			text.setText(null);
			cbx.setState(false);
		}
	}
}
