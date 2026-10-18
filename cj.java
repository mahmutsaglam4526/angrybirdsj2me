package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:cj.class */
public final class cj extends cb {
    private by a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private dp f156a;

    public cj() {
        super(7);
    }

    @Override // defpackage.cb
    public final void b(int r4) {
        ((cb) this).a.c(3);
        ((cb) this).a.c(22);
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
        this.f156a = new dp(byVar, 1);
        this.f156a.a(ac.a, ac.b);
        this.f156a.e();
        for (int r11 = 0; r11 <= 0; r11++) {
            dl dlVar = new dl();
            dlVar.mo89b();
            byVar.a(dlVar, 0, 32768, (0 * ac.a) + ((ac.a - dlVar.m90a(0)) >> 1), 0);
        }
        byVar.a(1 * ac.a, ac.b);
        this.a.a(this.f156a, 32768, 0);
        dn dnVarA = dn.a(204, 64);
        dn dnVarA2 = dn.a(203, 67);
        this.a.a(dnVarA, 65536, 0);
        this.a.a(dnVarA2, 0, 65536);
        this.a.a(ac.a, ac.b);
        this.f156a.a(cd.m101a(), true);
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
        } else if (r0 >= 200) {
            ((cb) this).a.m2a(4);
            cd.m102a(r0 - 200);
            cd.b();
        }
    }

    @Override // defpackage.cb
    public final void e() {
        this.a.d();
    }

    @Override // defpackage.cb
    public final void f() {
        float fA = am.a((1.0f * this.f156a.c()) / 65536.0f, 0.0f, 1.0f) * 0.0f;
        am.m13a(fA);
        ck.a(fA);
        this.a.b(0, 0);
        au.m41b();
        au.c();
    }
}
