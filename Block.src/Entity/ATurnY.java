/*    */ package Entity;
/*    */ 
/*    */ public class ATurnY
/*    */   extends Shapes {
/*    */   public ATurnY(int cenX, int cenY) {
/*  6 */     this.centreX = cenX;
/*  7 */     this.centreY = cenY;
/*  8 */     this.type = 4;
/*  9 */     this.subType = 0;
/* 10 */     update();
/*    */   }
/*    */   
/*    */   public void update() {
/* 14 */     this.x1 = this.centreX - 1;
/* 15 */     this.x2 = this.centreX - 1;
/* 16 */     this.x3 = this.centreX + 1;
/* 17 */     this.y1 = this.centreY + 1;
/* 18 */     this.y2 = this.centreY;
/* 19 */     this.y3 = this.centreY;
/*    */   }
/*    */ }


/* Location:              C:\Users\xianzhikun\Desktop\mytemple\Block\Block.jar!\Entity\ATurnY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */