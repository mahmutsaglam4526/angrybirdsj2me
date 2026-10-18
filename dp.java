package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:dp.class */
public final class dp extends bs {
    private boolean a;
    private int b;
    private int[] e;

    private dp() {
        this.e = new int[2];
    }

    public dp(bo boVar) {
        super(boVar);
        this.e = new int[2];
    }

    public dp(bo boVar, int r5) {
        super(boVar);
        this.e = new int[2];
        this.b = r5;
    }

    @Override // defpackage.bs
    public final void a(int r6, int r7, boolean z) {
        super.a(r6, r7, z);
        ((bs) this).f134a = 3;
    }

    @Override // defpackage.bs, defpackage.bo
    public final int a(int r6, int r7, int r8) {
        int r0 = super.a(r6, r7, r8);
        if (c() && r6 == 65) {
            this.a = true;
        }
        return r0;
    }

    public final void a(int r6, boolean z) {
        int r0 = (((r6 << 1) + 1) * ac.a) / 2;
        if (!z) {
            a(r0, 0, true);
            return;
        }
        a(r0, 0, true);
        ((bs) this).c[0] = ((bs) this).f130a[0];
        ((bs) this).c[1] = ((bs) this).f130a[1];
    }

    @Override // defpackage.bs, defpackage.bo
    public final void d() {
        super.d();
        if (c() && this.a && am.a((1.0f * ((bs) this).d[0]) / 65536.0f) < 4.0f) {
            this.a = false;
            a(q.e(am.m13a(((1.0f / ac.a) * ((bs) this).c[0]) / 65536.0f), this.b - 1), false);
        }
        if ((this.e[0] == 0 && this.e[1] == 0) ? false : true) {
            if (((bs) this).f134a == 0) {
                ((bs) this).f134a = 2;
            }
            for (int r6 = 0; r6 < 2; r6++) {
                if (q.a(((bs) this).d[r6]) < this.e[r6]) {
                    ((bs) this).d[r6] = this.e[r6];
                }
            }
        }
    }

    @Override // defpackage.bs, defpackage.bo
    public final void b(int r5, int r6) {
        super.b(r5, r6);
        au.m49a();
    }

    private boolean c() {
        return this.b > 0;
    }

    public final void f() {
        this.e[1] = 32768;
    }
}
