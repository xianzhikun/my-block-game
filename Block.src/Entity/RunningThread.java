/*     */ package Entity;
/*     */ 
/*     */ import java.util.Random;
/*     */ 
/*     */ public class RunningThread extends Thread {
/*   6 */   int shapeType = -1;
/*   7 */   Random rand = new Random();
/*   8 */   Shapes shape = null;
/*   9 */   int sleepTime = 500;
/*     */ 
/*     */   
/*     */   public void run() {
/*     */     while (true) {
/*     */       try {
/*  15 */         if (MainFrame.socre <= 300) {
/*     */           
/*  17 */           this.sleepTime = 500 - MainFrame.socre;
/*     */         }
/*     */         else {
/*     */           
/*  21 */           this.sleepTime = 200;
/*     */         } 
/*  23 */         Thread.sleep(this.sleepTime);
/*  24 */       } catch (InterruptedException e) {
/*     */         
/*  26 */         e.printStackTrace();
/*     */       } 
/*  28 */       if (this.shape == null)
/*     */       {
/*  30 */         randomCreate();
/*     */       }
/*  32 */       int i = moveOneDown();
/*  33 */       if (i == 1) {
/*     */         
/*  35 */         check();
/*     */       }
/*  37 */       else if (i == 2) {
/*     */         
/*  39 */         check();
/*     */       }
/*  41 */       else if (i == 3) {
/*     */         
/*  43 */         System.out.println("exit..");
/*     */         return;
/*     */       } 
/*  46 */       repaint();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void check() {
/*  51 */     System.out.println("进入检查..");
/*  52 */     for (int i = 15; i > -1; i--) {
/*     */       
/*  54 */       for (int j = 0; j < 10; j++) {
/*     */         
/*  56 */         if (MainFrame.blocks[j][i] == 0)
/*     */           break; 
/*  58 */         if (j == 9) {
/*     */           
/*  60 */           downOne(i);
/*  61 */           plusScore();
/*     */         } 
/*     */       } 
/*     */     } 
/*  65 */     repaint();
/*     */   }
/*     */ 
/*     */   
/*     */   public void downOne(int y) {
/*  70 */     System.out.println("清空y格..");
/*  71 */     for (int i = 0; i < 10; i++)
/*     */     {
/*  73 */       MainFrame.blocks[i][y] = 0;
/*     */     }
/*     */     
/*  76 */     for (int i = y; i > 0; i--) {
/*     */       
/*  78 */       for (int j = 0; j < 10; j++)
/*     */       {
/*  80 */         MainFrame.blocks[j][i] = MainFrame.blocks[j][i - 1];
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void plusScore() {
/*  88 */     MainFrame.socre++;
/*  89 */     MainFrame.socreLabel.setText("当前分数：" + MainFrame.socre);
/*     */   }
/*     */ 
/*     */   
/*  93 */   public void clearSocre() { MainFrame.socre = 0; }
/*     */ 
/*     */ 
/*     */   
/*  97 */   public void repaint() { MainFrame.mypanel.repaint(); }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int moveOneDown() {
/* 103 */     if (this.shape.gety0() == 15 || 
/* 104 */       this.shape.getY1() == 15 || 
/* 105 */       this.shape.getY2() == 15 || 
/* 106 */       this.shape.getY3() == 15) {
/*     */       
/* 108 */       formThis();
/* 109 */       this.shape = null;
/* 110 */       return 2;
/*     */     } 
/* 112 */     if (this.shape.gety0() + 1 >= 0)
/*     */     {
/* 114 */       if (MainFrame.blocks[this.shape.getx0()][this.shape.gety0() + 1] == 1) {
/*     */         
/* 116 */         if (this.shape.gety0() + 1 == 0) {
/*     */           
/* 118 */           this.shape = null;
/*     */           
/* 120 */           return 3;
/*     */         } 
/* 122 */         formThis();
/* 123 */         this.shape = null;
/* 124 */         return 1;
/*     */       } 
/*     */     }
/* 127 */     if (this.shape.getY1() + 1 >= 0)
/*     */     {
/* 129 */       if (MainFrame.blocks[this.shape.getX1()][this.shape.getY1() + 1] == 1) {
/*     */         
/* 131 */         if (this.shape.gety0() + 1 == 0) {
/*     */           
/* 133 */           this.shape = null;
/*     */           
/* 135 */           return 3;
/*     */         } 
/* 137 */         formThis();
/* 138 */         this.shape = null;
/* 139 */         return 1;
/*     */       } 
/*     */     }
/* 142 */     if (this.shape.getY2() + 1 >= 0)
/*     */     {
/* 144 */       if (MainFrame.blocks[this.shape.getX2()][this.shape.getY2() + 1] == 1) {
/*     */         
/* 146 */         if (this.shape.gety0() + 1 == 0) {
/*     */           
/* 148 */           this.shape = null;
/*     */           
/* 150 */           return 3;
/*     */         } 
/* 152 */         formThis();
/* 153 */         this.shape = null;
/* 154 */         return 1;
/*     */       } 
/*     */     }
/* 157 */     if (this.shape.getY3() + 1 >= 0)
/*     */     {
/* 159 */       if (MainFrame.blocks[this.shape.getX3()][this.shape.getY3() + 1] == 1) {
/*     */         
/* 161 */         if (this.shape.gety0() + 1 == 0) {
/*     */           
/* 163 */           this.shape = null;
/*     */           
/* 165 */           return 3;
/*     */         } 
/* 167 */         formThis();
/* 168 */         this.shape = null;
/* 169 */         return 1;
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/* 174 */     deleteThis();
/*     */     
/* 176 */     this.shape.centreY++;
/* 177 */     this.shape.update();
/*     */     
/* 179 */     updateThis();
/* 180 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int turnLeft() {
/* 186 */     if (this.shape == null)
/*     */     {
/* 188 */       return -1;
/*     */     }
/* 190 */     if (this.shape.getx0() > 0 && 
/* 191 */       this.shape.getX1() > 0 && 
/* 192 */       this.shape.getX2() > 0 && 
/* 193 */       this.shape.getX3() > 0) {
/*     */       
/* 195 */       System.out.println("进入1..");
/* 196 */       deleteThis();
/* 197 */       if (MainFrame.blocks[this.shape.getx0() - 1][this.shape.gety0()] == 0 && 
/* 198 */         MainFrame.blocks[this.shape.getX1() - 1][this.shape.getY1()] == 0 && 
/* 199 */         MainFrame.blocks[this.shape.getX2() - 1][this.shape.getY2()] == 0 && 
/* 200 */         MainFrame.blocks[this.shape.getX3() - 1][this.shape.getY3()] == 0) {
/*     */ 
/*     */         
/* 203 */         System.out.println("进入2..");
/*     */         
/* 205 */         this.shape.centreX--;
/* 206 */         this.shape.update();
/* 207 */         updateThis();
/* 208 */         repaint();
/*     */         
/* 210 */         return 0;
/*     */       } 
/*     */ 
/*     */       
/* 214 */       updateThis();
/* 215 */       System.out.println("进入3..");
/* 216 */       return 1;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 221 */     System.out.println("进入4..");
/* 222 */     return 2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int turnRight() {
/* 231 */     if (this.shape == null)
/*     */     {
/* 233 */       return -1;
/*     */     }
/* 235 */     if (this.shape.getx0() < 9 && 
/* 236 */       this.shape.getX1() < 9 && 
/* 237 */       this.shape.getX2() < 9 && 
/* 238 */       this.shape.getX3() < 9) {
/*     */       
/* 240 */       deleteThis();
/* 241 */       if (MainFrame.blocks[this.shape.getx0() + 1][this.shape.gety0()] == 0 && 
/* 242 */         MainFrame.blocks[this.shape.getX1() + 1][this.shape.getY1()] == 0 && 
/* 243 */         MainFrame.blocks[this.shape.getX2() + 1][this.shape.getY2()] == 0 && 
/* 244 */         MainFrame.blocks[this.shape.getX3() + 1][this.shape.getY3()] == 0) {
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 249 */         this.shape.centreX++;
/* 250 */         this.shape.update();
/* 251 */         updateThis();
/* 252 */         repaint();
/*     */         
/* 254 */         return 0;
/*     */       } 
/*     */ 
/*     */       
/* 258 */       updateThis();
/* 259 */       return 1;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 264 */     return 2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int spin() {
/* 271 */     if (this.shape == null) {
/*     */       
/* 273 */       System.out.println("未识别到shape");
/* 274 */       return -1;
/*     */     } 
/* 276 */     int type = this.shape.type;
/* 277 */     if (type == 0)
/*     */     {
/* 279 */       return 0;
/*     */     }
/* 281 */     if (type == 1) {
/*     */       
/* 283 */       int subtype = this.shape.subType;
/* 284 */       if (subtype == 0) {
/*     */         
/* 286 */         Shapes sub = new BLine(this.shape.getx0(), this.shape.gety0());
/* 287 */         spinRight(sub);
/* 288 */         boolean isRight = checkShape(sub);
/* 289 */         if (isRight) {
/*     */           
/* 291 */           deleteThis();
/* 292 */           this.shape = sub;
/* 293 */           updateThis();
/* 294 */           repaint();
/*     */         } else {
/*     */           
/* 297 */           System.out.println("shape 不能旋转");
/* 298 */           return 1;
/*     */         } 
/*     */       } else {
/*     */         
/* 302 */         Shapes sub = new ALine(this.shape.getx0(), this.shape.gety0());
/* 303 */         spinRight(sub);
/* 304 */         boolean isRight = checkShape(sub);
/* 305 */         if (isRight) {
/*     */           
/* 307 */           deleteThis();
/* 308 */           this.shape = sub;
/* 309 */           updateThis();
/* 310 */           repaint();
/*     */         } else {
/*     */           
/* 313 */           System.out.println("shape 不能旋转");
/* 314 */           return 1;
/*     */         }
/*     */       
/*     */       } 
/* 318 */     } else if (type == 2) {
/*     */       
/* 320 */       int subtype = this.shape.subType;
/* 321 */       if (subtype == 0) {
/*     */         
/* 323 */         Shapes sub = new BThree(this.shape.getx0(), this.shape.gety0());
/* 324 */         spinRight(sub);
/* 325 */         boolean isRight = checkShape(sub);
/* 326 */         if (isRight) {
/*     */           
/* 328 */           deleteThis();
/* 329 */           this.shape = sub;
/* 330 */           updateThis();
/* 331 */           repaint();
/*     */         } else {
/*     */           
/* 334 */           System.out.println("shape 不能旋转");
/* 335 */           return 1;
/*     */         }
/*     */       
/* 338 */       } else if (subtype == 1) {
/*     */         
/* 340 */         Shapes sub = new CThree(this.shape.getx0(), this.shape.gety0());
/* 341 */         spinRight(sub);
/* 342 */         boolean isRight = checkShape(sub);
/* 343 */         if (isRight) {
/*     */           
/* 345 */           deleteThis();
/* 346 */           this.shape = sub;
/* 347 */           updateThis();
/* 348 */           repaint();
/*     */         } else {
/*     */           
/* 351 */           System.out.println("shape 不能旋转");
/* 352 */           return 1;
/*     */         }
/*     */       
/* 355 */       } else if (subtype == 2) {
/*     */         
/* 357 */         Shapes sub = new DThree(this.shape.getx0(), this.shape.gety0());
/* 358 */         spinRight(sub);
/* 359 */         boolean isRight = checkShape(sub);
/* 360 */         if (isRight) {
/*     */           
/* 362 */           deleteThis();
/* 363 */           this.shape = sub;
/* 364 */           updateThis();
/* 365 */           repaint();
/*     */         } else {
/*     */           
/* 368 */           System.out.println("shape 不能旋转");
/* 369 */           return 1;
/*     */         } 
/*     */       } else {
/*     */         
/* 373 */         Shapes sub = new AThree(this.shape.getx0(), this.shape.gety0());
/* 374 */         spinRight(sub);
/* 375 */         boolean isRight = checkShape(sub);
/* 376 */         if (isRight) {
/*     */           
/* 378 */           deleteThis();
/* 379 */           this.shape = sub;
/* 380 */           updateThis();
/* 381 */           repaint();
/*     */         } else {
/*     */           
/* 384 */           System.out.println("shape 不能旋转");
/* 385 */           return 1;
/*     */         }
/*     */       
/*     */       } 
/* 389 */     } else if (type == 3) {
/*     */       
/* 391 */       int subtype = this.shape.subType;
/* 392 */       if (subtype == 0) {
/*     */         
/* 394 */         Shapes sub = new BTurnX(this.shape.getx0(), this.shape.gety0());
/* 395 */         spinRight(sub);
/* 396 */         boolean isRight = checkShape(sub);
/* 397 */         if (isRight) {
/*     */           
/* 399 */           deleteThis();
/* 400 */           this.shape = sub;
/* 401 */           updateThis();
/* 402 */           repaint();
/*     */         } else {
/*     */           
/* 405 */           System.out.println("shape 不能旋转");
/* 406 */           return 1;
/*     */         }
/*     */       
/* 409 */       } else if (subtype == 1) {
/*     */         
/* 411 */         Shapes sub = new CTurnX(this.shape.getx0(), this.shape.gety0());
/* 412 */         spinRight(sub);
/* 413 */         boolean isRight = checkShape(sub);
/* 414 */         if (isRight) {
/*     */           
/* 416 */           deleteThis();
/* 417 */           this.shape = sub;
/* 418 */           updateThis();
/* 419 */           repaint();
/*     */         } else {
/*     */           
/* 422 */           System.out.println("shape 不能旋转");
/* 423 */           return 1;
/*     */         }
/*     */       
/* 426 */       } else if (subtype == 2) {
/*     */         
/* 428 */         Shapes sub = new DTurnX(this.shape.getx0(), this.shape.gety0());
/* 429 */         spinRight(sub);
/* 430 */         boolean isRight = checkShape(sub);
/* 431 */         if (isRight) {
/*     */           
/* 433 */           deleteThis();
/* 434 */           this.shape = sub;
/* 435 */           updateThis();
/* 436 */           repaint();
/*     */         } else {
/*     */           
/* 439 */           System.out.println("shape 不能旋转");
/* 440 */           return 1;
/*     */         } 
/*     */       } else {
/*     */         
/* 444 */         Shapes sub = new ATurnX(this.shape.getx0(), this.shape.gety0());
/* 445 */         spinRight(sub);
/* 446 */         boolean isRight = checkShape(sub);
/* 447 */         if (isRight) {
/*     */           
/* 449 */           deleteThis();
/* 450 */           this.shape = sub;
/* 451 */           updateThis();
/* 452 */           repaint();
/*     */         } else {
/*     */           
/* 455 */           System.out.println("shape 不能旋转");
/* 456 */           return 1;
/*     */         }
/*     */       
/*     */       } 
/* 460 */     } else if (type == 4) {
/*     */       
/* 462 */       int subtype = this.shape.subType;
/* 463 */       if (subtype == 0) {
/*     */         
/* 465 */         Shapes sub = new BTurnY(this.shape.getx0(), this.shape.gety0());
/* 466 */         spinRight(sub);
/* 467 */         boolean isRight = checkShape(sub);
/* 468 */         if (isRight) {
/*     */           
/* 470 */           deleteThis();
/* 471 */           this.shape = sub;
/* 472 */           updateThis();
/* 473 */           repaint();
/*     */         } else {
/*     */           
/* 476 */           System.out.println("shape 不能旋转");
/* 477 */           return 1;
/*     */         }
/*     */       
/* 480 */       } else if (subtype == 1) {
/*     */         
/* 482 */         Shapes sub = new CTurnY(this.shape.getx0(), this.shape.gety0());
/* 483 */         spinRight(sub);
/* 484 */         boolean isRight = checkShape(sub);
/* 485 */         if (isRight) {
/*     */           
/* 487 */           deleteThis();
/* 488 */           this.shape = sub;
/* 489 */           updateThis();
/* 490 */           repaint();
/*     */         } else {
/*     */           
/* 493 */           System.out.println("shape 不能旋转");
/* 494 */           return 1;
/*     */         }
/*     */       
/* 497 */       } else if (subtype == 2) {
/*     */         
/* 499 */         Shapes sub = new DTurnY(this.shape.getx0(), this.shape.gety0());
/* 500 */         spinRight(sub);
/* 501 */         boolean isRight = checkShape(sub);
/* 502 */         if (isRight) {
/*     */           
/* 504 */           deleteThis();
/* 505 */           this.shape = sub;
/* 506 */           updateThis();
/* 507 */           repaint();
/*     */         } else {
/*     */           
/* 510 */           System.out.println("shape 不能旋转");
/* 511 */           return 1;
/*     */         } 
/*     */       } else {
/*     */         
/* 515 */         Shapes sub = new ATurnY(this.shape.getx0(), this.shape.gety0());
/* 516 */         spinRight(sub);
/* 517 */         boolean isRight = checkShape(sub);
/* 518 */         if (isRight) {
/*     */           
/* 520 */           deleteThis();
/* 521 */           this.shape = sub;
/* 522 */           updateThis();
/* 523 */           repaint();
/*     */         } else {
/*     */           
/* 526 */           System.out.println("shape 不能旋转");
/* 527 */           return 1;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 532 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void deleteThis() {
/* 537 */     for (int i = 0; i < 10; i++) {
/*     */       
/* 539 */       for (int j = 0; j < 16; j++) {
/*     */         
/* 541 */         if (MainFrame.blocks[i][j] == 2)
/*     */         {
/* 543 */           MainFrame.blocks[i][j] = 0;
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void updateThis() {
/* 550 */     if (this.shape.gety0() >= 0)
/*     */     {
/* 552 */       MainFrame.blocks[this.shape.getx0()][this.shape.gety0()] = 2;
/*     */     }
/* 554 */     if (this.shape.getY1() >= 0)
/*     */     {
/* 556 */       MainFrame.blocks[this.shape.getX1()][this.shape.getY1()] = 2;
/*     */     }
/* 558 */     if (this.shape.getY2() >= 0)
/*     */     {
/* 560 */       MainFrame.blocks[this.shape.getX2()][this.shape.getY2()] = 2;
/*     */     }
/* 562 */     if (this.shape.getY3() >= 0)
/*     */     {
/* 564 */       MainFrame.blocks[this.shape.getX3()][this.shape.getY3()] = 2;
/*     */     }
/*     */   }
/*     */   
/*     */   public void formThis() {
/* 569 */     for (int i = 0; i < 10; i++) {
/*     */       
/* 571 */       for (int j = 0; j < 16; j++) {
/*     */         
/* 573 */         if (MainFrame.blocks[i][j] == 2)
/*     */         {
/* 575 */           MainFrame.blocks[i][j] = 1;
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void spinRight(Shapes sha) {
/* 582 */     while (sha.getx0() < 0 || 
/* 583 */       sha.getX1() < 0 || 
/* 584 */       sha.getX2() < 0 || 
/* 585 */       sha.getX3() < 0) {
/*     */       
/* 587 */       sha.centreX++;
/* 588 */       sha.update();
/*     */     } 
/*     */     
/* 591 */     while (sha.getx0() > 9 || 
/* 592 */       sha.getX1() > 9 || 
/* 593 */       sha.getX2() > 9 || 
/* 594 */       sha.getX3() > 9) {
/*     */       
/* 596 */       sha.centreX--;
/* 597 */       sha.update();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean checkShape(Shapes sha) {
/* 603 */     if (MainFrame.blocks[sha.getx0()][sha.gety0()] == 1 || 
/* 604 */       MainFrame.blocks[sha.getX1()][sha.getY1()] == 1 || 
/* 605 */       MainFrame.blocks[sha.getX2()][sha.getY2()] == 1 || 
/* 606 */       MainFrame.blocks[sha.getX3()][sha.getY3()] == 1)
/*     */     {
/* 608 */       return false;
/*     */     }
/*     */     
/* 611 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void randomCreate() {
/* 617 */     int r = this.rand.nextInt(5);
/* 618 */     if (r == 0) {
/*     */       
/* 620 */       this.shape = new Square(5, -1);
/* 621 */       this.shapeType = 0;
/*     */     }
/* 623 */     else if (r == 1) {
/*     */       
/* 625 */       int j = this.rand.nextInt(2);
/* 626 */       if (j == 0) {
/*     */         
/* 628 */         this.shape = new ALine(5, -1);
/*     */       } else {
/*     */         
/* 631 */         this.shape = new BLine(5, -2);
/*     */       }
/*     */     
/* 634 */     } else if (r == 2) {
/*     */       
/* 636 */       int j = this.rand.nextInt(4);
/* 637 */       if (j == 0) {
/*     */         
/* 639 */         this.shape = new AThree(5, -1);
/*     */       }
/* 641 */       else if (j == 1) {
/*     */         
/* 643 */         this.shape = new BThree(5, -2);
/*     */       }
/* 645 */       else if (j == 2) {
/*     */         
/* 647 */         this.shape = new CThree(5, -2);
/*     */       } else {
/*     */         
/* 650 */         this.shape = new DThree(5, -2);
/*     */       }
/*     */     
/* 653 */     } else if (r == 3) {
/*     */       
/* 655 */       int j = this.rand.nextInt(4);
/* 656 */       if (j == 0) {
/*     */         
/* 658 */         this.shape = new ATurnX(5, -2);
/*     */       }
/* 660 */       else if (j == 1) {
/*     */         
/* 662 */         this.shape = new BTurnX(5, -2);
/*     */       }
/* 664 */       else if (j == 2) {
/*     */         
/* 666 */         this.shape = new CTurnX(5, -1);
/*     */       } else {
/*     */         
/* 669 */         this.shape = new DTurnX(5, -2);
/*     */       } 
/*     */     } else {
/*     */       
/* 673 */       int j = this.rand.nextInt(4);
/* 674 */       if (j == 0) {
/*     */         
/* 676 */         this.shape = new ATurnY(5, -2);
/*     */       }
/* 678 */       else if (j == 1) {
/*     */         
/* 680 */         this.shape = new BTurnY(5, -2);
/*     */       }
/* 682 */       else if (j == 2) {
/*     */         
/* 684 */         this.shape = new CTurnY(5, -1);
/*     */       } else {
/*     */         
/* 687 */         this.shape = new DTurnY(5, -2);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\xianzhikun\Desktop\mytemple\Block\Block.jar!\Entity\RunningThread.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */