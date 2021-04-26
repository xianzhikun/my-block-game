/*    */ package Frame;
/*    */ 
/*    */ import Entity.MainFrame;
/*    */ import java.awt.Graphics;
/*    */ import javax.swing.JPanel;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MyPanel
/*    */   extends JPanel
/*    */ {
/*    */   protected void paintComponent(Graphics g) {
/* 14 */     for (int i = 0; i < 10; i++) {
/*    */       
/* 16 */       for (int j = 0; j < 16; j++) {
/*    */         
/* 18 */         if (MainFrame.blocks[i][j] == 0)
/*    */         {
/* 20 */           g.clearRect(i * 60, j * 60, 60, 60);
/*    */         }
/*    */       } 
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 34 */     for (int i = 0; i < 10; i++) {
/*    */       
/* 36 */       for (int j = 0; j < 16; j++) {
/*    */         
/* 38 */         if (MainFrame.blocks[i][j] != 0)
/*    */         {
/* 40 */           g.fillRect(i * 60 + 1, j * 60 + 1, 58, 58);
/*    */         }
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\xianzhikun\Desktop\mytemple\Block\Block.jar!\Frame\MyPanel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */