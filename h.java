package defpackage;

import android.R;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:h.class */
public final class h {
    private static final int[] a = {1, 100, 5, 10, 1, 1, 1};
    private static final int[] b = {22, 6, 299, 34, 6, 3};

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private u[] f415a = new u[7];

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private u[] f416b = new u[7];
    private u[] c = new u[7];

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f417a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public int f418b;

    public h() {
        int r7 = 0;
        while (r7 < 7) {
            int r8 = r7 == 6 ? 0 : b[r7];
            this.f415a[r7] = new u(r8);
            this.f416b[r7] = new u(r8);
            this.c[r7] = new u(r8);
            r7++;
        }
    }

    public final void a() {
        for (int r4 = 0; r4 < 7; r4++) {
            this.f415a[r4].a();
        }
    }

    public final void a(int r5) {
        for (int r6 = 0; r6 < 6; r6++) {
            if (av.a(r6)) {
                int r7 = 0;
                while (true) {
                    int r0 = av.a(r5, r6, r7);
                    r7 = r0;
                    if (r0 > 0) {
                        this.f415a[r6].a(r7);
                    }
                }
            }
        }
    }

    public final void b(int r4) {
        if (av.a(2)) {
            this.f415a[2].a(r4);
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final boolean m189a() {
        boolean z;
        this.f417a = 0;
        this.f418b = 1;
        for (int r7 = 0; r7 < 7; r7++) {
            if (r7 >= 6 || av.a(r7)) {
                u uVar = this.f415a[r7];
                u uVar2 = this.f416b[r7];
                uVar2.a();
                int r0 = uVar.a;
                int r11 = 0;
                for (int r12 = 0; r12 < r0; r12++) {
                    if (uVar.m196a(r12) && !this.c[r7].m196a(r12)) {
                        r11++;
                        uVar2.a(r12);
                    }
                }
                if (r11 > 0) {
                    this.f418b += ((r11 - 1) / a[r7]) + 1;
                }
            }
        }
        int r8 = 0;
        loop2: while (true) {
            if (r8 >= 7) {
                z = false;
                break;
            }
            if (r8 == 6 || av.a(r8)) {
                u uVar3 = this.f415a[r8];
                u uVar4 = this.c[r8];
                int r13 = uVar3.a;
                while (true) {
                    int r1 = r13;
                    r13--;
                    if (r1 <= 0) {
                        break;
                    }
                    if (!uVar3.m196a(r13) && uVar4.m196a(r13)) {
                        z = true;
                        break loop2;
                    }
                }
            }
            r8++;
        }
        return z || this.f418b > 1;
    }

    public final boolean b() {
        boolean z;
        int r0;
        if (this.f417a == 0) {
            for (int r7 = 0; r7 < 6; r7++) {
                if (av.a(r7)) {
                    u uVar = this.f415a[r7];
                    for (int r9 = 0; r9 < b[r7]; r9++) {
                        if (uVar.m195a(r9) == 0 && this.c[r7].m196a(r9)) {
                            this.c[r7].b(r9);
                            av.b(r7, r9);
                        }
                    }
                }
            }
        } else {
            int r8 = 0;
            while (true) {
                if (r8 >= 6) {
                    z = false;
                    break;
                }
                if (av.a(r8)) {
                    u uVar2 = this.f416b[r8];
                    int r1 = ((uVar2.a - 1) >> 5) + 1;
                    int r11 = 0;
                    for (int r12 = 0; r12 < r1; r12++) {
                        int r2 = uVar2.f428a[r12];
                        int r3 = r2 - ((r2 >>> 1) & 1431655765);
                        int r4 = (r3 & 858993459) + ((r3 >>> 2) & 858993459);
                        r11 += (((r4 + (r4 >>> 4)) & 252645135) * R.attr.cacheColorHint) >>> 24;
                    }
                    if (r11 > 0) {
                        for (int r10 = a[r8]; r10 > 0 && (r0 = uVar2.m197a()) >= 0; r10--) {
                            uVar2.b(r0);
                            this.c[r8].a(r0);
                            av.a(r8, r0);
                        }
                        z = true;
                        break;
                    }
                }
                r8++;
            }
            if (!z) {
                return false;
            }
        }
        this.f417a++;
        return true;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final int m190a() {
        u uVar = this.f415a[6];
        u uVar2 = this.c[6];
        int r0 = uVar.a;
        for (int r7 = 0; r7 < r0; r7++) {
            if (uVar2.m196a(r7) && !uVar.m196a(r7)) {
                uVar2.b(r7);
                return r7;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public final int m191b() {
        int r0 = this.f416b[6].m197a();
        if (r0 < 0) {
            return -1;
        }
        this.f416b[6].b(r0);
        this.c[6].a(r0);
        this.f417a++;
        return r0;
    }
}
