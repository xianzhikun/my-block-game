/*    */ package Entity;
/*    */ 
/*    */ public class DTurnX
/*    */   extends Shapes {
/*    */   public DTurnX(int cenX, int cenY) {
/*  6 */     this.centreX = cenX;
/*  7 */     this.centreY = cenY;
/*  8 */     this.type = 3;
/*  9 */     this.subType = 3;
/* 10 */     update();
/*    */   }
/*    */ 
/*    */   
/*    */   public void update() {
/* 15 */     this.x1 = this.centreX;
/* 16 */     this.x2 = this.centreX;
/* 17 */     this.x3 = this.centreX + 1;
/* 18 */     this.y1 = this.centreY + 1;
/* 19 */     this.y2 = this.centreY - 1;
/* 20 */     this.y3 = this.centreY - 1;
/*    */   }
/*    */ }


/* Location:              C:\Users\xianzhikun\Desktop\mytemple\Block\Block.jar!\Entity\DTurnX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */