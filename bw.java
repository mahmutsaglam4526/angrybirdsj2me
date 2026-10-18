package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:bw.class */
public final class bw extends bv {
    private int[][] a = new int[2][4];
    private int[] c = new int[2];

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private boolean[] f142a = new boolean[2];
    private int d;
    private int e;

    public bw(int r5, int r6, int r7) {
        this.e = Integer.MIN_VALUE;
        this.c[0] = r5;
        this.d = r6;
        this.e = r7;
    }

    @Override // defpackage.bo
    public final void a(bo boVar) {
        super.a(boVar);
        this.c[1] = ((((bo) this).a.a - 1) / this.c[0]) + 1;
        while (q.c(this.c[0], this.c[1]) >= this.a[0].length) {
            this.a = new int[2][this.a[0].length << 1];
        }
    }

    @Override // defpackage.bo
    /* JADX INFO: renamed from: b */
    public final void mo89b() {
        ((bo) this).b[2] = 0;
        ((bo) this).b[3] = 0;
        ab.a(this.a[0], 0, this.c[0], 0);
        ab.a(this.a[1], 0, this.c[1], 0);
        int r0 = this.d;
        int r9 = this.e != Integer.MIN_VALUE ? this.e : this.d;
        for (int r12 = 0; r12 < 2; r12++) {
            int r13 = 0;
            int r14 = 0;
            int r10 = 0;
            int r11 = 0;
            int r16 = 0;
            while (true) {
                bo boVarA = a(r16);
                if (boVarA != null) {
                    if (r12 == 0) {
                        boVarA.mo89b();
                        if (boVarA.mo88a() > ((bm) this).f127a) {
                            ((bm) this).f127a = boVarA.mo88a();
                        }
                        if (this.a[0][r13] < boVarA.b[2] + r0) {
                            if (this.f142a[0]) {
                                ab.a(this.a[0], 0, this.c[0], boVarA.b[2] + r0);
                            } else {
                                this.a[0][r13] = boVarA.b[2] + r0;
                            }
                        }
                        if (this.a[1][r14] < boVarA.b[3] + r9) {
                            if (this.f142a[1]) {
                                ab.a(this.a[1], 0, this.c[1], boVarA.b[3] + r9);
                            } else {
                                this.a[1][r14] = boVarA.b[3] + r9;
                            }
                        }
                    } else {
                        boVarA.a(this.a[0][r13] - r0, this.a[1][r14] - r9);
                        boVarA.b[0] = r10 + (r0 / 2);
                        boVarA.b[1] = r11 + (r9 / 2);
                    }
                    r10 += this.a[0][r13];
                    r13++;
                    if (r13 >= this.c[0]) {
                        r10 = 0;
                        r11 += this.a[1][r14];
                        r13 = 0;
                        r14++;
                    }
                    r16++;
                }
            }
        }
        ((bo) this).b[2] = ab.a(this.a[0], 0, this.c[0]);
        ((bo) this).b[3] = ab.a(this.a[1], 0, this.c[1]);
    }

    @Override // defpackage.bv, defpackage.bo
    /* JADX INFO: renamed from: a */
    public final int mo92a(int r7, int r8) {
        int r0;
        int r1;
        int r2;
        bo boVarA = a();
        if (boVarA != null && (r2 = boVarA.mo92a(r7, r8)) != 0) {
            return r2;
        }
        if (!(r7 == 48 || r7 == 50)) {
            return 0;
        }
        if (r8 == 3) {
            r0 = -1;
        } else {
            r0 = r8 == 4 ? 1 : 0;
        }
        int r9 = r0;
        if (r8 == 1) {
            r1 = -1;
        } else {
            r1 = r8 == 2 ? 1 : 0;
        }
        int r10 = r1;
        if (r9 == 0 && r10 == 0) {
            return 0;
        }
        if (super.c < 0) {
            a(0);
            return 1;
        }
        a(q.d(q.d((super.c % this.c[0]) + r9, this.c[0] - 1) + (q.d((super.c / this.c[0]) + r10, this.c[1] - 1) * this.c[0]), ((bo) this).a.a - 1));
        return 1;
    }
}
