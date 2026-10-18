package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:df.class */
public final class df extends cb {
    private by a;

    public df() {
        super(9);
        this.a = new by();
        by byVar = new by();
        byVar.a(110, ac.b);
        this.a.a(new br(new ab(byVar)), 0, 0, 0, 0);
        this.a.a(new br(new aa(ac.b)), 0, 0, 32768, 32768, 110, ac.b / 2);
        this.a.a(dn.a(10, 66), 0, 0, 32768, 32768, 110, ac.b / 2);
        this.a.a(dn.a(11, 70), 0, 0, 32768, 32768, 49, 85);
        this.a.a(dn.a(9, 71), 0, 0, 32768, 32768, 49, 150);
        this.a.a(new dq(), 0, 0, 32768, 32768, 24, ac.b - 25);
        this.a.a(dn.a(8, 72), 0, 0, 32768, 32768, 74, ac.b - 25);
        bt btVar = new bt();
        btVar.e();
        btVar.a(ac.a - 110, ac.b);
        this.a.a(btVar, 65536, 0);
    }

    @Override // defpackage.cb
    public final void b(int r3) {
        dc.a(((cb) this).a);
    }

    @Override // defpackage.a
    /* JADX INFO: renamed from: a */
    public final void mo1a() {
        this.a.a(ac.a, ac.b);
    }

    @Override // defpackage.cb
    public final void a(int r6, int r7, int r8) {
        int r0 = this.a.a(r6, r7, r8);
        if (r0 == 64) {
            az.m67a();
            return;
        }
        if (r0 == 66) {
            ((cb) this).a.a();
            return;
        }
        if (r0 == 70) {
            ((dc) ((cb) this).a.m4a(8)).j();
            ((cb) this).a.a();
            return;
        }
        if (r0 == 71) {
            ((cb) this).a.a();
            ((cb) this).a.a();
        } else if (r0 == 72) {
            ((cb) this).a.m4a(8);
            if (((dk) ((cb) this).a.m4a(12)).a(dc.a(true), true)) {
                ((cb) this).a.m2a(12);
            }
        }
    }

    @Override // defpackage.cb
    public final void e() {
        this.a.d();
    }

    @Override // defpackage.cb
    public final void f() {
        ((cb) this).a.m4a(8).f();
        Cdo.a();
        this.a.b(0, 0);
        ae.a(3, ((dc) ((cb) this).a.m4a(8)).m143a(), new int[]{0, 0, 105, 50}, 0, 0, 4096, 4096);
    }
}
