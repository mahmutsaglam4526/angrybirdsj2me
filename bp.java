package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:bp.class */
public final class bp extends bm {
    private int[] c;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private int f129c;

    public bp() {
        this.c = new int[4];
    }

    public bp(int r4) {
        this.c = new int[4];
        this.f129c = r4;
    }

    private int b(int r5) {
        if (this.f129c <= 0) {
            return 0;
        }
        return 0 == (r5 << 2) ? au.m43a(this.f129c) : au.m44b(this.f129c);
    }

    @Override // defpackage.bo
    /* JADX INFO: renamed from: b */
    public final void mo89b() {
        if (this.f129c > 0) {
            ((bo) this).b[2] = b(0);
            ((bo) this).b[3] = b(1);
        }
    }

    @Override // defpackage.bo
    public final void b(int r6, int r7) {
        if (a() && this.f129c > 0) {
            a(this.c, r6, r7);
            int[] r0 = this.c;
            m87a();
            aa.a(this.f129c, this.c);
        }
    }
}
