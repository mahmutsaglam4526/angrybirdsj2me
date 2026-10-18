package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:bm.class */
public abstract class bm extends bo {
    public static final int[] a_ = new int[4];
    public boolean b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f127a;
    public boolean a = true;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public int f128b = -1;

    @Override // defpackage.bo
    public boolean a() {
        return this.a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    protected final void m87a() {
        if (this.f128b >= 0) {
            au.f(this.f128b);
        }
    }

    @Override // defpackage.bo
    /* JADX INFO: renamed from: b */
    public final boolean mo93b() {
        return this.b;
    }

    @Override // defpackage.bo
    public void a(boolean z) {
        this.b = z;
    }

    @Override // defpackage.bo
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public int mo88a() {
        return this.f127a;
    }
}
