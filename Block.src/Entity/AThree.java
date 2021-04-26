/*    */ package Entity;
/*    */ 
/*    */ public class AThree
/*    */   extends Shapes {
/*    */   public AThree(int cenX, int cenY) {
/*  6 */     this.type = 2;
/*  7 */     this.subType = 0;
/*  8 */     this.centreX = cenX;
/*  9 */     this.centreY = cenY;
/* 10 */     update();
/*    */   }
/*    */   
/*    */   public void update() {
/* 14 */     this.x1 = this.centreX - 1;
/* 15 */     this.x2 = this.centreX;
/* 16 */     this.x3 = this.centreX + 1;
/* 17 */     this.y1 = this.centreY;
/* 18 */     this.y2 = this.centreY - 1;
/* 19 */     this.y3 = this.centreY;
/*    */   }
/*    */ }


/* Location:              C:\Users\xianzhikun\Desktop\mytemple\Block\Block.jar!\Entity\AThree.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */