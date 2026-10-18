package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:aa.class */
public final class aa implements bq {
    private int a;
    private int b;
    private int c;

    public aa() {
    }

    public static int a(int r3, int r4, int r5) {
        return ((r3 - r4) * r5) >> 16;
    }

    public static void a(int r5, int[] r6) {
        a(r5, r6, 32768, 32768);
    }

    public static void a(int r5, int[] r6, int r7) {
        a(r5, r6, r7, 65536);
    }

    private static void a(int r6, int[] r7, int r8, int r9) {
        au.a(r6, 0 + r7[0] + a(r7[2], au.m43a(r6), r8), 0 + r7[1] + a(r7[3], au.m44b(r6), r9));
    }

    public aa(int r4) {
        this.b = -1;
        this.c = -1;
        this.a = 14;
        this.b = 11;
        this.c = r4;
    }

    @Override // defpackage.bq
    public final int a() {
        if (this.b > 0) {
            return this.b;
        }
        return 0;
    }

    @Override // defpackage.bq
    public final int b() {
        if (this.c > 0) {
            return this.c;
        }
        return 0;
    }

    @Override // defpackage.bq
    public final void a(int r6, int r7, int r8, int r9) {
        ae.a();
        au.b(r6, r7, r8, r9);
        int r0 = au.m43a(this.a);
        int r1 = au.m44b(this.a);
        int r2 = 0;
        while (true) {
            int r12 = r2;
            if (r12 >= r9) {
                ae.m7a();
                return;
            }
            int r3 = 0;
            while (true) {
                int r13 = r3;
                if (r13 < r8) {
                    au.a(this.a, r6 + r13, r7 + r12);
                    r3 = r13 + r0;
                }
            }
            r2 = r12 + r1;
        }
    }
}
