/*    */ package Entity;
/*    */ 
/*    */ public class ATurnX
/*    */   extends Shapes {
/*    */   public ATurnX(int cenX, int cenY) {
/*  6 */     this.centreX = cenX;
/*  7 */     this.centreY = cenY;
/*  8 */     this.type = 3;
/*  9 */     this.subType = 0;
/* 10 */     update();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void update() {
/* 16 */     this.x1 = this.centreX - 1;
/* 17 */     this.x2 = this.centreX + 1;
/* 18 */     this.x3 = this.centreX + 1;
/* 19 */     this.y1 = this.centreY;
/* 20 */     this.y2 = this.centreY;
/* 21 */     this.y3 = this.centreY + 1;
/*    */   }
/*    */ }


/* Location:              C:\Users\xianzhikun\Desktop\mytemple\Block\Block.jar!\Entity\ATurnX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */