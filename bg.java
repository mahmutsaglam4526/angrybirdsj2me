package defpackage;

import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:bg.class */
public final class bg {
    private static int[] a = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public Object f101a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private int f102a;
    private int b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private boolean f103a;

    public bg() {
    }

    public bg(Image image) {
        this.f101a = image;
        this.f102a = image.getWidth();
        this.b = image.getHeight();
        this.f103a = a(image);
    }

    public final int a() {
        return this.f102a;
    }

    public final int b() {
        return this.b;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final boolean m74a() {
        return this.f103a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final Object m75a() {
        return this.f101a;
    }

    private static boolean a(Image image) {
        boolean z;
        int width = image.getWidth();
        if (a == null || a.length < width) {
            a = new int[width];
        }
        int[] r0 = a;
        int height = image.getHeight();
        do {
            int r1 = height;
            height--;
            if (r1 <= 0) {
                return false;
            }
            image.getRGB(a, 0, width, 0, 0, width, 1);
            int[] r2 = a;
            int length = r2.length;
            while (true) {
                length--;
                if (length < 0) {
                    z = false;
                    break;
                }
                if ((r2[length] & (-16777216)) != -16777216) {
                    z = true;
                    break;
                }
            }
        } while (!z);
        return true;
    }
}
