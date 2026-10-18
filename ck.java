package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:ck.class */
public final class ck extends cb {
    private by a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private dp f157a;
    private int b;
    private int c;

    public ck() {
        super(4);
    }

    @Override // defpackage.cb
    public final void b(int r4) {
        ((cb) this).a.c(3);
        if (r4 >= 8) {
            dc.f253a.a();
            dc.f253a = null;
        }
    }

    @Override // defpackage.a
    /* JADX INFO: renamed from: a */
    public final void mo1a() {
        this.a = new by();
        by byVar = new by();
        this.b = dj.a[cd.m101a()] / 15;
        this.c = dj.a[cd.m101a()];
        for (int r11 = 0; r11 < this.b; r11++) {
            bw bwVar = new bw(1, 0, 16);
            int r0 = 206 + (cd.m101a() % 3);
            int r14 = r11 * 15;
            for (int r15 = 0; r15 < 3 && r14 < this.c; r15++) {
                bw bwVar2 = new bw(5, 16, 0);
                for (int r17 = 0; r17 < 5 && r14 < this.c; r17++) {
                    int r5 = r14;
                    r14++;
                    bwVar2.a(new dm(r0, cd.m101a(), r5));
                }
                bwVar2.mo89b();
                bwVar.a(bwVar2);
            }
            bwVar.mo89b();
            byVar.a(bwVar, 0, 0, (r11 * ac.a) + ((ac.a - bwVar.m90a(0)) >> 1), 8);
        }
        byVar.a(this.b * ac.a, ac.b);
        dp dpVar = new dp(byVar, this.b);
        dpVar.a(ac.a, ac.b);
        dpVar.e();
        this.a.a(dpVar, 32768, 0);
        dn dnVarA = dn.a(204, 64);
        dn dnVarA2 = dn.a(203, 67);
        this.a.a(dnVarA, 65536, 0);
        this.a.a(dnVarA2, 0, 65536);
        this.f157a = dpVar;
        this.a.a(ac.a, ac.b);
        dpVar.a(((dc) ((cb) this).a.m4a(8)).c() / 15, true);
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
        if (r0 == 67) {
            ((cb) this).a.a();
            return;
        }
        if (r0 >= 100) {
            int r1 = de.a(cd.f150a) + (r0 - 100);
            if (cd.a(r1)) {
                di.d();
                ((dc) ((cb) this).a.m4a(8)).c(r1);
            }
        }
    }

    @Override // defpackage.cb
    public final void e() {
        this.a.d();
    }

    public static void a(float f) {
        int r0 = am.m13a(f);
        int[] r1 = dd.f254a[5];
        int r12 = r1[0];
        if (f < 0.0f) {
            int r2 = (int) Math.floor(f);
            r12 = ad.a(r1[r2], r1[r2 + 1], f - ((float) Math.floor(f)));
        }
        au.c(r12);
        int[] r3 = {0, 0, ac.a, ac.b};
        au.a(215, 0, 0, 200, 240, 0, (ac.a / 2) - 200, 0);
        au.a(215, 0, 0, 200, 240, 2, ac.a / 2, 0);
        aa.a(216 + (r0 << 1), r3, 0);
        aa.a(217 + (r0 << 1), r3, 65536);
    }

    @Override // defpackage.cb
    public final void f() {
        a(cd.m101a());
        this.a.b(0, 0);
        int r0 = am.m13a(am.a((1.0f * this.f157a.c()) / 65536.0f, 0.0f, 1.0f) * (this.b - 1));
        int r6 = (au.m41b() - (this.b * 13)) >> 1;
        int r1 = au.c() - 15;
        if (this.b > 1) {
            int r8 = 0;
            while (r8 < this.b) {
                int r2 = 222 + (r8 == r0 ? 1 : 0);
                au.a(r2, r6, r1);
                r6 += au.m43a(r2);
                r8++;
            }
        }
    }
}
