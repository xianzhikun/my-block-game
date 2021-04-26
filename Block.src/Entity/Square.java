/*    */ package Entity;
/*    */ 
/*    */ public class Square
/*    */   extends Shapes {
/*    */   public Square(int cenX, int cenY) {
/*  6 */     this.type = 0;
/*  7 */     this.centreX = cenX;
/*  8 */     this.centreY = cenY;
/*  9 */     update();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void update() {
/* 16 */     this.x1 = this.centreX;
/* 17 */     this.y1 = this.centreY - 1;
/* 18 */     this.x2 = this.centreX + 1;
/* 19 */     this.y2 = this.centreY - 1;
/* 20 */     this.x3 = this.centreX + 1;
/* 21 */     this.y3 = this.centreY;
/*    */   }
/*    */ }


/* Location:              C:\Users\xianzhikun\Desktop\mytemple\Block\Block.jar!\Entity\Square.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */