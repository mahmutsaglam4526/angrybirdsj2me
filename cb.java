package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:cb.class */
public abstract class cb extends a {
    public final ac a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private long f146a;
    private long b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static boolean f147a;

    public cb(int r4) {
        super(r4);
        this.a = cf.a;
    }

    @Override // defpackage.a
    public final void a(a aVar) {
        this.a.f6a.a();
        this.a.c(1);
        this.a.c(15);
        b(aVar != null ? aVar.a : -1);
    }

    public abstract void b(int r1);

    @Override // defpackage.a
    public final void a(int r6) {
        switch (r6 & 240) {
            case 16:
                if (r6 == 19) {
                    di.f();
                    mo146g();
                } else if (r6 == 18) {
                    di.e();
                }
                break;
            case 48:
                as.e();
                a(r6, as.d());
                break;
            case 64:
                int r0 = as.g();
                int r1 = au.m41b() - as.f();
                boolean z = (r0 >= 0 && r0 <= 5) || (r1 >= 0 && r1 <= 5) || ((r0 >= ac.a - 5 && r0 <= ac.a) || (r1 >= ac.b - 5 && r1 <= ac.b));
                boolean z2 = z;
                if (z && !f147a) {
                    r6 = 65;
                }
                if (f147a && !z2 && r6 != 66) {
                    r6 = 64;
                }
                if (r6 == 64) {
                    f147a = false;
                }
                if (!f147a) {
                    a(r6, r0, r1);
                    if (z2) {
                        f147a = true;
                    }
                }
                break;
            case 80:
                if (r6 == 81) {
                }
                break;
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo146g() {
    }

    public void a(int r2, int r3) {
    }

    public void a(int r2, int r3, int r4) {
    }

    @Override // defpackage.a
    public final void c() {
        if (this.a.f10a && this.b < az.a()) {
            this.b = az.a() + 1000;
            this.f146a = az.m70b();
        }
        e();
    }

    @Override // defpackage.a
    public final void d() {
        au.a(this.a.c);
        f();
        if (this.a.f10a) {
            au.m47a(1, new StringBuffer().append("Free mem: ").append(this.f146a).toString(), 0, 0);
        }
        au.a(0);
        au.a(this.a.c, 0, 0, ac.a, ac.b, 5, 0, 0);
    }

    public abstract void e();

    public abstract void f();

    public static final void h() {
        az.m69a(cf.a.f9a);
    }
}
