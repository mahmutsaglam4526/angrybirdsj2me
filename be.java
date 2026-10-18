package defpackage;

import javax.microedition.lcdui.Canvas;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:be.class */
public final class be {
    public static final int a(Canvas canvas, int r4) {
        if (r4 == -6) {
            return 10;
        }
        if (r4 == -7) {
            return 11;
        }
        if (r4 == -8) {
            return 12;
        }
        if (r4 == 0) {
            return 13;
        }
        switch (canvas.getGameAction(r4)) {
            case 1:
                return 1;
            case 2:
                return 3;
            case 3:
            case 4:
            case 7:
            default:
                return 0;
            case 5:
                return 4;
            case 6:
                return 2;
            case 8:
                return 5;
            case 9:
                return 6;
            case 10:
                return 7;
            case 11:
                return 8;
            case 12:
                return 9;
        }
    }
}
