/*    */ package Entity;
/*    */ 
/*    */ public class DThree
/*    */   extends Shapes {
/*    */   public DThree(int cenX, int cenY) {
/*  6 */     this.type = 2;
/*  7 */     this.centreX = cenX;
/*  8 */     this.centreY = cenY;
/*  9 */     this.subType = 3;
/* 10 */     update();
/*    */   }
/*    */ 
/*    */   
/*    */   public void update() {
/* 15 */     this.x1 = this.centreX;
/* 16 */     this.x2 = this.centreX - 1;
/* 17 */     this.x3 = this.centreX;
/* 18 */     this.y1 = this.centreY + 1;
/* 19 */     this.y2 = this.centreY;
/* 20 */     this.y3 = this.centreY - 1;
/*    */   }
/*    */ }


/* Location:              C:\Users\xianzhikun\Desktop\mytemple\Block\Block.jar!\Entity\DThree.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */