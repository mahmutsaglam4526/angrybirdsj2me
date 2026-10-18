package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:br.class */
public final class br extends bm {
    private bq a;
    private boolean c = true;

    public br(bq bqVar) {
        this.a = bqVar;
    }

    @Override // defpackage.bo
    /* JADX INFO: renamed from: b */
    public final void mo89b() {
        ((bo) this).b[2] = this.a.a();
        ((bo) this).b[3] = this.a.b();
    }

    @Override // defpackage.bo
    public final void a(int r5, int r6) {
        super.a(r5, r6);
    }

    @Override // defpackage.bm, defpackage.bo
    public final boolean a() {
        return this.c;
    }

    @Override // defpackage.bo
    public final void b(int r8, int r9) {
        if (this.c) {
            a(bm.a_, r8, r9);
            int[] r0 = bm.a_;
            m87a();
            this.a.a(bm.a_[0], bm.a_[1], bm.a_[2], bm.a_[3]);
        }
    }
}
