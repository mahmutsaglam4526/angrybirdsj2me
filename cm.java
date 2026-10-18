package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:cm.class */
public final class cm extends cb {
    private by a;

    public cm() {
        super(13);
    }

    @Override // defpackage.cb
    public final void b(int r4) {
        ((cb) this).a.c(23);
        ((cb) this).a.c(3);
        ci.a(((cb) this).a);
    }

    @Override // defpackage.a
    /* JADX INFO: renamed from: a */
    public final void mo1a() {
        this.a = new by();
        this.a.a(dn.a(284, 66), 16384, 62259, 32768, 32768, 0, 0);
        this.a.a(dn.a(15, 75), 49152, 62259, 32768, 32768, 0, 0);
        this.a.a(au.m43a(283), au.m44b(283));
        this.a.a(new int[]{0, 0, ac.a, ac.b});
        this.a.mo89b();
        di.c();
    }

    @Override // defpackage.cb
    public final void a(int r6, int r7, int r8) {
        int r0 = this.a.a(r6, r7, r8);
        if (r0 == 66) {
            ((cb) this).a.m2a(2);
        } else if (r0 == 75) {
            cb.h();
        }
    }

    @Override // defpackage.cb
    public final void e() {
        this.a.d();
    }

    @Override // defpackage.cb
    public final void f() {
        this.a.b(0, 0);
        au.b(2);
        at.b(dd.f254a[3][dd.a()]);
        at.f();
        at.a(-1);
        at.c();
        at.a(0.0f, ac.b * 0.9f);
        dd.m148a();
        dd.b();
        at.d();
        au.b(1);
        Cdo.a();
        au.a(283, (ac.a - au.m43a(283)) >> 1, (ac.b - au.m44b(283)) >> 1);
        this.a.b(0, 0);
    }

    static {
        float[] fArr = {0.22f, 0.5f, 0.78f};
    }
}
