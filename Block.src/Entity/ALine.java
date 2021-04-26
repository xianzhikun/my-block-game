/*    */ package Entity;
/*    */ 
/*    */ public class ALine
/*    */   extends Shapes
/*    */ {
/*    */   public ALine(int cenx, int ceny) {
/*  7 */     this.type = 1;
/*  8 */     this.subType = 0;
/*  9 */     this.centreX = cenx;
/* 10 */     this.centreY = ceny;
/*    */     
/* 12 */     update();
/*    */   }
/*    */ 
/*    */   
/*    */   public void update() {
/* 17 */     this.x1 = this.centreX - 1;
/* 18 */     this.x2 = this.centreX + 1;
/* 19 */     this.x3 = this.centreX + 2;
/* 20 */     this.y1 = this.centreY;
/* 21 */     this.y2 = this.centreY;
/* 22 */     this.y3 = this.centreY;
/*    */   }
/*    */ }


/* Location:              C:\Users\xianzhikun\Desktop\mytemple\Block\Block.jar!\Entity\ALine.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */