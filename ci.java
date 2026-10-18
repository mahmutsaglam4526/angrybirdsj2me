package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:ci.class */
public final class ci extends cb {
    private by a;
    private int b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static ch f155a;

    public ci() {
        super(2);
        this.a = new by();
        dn dnVarA = dn.a(204, 64);
        dn dnVarA2 = dn.a(214, 65);
        dq dqVar = new dq();
        dn dnVarA3 = dn.a(205, 69);
        this.a.a(new bp(213), 32768, 0, 0, 20);
        this.a.a(dnVarA, 65536, 0);
        this.a.a(dnVarA2, 32768, 32768, 0, 20);
        this.a.a(dqVar, 0, 0, 10, ac.b - 40);
        this.a.a(dnVarA3, 0, 0, 60, ac.b - 40);
        this.a.a(dn.a(16, 75), 0, 0, 0, 0, ac.a - 50, ac.b - 40);
    }

    @Override // defpackage.cb
    public final void b(int r4) {
        ((cb) this).a.c(3);
        a(((cb) this).a);
        if (f155a == null) {
            f155a = new ch();
        }
    }

    public static final void a(ac acVar) {
        dd.a(acVar);
        acVar.c(26);
    }

    @Override // defpackage.a
    /* JADX INFO: renamed from: a */
    public final void mo1a() {
        this.a.a(ac.a, ac.b);
        di.c();
    }

    @Override // defpackage.cb
    public final void a(int r5, int r6) {
        this.a.mo92a(r5, r6);
    }

    @Override // defpackage.cb
    public final void a(int r6, int r7, int r8) {
        int r0 = this.a.a(r6, r7, r8);
        if (r0 == 64) {
            az.m67a();
            return;
        }
        if (r0 == 65) {
            ((cb) this).a.m2a(7);
        } else if (r0 == 69) {
            ((cb) this).a.m2a(3);
        } else if (r0 == 75) {
            cb.h();
        }
    }

    @Override // defpackage.cb
    public final void e() {
        int r0;
        this.a.d();
        ch chVar = f155a;
        chVar.a -= 33;
        for (int r10 = 0; r10 < chVar.f154a.length; r10++) {
            cg cgVar = chVar.f154a[r10];
            if (cgVar.a < cgVar.b) {
                cgVar.a += 33;
                if (cgVar.a >= cgVar.b) {
                    cgVar.a = cgVar.b;
                }
            }
            if (ce.f151a > 0 && !chVar.f154a[r10].a() && chVar.a <= 0) {
                float fA = (40.0f + az.a(50)) / 100.0f;
                int r1 = (int) (8000.0f * fA);
                while (true) {
                    r0 = az.a(5);
                    if (r0 >= 0 && r0 <= 4) {
                        if ((ce.f151a & (1 << r0)) != 0) {
                            break;
                        }
                    }
                }
                int r2 = cv.a(r0 + 55, null);
                cg cgVar2 = chVar.f154a[r10];
                int r3 = (int) (ac.a * fA);
                int r4 = (int) ((ac.b * 0.3f) + (ac.b * 0.4f * fA));
                cgVar2.a = 0;
                cgVar2.b = r1;
                cgVar2.f = r2;
                cgVar2.c = r3;
                cgVar2.d = r4;
                float f = cgVar2.d;
                float f2 = (-cgVar2.c) * 0.5f;
                cgVar2.f153a = f / (f2 * f2);
                cgVar2.e = (int) (0.2f * ac.a);
                cgVar2.e = az.a(cgVar2.e << 1) - cgVar2.e;
                chVar.a = 2000 + az.a(2000);
            }
        }
        this.b += 33;
    }

    @Override // defpackage.cb
    public final void f() {
        au.b(2);
        at.b(dd.f254a[3][dd.a()]);
        at.f();
        at.a(-1);
        at.a(0, 1);
        at.a(1, 1);
        at.c();
        at.a(((this.b % 15000) / 15000.0f) * 256.0f, ac.b * 0.9f);
        dd.m148a();
        at.d();
        ch chVar = f155a;
        for (int r7 = 0; r7 < chVar.f154a.length; r7++) {
            if (chVar.f154a[r7].a()) {
                cg cgVar = chVar.f154a[r7];
                float f = ((cgVar.c * cgVar.a) / cgVar.b) - (cgVar.c * 0.5f);
                at.a(cgVar.f, f + (ac.a * 0.5f) + cgVar.e, (((cgVar.f153a * f) * f) + ac.b) - cgVar.d);
            }
        }
        at.c();
        at.a(((this.b % 17500) / 17500.0f) * 256.0f, ac.b * 0.9f);
        dd.b();
        at.d();
        au.b(1);
        this.a.b(0, 0);
    }
}
