/*    */ package Entity;
/*    */ 
/*    */ public class CTurnX
/*    */   extends Shapes {
/*    */   public CTurnX(int cenX, int cenY) {
/*  6 */     this.centreX = cenX;
/*  7 */     this.centreY = cenY;
/*  8 */     this.type = 3;
/*  9 */     this.subType = 2;
/* 10 */     update();
/*    */   }
/*    */ 
/*    */   
/*    */   public void update() {
/* 15 */     this.x1 = this.centreX + 1;
/* 16 */     this.x2 = this.centreX - 1;
/* 17 */     this.x3 = this.centreX - 1;
/* 18 */     this.y1 = this.centreY;
/* 19 */     this.y2 = this.centreY;
/* 20 */     this.y3 = this.centreY - 1;
/*    */   }
/*    */ }


/* Location:              C:\Users\xianzhikun\Desktop\mytemple\Block\Block.jar!\Entity\CTurnX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */