package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:aq.class */
public abstract class aq {
    public c a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private i f61a = new i();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public h f62a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static long f63a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f64a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f65a;

    public void a() {
        this.f62a = new h();
        this.a = new c();
    }

    public final void a(a aVar) {
        i iVar = this.f61a;
        int r1 = aVar.a;
        int r0 = ab.a(r1, iVar.a.f421a, iVar.a.a);
        if (r0 < 0) {
            iVar.a.a(r0 ^ (-1), r1);
            iVar.f419a.a(r0 ^ (-1), aVar);
        } else {
            iVar.a.f421a[r0] = r1;
            iVar.f419a.f422a[r0] = aVar;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final a m33a() {
        int r0 = this.a.a();
        if (r0 == 0) {
            return null;
        }
        return (a) this.f61a.a(r0);
    }

    public final a a(int r4) {
        return (a) this.f61a.a(r4);
    }

    public final void b() {
        a aVarM33a = m33a();
        c cVar = this.a;
        aVarM33a.mo1a();
        c cVar2 = this.a;
    }

    public abstract void c();
}
