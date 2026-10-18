package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:bz.class */
public final class bz implements bq {
    private int a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String f143a;

    public bz() {
    }

    public bz(int r5, String str) {
        this.a = r5;
        this.f143a = str;
    }

    @Override // defpackage.bq
    public final int a() {
        if (this.f143a == null) {
            return 0;
        }
        return au.a(this.a, this.f143a);
    }

    @Override // defpackage.bq
    public final int b() {
        if (this.f143a == null) {
            return 0;
        }
        return au.m46c(this.a);
    }

    @Override // defpackage.bq
    public final void a(int r6, int r7, int r8, int r9) {
        if (this.f143a != null) {
            au.m47a(this.a, this.f143a, r6 + aa.a(r8, a(), 32768), r7 + aa.a(r9, b(), 32768));
        }
    }
}
