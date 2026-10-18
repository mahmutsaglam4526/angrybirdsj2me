package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:dh.class */
public final class dh extends cb {
    public static boolean a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final float[] f255a = {0.22f, 0.5f, 0.78f};

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private by f256a;

    public dh() {
        super(11);
    }

    @Override // defpackage.cb
    public final void b(int r3) {
        dc.a(((cb) this).a);
    }

    @Override // defpackage.a
    /* JADX INFO: renamed from: a */
    public final void mo1a() {
        dc dcVar = (dc) ((cb) this).a.m4a(8);
        boolean zM140a = false;
        if (a) {
            zM140a = dcVar.m140a();
            db.a(30);
        }
        this.f256a = new by();
        this.f256a.a(new br(new dg()), 0, 0, 0, 0);
        this.f256a.a(dn.a(9, 71), 0, 0, 32768, 32768, (int) (278.0f * f255a[0]), 179);
        this.f256a.a(dn.a(11, 70), 0, 0, 32768, 32768, (int) (278.0f * f255a[1]), 179);
        int r0 = dcVar.m141b();
        de.b(r0);
        boolean z = cd.m99a(r0) > 0;
        boolean z2 = r0 - de.a(0) == dj.a[0] - 1;
        if ((a || z) && z2) {
            this.f256a.a(dn.a(18, 74), 0, 0, 32768, 32768, (int) (278.0f * f255a[2]), 179);
        } else if (dcVar.m142b()) {
            this.f256a.a(dn.a(17, 66), 0, 0, 32768, 32768, (int) (278.0f * f255a[2]), 179);
        }
        this.f256a.a(new br(new bz(3, dcVar.m143a())), 0, 0, 32768, 32768, 57, 26);
        if (a) {
            this.f256a.a(new br(new bz(2, Integer.toString(dc.d()))), 0, 0, 32768, 32768, 76, 93);
            this.f256a.a(new bp(20 + dc.m144e()), 0, 0, 32768, 32768, 76, 118);
            this.f256a.a(new bp(40), 0, 0, 32768, 32768, 185, 110);
            if (zM140a) {
                this.f256a.a(new bp(19), 0, 0, 32768, 32768, 253, 75);
            }
            this.f256a.a(new br(new bz(2, Integer.toString(dcVar.m145f()))), 0, 0, 65536, 65536, 207, 42);
            this.f256a.a(new bp(24 + dcVar.g()), 0, 0, 0, 65536, 217, 42);
        } else {
            this.f256a.a(new bp(39), 0, 0, 32768, 32768, 143, 108);
        }
        this.f256a.a(278, 179);
        this.f256a.a(new int[]{0, 0, ac.a, ac.b});
    }

    @Override // defpackage.cb
    public final void a(int r6, int r7, int r8) {
        int r0 = this.f256a.a(r6, r7, r8);
        if (r0 == 70) {
            ((dc) ((cb) this).a.m4a(8)).j();
            ((cb) this).a.a();
            return;
        }
        if (r0 == 71) {
            ((cb) this).a.a();
            ((cb) this).a.a();
            return;
        }
        if (r0 == 66) {
            ((cb) this).a.a();
            ((cb) this).a.a();
            ((dc) ((cb) this).a.m4a(8)).i();
        } else if (r0 == 74) {
            ((cb) this).a.a();
            ((cb) this).a.a();
            ((cb) this).a.a();
            int r1 = cd.m101a();
            cc.b(cd.f150a, 1);
            if (r1 != 0) {
                cd.m102a(r1 + 1);
            }
            ((cb) this).a.m2a(5);
        }
    }

    @Override // defpackage.cb
    public final void e() {
        this.f256a.d();
    }

    @Override // defpackage.cb
    public final void f() {
        ((cb) this).a.m4a(8).f();
        Cdo.a();
        this.f256a.b(0, 0);
    }
}
