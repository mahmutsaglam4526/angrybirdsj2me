package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:el.class */
public final class el extends eo {
    public final ap a;
    private final ap b = new ap();

    public el() {
        new ap();
        new ap();
        super.b = 0;
        this.a = new ap();
        super.a = 0.0f;
    }

    @Override // defpackage.eo
    public final eo a() {
        el elVar = new el();
        elVar.a.a(this.a);
        ((eo) elVar).a = super.a;
        return elVar;
    }

    @Override // defpackage.eo
    public final void a(dx dxVar, es esVar) {
        ap apVar = this.b;
        al.a(esVar.f327a, this.a, apVar);
        apVar.m24b(esVar.a);
        dxVar.a.f60a = apVar.f60a - super.a;
        dxVar.a.b = apVar.b - super.a;
        dxVar.b.f60a = apVar.f60a + super.a;
        dxVar.b.b = apVar.b + super.a;
    }

    @Override // defpackage.eo
    public final void a(em emVar, float f) {
        emVar.a = f * 3.1415927f * super.a * super.a;
        emVar.f321a.a(this.a);
        emVar.b = emVar.a * ((0.5f * super.a * super.a) + ap.m31a(this.a, this.a));
    }
}
