/*    */ package Entity;
/*    */ 
/*    */ public class BLine
/*    */   extends Shapes {
/*    */   public BLine(int cenx, int ceny) {
/*  6 */     this.type = 1;
/*  7 */     this.subType = 1;
/*  8 */     this.centreX = cenx;
/*  9 */     this.centreY = ceny;
/*    */     
/* 11 */     update();
/*    */   }
/*    */ 
/*    */   
/*    */   public void update() {
/* 16 */     this.x1 = this.centreX;
/* 17 */     this.x2 = this.centreX;
/* 18 */     this.x3 = this.centreX;
/* 19 */     this.y1 = this.centreY + 1;
/* 20 */     this.y2 = this.centreY - 1;
/* 21 */     this.y3 = this.centreY - 2;
/*    */   }
/*    */ }


/* Location:              C:\Users\xianzhikun\Desktop\mytemple\Block\Block.jar!\Entity\BLine.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */