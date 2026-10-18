package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:bn.class */
public final class bn extends bm {
    private y a;

    public bn() {
    }

    public bn(y yVar) {
        this.a = yVar;
    }

    @Override // defpackage.bo
    /* JADX INFO: renamed from: b */
    public final void mo89b() {
        if (this.a != null) {
            ((bo) this).b[2] = this.a.a();
            this.a.a(((bo) this).b[2], false);
            ((bo) this).b[3] = this.a.b();
        }
    }

    @Override // defpackage.bo
    public final void a(int r5, int r6) {
        super.a(r5, r6);
        if (this.a != null) {
            this.a.a(r5, false);
        }
    }

    @Override // defpackage.bo
    public final void b(int r5, int r6) {
        if (a()) {
            this.a.b(r5 + ((bo) this).b[0], r6 + ((bo) this).b[1]);
        }
    }
}
