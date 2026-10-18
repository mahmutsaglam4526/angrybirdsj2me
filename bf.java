package defpackage;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:bf.class */
public final class bf extends Canvas implements ar {
    private static bc a;

    @Override // defpackage.ar
    public final void a(bc bcVar) {
        a = bcVar;
        setFullScreenMode(true);
    }

    @Override // defpackage.ar
    public final Canvas a() {
        return this;
    }

    @Override // defpackage.ar
    /* JADX INFO: renamed from: a */
    public final void mo34a() {
        repaint();
        serviceRepaints();
    }

    public final void hideNotify() {
        a.pauseApp();
    }

    public final void showNotify() {
        a.startApp();
    }

    public final void keyPressed(int r6) {
        as.a(48, r6, be.a(this, r6));
    }

    public final void keyReleased(int r6) {
        as.a(49, r6, be.a(this, r6));
    }

    public final void pointerPressed(int r5, int r6) {
        as.b(64, r5, r6);
    }

    public final void pointerReleased(int r5, int r6) {
        as.b(65, r5, r6);
    }

    public final void pointerDragged(int r5, int r6) {
        as.b(67, r5, r6);
    }

    public final void paint(Graphics graphics) {
        a.a(graphics);
    }
}
