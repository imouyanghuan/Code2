package com.anjoystudio.pandoradef;

import java.io.Serializable;

public class Data
  implements Serializable
{
  public static final int GAME_AREA_START_X = 84;
  public static final int GAME_AREA_START_Y = 72;
  public static final int MAP_H = 48;
  public static final int MAP_HEIGHT = 720;
  public static final byte[][][] MAP_PAINT;
  public static final int MAP_W = 48;
  public static final int MAP_WIDTH = 1080;
  public static final short[] NPC_BASE_BLOOD;
  public static final short[] NPC_ORDER;
  public static final int[] NPC_REFRESH_COUNT;
  public static final int[] NPC_REFRESH_TIME;
  public static final int NPC_STEP_LENTH = 4;
  public static final int[][] POWER;
  public static final int[] SLOW_DOWN;
  public static final int TOWER_SIZE = 48;
  public static int[] buildFee;
  public static final byte[][][] map_logic;
  public static final int[] money_count;
  public static int[] sleepTime;

  static
  {
    byte[][][] arrayOfByte1 = new byte[4][][];
    byte[][] arrayOfByte2 = new byte[10][];
    byte[] arrayOfByte3 = new byte[15];
    arrayOfByte3[0] = 1;
    arrayOfByte3[1] = 2;
    arrayOfByte3[2] = 3;
    arrayOfByte3[3] = 4;
    arrayOfByte3[4] = 5;
    arrayOfByte3[5] = 6;
    arrayOfByte3[6] = 7;
    arrayOfByte3[7] = 8;
    arrayOfByte3[8] = 9;
    arrayOfByte3[9] = 55;
    arrayOfByte3[10] = 56;
    arrayOfByte3[11] = 57;
    arrayOfByte3[12] = 73;
    arrayOfByte3[13] = 74;
    arrayOfByte3[14] = 75;
    arrayOfByte2[0] = arrayOfByte3;
    byte[] arrayOfByte4 = new byte[15];
    arrayOfByte4[0] = 10;
    arrayOfByte4[1] = 11;
    arrayOfByte4[2] = 12;
    arrayOfByte4[3] = 13;
    arrayOfByte4[4] = 14;
    arrayOfByte4[5] = 15;
    arrayOfByte4[6] = 16;
    arrayOfByte4[7] = 17;
    arrayOfByte4[8] = 18;
    arrayOfByte4[9] = 64;
    arrayOfByte4[10] = 26;
    arrayOfByte4[11] = 26;
    arrayOfByte4[12] = 82;
    arrayOfByte4[13] = 83;
    arrayOfByte4[14] = 84;
    arrayOfByte2[1] = arrayOfByte4;
    byte[] arrayOfByte5 = new byte[15];
    arrayOfByte5[0] = 19;
    arrayOfByte5[1] = 20;
    arrayOfByte5[2] = 21;
    arrayOfByte5[3] = 22;
    arrayOfByte5[4] = 26;
    arrayOfByte5[5] = 26;
    arrayOfByte5[6] = 26;
    arrayOfByte5[7] = 26;
    arrayOfByte5[8] = 27;
    arrayOfByte5[9] = 58;
    arrayOfByte5[10] = 26;
    arrayOfByte5[11] = 26;
    arrayOfByte5[12] = 26;
    arrayOfByte5[13] = 62;
    arrayOfByte5[14] = 63;
    arrayOfByte2[2] = arrayOfByte5;
    byte[] arrayOfByte6 = new byte[15];
    arrayOfByte6[0] = 28;
    arrayOfByte6[1] = 29;
    arrayOfByte6[2] = 30;
    arrayOfByte6[3] = 26;
    arrayOfByte6[4] = 26;
    arrayOfByte6[5] = 26;
    arrayOfByte6[6] = 26;
    arrayOfByte6[7] = 26;
    arrayOfByte6[8] = 26;
    arrayOfByte6[9] = 26;
    arrayOfByte6[10] = 26;
    arrayOfByte6[11] = 26;
    arrayOfByte6[12] = 26;
    arrayOfByte6[13] = 26;
    arrayOfByte6[14] = 72;
    arrayOfByte2[3] = arrayOfByte6;
    byte[] arrayOfByte7 = new byte[15];
    arrayOfByte7[0] = 37;
    arrayOfByte7[1] = 38;
    arrayOfByte7[2] = 39;
    arrayOfByte7[3] = 26;
    arrayOfByte7[4] = 26;
    arrayOfByte7[5] = 26;
    arrayOfByte7[6] = 26;
    arrayOfByte7[7] = 26;
    arrayOfByte7[8] = 26;
    arrayOfByte7[9] = 26;
    arrayOfByte7[10] = 26;
    arrayOfByte7[11] = 26;
    arrayOfByte7[12] = 26;
    arrayOfByte7[13] = 26;
    arrayOfByte7[14] = 81;
    arrayOfByte2[4] = arrayOfByte7;
    byte[] arrayOfByte8 = new byte[15];
    arrayOfByte8[0] = 46;
    arrayOfByte8[1] = 47;
    arrayOfByte8[2] = 39;
    arrayOfByte8[3] = 26;
    arrayOfByte8[4] = 26;
    arrayOfByte8[5] = 26;
    arrayOfByte8[6] = 26;
    arrayOfByte8[7] = 26;
    arrayOfByte8[8] = 26;
    arrayOfByte8[9] = 26;
    arrayOfByte8[10] = 26;
    arrayOfByte8[11] = 26;
    arrayOfByte8[12] = 26;
    arrayOfByte8[13] = 89;
    arrayOfByte8[14] = 90;
    arrayOfByte2[5] = arrayOfByte8;
    byte[] arrayOfByte9 = new byte[15];
    arrayOfByte9[0] = 48;
    arrayOfByte9[1] = 49;
    arrayOfByte9[2] = 50;
    arrayOfByte9[3] = 26;
    arrayOfByte9[4] = 26;
    arrayOfByte9[5] = 26;
    arrayOfByte9[6] = 26;
    arrayOfByte9[7] = 26;
    arrayOfByte9[8] = 26;
    arrayOfByte9[9] = 26;
    arrayOfByte9[10] = 26;
    arrayOfByte9[11] = 26;
    arrayOfByte9[12] = 26;
    arrayOfByte9[13] = 67;
    arrayOfByte9[14] = 61;
    arrayOfByte2[6] = arrayOfByte9;
    byte[] arrayOfByte10 = new byte[15];
    arrayOfByte10[0] = 51;
    arrayOfByte10[1] = 52;
    arrayOfByte10[2] = 53;
    arrayOfByte10[3] = 26;
    arrayOfByte10[4] = 26;
    arrayOfByte10[5] = 26;
    arrayOfByte10[6] = 26;
    arrayOfByte10[7] = 26;
    arrayOfByte10[8] = 71;
    arrayOfByte10[9] = 26;
    arrayOfByte10[10] = 26;
    arrayOfByte10[11] = 26;
    arrayOfByte10[12] = 26;
    arrayOfByte10[13] = 59;
    arrayOfByte10[14] = 60;
    arrayOfByte2[7] = arrayOfByte10;
    byte[] arrayOfByte11 = new byte[15];
    arrayOfByte11[0] = 54;
    arrayOfByte11[1] = 85;
    arrayOfByte11[2] = 86;
    arrayOfByte11[3] = 31;
    arrayOfByte11[4] = 32;
    arrayOfByte11[5] = 33;
    arrayOfByte11[6] = 34;
    arrayOfByte11[7] = 35;
    arrayOfByte11[8] = 36;
    arrayOfByte11[9] = 26;
    arrayOfByte11[10] = 68;
    arrayOfByte11[11] = 69;
    arrayOfByte11[12] = 70;
    arrayOfByte11[13] = 65;
    arrayOfByte11[14] = 66;
    arrayOfByte2[8] = arrayOfByte11;
    byte[] arrayOfByte12 = new byte[15];
    arrayOfByte12[0] = 23;
    arrayOfByte12[1] = 24;
    arrayOfByte12[2] = 25;
    arrayOfByte12[3] = 40;
    arrayOfByte12[4] = 41;
    arrayOfByte12[5] = 42;
    arrayOfByte12[6] = 43;
    arrayOfByte12[7] = 44;
    arrayOfByte12[8] = 45;
    arrayOfByte12[9] = 76;
    arrayOfByte12[10] = 77;
    arrayOfByte12[11] = 78;
    arrayOfByte12[12] = 79;
    arrayOfByte12[13] = 87;
    arrayOfByte12[14] = 88;
    arrayOfByte2[9] = arrayOfByte12;
    arrayOfByte1[0] = arrayOfByte2;
    byte[][] arrayOfByte13 = new byte[10][];
    byte[] arrayOfByte14 = new byte[15];
    arrayOfByte14[0] = 1;
    arrayOfByte14[1] = 2;
    arrayOfByte14[2] = 12;
    arrayOfByte14[3] = 13;
    arrayOfByte14[4] = 14;
    arrayOfByte14[5] = 15;
    arrayOfByte14[6] = 16;
    arrayOfByte14[7] = 25;
    arrayOfByte14[8] = 3;
    arrayOfByte14[9] = 4;
    arrayOfByte14[10] = 5;
    arrayOfByte14[11] = 6;
    arrayOfByte14[12] = 7;
    arrayOfByte14[13] = 8;
    arrayOfByte14[14] = 9;
    arrayOfByte13[0] = arrayOfByte14;
    byte[] arrayOfByte15 = new byte[15];
    arrayOfByte15[0] = 10;
    arrayOfByte15[1] = 11;
    arrayOfByte15[2] = 21;
    arrayOfByte15[3] = 22;
    arrayOfByte15[4] = 23;
    arrayOfByte15[5] = 24;
    arrayOfByte15[6] = 33;
    arrayOfByte15[7] = 41;
    arrayOfByte15[8] = 32;
    arrayOfByte15[9] = 32;
    arrayOfByte15[10] = 32;
    arrayOfByte15[11] = 33;
    arrayOfByte15[12] = 33;
    arrayOfByte15[13] = 17;
    arrayOfByte15[14] = 18;
    arrayOfByte13[1] = arrayOfByte15;
    byte[] arrayOfByte16 = new byte[15];
    arrayOfByte16[0] = 19;
    arrayOfByte16[1] = 20;
    arrayOfByte16[2] = 30;
    arrayOfByte16[3] = 31;
    arrayOfByte16[4] = 32;
    arrayOfByte16[5] = 32;
    arrayOfByte16[6] = 41;
    arrayOfByte16[7] = 41;
    arrayOfByte16[8] = 42;
    arrayOfByte16[9] = 41;
    arrayOfByte16[10] = 32;
    arrayOfByte16[11] = 33;
    arrayOfByte16[12] = 32;
    arrayOfByte16[13] = 33;
    arrayOfByte16[14] = 27;
    arrayOfByte13[2] = arrayOfByte16;
    byte[] arrayOfByte17 = new byte[15];
    arrayOfByte17[0] = 28;
    arrayOfByte17[1] = 29;
    arrayOfByte17[2] = 39;
    arrayOfByte17[3] = 40;
    arrayOfByte17[4] = 41;
    arrayOfByte17[5] = 32;
    arrayOfByte17[6] = 41;
    arrayOfByte17[7] = 41;
    arrayOfByte17[8] = 41;
    arrayOfByte17[9] = 41;
    arrayOfByte17[10] = 41;
    arrayOfByte17[11] = 41;
    arrayOfByte17[12] = 33;
    arrayOfByte17[13] = 32;
    arrayOfByte17[14] = 36;
    arrayOfByte13[3] = arrayOfByte17;
    byte[] arrayOfByte18 = new byte[15];
    arrayOfByte18[0] = 37;
    arrayOfByte18[1] = 38;
    arrayOfByte18[2] = 32;
    arrayOfByte18[3] = 33;
    arrayOfByte18[4] = 41;
    arrayOfByte18[5] = 32;
    arrayOfByte18[6] = 41;
    arrayOfByte18[7] = 41;
    arrayOfByte18[8] = 41;
    arrayOfByte18[9] = 41;
    arrayOfByte18[10] = 41;
    arrayOfByte18[11] = 41;
    arrayOfByte18[12] = 41;
    arrayOfByte18[13] = 33;
    arrayOfByte18[14] = 45;
    arrayOfByte13[4] = arrayOfByte18;
    byte[] arrayOfByte19 = new byte[15];
    arrayOfByte19[0] = 57;
    arrayOfByte19[1] = 58;
    arrayOfByte19[2] = 41;
    arrayOfByte19[3] = 32;
    arrayOfByte19[4] = 32;
    arrayOfByte19[5] = 41;
    arrayOfByte19[6] = 41;
    arrayOfByte19[7] = 41;
    arrayOfByte19[8] = 41;
    arrayOfByte19[9] = 42;
    arrayOfByte19[10] = 33;
    arrayOfByte19[11] = 35;
    arrayOfByte19[12] = 32;
    arrayOfByte19[13] = 33;
    arrayOfByte19[14] = 59;
    arrayOfByte13[5] = arrayOfByte19;
    byte[] arrayOfByte20 = new byte[15];
    arrayOfByte20[0] = 46;
    arrayOfByte20[1] = 47;
    arrayOfByte20[2] = 40;
    arrayOfByte20[3] = 42;
    arrayOfByte20[4] = 32;
    arrayOfByte20[5] = 32;
    arrayOfByte20[6] = 32;
    arrayOfByte20[7] = 41;
    arrayOfByte20[8] = 33;
    arrayOfByte20[9] = 41;
    arrayOfByte20[10] = 34;
    arrayOfByte20[11] = 44;
    arrayOfByte20[12] = 41;
    arrayOfByte20[13] = 26;
    arrayOfByte20[14] = 54;
    arrayOfByte13[6] = arrayOfByte20;
    byte[] arrayOfByte21 = new byte[15];
    arrayOfByte21[0] = 55;
    arrayOfByte21[1] = 56;
    arrayOfByte21[2] = 41;
    arrayOfByte21[3] = 41;
    arrayOfByte21[4] = 41;
    arrayOfByte21[5] = 41;
    arrayOfByte21[6] = 32;
    arrayOfByte21[7] = 32;
    arrayOfByte21[8] = 33;
    arrayOfByte21[9] = 41;
    arrayOfByte21[10] = 43;
    arrayOfByte21[11] = 41;
    arrayOfByte21[12] = 33;
    arrayOfByte21[13] = 62;
    arrayOfByte21[14] = 63;
    arrayOfByte13[7] = arrayOfByte21;
    byte[] arrayOfByte22 = new byte[15];
    arrayOfByte22[0] = 64;
    arrayOfByte22[1] = 65;
    arrayOfByte22[2] = 66;
    arrayOfByte22[3] = 41;
    arrayOfByte22[4] = 41;
    arrayOfByte22[5] = 32;
    arrayOfByte22[6] = 33;
    arrayOfByte22[7] = 41;
    arrayOfByte22[8] = 42;
    arrayOfByte22[9] = 41;
    arrayOfByte22[10] = 33;
    arrayOfByte22[11] = 41;
    arrayOfByte22[12] = 42;
    arrayOfByte22[13] = 71;
    arrayOfByte22[14] = 72;
    arrayOfByte13[8] = arrayOfByte22;
    byte[] arrayOfByte23 = new byte[15];
    arrayOfByte23[0] = 73;
    arrayOfByte23[1] = 74;
    arrayOfByte23[2] = 48;
    arrayOfByte23[3] = 49;
    arrayOfByte23[4] = 50;
    arrayOfByte23[5] = 51;
    arrayOfByte23[6] = 52;
    arrayOfByte23[7] = 53;
    arrayOfByte23[8] = 75;
    arrayOfByte23[9] = 76;
    arrayOfByte23[10] = 77;
    arrayOfByte23[11] = 78;
    arrayOfByte23[12] = 79;
    arrayOfByte23[13] = 80;
    arrayOfByte23[14] = 81;
    arrayOfByte13[9] = arrayOfByte23;
    arrayOfByte1[1] = arrayOfByte13;
    byte[][] arrayOfByte24 = new byte[10][];
    byte[] arrayOfByte25 = new byte[15];
    arrayOfByte25[0] = 46;
    arrayOfByte25[1] = 47;
    arrayOfByte25[2] = 48;
    arrayOfByte25[3] = 49;
    arrayOfByte25[4] = 50;
    arrayOfByte25[5] = 51;
    arrayOfByte25[6] = 28;
    arrayOfByte25[7] = 29;
    arrayOfByte25[8] = 30;
    arrayOfByte25[9] = 31;
    arrayOfByte25[10] = 32;
    arrayOfByte25[11] = 33;
    arrayOfByte25[12] = 20;
    arrayOfByte25[13] = 11;
    arrayOfByte25[14] = 2;
    arrayOfByte24[0] = arrayOfByte25;
    byte[] arrayOfByte26 = new byte[15];
    arrayOfByte26[0] = 55;
    arrayOfByte26[1] = 56;
    arrayOfByte26[2] = 57;
    arrayOfByte26[3] = 58;
    arrayOfByte26[4] = 59;
    arrayOfByte26[5] = 60;
    arrayOfByte26[6] = 37;
    arrayOfByte26[7] = 38;
    arrayOfByte26[8] = 39;
    arrayOfByte26[9] = 40;
    arrayOfByte26[10] = 41;
    arrayOfByte26[11] = 42;
    arrayOfByte26[12] = 7;
    arrayOfByte26[13] = 8;
    arrayOfByte26[14] = 9;
    arrayOfByte24[1] = arrayOfByte26;
    byte[] arrayOfByte27 = new byte[15];
    arrayOfByte27[0] = 16;
    arrayOfByte27[1] = 17;
    arrayOfByte27[2] = 12;
    arrayOfByte27[3] = 13;
    arrayOfByte27[4] = 13;
    arrayOfByte27[5] = 3;
    arrayOfByte27[6] = 12;
    arrayOfByte27[7] = 13;
    arrayOfByte27[8] = 3;
    arrayOfByte27[9] = 4;
    arrayOfByte27[10] = 13;
    arrayOfByte27[11] = 3;
    arrayOfByte27[12] = 3;
    arrayOfByte27[13] = 12;
    arrayOfByte27[14] = 18;
    arrayOfByte24[2] = arrayOfByte27;
    byte[] arrayOfByte28 = new byte[15];
    arrayOfByte28[0] = 25;
    arrayOfByte28[1] = 26;
    arrayOfByte28[2] = 4;
    arrayOfByte28[3] = 3;
    arrayOfByte28[4] = 12;
    arrayOfByte28[5] = 12;
    arrayOfByte28[6] = 5;
    arrayOfByte28[7] = 6;
    arrayOfByte28[8] = 4;
    arrayOfByte28[9] = 13;
    arrayOfByte28[10] = 12;
    arrayOfByte28[11] = 12;
    arrayOfByte28[12] = 12;
    arrayOfByte28[13] = 3;
    arrayOfByte28[14] = 27;
    arrayOfByte24[3] = arrayOfByte28;
    byte[] arrayOfByte29 = new byte[15];
    arrayOfByte29[0] = 34;
    arrayOfByte29[1] = 35;
    arrayOfByte29[2] = 13;
    arrayOfByte29[3] = 12;
    arrayOfByte29[4] = 3;
    arrayOfByte29[5] = 4;
    arrayOfByte29[6] = 12;
    arrayOfByte29[7] = 12;
    arrayOfByte29[8] = 13;
    arrayOfByte29[9] = 13;
    arrayOfByte29[10] = 12;
    arrayOfByte29[11] = 13;
    arrayOfByte29[12] = 3;
    arrayOfByte29[13] = 15;
    arrayOfByte29[14] = 36;
    arrayOfByte24[4] = arrayOfByte29;
    byte[] arrayOfByte30 = new byte[15];
    arrayOfByte30[0] = 43;
    arrayOfByte30[1] = 44;
    arrayOfByte30[2] = 3;
    arrayOfByte30[3] = 4;
    arrayOfByte30[4] = 12;
    arrayOfByte30[5] = 13;
    arrayOfByte30[6] = 3;
    arrayOfByte30[7] = 4;
    arrayOfByte30[8] = 3;
    arrayOfByte30[9] = 4;
    arrayOfByte30[10] = 4;
    arrayOfByte30[11] = 3;
    arrayOfByte30[12] = 23;
    arrayOfByte30[13] = 24;
    arrayOfByte30[14] = 45;
    arrayOfByte24[5] = arrayOfByte30;
    byte[] arrayOfByte31 = new byte[15];
    arrayOfByte31[0] = 52;
    arrayOfByte31[1] = 53;
    arrayOfByte31[2] = 3;
    arrayOfByte31[3] = 4;
    arrayOfByte31[4] = 12;
    arrayOfByte31[5] = 3;
    arrayOfByte31[6] = 12;
    arrayOfByte31[7] = 13;
    arrayOfByte31[8] = 12;
    arrayOfByte31[9] = 13;
    arrayOfByte31[10] = 13;
    arrayOfByte31[11] = 12;
    arrayOfByte31[12] = 13;
    arrayOfByte31[13] = 13;
    arrayOfByte31[14] = 54;
    arrayOfByte24[6] = arrayOfByte31;
    byte[] arrayOfByte32 = new byte[15];
    arrayOfByte32[0] = 61;
    arrayOfByte32[1] = 62;
    arrayOfByte32[2] = 12;
    arrayOfByte32[3] = 21;
    arrayOfByte32[4] = 22;
    arrayOfByte32[5] = 12;
    arrayOfByte32[6] = 12;
    arrayOfByte32[7] = 13;
    arrayOfByte32[8] = 3;
    arrayOfByte32[9] = 4;
    arrayOfByte32[10] = 3;
    arrayOfByte32[11] = 3;
    arrayOfByte32[12] = 3;
    arrayOfByte32[13] = 3;
    arrayOfByte32[14] = 63;
    arrayOfByte24[7] = arrayOfByte32;
    byte[] arrayOfByte33 = new byte[15];
    arrayOfByte33[0] = 70;
    arrayOfByte33[1] = 71;
    arrayOfByte33[2] = 13;
    arrayOfByte33[3] = 3;
    arrayOfByte33[4] = 3;
    arrayOfByte33[5] = 4;
    arrayOfByte33[6] = 4;
    arrayOfByte33[7] = 12;
    arrayOfByte33[8] = 12;
    arrayOfByte33[9] = 13;
    arrayOfByte33[10] = 12;
    arrayOfByte33[11] = 3;
    arrayOfByte33[12] = 4;
    arrayOfByte33[13] = 14;
    arrayOfByte33[14] = 72;
    arrayOfByte24[8] = arrayOfByte33;
    byte[] arrayOfByte34 = new byte[15];
    arrayOfByte34[0] = 64;
    arrayOfByte34[1] = 65;
    arrayOfByte34[2] = 66;
    arrayOfByte34[3] = 67;
    arrayOfByte34[4] = 68;
    arrayOfByte34[5] = 69;
    arrayOfByte34[6] = 73;
    arrayOfByte34[7] = 74;
    arrayOfByte34[8] = 75;
    arrayOfByte34[9] = 76;
    arrayOfByte34[10] = 77;
    arrayOfByte34[11] = 78;
    arrayOfByte34[12] = 79;
    arrayOfByte34[13] = 80;
    arrayOfByte34[14] = 1;
    arrayOfByte24[9] = arrayOfByte34;
    arrayOfByte1[2] = arrayOfByte24;
    byte[][] arrayOfByte35 = new byte[10][];
    byte[] arrayOfByte36 = new byte[15];
    arrayOfByte36[0] = 1;
    arrayOfByte36[1] = 2;
    arrayOfByte36[2] = 7;
    arrayOfByte36[3] = 4;
    arrayOfByte36[4] = 2;
    arrayOfByte36[5] = 3;
    arrayOfByte36[6] = 4;
    arrayOfByte36[7] = 8;
    arrayOfByte36[8] = 5;
    arrayOfByte36[9] = 6;
    arrayOfByte36[10] = 7;
    arrayOfByte36[11] = 7;
    arrayOfByte36[12] = 7;
    arrayOfByte36[13] = 12;
    arrayOfByte36[14] = 9;
    arrayOfByte35[0] = arrayOfByte36;
    byte[] arrayOfByte37 = new byte[15];
    arrayOfByte37[0] = 10;
    arrayOfByte37[1] = 15;
    arrayOfByte37[2] = 15;
    arrayOfByte37[3] = 13;
    arrayOfByte37[4] = 15;
    arrayOfByte37[5] = 15;
    arrayOfByte37[6] = 15;
    arrayOfByte37[7] = 17;
    arrayOfByte37[8] = 14;
    arrayOfByte37[9] = 15;
    arrayOfByte37[10] = 16;
    arrayOfByte37[11] = 15;
    arrayOfByte37[12] = 15;
    arrayOfByte37[13] = 21;
    arrayOfByte37[14] = 18;
    arrayOfByte35[1] = arrayOfByte37;
    byte[] arrayOfByte38 = new byte[15];
    arrayOfByte38[0] = 19;
    arrayOfByte38[1] = 20;
    arrayOfByte38[2] = 15;
    arrayOfByte38[3] = 22;
    arrayOfByte38[4] = 15;
    arrayOfByte38[5] = 15;
    arrayOfByte38[6] = 15;
    arrayOfByte38[7] = 15;
    arrayOfByte38[8] = 23;
    arrayOfByte38[9] = 24;
    arrayOfByte38[10] = 25;
    arrayOfByte38[11] = 15;
    arrayOfByte38[12] = 15;
    arrayOfByte38[13] = 30;
    arrayOfByte38[14] = 27;
    arrayOfByte35[2] = arrayOfByte38;
    byte[] arrayOfByte39 = new byte[15];
    arrayOfByte39[0] = 28;
    arrayOfByte39[1] = 29;
    arrayOfByte39[2] = 15;
    arrayOfByte39[3] = 31;
    arrayOfByte39[4] = 32;
    arrayOfByte39[5] = 15;
    arrayOfByte39[6] = 15;
    arrayOfByte39[7] = 15;
    arrayOfByte39[8] = 15;
    arrayOfByte39[9] = 33;
    arrayOfByte39[10] = 34;
    arrayOfByte39[11] = 15;
    arrayOfByte39[12] = 15;
    arrayOfByte39[13] = 39;
    arrayOfByte39[14] = 36;
    arrayOfByte35[3] = arrayOfByte39;
    byte[] arrayOfByte40 = new byte[15];
    arrayOfByte40[0] = 37;
    arrayOfByte40[1] = 38;
    arrayOfByte40[2] = 15;
    arrayOfByte40[3] = 40;
    arrayOfByte40[4] = 41;
    arrayOfByte40[5] = 15;
    arrayOfByte40[6] = 15;
    arrayOfByte40[7] = 15;
    arrayOfByte40[8] = 15;
    arrayOfByte40[9] = 42;
    arrayOfByte40[10] = 43;
    arrayOfByte40[11] = 15;
    arrayOfByte40[12] = 15;
    arrayOfByte40[13] = 15;
    arrayOfByte40[14] = 45;
    arrayOfByte35[4] = arrayOfByte40;
    byte[] arrayOfByte41 = new byte[15];
    arrayOfByte41[0] = 46;
    arrayOfByte41[1] = 47;
    arrayOfByte41[2] = 15;
    arrayOfByte41[3] = 15;
    arrayOfByte41[4] = 15;
    arrayOfByte41[5] = 15;
    arrayOfByte41[6] = 15;
    arrayOfByte41[7] = 15;
    arrayOfByte41[8] = 15;
    arrayOfByte41[9] = 15;
    arrayOfByte41[10] = 15;
    arrayOfByte41[11] = 48;
    arrayOfByte41[12] = 49;
    arrayOfByte41[13] = 50;
    arrayOfByte41[14] = 54;
    arrayOfByte35[5] = arrayOfByte41;
    byte[] arrayOfByte42 = new byte[15];
    arrayOfByte42[0] = 55;
    arrayOfByte42[1] = 56;
    arrayOfByte42[2] = 15;
    arrayOfByte42[3] = 58;
    arrayOfByte42[4] = 15;
    arrayOfByte42[5] = 15;
    arrayOfByte42[6] = 15;
    arrayOfByte42[7] = 15;
    arrayOfByte42[8] = 15;
    arrayOfByte42[9] = 15;
    arrayOfByte42[10] = 15;
    arrayOfByte42[11] = 51;
    arrayOfByte42[12] = 52;
    arrayOfByte42[13] = 53;
    arrayOfByte42[14] = 63;
    arrayOfByte35[6] = arrayOfByte42;
    byte[] arrayOfByte43 = new byte[15];
    arrayOfByte43[0] = 64;
    arrayOfByte43[1] = 65;
    arrayOfByte43[2] = 66;
    arrayOfByte43[3] = 67;
    arrayOfByte43[4] = 68;
    arrayOfByte43[5] = 15;
    arrayOfByte43[6] = 15;
    arrayOfByte43[7] = 71;
    arrayOfByte43[8] = 72;
    arrayOfByte43[9] = 59;
    arrayOfByte43[10] = 60;
    arrayOfByte43[11] = 61;
    arrayOfByte43[12] = 62;
    arrayOfByte43[13] = 69;
    arrayOfByte43[14] = 70;
    arrayOfByte35[7] = arrayOfByte43;
    byte[] arrayOfByte44 = new byte[15];
    arrayOfByte44[0] = 73;
    arrayOfByte44[1] = 74;
    arrayOfByte44[2] = 75;
    arrayOfByte44[3] = 76;
    arrayOfByte44[4] = 77;
    arrayOfByte44[5] = 78;
    arrayOfByte44[6] = 79;
    arrayOfByte44[7] = 80;
    arrayOfByte44[8] = 81;
    arrayOfByte44[9] = 91;
    arrayOfByte44[10] = 92;
    arrayOfByte44[11] = 93;
    arrayOfByte44[12] = 94;
    arrayOfByte44[13] = 95;
    arrayOfByte44[14] = 96;
    arrayOfByte35[8] = arrayOfByte44;
    byte[] arrayOfByte45 = new byte[15];
    arrayOfByte45[0] = 82;
    arrayOfByte45[1] = 83;
    arrayOfByte45[2] = 84;
    arrayOfByte45[3] = 85;
    arrayOfByte45[4] = 86;
    arrayOfByte45[5] = 87;
    arrayOfByte45[6] = 88;
    arrayOfByte45[7] = 89;
    arrayOfByte45[8] = 90;
    arrayOfByte45[9] = 98;
    arrayOfByte45[10] = 99;
    arrayOfByte45[11] = 44;
    arrayOfByte45[12] = 98;
    arrayOfByte45[13] = 44;
    arrayOfByte45[14] = 57;
    arrayOfByte35[9] = arrayOfByte45;
    arrayOfByte1[3] = arrayOfByte35;
    MAP_PAINT = arrayOfByte1;
    byte[][][] arrayOfByte46 = new byte[2][][];
    byte[][] arrayOfByte47 = new byte[12][];
    arrayOfByte47[0] = new byte[19];
    arrayOfByte47[1] = new byte[19];
    arrayOfByte47[2] = new byte[19];
    arrayOfByte47[3] = new byte[19];
    arrayOfByte47[4] = new byte[19];
    arrayOfByte47[5] = new byte[19];
    arrayOfByte47[6] = new byte[19];
    arrayOfByte47[7] = new byte[19];
    arrayOfByte47[8] = new byte[19];
    arrayOfByte47[9] = new byte[19];
    arrayOfByte47[10] = new byte[19];
    arrayOfByte47[11] = new byte[19];
    arrayOfByte46[0] = arrayOfByte47;
    byte[][] arrayOfByte48 = new byte[12][];
    byte[] arrayOfByte49 = new byte[19];
    arrayOfByte49[9] = 7;
    arrayOfByte49[10] = 7;
    arrayOfByte49[11] = 7;
    arrayOfByte48[0] = arrayOfByte49;
    byte[] arrayOfByte50 = new byte[19];
    arrayOfByte50[9] = 7;
    arrayOfByte48[1] = arrayOfByte50;
    byte[] arrayOfByte51 = new byte[19];
    arrayOfByte51[0] = 7;
    arrayOfByte51[11] = 7;
    arrayOfByte51[12] = 7;
    arrayOfByte51[13] = 7;
    arrayOfByte51[14] = 7;
    arrayOfByte48[2] = arrayOfByte51;
    byte[] arrayOfByte52 = new byte[19];
    arrayOfByte52[0] = 7;
    arrayOfByte52[3] = 7;
    arrayOfByte52[4] = 7;
    arrayOfByte52[12] = 7;
    arrayOfByte52[13] = 7;
    arrayOfByte52[14] = 7;
    arrayOfByte48[3] = arrayOfByte52;
    byte[] arrayOfByte53 = new byte[19];
    arrayOfByte53[0] = 7;
    arrayOfByte53[3] = 7;
    arrayOfByte53[4] = 7;
    arrayOfByte53[13] = 7;
    arrayOfByte48[4] = arrayOfByte53;
    byte[] arrayOfByte54 = new byte[19];
    arrayOfByte54[0] = 7;
    arrayOfByte54[3] = 7;
    arrayOfByte54[4] = 7;
    arrayOfByte48[5] = arrayOfByte54;
    byte[] arrayOfByte55 = new byte[19];
    arrayOfByte55[0] = 7;
    arrayOfByte48[6] = arrayOfByte55;
    byte[] arrayOfByte56 = new byte[19];
    arrayOfByte56[0] = 7;
    arrayOfByte56[15] = 7;
    arrayOfByte56[16] = 7;
    arrayOfByte48[7] = arrayOfByte56;
    byte[] arrayOfByte57 = new byte[19];
    arrayOfByte57[3] = 7;
    arrayOfByte57[15] = 7;
    arrayOfByte57[16] = 7;
    arrayOfByte48[8] = arrayOfByte57;
    byte[] arrayOfByte58 = new byte[19];
    arrayOfByte58[2] = 7;
    arrayOfByte58[3] = 7;
    arrayOfByte58[4] = 7;
    arrayOfByte48[9] = arrayOfByte58;
    byte[] arrayOfByte59 = new byte[19];
    arrayOfByte59[9] = 7;
    arrayOfByte59[10] = 7;
    arrayOfByte59[11] = 7;
    arrayOfByte59[12] = 7;
    arrayOfByte59[13] = 7;
    arrayOfByte59[14] = 7;
    arrayOfByte59[15] = 7;
    arrayOfByte59[16] = 7;
    arrayOfByte59[17] = 7;
    arrayOfByte59[18] = 7;
    arrayOfByte48[10] = arrayOfByte59;
    byte[] arrayOfByte60 = new byte[19];
    arrayOfByte60[0] = 7;
    arrayOfByte60[1] = 7;
    arrayOfByte60[2] = 7;
    arrayOfByte60[3] = 7;
    arrayOfByte60[4] = 7;
    arrayOfByte60[5] = 7;
    arrayOfByte60[6] = 7;
    arrayOfByte60[7] = 7;
    arrayOfByte60[8] = 7;
    arrayOfByte60[9] = 7;
    arrayOfByte60[10] = 7;
    arrayOfByte60[11] = 7;
    arrayOfByte60[12] = 7;
    arrayOfByte60[13] = 7;
    arrayOfByte60[14] = 7;
    arrayOfByte60[15] = 7;
    arrayOfByte60[16] = 7;
    arrayOfByte60[17] = 7;
    arrayOfByte60[18] = 7;
    arrayOfByte48[11] = arrayOfByte60;
    arrayOfByte46[1] = arrayOfByte48;
    map_logic = arrayOfByte46;
    int[] arrayOfInt1 = new int[6];
    arrayOfInt1[0] = 5;
    arrayOfInt1[1] = 10;
    arrayOfInt1[2] = 20;
    arrayOfInt1[3] = 50;
    arrayOfInt1[4] = 70;
    arrayOfInt1[5] = 120;
    buildFee = arrayOfInt1;
    int[] arrayOfInt2 = new int[6];
    arrayOfInt2[0] = 2;
    arrayOfInt2[1] = 10;
    arrayOfInt2[2] = 10;
    arrayOfInt2[3] = 6;
    arrayOfInt2[4] = 6;
    arrayOfInt2[5] = 14;
    sleepTime = arrayOfInt2;
    int[] arrayOfInt3 = new int[100];
    arrayOfInt3[0] = 2;
    arrayOfInt3[1] = 4;
    arrayOfInt3[2] = 6;
    arrayOfInt3[3] = 6;
    arrayOfInt3[4] = 8;
    arrayOfInt3[5] = 6;
    arrayOfInt3[6] = 10;
    arrayOfInt3[7] = 6;
    arrayOfInt3[8] = 10;
    arrayOfInt3[9] = 3;
    arrayOfInt3[10] = 8;
    arrayOfInt3[11] = 8;
    arrayOfInt3[12] = 6;
    arrayOfInt3[13] = 8;
    arrayOfInt3[14] = 8;
    arrayOfInt3[15] = 8;
    arrayOfInt3[16] = 8;
    arrayOfInt3[17] = 8;
    arrayOfInt3[18] = 8;
    arrayOfInt3[19] = 5;
    arrayOfInt3[20] = 10;
    arrayOfInt3[21] = 6;
    arrayOfInt3[22] = 10;
    arrayOfInt3[23] = 6;
    arrayOfInt3[24] = 5;
    arrayOfInt3[25] = 8;
    arrayOfInt3[26] = 10;
    arrayOfInt3[27] = 6;
    arrayOfInt3[28] = 10;
    arrayOfInt3[29] = 3;
    arrayOfInt3[30] = 10;
    arrayOfInt3[31] = 12;
    arrayOfInt3[32] = 12;
    arrayOfInt3[33] = 12;
    arrayOfInt3[34] = 12;
    arrayOfInt3[35] = 8;
    arrayOfInt3[36] = 10;
    arrayOfInt3[37] = 6;
    arrayOfInt3[38] = 8;
    arrayOfInt3[39] = 2;
    arrayOfInt3[40] = 12;
    arrayOfInt3[41] = 10;
    arrayOfInt3[42] = 12;
    arrayOfInt3[43] = 8;
    arrayOfInt3[44] = 12;
    arrayOfInt3[45] = 10;
    arrayOfInt3[46] = 16;
    arrayOfInt3[47] = 10;
    arrayOfInt3[48] = 10;
    arrayOfInt3[49] = 4;
    arrayOfInt3[50] = 12;
    arrayOfInt3[51] = 8;
    arrayOfInt3[52] = 12;
    arrayOfInt3[53] = 8;
    arrayOfInt3[54] = 3;
    arrayOfInt3[55] = 12;
    arrayOfInt3[56] = 8;
    arrayOfInt3[57] = 12;
    arrayOfInt3[58] = 8;
    arrayOfInt3[59] = 3;
    arrayOfInt3[60] = 10;
    arrayOfInt3[61] = 12;
    arrayOfInt3[62] = 12;
    arrayOfInt3[63] = 12;
    arrayOfInt3[64] = 12;
    arrayOfInt3[65] = 12;
    arrayOfInt3[66] = 12;
    arrayOfInt3[67] = 12;
    arrayOfInt3[68] = 10;
    arrayOfInt3[69] = 4;
    arrayOfInt3[70] = 10;
    arrayOfInt3[71] = 10;
    arrayOfInt3[72] = 12;
    arrayOfInt3[73] = 12;
    arrayOfInt3[74] = 3;
    arrayOfInt3[75] = 10;
    arrayOfInt3[76] = 14;
    arrayOfInt3[77] = 5;
    arrayOfInt3[78] = 12;
    arrayOfInt3[79] = 10;
    arrayOfInt3[80] = 10;
    arrayOfInt3[81] = 10;
    arrayOfInt3[82] = 12;
    arrayOfInt3[83] = 12;
    arrayOfInt3[84] = 12;
    arrayOfInt3[85] = 4;
    arrayOfInt3[86] = 4;
    arrayOfInt3[87] = 10;
    arrayOfInt3[88] = 5;
    arrayOfInt3[89] = 16;
    arrayOfInt3[90] = 10;
    arrayOfInt3[91] = 16;
    arrayOfInt3[92] = 6;
    arrayOfInt3[93] = 16;
    arrayOfInt3[94] = 16;
    arrayOfInt3[95] = 16;
    arrayOfInt3[96] = 6;
    arrayOfInt3[97] = 6;
    arrayOfInt3[98] = 16;
    arrayOfInt3[99] = 6;
    NPC_REFRESH_COUNT = arrayOfInt3;
    short[] arrayOfShort1 = new short[7];
    arrayOfShort1[0] = 70;
    arrayOfShort1[1] = 120;
    arrayOfShort1[2] = 80;
    arrayOfShort1[3] = 100;
    arrayOfShort1[4] = 300;
    arrayOfShort1[5] = 380;
    arrayOfShort1[6] = 500;
    NPC_BASE_BLOOD = arrayOfShort1;
    short[] arrayOfShort2 = new short[100];
    arrayOfShort2[9] = 1;
    arrayOfShort2[11] = 3;
    arrayOfShort2[12] = 2;
    arrayOfShort2[14] = 2;
    arrayOfShort2[18] = 2;
    arrayOfShort2[19] = 3;
    arrayOfShort2[21] = 1;
    arrayOfShort2[22] = 2;
    arrayOfShort2[23] = 3;
    arrayOfShort2[24] = 1;
    arrayOfShort2[25] = 2;
    arrayOfShort2[27] = 1;
    arrayOfShort2[28] = 2;
    arrayOfShort2[29] = 4;
    arrayOfShort2[32] = 2;
    arrayOfShort2[33] = 2;
    arrayOfShort2[34] = 2;
    arrayOfShort2[35] = 3;
    arrayOfShort2[37] = 1;
    arrayOfShort2[38] = 2;
    arrayOfShort2[39] = 5;
    arrayOfShort2[40] = 2;
    arrayOfShort2[41] = 1;
    arrayOfShort2[42] = 2;
    arrayOfShort2[43] = 3;
    arrayOfShort2[45] = 1;
    arrayOfShort2[47] = 3;
    arrayOfShort2[49] = 5;
    arrayOfShort2[51] = 1;
    arrayOfShort2[52] = 2;
    arrayOfShort2[53] = 3;
    arrayOfShort2[54] = 4;
    arrayOfShort2[56] = 1;
    arrayOfShort2[57] = 2;
    arrayOfShort2[59] = 4;
    arrayOfShort2[60] = 1;
    arrayOfShort2[61] = 1;
    arrayOfShort2[62] = 2;
    arrayOfShort2[63] = 2;
    arrayOfShort2[64] = 2;
    arrayOfShort2[65] = 3;
    arrayOfShort2[67] = 3;
    arrayOfShort2[68] = 2;
    arrayOfShort2[69] = 5;
    arrayOfShort2[70] = 1;
    arrayOfShort2[71] = 2;
    arrayOfShort2[72] = 2;
    arrayOfShort2[73] = 2;
    arrayOfShort2[75] = 2;
    arrayOfShort2[76] = 2;
    arrayOfShort2[77] = 4;
    arrayOfShort2[78] = 2;
    arrayOfShort2[79] = 1;
    arrayOfShort2[80] = 1;
    arrayOfShort2[81] = 1;
    arrayOfShort2[82] = 1;
    arrayOfShort2[83] = 2;
    arrayOfShort2[84] = 2;
    arrayOfShort2[85] = 4;
    arrayOfShort2[86] = 4;
    arrayOfShort2[87] = 2;
    arrayOfShort2[89] = 1;
    arrayOfShort2[91] = 2;
    arrayOfShort2[92] = 4;
    arrayOfShort2[94] = 1;
    arrayOfShort2[95] = 3;
    arrayOfShort2[96] = 4;
    arrayOfShort2[97] = 5;
    arrayOfShort2[99] = 5;
    NPC_ORDER = arrayOfShort2;
    int[] arrayOfInt4 = new int[6];
    arrayOfInt4[0] = 16;
    arrayOfInt4[1] = 24;
    arrayOfInt4[2] = 24;
    arrayOfInt4[3] = 28;
    arrayOfInt4[4] = 64;
    arrayOfInt4[5] = 64;
    NPC_REFRESH_TIME = arrayOfInt4;
    int[][] arrayOfInt = new int[6][];
    int[] arrayOfInt5 = new int[3];
    arrayOfInt5[0] = 14;
    arrayOfInt5[1] = 18;
    arrayOfInt5[2] = 24;
    arrayOfInt[0] = arrayOfInt5;
    int[] arrayOfInt6 = new int[3];
    arrayOfInt6[0] = 16;
    arrayOfInt6[1] = 20;
    arrayOfInt6[2] = 30;
    arrayOfInt[1] = arrayOfInt6;
    int[] arrayOfInt7 = new int[3];
    arrayOfInt7[0] = 30;
    arrayOfInt7[1] = 60;
    arrayOfInt7[2] = 120;
    arrayOfInt[2] = arrayOfInt7;
    int[] arrayOfInt8 = new int[3];
    arrayOfInt8[0] = 50;
    arrayOfInt8[1] = 100;
    arrayOfInt8[2] = 200;
    arrayOfInt[3] = arrayOfInt8;
    int[] arrayOfInt9 = new int[3];
    arrayOfInt9[0] = 45;
    arrayOfInt9[1] = 70;
    arrayOfInt9[2] = 100;
    arrayOfInt[4] = arrayOfInt9;
    int[] arrayOfInt10 = new int[3];
    arrayOfInt10[0] = 150;
    arrayOfInt10[1] = 300;
    arrayOfInt10[2] = 600;
    arrayOfInt[5] = arrayOfInt10;
    POWER = arrayOfInt;
    int[] arrayOfInt11 = new int[3];
    arrayOfInt11[0] = 2;
    arrayOfInt11[1] = 3;
    arrayOfInt11[2] = 5;
    SLOW_DOWN = arrayOfInt11;
    int[] arrayOfInt12 = new int[6];
    arrayOfInt12[0] = 1;
    arrayOfInt12[1] = 3;
    arrayOfInt12[2] = 2;
    arrayOfInt12[3] = 4;
    arrayOfInt12[4] = 5;
    arrayOfInt12[5] = 6;
    money_count = arrayOfInt12;
  }
}

/* Location:           C:\Users\junxu.wang\Documents\mysvn\sample\utils\apk_tools\classes_dex2jar.jar
 * Qualified Name:     com.anjoystudio.pandoradef.Data
 * JD-Core Version:    0.5.4
 */