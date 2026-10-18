package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:dk.class */
public final class dk extends cb {
    private bo a;
    private int b;
    private int c;
    private int d;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private boolean f257a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final int[] f258a = {247, 248, 249, 251, 250};

    public dk() {
        super(12);
        this.a = dn.a(246, 66);
    }

    @Override // defpackage.cb
    public final void b(int r3) {
        dc.a(((cb) this).a);
    }

    @Override // defpackage.a
    /* JADX INFO: renamed from: a */
    public final void mo1a() {
        this.a.mo89b();
        this.a.b[0] = 225;
        this.a.b[1] = 164;
    }

    @Override // defpackage.a
    public final void b() {
        i();
    }

    @Override // defpackage.cb
    public final void a(int r6, int r7, int r8) {
        if (this.a.a(r6, r7, r8) == 66) {
            i();
            int r0 = ce.f151a | (1 << this.c);
            if (r0 != ce.f151a) {
                ce.f151a = r0;
                ce.a();
            }
            this.c = a(this.c);
            if (this.c < 0) {
                ((cb) this).a.a();
                if (this.f257a) {
                    ((cb) this).a.a();
                }
            }
        }
    }

    @Override // defpackage.cb
    public final void e() {
        this.a.d();
        if (this.d != 0 || this.c < 0) {
            return;
        }
        this.d = f258a[this.c];
        av.a(2, this.d);
    }

    @Override // defpackage.cb
    public final void f() {
        ((cb) this).a.m4a(8).f();
        au.e(-2147483584);
        ae.b();
        au.d(0);
        int r0 = (au.m41b() - 293) >> 1;
        int r1 = (au.c() - 140) >> 1;
        if (av.b(this.d)) {
            au.a(this.d, r0, r1);
        }
        this.a.b(0, 0);
    }

    public final boolean a(int r5, boolean z) {
        this.b = r5 & 31;
        this.c = a(-1);
        this.f257a = z;
        return this.c >= 0;
    }

    private int a(int r5) {
        do {
            r5++;
            if (r5 >= 32) {
                return -1;
            }
        } while ((this.b & (1 << r5)) == 0);
        return r5;
    }

    private void i() {
        av.b(2, this.d);
        this.d = 0;
    }
}
