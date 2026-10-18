package defpackage;

import com.nokia.mid.ui.DirectGraphics;
import com.nokia.mid.ui.DirectUtils;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.m3g.Graphics3D;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:au.class */
public final class au {
    private static Graphics b;
    private static Image a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static Graphics f76a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static DirectGraphics f77a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static int f78a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public static int f79b;
    public static int c;
    public static int d;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static boolean f80a;
    private static int e;
    private static int f;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int[] f81a = new int[4];

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Object[] f82a = new Object[6];

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static boolean f83b;
    private static int g;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static bi f84a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static bj f85a;

    public static void a() {
        f83b = true;
    }

    public static void a(int r4) {
        if (r4 == 0) {
            a = null;
            f76a = b;
            f78a = 240;
            f79b = 320;
        } else {
            Image image = (Image) f84a.mo78a(r4);
            a = image;
            f76a = image.getGraphics();
            f78a = a.getWidth();
            f79b = a.getHeight();
        }
        f77a = DirectUtils.getDirectGraphics(f76a);
        b(1);
        e = 16777215;
        f = 255;
        m42e();
        f81a[0] = 0;
        f81a[1] = 0;
        f81a[2] = f78a;
        f81a[3] = f79b;
        m48f();
    }

    public static void b(int r5) {
        if (r5 == g) {
        }
        switch (g) {
            case 2:
                Graphics3D.getInstance().releaseTarget();
                break;
            case 3:
                Graphics3D.getInstance().releaseTarget();
                break;
        }
        g = r5;
        switch (r5) {
            case 2:
                Graphics3D.getInstance().bindTarget(f76a, false, 16);
                if (f85a == null) {
                    f85a = new bj();
                }
                f85a.a();
                at.b();
                break;
            case 3:
                Graphics3D.getInstance().bindTarget(f76a, false, 16);
                break;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static int m40a() {
        return g;
    }

    public static void b() {
        if (g != 2) {
            new StringBuffer().append("Invalid renderer, use Gfx.setRenderer to set correct: ").append(g).append(", ").append(2).toString();
        }
        az.c();
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static int m41b() {
        return f78a;
    }

    public static int c() {
        return f79b;
    }

    public static void c(int r5) {
        d(r5);
        a(0, 0, f78a, f79b);
    }

    public static int d() {
        return (f << 24) | e;
    }

    public static int e() {
        return f;
    }

    public static void d(int r3) {
        e = r3 & 16777215;
        f = 255;
        m42e();
    }

    public static void e(int r3) {
        e = r3 & 16777215;
        f = r3 >>> 24;
        m42e();
    }

    public static void a(int r3, int r4) {
        e = r4 & 16777215;
        f = r3 & 255;
        m42e();
    }

    public static void f(int r3) {
        f = r3 & 255;
        m42e();
    }

    /* JADX INFO: renamed from: e, reason: collision with other method in class */
    private static void m42e() {
        if (f < 255) {
            f77a.setARGBColor(e | (f << 24));
        } else {
            f77a.setARGBColor(e | (-16777216));
        }
    }

    public static void a(int r6, int r7, int r8, int r9) {
        f76a.fillRect(r6, r7, r8, r9);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static int m43a(int r3) {
        return f84a.mo79a(r3);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static int m44b(int r3) {
        return f84a.mo80b(r3);
    }

    public static void a(int r5, int r6, int r7) {
        f84a.a(r5, r6, r7);
    }

    public static void a(int r10, int r11, int r12, int r13, int r14, int r15, int r16, int r17) {
        f84a.a(r10, r16, r17, r15, r11, r12, r13, r14);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static int m45a(int r3, int r4) {
        return f84a.a(Image.createImage(r3, r4));
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public static int m46c(int r3) {
        return f82a[r3] instanceof Font ? ((Font) f82a[r3]).getHeight() : ((o) f82a[r3]).a();
    }

    public static int a(int r5, String str) {
        return a(r5, str, 0, str.length());
    }

    public static int a(int r5, String str, int r7, int r8) {
        if (!(f82a[r5] instanceof Font)) {
            return ((o) f82a[r5]).a(str, r7, r8);
        }
        Font font = (Font) f82a[r5];
        int r9 = font.substringWidth(str, r7, r8);
        if (str.charAt((r7 + r8) - 1) == 173) {
            r9 += font.charWidth('-');
        }
        return r9;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m47a(int r7, String str, int r9, int r10) {
        a(r7, str, 0, str.length(), r9, r10);
    }

    public static void a(int r8, String str, int r10, int r11, int r12, int r13) {
        if (!(f82a[r8] instanceof Font)) {
            ((o) f82a[r8]).a(str, r10, r11, r12, r13);
            return;
        }
        f76a.setFont((Font) f82a[r8]);
        f76a.drawSubstring(str, r10, r11, r12, r13, 0);
        if (str.charAt((r10 + r11) - 1) == 173) {
            f76a.drawChar('-', r12 + a(r8, str, r10, r11 - 1), r13, 0);
        }
    }

    public static int f() {
        return f81a[0];
    }

    public static int g() {
        return f81a[1];
    }

    public static int h() {
        return f81a[2];
    }

    public static int i() {
        return f81a[3];
    }

    public static void a(int[] r6) {
        System.arraycopy(f81a, 0, r6, 0, 4);
    }

    public static void b(int r5, int r6, int r7, int r8) {
        f81a[0] = r5;
        f81a[1] = r6;
        f81a[2] = r7;
        f81a[3] = r8;
        int r0 = f78a;
        int r1 = f79b;
        int r9 = 0;
        while (r9 < 2) {
            int r2 = (f81a[r9] + f81a[r9 + 2]) - (r9 == 0 ? r0 : r1);
            if (r2 > 0) {
                int[] r3 = f81a;
                int r4 = r9 + 2;
                r3[r4] = r3[r4] - r2;
            }
            int r10 = 0 - f81a[r9];
            if (r10 > 0) {
                int[] r11 = f81a;
                int r12 = r9;
                r11[r12] = r11[r12] + r10;
                int[] r13 = f81a;
                int r14 = r9 + 2;
                r13[r14] = r13[r14] - r10;
            }
            r9++;
        }
        m48f();
        m48f();
    }

    /* JADX INFO: renamed from: f, reason: collision with other method in class */
    private static void m48f() {
        f76a.setClip(f81a[0], f81a[1], f81a[2], f81a[3]);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m49a() {
        return false;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public static void m50c() {
        f84a = new bk();
    }

    public static void a(Graphics graphics, int r7, int r8) {
        b = graphics;
        if (!f80a) {
            graphics.setColor(0);
            graphics.fillRect(0, 0, r7, r8);
            f80a = true;
        }
        c = (r7 - 240) / 2;
        d = (r8 - 320) / 2;
        b.translate(c, d);
        a(0);
    }

    protected static void g(int r7) {
        int[] r0 = av.a(av.m60a(4, r7));
        int r1 = r0[0];
        if (r1 == 1) {
            int r2 = r0[1];
            int r3 = r0[2];
            int r4 = r0[3];
            if (r3 == -1 && r4 == -1) {
                f82a[r7] = Font.getFont(r2 & 96, r2 & 7, r2 & 24);
                return;
            } else {
                f82a[r7] = new bb(r2, r3, r4);
                return;
            }
        }
        if (r1 != 5) {
            new StringBuffer().append("Unknown font type: ").append(r0[0]).toString();
            az.b();
            return;
        }
        int r5 = r0[1];
        int r6 = r0[2];
        av.a(2, r6);
        byte[] bArrM56a = av.m56a(r5);
        n nVar = new n();
        nVar.a = r6;
        bl blVar = new bl(bArrM56a);
        byte[] bArr = blVar.a;
        int r8 = blVar.b;
        blVar.b = r8 + 1;
        int r9 = (bArr[r8] & 255) << 8;
        byte[] bArr2 = blVar.a;
        int r10 = blVar.b;
        blVar.b = r10 + 1;
        short s = (short) (r9 | (bArr2[r10] & 255));
        nVar.b = blVar.m83a() & 255;
        blVar.m83a();
        nVar.h = blVar.m83a();
        nVar.c = blVar.m83a();
        nVar.d = blVar.m83a();
        nVar.i = blVar.m83a();
        nVar.e = blVar.m83a();
        nVar.f = blVar.m83a();
        nVar.g = (nVar.b - nVar.e) - nVar.f;
        nVar.h -= nVar.c + nVar.d;
        nVar.i -= nVar.e + nVar.f;
        blVar.m85a();
        blVar.m85a();
        nVar.f423a = new r(s);
        short s2 = 0;
        short s3 = 0;
        int r11 = f84a.mo79a(r6);
        while (blVar.a() > 0) {
            char cM85a = blVar.m85a();
            int r12 = blVar.m83a() & 255;
            nVar.f424a[0] = r12;
            if (s2 + r12 > r11) {
                s2 = 0;
                s3 = (short) (s3 + nVar.b);
            }
            nVar.f424a[1] = s2;
            nVar.f424a[2] = s3;
            r rVar = nVar.f423a;
            int r13 = cM85a + 1;
            int[] r14 = nVar.f424a;
            int length = rVar.f426a.length;
            int r19 = rVar.a(r13);
            while (rVar.f426a[r19] != 0) {
                int r15 = r19 + 4;
                r19 = r15;
                if (r15 >= length) {
                    r19 = 0;
                }
            }
            rVar.f426a[r19] = r13;
            az.a(r14, 0, rVar.f426a, r19 + 1, 3);
            s2 = (short) (s2 + r12);
        }
        f82a[r7] = nVar;
    }

    protected static void h(int r4) {
        f82a[r4] = null;
    }

    public static void i(int r3) {
        f84a.a(r3);
    }

    public static void j(int r3) {
        f84a.b(r3);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m51a(int r3) {
        return f84a.mo76a(r3);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static boolean m52b() {
        return f83b;
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    public static void m53d() {
        f83b = false;
    }
}
