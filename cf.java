package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:cf.class */
public final class cf extends aq {
    public static ac a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private int[] f152a = new int[4];
    private int[] b = {0, 5, 3, 6};

    @Override // defpackage.aq
    public final void a() {
        super.a();
        a = new ac(this, ((aq) this).a, ((aq) this).f62a);
        a(new cl());
        a(new ci());
        a(new ca());
        a(new ck());
        a(new cc());
        a(new dc());
        a(new dh());
        a(new df());
        a(new cj());
        a(new cm());
        a(new dk());
        a.m2a(1);
        if (!p.a) {
            p.a = true;
            p.f425a = new float[512];
            for (int r7 = 0; r7 < 512; r7++) {
                p.f425a[r7] = (float) Math.sin(((r7 << 1) * 3.1415927f) / 512.0f);
            }
        }
        di.a();
        cd.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aq
    public final void c() {
        if ((((aq) this).a.a() == 2 || ((aq) this).a.a() == 13) && (((aq) this).a.f145b == 1 || ((aq) this).a.f145b == 13)) {
            return;
        }
        if (((aq) this).a.a() == 1) {
            au.d(-16777216);
            ae.b();
            return;
        }
        ae.a(this.f152a);
        au.a(a.c, 0, 0, ac.a, ac.b, 5, 0, 0);
        Cdo.a();
        a(3, (ac.a - 113) / 2, (ac.b - 69) / 2, 0);
        int r0 = q.a(((int) az.a()) / 100, 12);
        int r1 = this.b[r0 / 3];
        a(4 + (r0 % 3), (ac.a - 30) / 2, ((ac.b - 30) / 2) + 18, r1);
    }

    private static void a(int r9, int r10, int r11, int r12) {
        au.a(r9, 0, 0, au.m43a(r9), au.m44b(r9), ((((r12 & 4) | ((r12 >> 1) & 1)) | ((r12 & 1) << 1)) ^ 5) & 7, r11, r10);
    }
}
