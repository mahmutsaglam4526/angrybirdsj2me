package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:cc.class */
public final class cc extends cb {
    private static int b;
    private int c;
    private int d;
    private static boolean a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static boolean f148b;
    private int e;

    public static void b(int r4, int r5) {
        b = 228 + (r4 << 1) + r5;
        f148b = r5 != 1;
        if (r5 == 1) {
            a = true;
        } else {
            a = false;
        }
    }

    public cc() {
        super(5);
    }

    @Override // defpackage.cb
    public final void b(int r4) {
        ac acVar = ((cb) this).a;
        acVar.f6a.b(b);
    }

    @Override // defpackage.a
    /* JADX INFO: renamed from: a */
    public final void mo1a() {
        if (au.m44b(b) > ac.b) {
            this.e = 1;
        } else {
            this.e = 0;
        }
        this.c = (int) ((this.e == 0 ? au.m43a(b) - ac.a : au.m44b(b) - ac.b) / 0.04f);
        this.d = 0;
    }

    @Override // defpackage.cb
    public final void a(int r4, int r5, int r6) {
        if (r4 == 64 && f148b) {
            i();
        }
    }

    @Override // defpackage.cb
    public final void e() {
        this.d += 20;
        if (this.d > this.c + 3000 + 2000) {
            i();
        }
    }

    @Override // defpackage.cb
    public final void f() {
        int r0 = au.m44b(b) - ac.b;
        int r1 = au.m43a(b) - ac.a;
        au.c(-16777216);
        int r7 = r1 < 0 ? (-r1) / 2 : 0;
        int r8 = this.e == 1 ? -r0 : 0;
        int r2 = this.d - 3000;
        if (r2 > 0) {
            if (this.e == 0) {
                int r3 = r7 - ((int) (r2 * 0.04f));
                r7 = r3;
                if (r3 < (-r1)) {
                    r7 = -r1;
                }
            } else {
                int r4 = (-r0) + ((int) (r2 * 0.04f));
                r8 = r4;
                if (r4 > 0) {
                    r8 = 0;
                }
            }
        }
        au.a(b, r7, r8);
    }

    private final void i() {
        if (a) {
            ((cb) this).a.m2a(13);
        } else {
            ((cb) this).a.a();
        }
    }
}
