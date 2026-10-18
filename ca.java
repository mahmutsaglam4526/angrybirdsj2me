package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:ca.class */
public final class ca extends cb {
    private by a;

    public ca() {
        super(3);
    }

    @Override // defpackage.cb
    public final void b(int r4) {
        ((cb) this).a.c(3);
        ci.a(((cb) this).a);
    }

    @Override // defpackage.a
    /* JADX INFO: renamed from: a */
    public final void mo1a() {
        if (this.a == null) {
            z zVar = new z();
            y yVar = new y();
            yVar.c(32768);
            yVar.m201a();
            zVar.a(yVar, av.m55a(1));
            yVar.a(224);
            zVar.a(yVar, ai.a("1.1.0"));
            yVar.a(225);
            zVar.a(yVar, av.m55a(3));
            yVar.a(224);
            zVar.a(yVar, av.m55a(4));
            yVar.a(225);
            zVar.a(yVar, av.m55a(5));
            yVar.a(175, true);
            dp dpVar = new dp(new bn(yVar));
            dpVar.a();
            dpVar.a(yVar.a(), ac.b);
            dpVar.f();
            this.a = new by();
            by byVar = new by();
            byVar.a(200, ac.b);
            this.a.a(new br(new ab(byVar)), 0, 0, 0, 0);
            this.a.a(new br(new aa(ac.b)), 0, 0, 32768, 32768, 200, ac.b / 2);
            this.a.a(dpVar, 0, 0, 0, 0, 10 + ((175 - yVar.a()) >> 1), 0);
            this.a.a(dn.a(41, 67), 0, 0, 32768, 32768, 200, 215);
            this.a.a(dn.a(204, 64), 65536, 0);
        }
        this.a.a(ac.a, ac.b);
    }

    @Override // defpackage.cb
    public final void a(int r6, int r7, int r8) {
        int r0 = this.a.a(r6, r7, r8);
        if (r0 == 64) {
            az.m67a();
        } else if (r0 == 67) {
            ((cb) this).a.a();
        }
    }

    @Override // defpackage.cb
    public final void e() {
        this.a.d();
    }

    @Override // defpackage.cb
    public final void f() {
        ((cb) this).a.m4a(2).f();
        Cdo.a();
        this.a.b(0, 0);
    }
}
