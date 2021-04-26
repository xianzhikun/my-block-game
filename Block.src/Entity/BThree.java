/*    */ package Entity;
/*    */ 
/*    */ public class BThree
/*    */   extends Shapes {
/*    */   public BThree(int cenX, int cenY) {
/*  6 */     this.type = 2;
/*  7 */     this.subType = 1;
/*  8 */     this.centreX = cenX;
/*  9 */     this.centreY = cenY;
/* 10 */     update();
/*    */   }
/*    */ 
/*    */   
/*    */   public void update() {
/* 15 */     this.x1 = this.centreX;
/* 16 */     this.x2 = this.centreX + 1;
/* 17 */     this.x3 = this.centreX;
/* 18 */     this.y1 = this.centreY - 1;
/* 19 */     this.y2 = this.centreY;
/* 20 */     this.y3 = this.centreY + 1;
/*    */   }
/*    */ }


/* Location:              C:\Users\xianzhikun\Desktop\mytemple\Block\Block.jar!\Entity\BThree.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */