/*    */ package Entity;
/*    */ 
/*    */ public class CThree
/*    */   extends Shapes {
/*    */   public CThree(int cenX, int cenY) {
/*  6 */     this.type = 2;
/*  7 */     this.subType = 2;
/*  8 */     this.centreX = cenX;
/*  9 */     this.centreY = cenY;
/* 10 */     update();
/*    */   }
/*    */ 
/*    */   
/*    */   public void update() {
/* 15 */     this.x1 = this.centreX + 1;
/* 16 */     this.x2 = this.centreX;
/* 17 */     this.x3 = this.centreX - 1;
/* 18 */     this.y1 = this.centreY;
/* 19 */     this.y2 = this.centreY + 1;
/* 20 */     this.y3 = this.centreY;
/*    */   }
/*    */ }


/* Location:              C:\Users\xianzhikun\Desktop\mytemple\Block\Block.jar!\Entity\CThree.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */