package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:ed.class */
public final class ed {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f285a;
    public final ee a = new ee();
    public final ee b = new ee();
    public final ee c = new ee();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final ap f286a = new ap();
    private final ap g = new ap();
    private final ap h = new ap();
    private final ap i = new ap();
    private final ap j = new ap();

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    final ap f287b = new ap();

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    final ap f288c = new ap();
    final ap d = new ap();
    final ap e = new ap();
    final ap f = new ap();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public final ee[] f284a = new ee[3];

    public ed() {
        this.f284a[0] = this.a;
        this.f284a[1] = this.b;
        this.f284a[2] = this.c;
    }

    public final void a(ap apVar) {
        switch (this.f285a) {
            case 0:
                apVar.m21a();
                return;
            case 1:
                apVar.m22a(this.a.c);
                break;
            case 2:
                break;
            case 3:
                apVar.m21a();
                return;
            default:
                apVar.m21a();
                return;
        }
        this.h.m22a(this.b.c).b(this.b.f289a);
        this.g.m22a(this.a.c).b(this.a.f289a).m24b(this.h);
        apVar.m22a(this.g);
    }

    public final void a(ap apVar, ap apVar2) {
        switch (this.f285a) {
            case 1:
                apVar.m22a(this.a.a);
                apVar2.m22a(this.a.b);
                break;
            case 2:
                this.g.m22a(this.a.a).b(this.a.f289a);
                apVar.m22a(this.b.a).b(this.b.f289a).m24b(this.g);
                this.g.m22a(this.a.b).b(this.a.f289a);
                apVar2.m22a(this.b.b).b(this.b.f289a).m24b(this.g);
                break;
            case 3:
                apVar.m22a(this.a.a).b(this.a.f289a);
                this.i.m22a(this.b.a).b(this.b.f289a);
                this.j.m22a(this.c.a).b(this.c.f289a);
                apVar.m24b(this.i).m24b(this.j);
                apVar2.m22a(apVar);
                break;
        }
    }

    public final float a() {
        switch (this.f285a) {
            case 0:
                return 0.0f;
            case 1:
                return 0.0f;
            case 2:
                return ep.b(this.a.c, this.b.c);
            case 3:
                this.i.m22a(this.b.c).m25c(this.a.c);
                this.j.m22a(this.c.c).m25c(this.a.c);
                return ap.m32b(this.i, this.j);
            default:
                return 0.0f;
        }
    }
}
