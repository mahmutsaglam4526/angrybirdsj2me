package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:dx.class */
public final class dx {
    public final ap a = new ap();
    public final ap b = new ap();

    public final void a(dx dxVar) {
        this.a.a(dxVar.a);
        this.b.a(dxVar.b);
    }

    public final void a(ap apVar) {
        apVar.f60a = (this.a.f60a + this.b.f60a) * 0.5f;
        apVar.b = (this.a.b + this.b.b) * 0.5f;
    }

    public final void a(dx dxVar, dx dxVar2) {
        this.a.f60a = dxVar.a.f60a < dxVar2.a.f60a ? dxVar.a.f60a : dxVar2.a.f60a;
        this.a.b = dxVar.a.b < dxVar2.a.b ? dxVar.a.b : dxVar2.a.b;
        this.b.f60a = dxVar.b.f60a > dxVar2.b.f60a ? dxVar.b.f60a : dxVar2.b.f60a;
        this.b.b = dxVar.b.b > dxVar2.b.b ? dxVar.b.b : dxVar2.b.b;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final boolean m156a(dx dxVar) {
        return this.a.f60a > dxVar.a.f60a && this.a.b > dxVar.a.b && dxVar.b.f60a > this.b.f60a && dxVar.b.b > this.b.b;
    }

    public final String toString() {
        return new StringBuffer().append("AABB[").append(this.a).append(" . ").append(this.b).append("]").toString();
    }
}
