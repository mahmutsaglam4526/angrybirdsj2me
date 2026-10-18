package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:x.class */
public final class x {
    public int a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public Object[] f430a = new Object[8];

    public final void a() {
        while (this.a > 0) {
            Object[] objArr = this.f430a;
            this.a--;
            this.f430a[this.a] = null;
        }
    }

    public final Object a(int r4) {
        if (r4 < 0) {
            r4 = this.a + r4;
        }
        return this.f430a[r4];
    }
}
