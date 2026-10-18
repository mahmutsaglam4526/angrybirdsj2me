package defpackage;

import javax.microedition.m3g.Transform;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:at.class */
public final class at {
    private static int a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static ao f70a;
    private static int b;
    private static int c;
    private static int d;
    private static int e;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static ao[] f69a = new ao[96];

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int[] f71a = new int[96];

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static int[] f72b = new int[2];

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static float[] f73a = new float[6];

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static ap f74a = new ap();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static bh f75a = new bh();

    public static void a() {
    }

    public static void b() {
        au.b();
        a = 0;
        b = 0;
        if (f69a[0] == null) {
            f69a[0] = new ao();
        }
        ao aoVar = f69a[0];
        f70a = aoVar;
        aoVar.a[0] = 1.0f;
        aoVar.a[1] = 0.0f;
        aoVar.a[2] = 0.0f;
        aoVar.a[3] = 0.0f;
        aoVar.a[4] = 1.0f;
        aoVar.a[5] = 0.0f;
        aoVar.f59a = 0;
        c = -1;
        ab.a(f72b, 0);
        au.f85a.a(f72b);
    }

    public static void c() {
        au.b();
        int[] r0 = f71a;
        int r1 = b;
        b = r1 + 1;
        r0[r1] = c;
        ao[] aoVarArr = f69a;
        int r2 = a + 1;
        a = r2;
        if (aoVarArr[r2] == null) {
            f69a[a] = new ao();
        }
        az.a(f70a.a, f69a[a].a);
        f70a = f69a[a];
    }

    public static void d() {
        au.b();
        ao[] aoVarArr = f69a;
        int r1 = a - 1;
        a = r1;
        f70a = aoVarArr[r1];
        int[] r0 = f71a;
        int r2 = b - 1;
        b = r2;
        c = r0[r2];
        au.f85a.a(f72b);
    }

    public static void a(int r4, int r5) {
        f72b[r4] = r5;
        au.f85a.a(f72b);
    }

    public static void a(int r2) {
        c = r2;
    }

    public static void b(int r4) {
        c = (c & (-16777216)) | (r4 & 16777215);
    }

    public static void e() {
        c = (-16777216) | (c & 16777215);
    }

    public static void a(float f, float f2) {
        au.b();
        ao aoVar = f70a;
        float[] fArr = aoVar.a;
        fArr[2] = fArr[2] + (f * aoVar.a[0]) + (f2 * aoVar.a[1]);
        float[] fArr2 = aoVar.a;
        fArr2[5] = fArr2[5] + (f * aoVar.a[3]) + (f2 * aoVar.a[4]);
    }

    public static void a(float f) {
        au.b();
        ao aoVar = f70a;
        float fCos = (float) Math.cos(f);
        float fSin = (float) Math.sin(f);
        float f2 = (fCos * aoVar.a[0]) + (fSin * aoVar.a[1]);
        float f3 = ((-fSin) * aoVar.a[0]) + (fCos * aoVar.a[1]);
        float f4 = (fCos * aoVar.a[3]) + (fSin * aoVar.a[4]);
        float f5 = ((-fSin) * aoVar.a[3]) + (fCos * aoVar.a[4]);
        aoVar.a[0] = f2;
        aoVar.a[1] = f3;
        aoVar.a[3] = f4;
        aoVar.a[4] = f5;
        aoVar.f59a |= 32;
    }

    public static void b(float f) {
        au.b();
        ao aoVar = f70a;
        float[] fArr = aoVar.a;
        fArr[0] = fArr[0] * f;
        float[] fArr2 = aoVar.a;
        fArr2[1] = fArr2[1] * f;
        float[] fArr3 = aoVar.a;
        fArr3[3] = fArr3[3] * f;
        float[] fArr4 = aoVar.a;
        fArr4[4] = fArr4[4] * f;
        aoVar.f59a |= 16;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static float m38a(float f) {
        f74a.a(f, 0.0f);
        ao aoVar = f70a;
        ap apVar = f74a;
        float f2 = aoVar.a[0];
        float f3 = aoVar.a[1];
        float f4 = aoVar.a[3];
        float f5 = aoVar.a[4];
        float f6 = 1.0f / ((f2 * f5) - (f3 * f4));
        float f7 = apVar.f60a - aoVar.a[2];
        float f8 = apVar.b - aoVar.a[5];
        apVar.f60a = f6 * ((f5 * f7) - (f3 * f8));
        apVar.b = f6 * ((f2 * f8) - (f4 * f7));
        return f74a.f60a;
    }

    public static void f() {
        bj bjVar = au.f85a;
        bjVar.f114a.setColor(c);
        bjVar.f108a.clear(bjVar.f114a);
    }

    public static void g() {
        d = 2;
        e = 0;
        au.f76a.setColor(c);
    }

    public static void b(float f, float f2) {
        f74a.a(f, f2);
        ao aoVar = f70a;
        ap apVar = f74a;
        float f3 = apVar.f60a;
        float f4 = apVar.b;
        apVar.f60a = (aoVar.a[0] * f3) + (aoVar.a[1] * f4) + aoVar.a[2];
        apVar.b = (aoVar.a[3] * f3) + (aoVar.a[4] * f4) + aoVar.a[5];
        switch (d) {
            case 1:
                float[] fArr = f73a;
                int r1 = e;
                e = r1 + 1;
                fArr[r1 % 4] = f74a.f60a;
                float[] fArr2 = f73a;
                int r2 = e;
                e = r2 + 1;
                fArr2[r2 % 4] = f74a.b;
                if (e >= 4) {
                    au.f76a.drawLine((int) f73a[0], (int) f73a[1], (int) f73a[2], (int) f73a[3]);
                }
                break;
            case 2:
                float[] fArr3 = f73a;
                int r3 = e;
                e = r3 + 1;
                fArr3[r3 % 6] = f74a.f60a;
                float[] fArr4 = f73a;
                int r4 = e;
                e = r4 + 1;
                fArr4[r4 % 6] = f74a.b;
                if (e >= 6) {
                    a(f73a);
                }
                break;
            case 4:
                float[] fArr5 = f73a;
                int r5 = e;
                e = r5 + 1;
                fArr5[r5] = f74a.f60a;
                float[] fArr6 = f73a;
                int r6 = e;
                e = r6 + 1;
                fArr6[r6] = f74a.b;
                if (e >= 6) {
                    a(f73a);
                    e = 0;
                }
                break;
        }
    }

    private static void a(float[] fArr) {
        bj bjVar = au.f85a;
        bjVar.f119a.setDefaultColor(c);
        bjVar.f118a[0] = (short) fArr[0];
        bjVar.f118a[1] = (short) fArr[1];
        bjVar.f118a[3] = (short) fArr[2];
        bjVar.f118a[4] = (short) fArr[3];
        bjVar.f118a[6] = (short) fArr[4];
        bjVar.f118a[7] = (short) fArr[5];
        bjVar.f120a.set(0, 3, bjVar.f118a);
        bjVar.f108a.render(bjVar.f121a, (Transform) null);
    }

    public static void h() {
        d = 0;
    }

    public static void a(int r3, float f, float f2) {
        a(f, f2);
        c(r3);
        a(-f, -f2);
    }

    public static void c(int r6) {
        bh bhVarMo77a = au.f84a.mo77a(r6);
        if (bhVarMo77a.f104a == null) {
            new StringBuffer().append("Image not loaded: ").append(r6).toString();
        }
        az.c();
        au.f85a.a(c, bhVarMo77a, f70a.a, true);
    }

    public static void a(int r6, float f, float f2, int r9, int r10, int r11, int r12) {
        a(f, f2);
        bh bhVarMo77a = au.f84a.mo77a(r6);
        if (bhVarMo77a.f104a == null) {
            new StringBuffer().append("Image not loaded: ").append(r6).toString();
        }
        az.c();
        f75a.a(bhVarMo77a);
        bh bhVar = f75a;
        int r0 = r9 - bhVar.f106a[7];
        int r1 = r10 - bhVar.f106a[8];
        int r2 = r0 + r11;
        int r3 = r1 + r12;
        int r4 = q.e(r0, bhVar.b());
        int r5 = q.e(r2, bhVar.b());
        int r7 = q.e(r1, bhVar.c());
        int r8 = q.e(r3, bhVar.c());
        int r13 = r5 - r4;
        int r14 = r8 - r7;
        bhVar.f106a[7] = r0 < 0 ? -r0 : 0;
        bhVar.f106a[8] = r1 < 0 ? -r1 : 0;
        int[] r15 = bhVar.f106a;
        r15[3] = r15[3] + r4;
        int[] r16 = bhVar.f106a;
        r16[4] = r16[4] + r7;
        bhVar.f106a[1] = r11;
        bhVar.f106a[2] = r12;
        bhVar.f106a[5] = r13 - r11;
        bhVar.f106a[6] = r14 - r12;
        au.f85a.a(c, f75a, f70a.a, false);
        f75a.f104a = null;
        a(-f, -f2);
    }
}
