package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:bu.class */
public class bu extends bt {
    private int d;
    private int e;
    private int f;

    public bu(int r4, int r5) {
        ((bt) this).c = r5;
        a(r4);
    }

    public final void a(int r4) {
        this.d = r4;
        this.e = r4;
    }

    @Override // defpackage.bo
    /* JADX INFO: renamed from: b */
    public final void mo89b() {
        ((bo) this).b[2] = au.m43a(this.d);
        ((bo) this).b[3] = au.m44b(this.d);
    }

    @Override // defpackage.bo
    public final void d() {
        this.f += 20;
    }

    @Override // defpackage.bo
    public void b(int r6, int r7) {
        if (((bm) this).a) {
            int r0 = au.e();
            if (((bm) this).f128b != -1) {
                au.f(((bm) this).f128b);
            }
            boolean z = ((bm) this).b;
            a(bm.a_, r6, r7);
            aa.a(z ? this.e : this.d, bm.a_);
            au.m49a();
            au.f(r0);
        }
    }
}
