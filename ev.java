package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:ev.class */
public final class ev {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public float f333a;
    public float b;
    public float c;
    public final dx a = new dx();

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private final dx f339b = new dx();

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private final dx f340c = new dx();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public am f335a = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public ev f334a = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public ej f337a = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public eo f336a = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public final eu f338a = new eu();

    public final am a() {
        return this.f335a;
    }

    public final void a(eh ehVar, es esVar, es esVar2) {
        boolean z;
        if (this.f337a == null) {
            return;
        }
        this.f336a.a(this.f339b, esVar);
        this.f336a.a(this.f340c, esVar2);
        this.a.a.f60a = this.f339b.a.f60a < this.f340c.a.f60a ? this.f339b.a.f60a : this.f340c.a.f60a;
        this.a.a.b = this.f339b.a.b < this.f340c.a.b ? this.f339b.a.b : this.f340c.a.b;
        this.a.b.f60a = this.f339b.b.f60a > this.f340c.b.f60a ? this.f339b.b.f60a : this.f340c.b.f60a;
        this.a.b.b = this.f339b.b.b > this.f340c.b.b ? this.f339b.b.b : this.f340c.b.b;
        ap apVar = this.f339b.a;
        apVar.f60a = esVar2.a.f60a - esVar.a.f60a;
        apVar.b = esVar2.a.b - esVar.a.b;
        ej ejVar = this.f337a;
        dx dxVar = this.a;
        ei eiVar = ehVar.a;
        if (ejVar.a.m156a(dxVar)) {
            z = false;
        } else {
            eiVar.c(ejVar);
            dxVar.a.f60a -= 0.1f;
            dxVar.a.b -= 0.1f;
            dxVar.b.f60a += 0.1f;
            dxVar.b.b += 0.1f;
            eiVar.f311a.a(apVar);
            eiVar.f311a.m26a(2.0f);
            if (eiVar.f311a.f60a < 0.0f) {
                dxVar.a.f60a += eiVar.f311a.f60a;
            } else {
                dxVar.b.f60a += eiVar.f311a.f60a;
            }
            if (eiVar.f311a.b < 0.0f) {
                dxVar.a.b += eiVar.f311a.b;
            } else {
                dxVar.b.b += eiVar.f311a.b;
            }
            ejVar.a.a(dxVar);
            eiVar.b(ejVar);
            z = true;
        }
        if (z) {
            ehVar.a(ejVar);
        }
    }
}
