package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:bs.class */
public class bs extends bo {
    private static int[] e = new int[4];
    private bo a;
    private int[] f;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int[] f130a;
    public int[] c;
    public int[] d;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private boolean[] f131a;
    private int b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private int f132c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private int f133d;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f134a;
    private int[] g;
    private int[] h;
    private int[] i;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private int f135e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    private int f136f;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    private int f137g;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private boolean f138a;

    private void f() {
        this.f[0] = 32768;
        this.f[1] = 32768;
    }

    public bs() {
        this.f = new int[2];
        this.f130a = new int[2];
        this.c = new int[2];
        this.d = new int[2];
        this.f131a = new boolean[2];
        this.b = 16384;
        this.f132c = 2048;
        this.f133d = 16384;
        this.g = new int[2];
        this.h = new int[2];
        this.i = new int[2];
        this.f137g = 65536;
        this.f138a = true;
        f();
    }

    public bs(bo boVar) {
        this.f = new int[2];
        this.f130a = new int[2];
        this.c = new int[2];
        this.d = new int[2];
        this.f131a = new boolean[2];
        this.b = 16384;
        this.f132c = 2048;
        this.f133d = 16384;
        this.g = new int[2];
        this.h = new int[2];
        this.i = new int[2];
        this.f137g = 65536;
        this.f138a = true;
        f();
        this.a = boVar;
        super.c();
        if (boVar != null) {
            super.a(boVar);
        }
    }

    @Override // defpackage.bo
    /* JADX INFO: renamed from: b */
    public final void mo89b() {
        super.mo89b();
        a.a(this.d);
        for (int r9 = 0; r9 < 2; r9++) {
            if (super.b[r9 + 2] >= this.a.b[r9 + 2]) {
                this.f130a[r9] = (-aa.a(super.b[r9 + 2], this.a.b[r9 + 2], this.f[r9])) << 16;
            } else {
                this.f130a[r9] = 0;
            }
        }
        a.b(this.c, this.f130a);
        b(true);
        this.f134a = 0;
    }

    public final void a() {
        this.f131a[1] = true;
    }

    public final void e() {
        this.f132c = 8192;
        this.f133d = 65536;
    }

    @Override // defpackage.bo
    public final void a(bo boVar) {
    }

    @Override // defpackage.bo
    public final void a(int r8, int r9) {
        super.b[2] = r8;
        super.b[3] = r9;
        if (this.a != null) {
            this.a.mo89b();
            for (int r10 = 0; r10 < 2; r10++) {
                if (super.b[r10 + 2] >= this.a.b[r10 + 2]) {
                    this.a.b[r10] = aa.a(super.b[r10 + 2], this.a.b[r10 + 2], this.f[r10]);
                } else {
                    this.a.b[r10] = 0;
                }
            }
        }
        a.a(this.d);
    }

    @Override // defpackage.bo
    /* JADX INFO: renamed from: a */
    public final int mo92a(int r5, int r6) {
        int r0 = this.a.mo92a(r5, r6);
        if (r5 == 48) {
            if (r6 == 1) {
                this.f135e = -1;
            }
            if (r6 == 2) {
                this.f135e = 1;
            }
            if (r6 == 3) {
                this.f136f = -1;
            }
            if (r6 == 4) {
                this.f136f = 1;
            }
            this.f134a = 2;
        }
        if (r5 == 49) {
            if (r6 == 1) {
                this.f135e = 0;
            }
            if (r6 == 2) {
                this.f135e = 0;
            }
            if (r6 == 3) {
                this.f136f = 0;
            }
            if (r6 == 4) {
                this.f136f = 0;
            }
            this.f134a = 2;
        }
        return r0;
    }

    public void a(int r8, int r9, boolean z) {
        this.f130a[0] = (r8 - (super.b[0] + (super.b[2] / 2))) << 16;
        this.f130a[1] = (r9 - (super.b[1] + (super.b[3] / 2))) << 16;
        if (z) {
            g();
        }
    }

    public final int c() {
        if (this.a.b[2] - super.b[2] == 0) {
            return 0;
        }
        return this.c[0] / (this.a.b[2] - super.b[2]);
    }

    private void g() {
        for (int r6 = 0; r6 < 2; r6++) {
            if (this.f131a[r6]) {
                int r0 = this.a.b[r6 + 2] << 16;
                this.f130a[r6] = this.c[r6] + (q.a((this.f130a[r6] - this.c[r6]) + (r0 / 2), r0) - (r0 / 2));
            } else {
                a(this.f130a, r6);
            }
        }
    }

    private void a(int[] r6, int r7) {
        if (this.f131a[r7]) {
            return;
        }
        r6[r7] = q.e(r6[r7], (this.a.b[r7 + 2] - super.b[r7 + 2]) << 16);
    }

    @Override // defpackage.bo
    public int a(int r8, int r9, int r10) {
        if (this.a == null) {
            return 0;
        }
        boolean zM91a = m91a(r9, r10);
        int r11 = r9 - super.b[0];
        int r12 = r10 - super.b[1];
        this.h[0] = r11;
        this.h[1] = r12;
        int[] r0 = this.h;
        r0[0] = r0[0] << 16;
        r0[1] = r0[1] << 16;
        boolean z = r8 == 65;
        boolean z2 = r8 == 64;
        boolean z3 = r8 == 67;
        if (!zM91a && this.f134a != 1) {
            this.f134a = 2;
            return 2;
        }
        if (this.f134a == 1) {
            if (z3) {
                return 1;
            }
            if (!z) {
                return 0;
            }
            this.f134a = 2;
            return 2;
        }
        if (this.f131a[0]) {
            r11 = q.a(r11 - this.a.b[0], this.a.b[2]) + this.a.b[0];
        }
        if (this.f131a[1]) {
            r12 = q.a(r12 - this.a.b[1], this.a.b[3]) + this.a.b[1];
        }
        boolean zMo94a = this.a.mo94a(e);
        int r1 = this.a.a(r8, r11, r12);
        if (r1 == 0) {
            if (!z2 && !z3) {
                return 0;
            }
            a.b(this.g, this.h);
            a.a(this.d);
            this.f134a = 1;
            return 1;
        }
        if (zMo94a & z) {
            int[] r2 = e;
            this.f134a = 3;
            int r3 = q.a(r2[0] + (r2[2] / 2), this.a.b[2]);
            int r4 = r2[1] + (r2[3] / 2);
            this.f130a[0] = this.c[0] - (((super.b[0] + (super.b[2] / 2)) - r3) << 16);
            this.f130a[1] = this.c[1] - (((super.b[1] + (super.b[3] / 2)) - r4) << 16);
            g();
        }
        return r1;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x015b  */
    @Override // defpackage.bo
    public void d() {
        int r1;
        if (this.a == null) {
            return;
        }
        this.a.d();
        this.d[1] = this.d[1] + (this.f135e * this.f137g);
        this.d[0] = this.d[0] + (this.f136f * this.f137g);
        if (this.f134a == 1) {
            int[] r0 = this.i;
            int[] r2 = this.g;
            int[] r3 = this.h;
            r0[0] = r2[0] - r3[0];
            r0[1] = r2[1] - r3[1];
            a.b(this.g, this.h);
            a.a(this.c, this.i);
            r.a(this.d, 49152);
            int[] r4 = this.d;
            int[] r5 = this.i;
            r4[0] = r4[0] + an.a(r5[0], 16384);
            r4[1] = r4[1] + an.a(r5[1], 16384);
        } else if (this.f134a == 2) {
            r.a(this.d, 62259);
            a.a(this.c, this.d);
        } else if (this.f134a == 3) {
            int[] r6 = this.c;
            int[] r7 = this.f130a;
            int r8 = this.f132c;
            int r9 = this.f133d;
            int length = r6.length;
            int r14 = 0;
            for (int r15 = 0; r15 < length; r15++) {
                int r10 = q.a(r7[r15] - r6[r15]);
                if (r10 > r14) {
                    r14 = r10;
                }
            }
            int r11 = r14;
            if (r11 == 0) {
                r1 = r9 < 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            } else if (r9 >= 0) {
                if (r9 < 32768) {
                    r1 = (r9 << 16) / r11;
                } else {
                    r1 = (int) ((((long) r9) << 16) / ((long) r11));
                }
            } else if (r9 > -32768) {
                r1 = (r9 << 16) / r11;
            } else {
                r1 = (int) ((((long) r9) << 16) / ((long) r11));
            }
            int r12 = r8 + r1;
            if (r12 >= 65536) {
                for (int r16 = 0; r16 < length; r16++) {
                    r6[r16] = r7[r16];
                }
            } else {
                for (int r17 = 0; r17 < length; r17++) {
                    int r13 = r17;
                    r6[r13] = r6[r13] + an.a(r12, r7[r17] - r6[r17]);
                }
            }
        }
        b(this.f134a != 4);
    }

    private void b(boolean z) {
        for (int r9 = 0; r9 < 2; r9++) {
            if (this.f131a[r9]) {
                int r0 = q.a(this.c[r9], this.a.b[r9 + 2] << 16) - this.c[r9];
                int[] r1 = this.c;
                int r2 = r9;
                r1[r2] = r1[r2] + r0;
                int[] r3 = this.f130a;
                int r4 = r9;
                r3[r4] = r3[r4] + r0;
            } else if (z) {
                if (super.b[r9 + 2] >= this.a.b[r9 + 2]) {
                    this.c[r9] = (-aa.a(super.b[r9 + 2], this.a.b[r9 + 2], this.f[r9])) << 16;
                } else if (this.f134a == 2) {
                    if (this.b == 65536) {
                        a(this.c, r9);
                    } else {
                        int r5 = (this.a.b[r9 + 2] - super.b[r9 + 2]) << 16;
                        if (this.c[r9] < 0) {
                            int[] r6 = this.c;
                            int r7 = r9;
                            r6[r7] = r6[r7] - an.a(this.c[r9], this.b);
                        } else if (this.c[r9] > r5) {
                            int[] r8 = this.c;
                            int r10 = r9;
                            r8[r10] = r8[r10] - an.a(this.c[r9] - r5, this.b);
                        }
                    }
                }
            }
            this.a.b[r9] = -an.a(this.c[r9]);
        }
    }

    @Override // defpackage.bo
    public void b(int r7, int r8) {
        if (this.a == null) {
            return;
        }
        int r0 = this.a.b[2];
        int r1 = this.a.b[3];
        if (r0 == 0 || r1 == 0) {
            return;
        }
        int r2 = r7 + super.b[0];
        int r9 = r8 + super.b[1];
        if (!this.f138a || ae.a(r2, r9, super.b[2], super.b[3])) {
            int r11 = this.f131a[0] ? (r2 - this.a.b[0]) + super.b[2] : r2 + 1;
            int r12 = this.f131a[1] ? (r9 - this.a.b[1]) + super.b[3] : r9 + 1;
            while (r9 < r12) {
                int r3 = r2;
                while (true) {
                    int r13 = r3;
                    if (r13 < r11) {
                        this.a.b(r13, r9);
                        r3 = r13 + r0;
                    }
                }
                r9 += r1;
            }
            if (this.f138a) {
                ae.m7a();
            }
        }
    }

    @Override // defpackage.bo
    public final void a(boolean z) {
        this.a.a(z);
    }
}
