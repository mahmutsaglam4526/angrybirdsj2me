package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:ec.class */
final class ec {
    public gg a;
    public gg b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f277a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public er f280a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public er f281b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public final ap f278a = new ap();

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public final ap f279b = new ap();
    final ap c = new ap();
    final ap d = new ap();
    final ap e = new ap();
    final ap f = new ap();
    final ap g = new ap();
    final ap h = new ap();
    final ap i = new ap();
    final ap j = new ap();
    final ap k = new ap();
    final ap l = new ap();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final es f282a = new es();

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    final es f283b = new es();
    final ap m = new ap();
    final ap n = new ap();

    ec() {
    }

    public final float a(int r5, int r6, float f) {
        this.f280a.a(this.f282a, f);
        this.f281b.a(this.f283b, f);
        switch (this.f277a) {
            case 0:
                al.b(this.f282a.f327a, this.f279b, this.m);
                al.b(this.f283b.f327a, this.f279b.m23b(), this.n);
                this.f279b.m23b();
                this.c.a(this.a.a[r5]);
                this.d.a(this.b.a[r6]);
                es.a(this.f282a, this.c, this.e);
                es.a(this.f283b, this.d, this.f);
                return ap.m31a(this.f.m25c(this.e), this.f279b);
            case 1:
                al.a(this.f282a.f327a, this.f279b, this.i);
                es.a(this.f282a, this.f278a, this.e);
                al.b(this.f283b.f327a, this.i.m23b(), this.n);
                this.i.m23b();
                this.d.a(this.b.a[r6]);
                es.a(this.f283b, this.d, this.f);
                return ap.m31a(this.f.m25c(this.e), this.i);
            case 2:
                al.a(this.f283b.f327a, this.f279b, this.i);
                es.a(this.f283b, this.f278a, this.f);
                al.b(this.f282a.f327a, this.i.m23b(), this.m);
                this.i.m23b();
                this.c.a(this.a.a[r5]);
                es.a(this.f282a, this.c, this.e);
                return ap.m31a(this.e.m25c(this.f), this.i);
            default:
                return 0.0f;
        }
    }
}
