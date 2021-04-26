/*    */ package Entity;
/*    */ 
/*    */ import Frame.MyPanel;
/*    */ import Frame.SimpleFrame;
/*    */ import java.awt.Container;
/*    */ import java.awt.Font;
/*    */ import java.awt.Insets;
/*    */ import java.awt.event.ActionEvent;
/*    */ import java.awt.event.ActionListener;
/*    */ import javax.swing.JButton;
/*    */ import javax.swing.JLabel;
/*    */ import javax.swing.JPanel;
/*    */ 
/*    */ public class MainFrame
/*    */   extends SimpleFrame
/*    */ {
/* 17 */   public static int[][] blocks = new int[10][16];
/*    */   public JButton left;
/*    */   public JButton right;
/*    */   public JButton spin;
/*    */   public static JLabel socreLabel;
/* 22 */   static MyPanel mypanel = new MyPanel();
/*    */   static Container content;
/* 24 */   public static int socre = 0;
/* 25 */   RunningThread thread = new RunningThread();
/*    */   public MainFrame(String name) {
/* 27 */     super(name);
/* 28 */     content = getContentPane();
/* 29 */     setContentPane(content);
/* 30 */     Insets insert = getInsets();
/* 31 */     int height = insert.top + insert.bottom;
/* 32 */     int width = insert.left + insert.right;
/* 33 */     setSize(840 + width, 960 + height);
/*    */     
/* 35 */     this.thread.start();
/*    */   }
/*    */ 
/*    */   
/*    */   public void run(JPanel panel) {
/* 40 */     this.left = new JButton("左");
/* 41 */     this.right = new JButton("右");
/* 42 */     this.spin = new JButton("旋转");
/* 43 */     socreLabel = new JLabel("当前分数：");
/* 44 */     this.left.setSize(60, 60);
/* 45 */     this.right.setSize(60, 60);
/* 46 */     this.spin.setSize(60, 60);
/* 47 */     socreLabel.setSize(120, 60);
/* 48 */     socreLabel.setFont(new Font("宋体", 0, 20));
/* 49 */     this.left.setFont(new Font("宋体", 0, 20));
/* 50 */     this.right.setFont(new Font("宋体", 0, 20));
/* 51 */     this.spin.setFont(new Font("宋体", 0, 20));
/* 52 */     this.left.addActionListener(new ActionListener()
/*    */         {
/*    */           public void actionPerformed(ActionEvent e)
/*    */           {
/* 56 */             int i = MainFrame.this.thread.turnLeft();
/*    */           }
/*    */         });
/* 59 */     this.right.addActionListener(new ActionListener()
/*    */         {
/*    */           public void actionPerformed(ActionEvent e)
/*    */           {
/* 63 */             int i = MainFrame.this.thread.turnRight();
/*    */           }
/*    */         });
/* 66 */     this.spin.addActionListener(new ActionListener()
/*    */         {
/*    */           public void actionPerformed(ActionEvent e)
/*    */           {
/* 70 */             int i = MainFrame.this.thread.spin();
/*    */           }
/*    */         });
/* 73 */     panel.add(this.left);
/* 74 */     panel.add(this.right);
/* 75 */     panel.add(this.spin);
/* 76 */     panel.add(socreLabel);
/* 77 */     panel.add(mypanel);
/*    */   }
/*    */ 
/*    */   
/*    */   public void setbounds(int width, int height, int x, int y) {
/* 82 */     this.left.setBounds(600, 600, 80, 60);
/* 83 */     this.right.setBounds(760, 600, 80, 60);
/* 84 */     this.spin.setBounds(680, 600, 80, 60);
/* 85 */     socreLabel.setBounds(620, 400, 120, 60);
/* 86 */     mypanel.setBounds(0, 0, 600, 960);
/*    */   }
/*    */ }


/* Location:              C:\Users\xianzhikun\Desktop\mytemple\Block\Block.jar!\Entity\MainFrame.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */